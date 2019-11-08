package com.elsevier.pure.api.sample;

import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationListResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganization;
import junit.framework.TestCase;

public class TestExternalOrganizationApi extends TestCase {
    private ExternalOrganizationApi pureApi;
    /**
     * Test case that fetches all external organizations from Pure
     * @throws ApiException
     */
    public void testFetch() throws ApiException {
        final ExternalOrganizationListResult response = pureApi.listExternalOrganizations(10, 0, "name");
        System.out.println("Count: " + response.getCount());

        if (response.getItems() != null) {
            for (ExternalOrganization externalOrganization : response.getItems()) {
                System.out.println(externalOrganization);
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