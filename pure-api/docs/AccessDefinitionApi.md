# AccessDefinitionApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccessDefinitionApi.md#create) | **PUT** /access-definitions | Create access definition
[**delete**](AccessDefinitionApi.md#delete) | **DELETE** /access-definitions/{uuid} | Delete access definition
[**get**](AccessDefinitionApi.md#get) | **GET** /access-definitions/{uuid} | Get access definition
[**list**](AccessDefinitionApi.md#list) | **GET** /access-definitions | Lists all access definitions
[**update**](AccessDefinitionApi.md#update) | **PUT** /access-definitions/{uuid} | Update access definition


<a name="create"></a>
# **create**
> AccessDefinition create(accessDefinition)

Create access definition

Create access definition

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AccessDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AccessDefinitionApi apiInstance = new AccessDefinitionApi(defaultClient);
    AccessDefinition accessDefinition = new AccessDefinition(); // AccessDefinition | The content to create
    try {
      AccessDefinition result = apiInstance.create(accessDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessDefinitionApi#create");
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
 **accessDefinition** | [**AccessDefinition**](AccessDefinition.md)| The content to create |

### Return type

[**AccessDefinition**](AccessDefinition.md)

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

<a name="delete"></a>
# **delete**
> delete(uuid)

Delete access definition

Delete access definition with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AccessDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AccessDefinitionApi apiInstance = new AccessDefinitionApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the access definition
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessDefinitionApi#delete");
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
 **uuid** | [**UUID**](.md)| UUID of the access definition |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful operation |  -  |
**404** | Resource not found |  -  |

<a name="get"></a>
# **get**
> AccessDefinition get(uuid)

Get access definition

Get access definition by UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AccessDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AccessDefinitionApi apiInstance = new AccessDefinitionApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired access definition
    try {
      AccessDefinition result = apiInstance.get(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessDefinitionApi#get");
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
 **uuid** | [**UUID**](.md)| UUID of the desired access definition |

### Return type

[**AccessDefinition**](AccessDefinition.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**301** | The requested content have changed UUID |  -  |
**404** | Resource not found |  -  |

<a name="list"></a>
# **list**
> AccessDefinitionListResult list(size, offset, order)

Lists all access definitions

Lists all access definitions in the Pure instance. If you need to filter the access definitions returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AccessDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AccessDefinitionApi apiInstance = new AccessDefinitionApi(defaultClient);
    Integer size = 10; // Integer | Number of returned access definitions per request.
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    String order = "order_example"; // String | The order of the list, must be a value from accessDefinition_getOrderings
    try {
      AccessDefinitionListResult result = apiInstance.list(size, offset, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessDefinitionApi#list");
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
 **size** | **Integer**| Number of returned access definitions per request. | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]
 **order** | **String**| The order of the list, must be a value from accessDefinition_getOrderings | [optional]

### Return type

[**AccessDefinitionListResult**](AccessDefinitionListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="update"></a>
# **update**
> AccessDefinition update(uuid, accessDefinition)

Update access definition

Update access definition with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.AccessDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    AccessDefinitionApi apiInstance = new AccessDefinitionApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the access definition to update
    AccessDefinition accessDefinition = new AccessDefinition(); // AccessDefinition | The content to update
    try {
      AccessDefinition result = apiInstance.update(uuid, accessDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessDefinitionApi#update");
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
 **uuid** | [**UUID**](.md)| UUID of the access definition to update |
 **accessDefinition** | [**AccessDefinition**](AccessDefinition.md)| The content to update |

### Return type

[**AccessDefinition**](AccessDefinition.md)

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
**404** | Resource not found |  -  |

