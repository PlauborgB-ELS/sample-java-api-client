# UserApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserApi.md#create) | **PUT** /users | Create user
[**delete**](UserApi.md#delete) | **DELETE** /users/{uuid} | Delete user
[**get**](UserApi.md#get) | **GET** /users/{uuid} | Get user
[**list**](UserApi.md#list) | **GET** /users | Lists all users
[**update**](UserApi.md#update) | **PUT** /users/{uuid} | Update user


<a name="create"></a>
# **create**
> User create(user)

Create user

Create user

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    User user = new User(); // User | The content to create
    try {
      User result = apiInstance.create(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#create");
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
 **user** | [**User**](User.md)| The content to create |

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

<a name="delete"></a>
# **delete**
> delete(uuid)

Delete user

Delete user with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the user
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#delete");
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
 **uuid** | [**UUID**](.md)| UUID of the user |

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
> User get(uuid)

Get user

Get user UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired user
    try {
      User result = apiInstance.get(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#get");
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
 **uuid** | [**UUID**](.md)| UUID of the desired user |

### Return type

[**User**](User.md)

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
> UserListResult list(size, offset, order)

Lists all users

Lists all users in the Pure instance. If you need to filter the users returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer size = 10; // Integer | Number of returned users per request.
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    String order = "order_example"; // String | The order of the list, must be a value from user_getOrderings
    try {
      UserListResult result = apiInstance.list(size, offset, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#list");
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
 **size** | **Integer**| Number of returned users per request. | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]
 **order** | **String**| The order of the list, must be a value from user_getOrderings | [optional]

### Return type

[**UserListResult**](UserListResult.md)

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
> User update(uuid, user)

Update user

Update user with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the user to update
    User user = new User(); // User | The content to update
    try {
      User result = apiInstance.update(uuid, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#update");
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
 **uuid** | [**UUID**](.md)| UUID of the user to update |
 **user** | [**User**](User.md)| The content to update |

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
**404** | Resource not found |  -  |

