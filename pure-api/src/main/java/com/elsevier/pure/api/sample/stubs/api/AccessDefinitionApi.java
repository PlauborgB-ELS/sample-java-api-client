/*
 * Pure API
 * This is an early access version of the new Pure write API.
 *
 * The version of the OpenAPI document: 0.1 Early Access
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


import com.elsevier.pure.api.sample.stubs.model.AccessDefinition;
import com.elsevier.pure.api.sample.stubs.model.AccessDefinitionListResult;
import com.elsevier.pure.api.sample.stubs.model.ProblemDetails;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessDefinitionApi {
    private ApiClient localVarApiClient;

    public AccessDefinitionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessDefinitionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for create
     * @param accessDefinition The content to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCall(AccessDefinition accessDefinition, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessDefinition;

        // create path and map variables
        String localVarPath = "/access-definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(AccessDefinition accessDefinition, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accessDefinition' is set
        if (accessDefinition == null) {
            throw new ApiException("Missing the required parameter 'accessDefinition' when calling create(Async)");
        }
        

        okhttp3.Call localVarCall = createCall(accessDefinition, _callback);
        return localVarCall;

    }

    /**
     * Create access definition
     * Create access definition
     * @param accessDefinition The content to create (required)
     * @return AccessDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public AccessDefinition create(AccessDefinition accessDefinition) throws ApiException {
        ApiResponse<AccessDefinition> localVarResp = createWithHttpInfo(accessDefinition);
        return localVarResp.getData();
    }

    /**
     * Create access definition
     * Create access definition
     * @param accessDefinition The content to create (required)
     * @return ApiResponse&lt;AccessDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessDefinition> createWithHttpInfo(AccessDefinition accessDefinition) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(accessDefinition, null);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create access definition (asynchronously)
     * Create access definition
     * @param accessDefinition The content to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAsync(AccessDefinition accessDefinition, final ApiCallback<AccessDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(accessDefinition, _callback);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param uuid UUID of the access definition (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCall(UUID uuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/access-definitions/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/problem+json"
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(UUID uuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling delete(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCall(uuid, _callback);
        return localVarCall;

    }

    /**
     * Delete access definition
     * Delete access definition with specific UUID.
     * @param uuid UUID of the access definition (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public void delete(UUID uuid) throws ApiException {
        deleteWithHttpInfo(uuid);
    }

    /**
     * Delete access definition
     * Delete access definition with specific UUID.
     * @param uuid UUID of the access definition (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(UUID uuid) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(uuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete access definition (asynchronously)
     * Delete access definition with specific UUID.
     * @param uuid UUID of the access definition (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(UUID uuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(uuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for get
     * @param uuid UUID of the desired access definition (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 301 </td><td> The requested content have changed UUID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCall(UUID uuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/access-definitions/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

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
    private okhttp3.Call getValidateBeforeCall(UUID uuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling get(Async)");
        }
        

        okhttp3.Call localVarCall = getCall(uuid, _callback);
        return localVarCall;

    }

    /**
     * Get access definition
     * Get access definition by UUID.
     * @param uuid UUID of the desired access definition (required)
     * @return AccessDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 301 </td><td> The requested content have changed UUID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public AccessDefinition get(UUID uuid) throws ApiException {
        ApiResponse<AccessDefinition> localVarResp = getWithHttpInfo(uuid);
        return localVarResp.getData();
    }

    /**
     * Get access definition
     * Get access definition by UUID.
     * @param uuid UUID of the desired access definition (required)
     * @return ApiResponse&lt;AccessDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 301 </td><td> The requested content have changed UUID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessDefinition> getWithHttpInfo(UUID uuid) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(uuid, null);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get access definition (asynchronously)
     * Get access definition by UUID.
     * @param uuid UUID of the desired access definition (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 301 </td><td> The requested content have changed UUID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsync(UUID uuid, final ApiCallback<AccessDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(uuid, _callback);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for list
     * @param size Number of returned access definitions per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from accessDefinition_getOrderings (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCall(Integer size, Integer offset, String order, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/access-definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

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
    private okhttp3.Call listValidateBeforeCall(Integer size, Integer offset, String order, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listCall(size, offset, order, _callback);
        return localVarCall;

    }

    /**
     * Lists all access definitions
     * Lists all access definitions in the Pure instance. If you need to filter the access definitions returned, see the POST version which supports additional filtering.
     * @param size Number of returned access definitions per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from accessDefinition_getOrderings (optional)
     * @return AccessDefinitionListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public AccessDefinitionListResult list(Integer size, Integer offset, String order) throws ApiException {
        ApiResponse<AccessDefinitionListResult> localVarResp = listWithHttpInfo(size, offset, order);
        return localVarResp.getData();
    }

    /**
     * Lists all access definitions
     * Lists all access definitions in the Pure instance. If you need to filter the access definitions returned, see the POST version which supports additional filtering.
     * @param size Number of returned access definitions per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from accessDefinition_getOrderings (optional)
     * @return ApiResponse&lt;AccessDefinitionListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessDefinitionListResult> listWithHttpInfo(Integer size, Integer offset, String order) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(size, offset, order, null);
        Type localVarReturnType = new TypeToken<AccessDefinitionListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists all access definitions (asynchronously)
     * Lists all access definitions in the Pure instance. If you need to filter the access definitions returned, see the POST version which supports additional filtering.
     * @param size Number of returned access definitions per request. (optional, default to 10)
     * @param offset The offset for the returned list. 0 or null value is from the start (optional, default to 0)
     * @param order The order of the list, must be a value from accessDefinition_getOrderings (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAsync(Integer size, Integer offset, String order, final ApiCallback<AccessDefinitionListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(size, offset, order, _callback);
        Type localVarReturnType = new TypeToken<AccessDefinitionListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param uuid UUID of the access definition to update (required)
     * @param accessDefinition The content to update (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCall(UUID uuid, AccessDefinition accessDefinition, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessDefinition;

        // create path and map variables
        String localVarPath = "/access-definitions/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateValidateBeforeCall(UUID uuid, AccessDefinition accessDefinition, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling update(Async)");
        }
        
        // verify the required parameter 'accessDefinition' is set
        if (accessDefinition == null) {
            throw new ApiException("Missing the required parameter 'accessDefinition' when calling update(Async)");
        }
        

        okhttp3.Call localVarCall = updateCall(uuid, accessDefinition, _callback);
        return localVarCall;

    }

    /**
     * Update access definition
     * Update access definition with specific UUID.
     * @param uuid UUID of the access definition to update (required)
     * @param accessDefinition The content to update (required)
     * @return AccessDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public AccessDefinition update(UUID uuid, AccessDefinition accessDefinition) throws ApiException {
        ApiResponse<AccessDefinition> localVarResp = updateWithHttpInfo(uuid, accessDefinition);
        return localVarResp.getData();
    }

    /**
     * Update access definition
     * Update access definition with specific UUID.
     * @param uuid UUID of the access definition to update (required)
     * @param accessDefinition The content to update (required)
     * @return ApiResponse&lt;AccessDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessDefinition> updateWithHttpInfo(UUID uuid, AccessDefinition accessDefinition) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(uuid, accessDefinition, null);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update access definition (asynchronously)
     * Update access definition with specific UUID.
     * @param uuid UUID of the access definition to update (required)
     * @param accessDefinition The content to update (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAsync(UUID uuid, AccessDefinition accessDefinition, final ApiCallback<AccessDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(uuid, accessDefinition, _callback);
        Type localVarReturnType = new TypeToken<AccessDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}