# ExternalOrganizationApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ExternalOrganizationApi.md#create) | **PUT** /external-organizations | Create external organization
[**delete**](ExternalOrganizationApi.md#delete) | **DELETE** /external-organizations/{uuid} | Delete external organization
[**get**](ExternalOrganizationApi.md#get) | **GET** /external-organizations/{uuid} | Get external organization
[**getAllowedAddressCountries**](ExternalOrganizationApi.md#getAllowedAddressCountries) | **GET** /external-organizations/allowed-address-countries | A list of allowed address countries
[**getAllowedAddressSubdivisions**](ExternalOrganizationApi.md#getAllowedAddressSubdivisions) | **GET** /external-organizations/allowed-address-subdivision | A list of allowed address subdivisions
[**getAllowedNatureTypes**](ExternalOrganizationApi.md#getAllowedNatureTypes) | **GET** /external-organizations/allowed-nature-types | A list of allowed nature types
[**getAllowedTypes**](ExternalOrganizationApi.md#getAllowedTypes) | **GET** /external-organizations/allowed-types | A list of allowed external organization types
[**getAllowedWorkflowSteps**](ExternalOrganizationApi.md#getAllowedWorkflowSteps) | **GET** /external-organizations/allowed-workflow-steps | A list of allowed workflow steps
[**getOrderings**](ExternalOrganizationApi.md#getOrderings) | **GET** /external-organizations/orderings | Lists available orderings
[**list**](ExternalOrganizationApi.md#list) | **GET** /external-organizations | Lists all external organizations
[**query**](ExternalOrganizationApi.md#query) | **POST** /external-organizations/search | Query operation for external organizations
[**update**](ExternalOrganizationApi.md#update) | **PUT** /external-organizations/{uuid} | Update external organization


<a name="create"></a>
# **create**
> ExternalOrganization create(externalOrganization)

Create external organization

Create external organization

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    ExternalOrganization externalOrganization = new ExternalOrganization(); // ExternalOrganization | The content to create
    try {
      ExternalOrganization result = apiInstance.create(externalOrganization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#create");
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
 **externalOrganization** | [**ExternalOrganization**](ExternalOrganization.md)| The content to create |

### Return type

[**ExternalOrganization**](ExternalOrganization.md)

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

Delete external organization

Delete external organization with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    String uuid = "uuid_example"; // String | UUID of the external organization
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#delete");
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
 **uuid** | **String**| UUID of the external organization |

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
> ExternalOrganization get(uuid)

Get external organization

Get external organization with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    String uuid = "uuid_example"; // String | UUID of the desired external organization
    try {
      ExternalOrganization result = apiInstance.get(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#get");
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
 **uuid** | **String**| UUID of the desired external organization |

### Return type

[**ExternalOrganization**](ExternalOrganization.md)

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

<a name="getAllowedAddressCountries"></a>
# **getAllowedAddressCountries**
> List&lt;ClassificationRef&gt; getAllowedAddressCountries()

A list of allowed address countries

Get a list of allowed countries that can be used for the &#39;address.country&#39; attribute of external organizations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      List<ClassificationRef> result = apiInstance.getAllowedAddressCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedAddressCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClassificationRef&gt;**](ClassificationRef.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedAddressSubdivisions"></a>
# **getAllowedAddressSubdivisions**
> List&lt;ClassificationRef&gt; getAllowedAddressSubdivisions()

A list of allowed address subdivisions

Get a list of allowed subdivisions that can be used for the &#39;address.subdivisions&#39; attribute of external organizations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      List<ClassificationRef> result = apiInstance.getAllowedAddressSubdivisions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedAddressSubdivisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClassificationRef&gt;**](ClassificationRef.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedNatureTypes"></a>
# **getAllowedNatureTypes**
> List&lt;ClassificationRef&gt; getAllowedNatureTypes()

A list of allowed nature types

Get a list of allowed nature types that can be used for the &#39;natureTypes&#39; attribute of external organizations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      List<ClassificationRef> result = apiInstance.getAllowedNatureTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedNatureTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClassificationRef&gt;**](ClassificationRef.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedTypes"></a>
# **getAllowedTypes**
> List&lt;ClassificationRef&gt; getAllowedTypes()

A list of allowed external organization types

Get a list of allowed types that can be used for the &#39;type&#39; attribute of external organizations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      List<ClassificationRef> result = apiInstance.getAllowedTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClassificationRef&gt;**](ClassificationRef.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedWorkflowSteps"></a>
# **getAllowedWorkflowSteps**
> List&lt;Workflow&gt; getAllowedWorkflowSteps()

A list of allowed workflow steps

Get a list of allowed workflow steps that can be used for the &#39;workflow&#39; attribute of external organizations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      List<Workflow> result = apiInstance.getAllowedWorkflowSteps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedWorkflowSteps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Workflow&gt;**](Workflow.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getOrderings"></a>
# **getOrderings**
> OrderingsList getOrderings()

Lists available orderings

Lists all orderings available to the external organization endpoint. These values can be used by the order parameter.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    try {
      OrderingsList result = apiInstance.getOrderings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getOrderings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderingsList**](OrderingsList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="list"></a>
# **list**
> ExternalOrganizationListResult list(size, offset, order)

Lists all external organizations

Lists all external organizations in the Pure instance. If you need to filter the external organizations returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    Integer size = 10; // Integer | Number of returned external organizations per request.
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    String order = "order_example"; // String | The order of the list, must be a value from getExternalOrganizationOrderings
    try {
      ExternalOrganizationListResult result = apiInstance.list(size, offset, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#list");
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
 **size** | **Integer**| Number of returned external organizations per request. | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]
 **order** | **String**| The order of the list, must be a value from getExternalOrganizationOrderings | [optional]

### Return type

[**ExternalOrganizationListResult**](ExternalOrganizationListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="query"></a>
# **query**
> ExternalOrganizationListResult query(externalOrganizationsQuery)

Query operation for external organizations

Lists external organizations in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    ExternalOrganizationsQuery externalOrganizationsQuery = new ExternalOrganizationsQuery(); // ExternalOrganizationsQuery | The query to perform
    try {
      ExternalOrganizationListResult result = apiInstance.query(externalOrganizationsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#query");
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
 **externalOrganizationsQuery** | [**ExternalOrganizationsQuery**](ExternalOrganizationsQuery.md)| The query to perform |

### Return type

[**ExternalOrganizationListResult**](ExternalOrganizationListResult.md)

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

<a name="update"></a>
# **update**
> ExternalOrganization update(uuid, externalOrganization)

Update external organization

Update external organization with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalOrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalOrganizationApi apiInstance = new ExternalOrganizationApi(defaultClient);
    String uuid = "uuid_example"; // String | UUID of the external organization to update
    ExternalOrganization externalOrganization = new ExternalOrganization(); // ExternalOrganization | The content to update
    try {
      ExternalOrganization result = apiInstance.update(uuid, externalOrganization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#update");
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
 **uuid** | **String**| UUID of the external organization to update |
 **externalOrganization** | [**ExternalOrganization**](ExternalOrganization.md)| The content to update |

### Return type

[**ExternalOrganization**](ExternalOrganization.md)

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

