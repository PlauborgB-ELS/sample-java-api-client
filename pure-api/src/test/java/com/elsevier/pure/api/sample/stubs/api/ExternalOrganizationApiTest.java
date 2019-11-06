/*
 * Pure API
 * Description text
 *
 * The version of the OpenAPI document: 0.1-Alpha
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.api;

import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.ErrorResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganisationListResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganization;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationsQuery;
import com.elsevier.pure.api.sample.stubs.model.OrderingsList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalOrganizationApi
 */
@Ignore
public class ExternalOrganizationApiTest {

    private final ExternalOrganizationApi api = new ExternalOrganizationApi();

    
    /**
     * Get external organization
     *
     * Get external organization with specific ID (path parameter).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalOrganisationTest() throws ApiException {
        String id = null;
        ExternalOrganization response = api.getExternalOrganisation(id);

        // TODO: test validations
    }
    
    /**
     * Lists available orderings
     *
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalOrganisationOrderingsTest() throws ApiException {
        OrderingsList response = api.getExternalOrganisationOrderings();

        // TODO: test validations
    }
    
    /**
     * Lists all external organizations
     *
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalOrganizationsTest() throws ApiException {
        ExternalOrganisationListResult response = api.listExternalOrganizations();

        // TODO: test validations
    }
    
    /**
     * Complex operation for external organizations
     *
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalOrganizationsUsingQueryTest() throws ApiException {
        ExternalOrganizationsQuery externalOrganizationsQuery = null;
        ExternalOrganisationListResult response = api.listExternalOrganizationsUsingQuery(externalOrganizationsQuery);

        // TODO: test validations
    }
    
}
