package com.elsevier.pure.api.sample;

import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganization;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationListResult;
import junit.framework.TestCase;

public class TestExternalOrganizationApi extends TestCase {
    private ExternalOrganizationApi pureApi;

    public TestExternalOrganizationApi() {
        System.setProperty("pure-api-base-path", "https://api.elsevierpure.com/ws/api");
        System.setProperty("pure-api-key", "622d9790-65f1-4769-a81b-b8d2967ef063");
    }

    /**
     * Test case that fetches all external organizations from Pure
     */
    public void testFetch() throws ApiException {
        final ExternalOrganizationListResult response = pureApi.list(10, 0, "name");
        System.out.println("Count: " + response.getCount());

        if (response.getItems() != null) {
            for (ExternalOrganization externalOrganization : response.getItems()) {
                System.out.println(externalOrganization.getName());
            }
        }
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

        this.pureApi = new ExternalOrganizationApi(apiClient);
    }
}