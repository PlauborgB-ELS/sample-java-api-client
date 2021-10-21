package com.elsevier.pure.api.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.elsevier.pure.api.sample.stubs.api.OrganizationApi;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;
import com.elsevier.pure.api.sample.stubs.api.UserApi;
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.DateRange;
import com.elsevier.pure.api.sample.stubs.model.Name;
import com.elsevier.pure.api.sample.stubs.model.Organization;
import com.elsevier.pure.api.sample.stubs.model.OrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.Person;
import com.elsevier.pure.api.sample.stubs.model.StaffOrganizationAssociation;
import com.elsevier.pure.api.sample.stubs.model.User;
import com.elsevier.pure.api.sample.stubs.model.UserListResult;
import com.elsevier.pure.api.sample.stubs.model.UserRef;
import com.elsevier.pure.api.sample.stubs.model.Visibility;

import junit.framework.TestCase;

public class TestUserApi extends TestCase {
    private UserApi userApi;
    private PersonApi personApi;
    private OrganizationApi organizationApi;

    private Collection<UUID> userUuids;
    private Collection<UUID> personUuids;
    private Collection<UUID> organizationUuids;

    public TestUserApi() {
        System.setProperty("pure-api-base-path", "http://localhost:8080/ws/api");
        System.setProperty("pure-api-key", "f4f5e7db-fcae-4157-9406-efad57a5cd9f");
    }

    /**
     * Test case that fetches all users from the configured Pure instance
     */
    public void testFetch() throws ApiException {
        final UserListResult response = userApi.list(10, 0, "modified");
        System.out.println("Count: " + response.getCount());

        if (response.getItems() != null) {
            for (User user : response.getItems()) {
                System.out.println(user.getUsername());
            }
        }
    }

    /**
     * Test case that creates a new user in the configured Pure instance
     */
    public void testCreateUser() throws ApiException {
        User user = new User();
        user.setUsername("user-" + UUID.randomUUID());
        user.setEmail(UUID.randomUUID() + "@somebogusdomain.com");
        final User userResponse = userApi.create(user);

        if (userResponse != null) {
            System.out.println("User '" + user.getUsername() + "' was successfully created");
        } else {
            fail("response is null");
        }
    }

    /**
     * Test case that creates a new user, then updates same user, in the configured Pure instance
     */
    public void testCreateAndUpdateUser() throws ApiException {
        User user = new User();
        user.setUsername("user-" + UUID.randomUUID());
        user.setEmail(UUID.randomUUID() + "@somebogusdomain.com");
        final User userCreateResponse = userApi.create(user);

        if (userCreateResponse != null) {
            System.out.println("User '" + userCreateResponse.getUsername() + "' was successfully created");
            userUuids.add(userCreateResponse.getUuid());
        } else {
            System.out.println("response is null");
        }
        user.setUsername("user-" + UUID.randomUUID());
        user.setEmail(UUID.randomUUID() + "@somebogusdomain.com");
        final User userUpdateResponse = userApi.update(userCreateResponse.getUuid(), user);

        if (userUpdateResponse != null) {
            System.out.println("User '" + userUpdateResponse.getUsername() + "' was successfully updated.");
            System.out.println("Old username '" + userCreateResponse.getUsername() + "'. New username '" + userUpdateResponse.getUsername() + "'");
            System.out.println("Old email '" + userCreateResponse.getEmail() + "'. New email '" + userUpdateResponse.getEmail() + "'");
        } else {
            System.out.println("response is null");
        }
    }

    /**
     * Test case that creates a new user, then deletes same user, in the configured Pure instance
     */
    public void testCreateAndDeleteUser() throws ApiException {
        User user = new User();
        user.setUsername("user-" + UUID.randomUUID());
        user.setEmail(UUID.randomUUID() + "@somebogusdomain.com");
        final User userCreateResponse = userApi.create(user);

        if (userCreateResponse != null) {
            System.out.println("User '" + userCreateResponse.getUsername() + "' was successfully created");
        } else {
            fail("User was not created!");
        }

        userApi.delete(userCreateResponse.getUuid());

        try {
            userApi.get(userCreateResponse.getUuid());
            fail("This should not be reached unless the user wasn't deleted as intended!");
        } catch (ApiException ex) {
            if (ex.getCode() == 404 && ex.getResponseBody().contains("Content not found")) {
                System.out.println("User not found!");
            } else {
                fail("Something went wrong when fetching the user after delete!");
            }
        }
    }

    /**
     * Test case that creates a new user, then deletes same user, in the configured Pure instance
     */
    public void testCreateUserAndAttachToPerson() throws ApiException {
        User user = new User();
        user.setUsername("user-" + UUID.randomUUID());
        user.setEmail(UUID.randomUUID() + "@somebogusdomain.com");
        final User userCreateResponse = userApi.create(user);

        if (userCreateResponse != null) {
            System.out.println("User '" + userCreateResponse.getUsername() + "' was successfully created");
            userUuids.add(userCreateResponse.getUuid());
        } else {
            fail("User was not created!");
        }

        Organization organization = getOrganization();
        Organization organisationCreateResponse = organizationApi.create(organization);

        if (organisationCreateResponse != null) {
            System.out.println("Organization successfully created!");
            organizationUuids.add(organisationCreateResponse.getUuid());
        } else {
            fail("Unable to create organization!");
        }

        Person person = getPerson();
        person.setUser(getUserRef(userCreateResponse));

        StaffOrganizationAssociation staffOrgAssociation = getStaffOrganizationAssociation(organisationCreateResponse);
        person.setStaffOrganizationAssociations(Collections.singletonList(staffOrgAssociation));

        Person personCreateResponse = personApi.create(person);

        if (personCreateResponse != null) {
            personUuids.add(personCreateResponse.getUuid());
            if (personCreateResponse.getUser() != null && personCreateResponse.getUser().getUuid().equals(userCreateResponse.getUuid())) {
                System.out.println("All is good! User was attached to person!");
            } else {
                fail("User should have been attached to person!");
            }
        } else {
            fail("Unable to create person!");
        }
    }

    private StaffOrganizationAssociation getStaffOrganizationAssociation(Organization organisationCreateResponse) {
        StaffOrganizationAssociation staffOrgAssociation = new StaffOrganizationAssociation();
        staffOrgAssociation.setOrganization(getOrganizationRef(organisationCreateResponse));
        DateRange period = new DateRange();
        period.setStartDate(OffsetDateTime.now().minusYears(1));
        period.setEndDate(OffsetDateTime.now());
        staffOrgAssociation.setPeriod(period);
        return staffOrgAssociation;
    }

    private Organization getOrganization() {
        Organization organisation = new Organization();
        HashMap<String, String> orgName = new HashMap<String, String>();
        orgName.put("en_GB", "Organization name");
        organisation.setName(orgName);
        organisation.setVisibility(new Visibility().key(Visibility.KeyEnum.FREE));
        DateRange lifeCycle = new DateRange();
        lifeCycle.setStartDate(OffsetDateTime.now().minusYears(1));
        lifeCycle.setEndDate(OffsetDateTime.now());
        organisation.setLifecycle(lifeCycle);
        return organisation;
    }

    private Person getPerson() {
        Person person = new Person();
        Name name = new Name();
        name.setFirstName("Firstname");
        name.setLastName("Lastname");
        person.setName(name);
        person.setVisibility(new Visibility().key(Visibility.KeyEnum.FREE));
        return person;
    }

    private OrganizationRef getOrganizationRef(Organization organisationCreateResponse) {
        OrganizationRef orgRef = new OrganizationRef();
        orgRef.setSystemName("Organization");
        orgRef.setUuid(organisationCreateResponse.getUuid());
        return orgRef;
    }

    private UserRef getUserRef(User userCreateResponse) {
        UserRef userRef = new UserRef();
        userRef.setSystemName("User");
        userRef.setUuid(userCreateResponse.getUuid());
        return userRef;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        final String pureApiBasePathProperty = "pure-api-base-path";
        final String pureApiBasePath = System.getProperty(pureApiBasePathProperty);
        assert pureApiBasePath != null
                : "You must specify a Pure API base path using -D"
                + pureApiBasePathProperty + "=some-Pure-API-base-path-URL";

        final String pureApiKeyProperty = "pure-api-key";
        final String pureApiKey = System.getProperty(pureApiKeyProperty);
        assert pureApiKey != null
                : "You must specify a Pure API key using -D"
                + pureApiKeyProperty + "=some-Pure-API-key";

        final ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(pureApiBasePath);
        apiClient.setApiKey(pureApiKey);

        this.userApi = new UserApi(apiClient);
        this.personApi = new PersonApi(apiClient);
        this.organizationApi = new OrganizationApi(apiClient);

        this.userUuids = new ArrayList<UUID>();
        this.personUuids = new ArrayList<UUID>();
        this.organizationUuids = new ArrayList<UUID>();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();

        for (UUID userUuid : userUuids) {
            userApi.delete(userUuid);
        }

        for (UUID personUuid : personUuids) {
            personApi.delete(personUuid);
        }

        for (UUID organizationUuid : organizationUuids) {
            organizationApi.delete(organizationUuid);
        }
    }
}