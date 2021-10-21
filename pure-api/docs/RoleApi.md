# RoleApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRoles**](RoleApi.md#addRoles) | **PUT** /roles/{uuid} | Add roles to user


<a name="addRoles"></a>
# **addRoles**
> User addRoles(uuid, roles)

Add roles to user

Add roles to user

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.RoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    RoleApi apiInstance = new RoleApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to add roles to
    Roles roles = new Roles(); // Roles | The roles to add
    try {
      User result = apiInstance.addRoles(uuid, roles);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoleApi#addRoles");
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
 **uuid** | [**UUID**](.md)| UUID of the person to add roles to |
 **roles** | [**Roles**](Roles.md)| The roles to add |

### Return type

[**User**](User.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request |  -  |

