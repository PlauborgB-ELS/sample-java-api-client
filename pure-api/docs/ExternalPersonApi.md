# ExternalPersonApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ExternalPersonApi.md#create) | **PUT** /external-persons | Create external person
[**createNote**](ExternalPersonApi.md#createNote) | **PUT** /external-persons/{uuid}/notes | Create note
[**delete**](ExternalPersonApi.md#delete) | **DELETE** /external-persons/{uuid} | Delete external person
[**dependents**](ExternalPersonApi.md#dependents) | **GET** /external-persons/{uuid}/dependents | Lists all dependents to a external person
[**get**](ExternalPersonApi.md#get) | **GET** /external-persons/{uuid} | Get external person
[**getAllowedClassifiedIdentifierTypes**](ExternalPersonApi.md#getAllowedClassifiedIdentifierTypes) | **GET** /external-persons/allowed-classified-identifier-types | A list of allowed classified identifier types
[**getAllowedCountries**](ExternalPersonApi.md#getAllowedCountries) | **GET** /external-persons/allowed-countries | A list of allowed countries
[**getAllowedDisciplineSchemes**](ExternalPersonApi.md#getAllowedDisciplineSchemes) | **GET** /external-persons/disciplines/allowed-discipline-schemes | A list of allowed discipline schemes
[**getAllowedDisciplines**](ExternalPersonApi.md#getAllowedDisciplines) | **GET** /external-persons/disciplines/{discipline-scheme}/allowed-disciplines | A list of allowed disciplines for a specific discipline scheme
[**getAllowedKeywordGroupConfigurationClassifications**](ExternalPersonApi.md#getAllowedKeywordGroupConfigurationClassifications) | **GET** /external-persons/allowed-keyword-group-configurations/{id}/classifications | A list of allowed classifications for the specified keyword group
[**getAllowedKeywordGroupConfigurations**](ExternalPersonApi.md#getAllowedKeywordGroupConfigurations) | **GET** /external-persons/allowed-keyword-group-configurations | A list of keyword group configurations
[**getAllowedLocales**](ExternalPersonApi.md#getAllowedLocales) | **GET** /external-persons/allowed-locales | A list of allowed locales in localized strings
[**getAllowedTypes**](ExternalPersonApi.md#getAllowedTypes) | **GET** /external-persons/allowed-types | A list of allowed external person types
[**getAllowedWorkflowSteps**](ExternalPersonApi.md#getAllowedWorkflowSteps) | **GET** /external-persons/allowed-workflow-steps | A list of allowed workflow steps
[**getDisciplineAssociation**](ExternalPersonApi.md#getDisciplineAssociation) | **GET** /external-persons/{uuid}/disciplines/{discipline-scheme} | Get disciplines from the discipline scheme associated with the external person
[**getOrderings**](ExternalPersonApi.md#getOrderings) | **GET** /external-persons/orderings | Lists available orderings
[**list**](ExternalPersonApi.md#list) | **GET** /external-persons | Lists all external persons
[**listDisciplineAssociations**](ExternalPersonApi.md#listDisciplineAssociations) | **POST** /external-persons/disciplines/{discipline-scheme}/search | Query operation for disciplines associated with external persons
[**listNotes**](ExternalPersonApi.md#listNotes) | **GET** /external-persons/{uuid}/notes | Lists notes
[**putDisciplineAssociation**](ExternalPersonApi.md#putDisciplineAssociation) | **PUT** /external-persons/{uuid}/disciplines/{discipline-scheme} | Update disciplines from the discipline scheme associated with the external person
[**query**](ExternalPersonApi.md#query) | **POST** /external-persons/search | Query operation for external persons
[**update**](ExternalPersonApi.md#update) | **PUT** /external-persons/{uuid} | Update external persons


<a name="create"></a>
# **create**
> ExternalPerson create(externalPerson)

Create external person

Create external person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    ExternalPerson externalPerson = new ExternalPerson(); // ExternalPerson | The content to create
    try {
      ExternalPerson result = apiInstance.create(externalPerson);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#create");
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
 **externalPerson** | [**ExternalPerson**](ExternalPerson.md)| The content to create |

### Return type

[**ExternalPerson**](ExternalPerson.md)

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

<a name="createNote"></a>
# **createNote**
> Note createNote(uuid, note)

Create note

Create note and associate it with an external person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person to add note to
    Note note = new Note(); // Note | The note to create
    try {
      Note result = apiInstance.createNote(uuid, note);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#createNote");
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
 **uuid** | [**UUID**](.md)| UUID of the external person to add note to |
 **note** | [**Note**](Note.md)| The note to create |

### Return type

[**Note**](Note.md)

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

Delete external person

Delete external person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#delete");
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
 **uuid** | [**UUID**](.md)| UUID of the external person |

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

<a name="dependents"></a>
# **dependents**
> ContentRefListResult dependents(uuid, verbose)

Lists all dependents to a external person

Lists all dependents to a external person with the specified UUID. If the user dont have access to view all the dependent content, an authorization error will be thrown. 

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person
    Boolean verbose = false; // Boolean | Default: false. Setting this to true will add links and names to the output but will also have an impact on performance. Use with coution.
    try {
      ContentRefListResult result = apiInstance.dependents(uuid, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#dependents");
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
 **uuid** | [**UUID**](.md)| UUID of the external person |
 **verbose** | **Boolean**| Default: false. Setting this to true will add links and names to the output but will also have an impact on performance. Use with coution. | [optional] [default to false]

### Return type

[**ContentRefListResult**](ContentRefListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="get"></a>
# **get**
> ExternalPerson get(uuid)

Get external person

Get external person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired external person
    try {
      ExternalPerson result = apiInstance.get(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#get");
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
 **uuid** | [**UUID**](.md)| UUID of the desired external person |

### Return type

[**ExternalPerson**](ExternalPerson.md)

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

<a name="getAllowedClassifiedIdentifierTypes"></a>
# **getAllowedClassifiedIdentifierTypes**
> ClassificationRefList getAllowedClassifiedIdentifierTypes()

A list of allowed classified identifier types

Get a list of allowed classified identifier types that can be used for the &#39;identifiers.type&#39; attribute of external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedClassifiedIdentifierTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedClassifiedIdentifierTypes");
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

[**ClassificationRefList**](ClassificationRefList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedCountries"></a>
# **getAllowedCountries**
> ClassificationRefList getAllowedCountries()

A list of allowed countries

Get a list of allowed countries that can be used for the &#39;countries&#39; attribute of external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedCountries");
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

[**ClassificationRefList**](ClassificationRefList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedDisciplineSchemes"></a>
# **getAllowedDisciplineSchemes**
> DisciplinesDisciplineSchemeListResult getAllowedDisciplineSchemes()

A list of allowed discipline schemes

Get a list fo a allowed discipline schemes for external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      DisciplinesDisciplineSchemeListResult result = apiInstance.getAllowedDisciplineSchemes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedDisciplineSchemes");
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

[**DisciplinesDisciplineSchemeListResult**](DisciplinesDisciplineSchemeListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedDisciplines"></a>
# **getAllowedDisciplines**
> DisciplinesDisciplineListResult getAllowedDisciplines(disciplineScheme, size, offset)

A list of allowed disciplines for a specific discipline scheme

Get a list of a allowed disciplines for specific discipline scheme for external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme for external persons
    Integer size = 10; // Integer | Number of returned disciplines per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      DisciplinesDisciplineListResult result = apiInstance.getAllowedDisciplines(disciplineScheme, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedDisciplines");
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
 **disciplineScheme** | **String**| Identifier for the discipline scheme for external persons |
 **size** | **Integer**| Number of returned disciplines per request | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]

### Return type

[**DisciplinesDisciplineListResult**](DisciplinesDisciplineListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedKeywordGroupConfigurationClassifications"></a>
# **getAllowedKeywordGroupConfigurationClassifications**
> ClassificationRefList getAllowedKeywordGroupConfigurationClassifications(id)

A list of allowed classifications for the specified keyword group

Get a list of allowed classifications that can be used when submitting a specified keyword group.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    Long id = 56L; // Long | Pure id of the keyword group configuration
    try {
      ClassificationRefList result = apiInstance.getAllowedKeywordGroupConfigurationClassifications(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedKeywordGroupConfigurationClassifications");
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
 **id** | **Long**| Pure id of the keyword group configuration |

### Return type

[**ClassificationRefList**](ClassificationRefList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedKeywordGroupConfigurations"></a>
# **getAllowedKeywordGroupConfigurations**
> KeywordGroupConfigurationList getAllowedKeywordGroupConfigurations()

A list of keyword group configurations

Get a list of allowed keyword group configurations that can be used when submitting keyword groups.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      KeywordGroupConfigurationList result = apiInstance.getAllowedKeywordGroupConfigurations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedKeywordGroupConfigurations");
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

[**KeywordGroupConfigurationList**](KeywordGroupConfigurationList.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getAllowedLocales"></a>
# **getAllowedLocales**
> LocalesList getAllowedLocales()

A list of allowed locales in localized strings

Get a list of allowed locales that can be used when submitting localized string entities.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      LocalesList result = apiInstance.getAllowedLocales();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedLocales");
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

[**LocalesList**](LocalesList.md)

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
> ClassificationRefList getAllowedTypes()

A list of allowed external person types

Get a list of allowed types that can be used for the &#39;type&#39; attribute of external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedTypes");
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

[**ClassificationRefList**](ClassificationRefList.md)

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
> WorkflowListResult getAllowedWorkflowSteps()

A list of allowed workflow steps

Get a list of allowed workflow steps that can be used for the &#39;workflow&#39; attribute of external persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      WorkflowListResult result = apiInstance.getAllowedWorkflowSteps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getAllowedWorkflowSteps");
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

[**WorkflowListResult**](WorkflowListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="getDisciplineAssociation"></a>
# **getDisciplineAssociation**
> DisciplinesAssociation getDisciplineAssociation(uuid, disciplineScheme)

Get disciplines from the discipline scheme associated with the external person

Get disciplines from the discipline scheme associated with the external person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired external person
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    try {
      DisciplinesAssociation result = apiInstance.getDisciplineAssociation(uuid, disciplineScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the desired external person |
 **disciplineScheme** | **String**| Identifier for the discipline scheme |

### Return type

[**DisciplinesAssociation**](DisciplinesAssociation.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | Resource not found |  -  |

<a name="getOrderings"></a>
# **getOrderings**
> OrderingsList getOrderings()

Lists available orderings

Lists all orderings available to the external person endpoint. These values can be used by the order parameter.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    try {
      OrderingsList result = apiInstance.getOrderings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#getOrderings");
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
> ExternalPersonListResult list(size, offset, order)

Lists all external persons

Lists all external persons in the Pure instance. If you need to filter the external persons returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    Integer size = 10; // Integer | Number of returned external persons per request.
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    String order = "order_example"; // String | The order of the list, must be a value from getExternalPersonOrderings
    try {
      ExternalPersonListResult result = apiInstance.list(size, offset, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#list");
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
 **size** | **Integer**| Number of returned external persons per request. | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]
 **order** | **String**| The order of the list, must be a value from getExternalPersonOrderings | [optional]

### Return type

[**ExternalPersonListResult**](ExternalPersonListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |

<a name="listDisciplineAssociations"></a>
# **listDisciplineAssociations**
> DisciplinesAssociationListResult listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery)

Query operation for disciplines associated with external persons

Lists disciplines from the discipline scheme associated with external persons in the Pure instance that matches the provided query.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociationsQuery disciplinesAssociationsQuery = new DisciplinesAssociationsQuery(); // DisciplinesAssociationsQuery | The query to perform
    try {
      DisciplinesAssociationListResult result = apiInstance.listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#listDisciplineAssociations");
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
 **disciplineScheme** | **String**| Identifier for the discipline scheme |
 **disciplinesAssociationsQuery** | [**DisciplinesAssociationsQuery**](DisciplinesAssociationsQuery.md)| The query to perform |

### Return type

[**DisciplinesAssociationListResult**](DisciplinesAssociationListResult.md)

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

<a name="listNotes"></a>
# **listNotes**
> NoteListResult listNotes(uuid, size, offset)

Lists notes

Lists notes associated with an external person ordered by date (nulls last)

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person to get notes for
    Integer size = 10; // Integer | Number of returned notes per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      NoteListResult result = apiInstance.listNotes(uuid, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#listNotes");
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
 **uuid** | [**UUID**](.md)| UUID of the external person to get notes for |
 **size** | **Integer**| Number of returned notes per request | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]

### Return type

[**NoteListResult**](NoteListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | External person not found |  -  |

<a name="putDisciplineAssociation"></a>
# **putDisciplineAssociation**
> DisciplinesAssociation putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation)

Update disciplines from the discipline scheme associated with the external person

Update disciplines from the discipline scheme associated with the external person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person to update
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociation disciplinesAssociation = new DisciplinesAssociation(); // DisciplinesAssociation | The disciplines association to create
    try {
      DisciplinesAssociation result = apiInstance.putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#putDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the external person to update |
 **disciplineScheme** | **String**| Identifier for the discipline scheme |
 **disciplinesAssociation** | [**DisciplinesAssociation**](DisciplinesAssociation.md)| The disciplines association to create |

### Return type

[**DisciplinesAssociation**](DisciplinesAssociation.md)

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

<a name="query"></a>
# **query**
> ExternalPersonListResult query(externalPersonsQuery)

Query operation for external persons

Lists external persons in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    ExternalPersonsQuery externalPersonsQuery = new ExternalPersonsQuery(); // ExternalPersonsQuery | The query to perform
    try {
      ExternalPersonListResult result = apiInstance.query(externalPersonsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#query");
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
 **externalPersonsQuery** | [**ExternalPersonsQuery**](ExternalPersonsQuery.md)| The query to perform |

### Return type

[**ExternalPersonListResult**](ExternalPersonListResult.md)

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
> ExternalPerson update(uuid, externalPerson)

Update external persons

Update external persons with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.ExternalPersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    ExternalPersonApi apiInstance = new ExternalPersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the external person to update
    ExternalPerson externalPerson = new ExternalPerson(); // ExternalPerson | The content to update
    try {
      ExternalPerson result = apiInstance.update(uuid, externalPerson);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPersonApi#update");
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
 **uuid** | [**UUID**](.md)| UUID of the external person to update |
 **externalPerson** | [**ExternalPerson**](ExternalPerson.md)| The content to update |

### Return type

[**ExternalPerson**](ExternalPerson.md)

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

