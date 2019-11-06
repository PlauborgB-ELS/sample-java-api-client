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

import com.elsevier.pure.api.sample.stubs.invoker.ApiCallback;
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.ApiResponse;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.Pair;
import com.elsevier.pure.api.sample.stubs.invoker.ProgressRequestBody;
import com.elsevier.pure.api.sample.stubs.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.elsevier.pure.api.sample.stubs.model.ErrorResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganisationListResult;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganization;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationsQuery;
import com.elsevier.pure.api.sample.stubs.model.OrderingsList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExternalOrganizationApi {
    private ApiClient localVarApiClient;

    public ExternalOrganizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExternalOrganizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getExternalOrganisation
     * @param id ID of the desired external organization (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExternalOrganisationCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExternalOrganisationValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getExternalOrganisation(Async)");
        }
        

        okhttp3.Call localVarCall = getExternalOrganisationCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get external organization
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @return ExternalOrganization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganization getExternalOrganisation(String id) throws ApiException {
        ApiResponse<ExternalOrganization> localVarResp = getExternalOrganisationWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get external organization
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @return ApiResponse&lt;ExternalOrganization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganization> getExternalOrganisationWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getExternalOrganisationValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get external organization (asynchronously)
     * Get external organization with specific ID (path parameter).
     * @param id ID of the desired external organization (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExternalOrganisationAsync(String id, final ApiCallback<ExternalOrganization> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExternalOrganisationValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganization>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExternalOrganisationOrderings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExternalOrganisationOrderingsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations/orderings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExternalOrganisationOrderingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getExternalOrganisationOrderingsCall(_callback);
        return localVarCall;

    }

    /**
     * Lists available orderings
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @return OrderingsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public OrderingsList getExternalOrganisationOrderings() throws ApiException {
        ApiResponse<OrderingsList> localVarResp = getExternalOrganisationOrderingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Lists available orderings
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @return ApiResponse&lt;OrderingsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderingsList> getExternalOrganisationOrderingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getExternalOrganisationOrderingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OrderingsList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists available orderings (asynchronously)
     * Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExternalOrganisationOrderingsAsync(final ApiCallback<OrderingsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExternalOrganisationOrderingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OrderingsList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listExternalOrganizations
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listExternalOrganizationsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/external-organizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listExternalOrganizationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listExternalOrganizationsCall(_callback);
        return localVarCall;

    }

    /**
     * Lists all external organizations
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @return ExternalOrganisationListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganisationListResult listExternalOrganizations() throws ApiException {
        ApiResponse<ExternalOrganisationListResult> localVarResp = listExternalOrganizationsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Lists all external organizations
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @return ApiResponse&lt;ExternalOrganisationListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganisationListResult> listExternalOrganizationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listExternalOrganizationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ExternalOrganisationListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists all external organizations (asynchronously)
     * Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listExternalOrganizationsAsync(final ApiCallback<ExternalOrganisationListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = listExternalOrganizationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ExternalOrganisationListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listExternalOrganizationsUsingQuery
     * @param externalOrganizationsQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listExternalOrganizationsUsingQueryCall(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = externalOrganizationsQuery;

        // create path and map variables
        String localVarPath = "/external-organizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listExternalOrganizationsUsingQueryValidateBeforeCall(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listExternalOrganizationsUsingQueryCall(externalOrganizationsQuery, _callback);
        return localVarCall;

    }

    /**
     * Complex operation for external organizations
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @return ExternalOrganisationListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ExternalOrganisationListResult listExternalOrganizationsUsingQuery(ExternalOrganizationsQuery externalOrganizationsQuery) throws ApiException {
        ApiResponse<ExternalOrganisationListResult> localVarResp = listExternalOrganizationsUsingQueryWithHttpInfo(externalOrganizationsQuery);
        return localVarResp.getData();
    }

    /**
     * Complex operation for external organizations
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @return ApiResponse&lt;ExternalOrganisationListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExternalOrganisationListResult> listExternalOrganizationsUsingQueryWithHttpInfo(ExternalOrganizationsQuery externalOrganizationsQuery) throws ApiException {
        okhttp3.Call localVarCall = listExternalOrganizationsUsingQueryValidateBeforeCall(externalOrganizationsQuery, null);
        Type localVarReturnType = new TypeToken<ExternalOrganisationListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Complex operation for external organizations (asynchronously)
     * Lists external organizations in the Pure instance, similar to the GET version, instead of using parameters to alter the response, an XML document is posted with the request. The XML document contains fields for all the parameters available for the GET version, but also additional filtering options. For documentation of the XML format see &lt;a href&#x3D;\&quot;documentation/Content/Topics/WebService/CT_ExternalOrganisation.htm#post_xml\&quot;&gt;External Organization documentation&lt;/a&gt;.
     * @param externalOrganizationsQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listExternalOrganizationsUsingQueryAsync(ExternalOrganizationsQuery externalOrganizationsQuery, final ApiCallback<ExternalOrganisationListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = listExternalOrganizationsUsingQueryValidateBeforeCall(externalOrganizationsQuery, _callback);
        Type localVarReturnType = new TypeToken<ExternalOrganisationListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
