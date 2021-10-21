# AuditEntryApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query**](AuditEntryApi.md#query) | **POST** /audit-entries/search | Query operation for audit entries


<a name="query"></a>
# **query**
> AuditEntryListResult query(auditEntriesQuery)

Query operation for audit entries

Lists audit entries in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AuditEntryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AuditEntryApi apiInstance = new AuditEntryApi(defaultClient);
    AuditEntriesQuery auditEntriesQuery = new AuditEntriesQuery(); // AuditEntriesQuery | The query to perform
    try {
      AuditEntryListResult result = apiInstance.query(auditEntriesQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditEntryApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditEntriesQuery** | [**AuditEntriesQuery**](AuditEntriesQuery.md)| The query to perform |

### Return type

[**AuditEntryListResult**](AuditEntryListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad request |  -  |

