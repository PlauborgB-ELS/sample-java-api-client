# ExternalOrganizationApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ExternalOrganizationApi.md#create) | **PUT** /external-organizations | Create external organization
[**createNote**](ExternalOrganizationApi.md#createNote) | **PUT** /external-organizations/{uuid}/notes | Create note
[**delete**](ExternalOrganizationApi.md#delete) | **DELETE** /external-organizations/{uuid} | Delete external organization
[**dependents**](ExternalOrganizationApi.md#dependents) | **GET** /external-organizations/{uuid}/dependents | Lists all dependents to the external organization
[**fileUploads**](ExternalOrganizationApi.md#fileUploads) | **PUT** /external-organizations/file-uploads | Upload file to a specific external organization
[**get**](ExternalOrganizationApi.md#get) | **GET** /external-organizations/{uuid} | Get external organization
[**getAllowedAddressCountries**](ExternalOrganizationApi.md#getAllowedAddressCountries) | **GET** /external-organizations/allowed-address-countries | A list of allowed address countries
[**getAllowedAddressSubdivisions**](ExternalOrganizationApi.md#getAllowedAddressSubdivisions) | **GET** /external-organizations/allowed-address-subdivision | A list of allowed address subdivisions
[**getAllowedClassifiedIdentifierTypes**](ExternalOrganizationApi.md#getAllowedClassifiedIdentifierTypes) | **GET** /external-organizations/allowed-classified-identifier-types | A list of allowed classified identifier types
[**getAllowedClassifiedImageTypes**](ExternalOrganizationApi.md#getAllowedClassifiedImageTypes) | **GET** /external-organizations/allowed-classified-file-types | A list of allowed classified identifier types
[**getAllowedDisciplineSchemes**](ExternalOrganizationApi.md#getAllowedDisciplineSchemes) | **GET** /external-organizations/disciplines/allowed-discipline-schemes | A list of allowed discipline schemes
[**getAllowedDisciplines**](ExternalOrganizationApi.md#getAllowedDisciplines) | **GET** /external-organizations/disciplines/{discipline-scheme}/allowed-disciplines | A list of allowed disciplines for a specific discipline scheme
[**getAllowedDocumentLicenses**](ExternalOrganizationApi.md#getAllowedDocumentLicenses) | **GET** /external-organizations/allowed-document-licenses | A list of allowed document licenses
[**getAllowedDocumentTypes**](ExternalOrganizationApi.md#getAllowedDocumentTypes) | **GET** /external-organizations/allowed-document-types | A list of allowed document types
[**getAllowedKeywordGroupConfigurationClassifications**](ExternalOrganizationApi.md#getAllowedKeywordGroupConfigurationClassifications) | **GET** /external-organizations/allowed-keyword-group-configurations/{id}/classifications | A list of allowed classifications for the specified keyword group
[**getAllowedKeywordGroupConfigurations**](ExternalOrganizationApi.md#getAllowedKeywordGroupConfigurations) | **GET** /external-organizations/allowed-keyword-group-configurations | A list of keyword group configurations
[**getAllowedLinkTypes**](ExternalOrganizationApi.md#getAllowedLinkTypes) | **GET** /external-organizations/allowed-link-types | A list of allowed link types
[**getAllowedLocales**](ExternalOrganizationApi.md#getAllowedLocales) | **GET** /external-organizations/allowed-locales | A list of allowed locales in localized strings
[**getAllowedNatureTypes**](ExternalOrganizationApi.md#getAllowedNatureTypes) | **GET** /external-organizations/allowed-nature-types | A list of allowed nature types
[**getAllowedTypes**](ExternalOrganizationApi.md#getAllowedTypes) | **GET** /external-organizations/allowed-types | A list of allowed external organization types
[**getAllowedWorkflowSteps**](ExternalOrganizationApi.md#getAllowedWorkflowSteps) | **GET** /external-organizations/allowed-workflow-steps | A list of allowed workflow steps
[**getDisciplineAssociation**](ExternalOrganizationApi.md#getDisciplineAssociation) | **GET** /external-organizations/{uuid}/disciplines/{discipline-scheme} | Get disciplines from the discipline scheme associated with the external organization
[**getFile**](ExternalOrganizationApi.md#getFile) | **GET** /external-organizations/{uuid}/files/{fileId} | Get file from the external organization
[**getOrderings**](ExternalOrganizationApi.md#getOrderings) | **GET** /external-organizations/orderings | Lists available orderings
[**list**](ExternalOrganizationApi.md#list) | **GET** /external-organizations | Lists all external organizations
[**listDisciplineAssociations**](ExternalOrganizationApi.md#listDisciplineAssociations) | **POST** /external-organizations/disciplines/{discipline-scheme}/search | Query operation for disciplines associated with external organizations
[**listNotes**](ExternalOrganizationApi.md#listNotes) | **GET** /external-organizations/{uuid}/notes | Lists notes
[**merge**](ExternalOrganizationApi.md#merge) | **POST** /external-organizations/merge | Merge external organizations
[**previewDeduplication**](ExternalOrganizationApi.md#previewDeduplication) | **POST** /external-organizations/preview-deduplication | Preview deduplication of external organizations
[**putDisciplineAssociation**](ExternalOrganizationApi.md#putDisciplineAssociation) | **PUT** /external-organizations/{uuid}/disciplines/{discipline-scheme} | Update disciplines from the discipline scheme associated with the external organization
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

<a name="createNote"></a>
# **createNote**
> Note createNote(uuid, note)

Create note

Create note and associate it with an external organization

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
    UUID uuid = new UUID(); // UUID | UUID of the external organization to add note to
    Note note = new Note(); // Note | The note to create
    try {
      Note result = apiInstance.createNote(uuid, note);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#createNote");
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
 **uuid** | [**UUID**](.md)| UUID of the external organization to add note to |
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
    UUID uuid = new UUID(); // UUID | UUID of the external organization
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
 **uuid** | [**UUID**](.md)| UUID of the external organization |

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

Lists all dependents to the external organization

Lists all dependents to the external organization with the specified UUID. If the user dont have access to view all the dependent content, an authorization error will be thrown. 

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
    UUID uuid = new UUID(); // UUID | UUID of the external organization to update
    Boolean verbose = false; // Boolean | Default: false. Setting this to true will add links and names to the output but will also have an impact on performance. Use with coution.
    try {
      ContentRefListResult result = apiInstance.dependents(uuid, verbose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#dependents");
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
 **uuid** | [**UUID**](.md)| UUID of the external organization to update |
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

<a name="fileUploads"></a>
# **fileUploads**
> UploadedFile fileUploads(body, contentType)

Upload file to a specific external organization

Uploads file for the external organization

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
    File body = new File("/path/to/file"); // File | 
    String contentType = "contentType_example"; // String | Set the mime type for the file
    try {
      UploadedFile result = apiInstance.fileUploads(body, contentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#fileUploads");
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
 **body** | **File**|  |
 **contentType** | **String**| Set the mime type for the file | [optional]

### Return type

[**UploadedFile**](UploadedFile.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

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
    UUID uuid = new UUID(); // UUID | UUID of the desired external organization
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
 **uuid** | [**UUID**](.md)| UUID of the desired external organization |

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
> ClassificationRefList getAllowedAddressCountries()

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
      ClassificationRefList result = apiInstance.getAllowedAddressCountries();
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

<a name="getAllowedAddressSubdivisions"></a>
# **getAllowedAddressSubdivisions**
> ClassificationRefList getAllowedAddressSubdivisions()

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
      ClassificationRefList result = apiInstance.getAllowedAddressSubdivisions();
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

<a name="getAllowedClassifiedIdentifierTypes"></a>
# **getAllowedClassifiedIdentifierTypes**
> ClassificationRefList getAllowedClassifiedIdentifierTypes()

A list of allowed classified identifier types

Get a list of allowed classified identifier types that can be used for the &#39;identifiers.type&#39; attribute of external organizations

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
      ClassificationRefList result = apiInstance.getAllowedClassifiedIdentifierTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedClassifiedIdentifierTypes");
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

<a name="getAllowedClassifiedImageTypes"></a>
# **getAllowedClassifiedImageTypes**
> ClassificationRefList getAllowedClassifiedImageTypes()

A list of allowed classified identifier types

Get a list of allowed classified image types that can be used for the &#39;images.type&#39; attribute of external organizations

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
      ClassificationRefList result = apiInstance.getAllowedClassifiedImageTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedClassifiedImageTypes");
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

Get a list fo a allowed discipline schemes for external organizations

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
      DisciplinesDisciplineSchemeListResult result = apiInstance.getAllowedDisciplineSchemes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedDisciplineSchemes");
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

Get a list of a allowed disciplines for specific discipline scheme for external organizations

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
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme for external organizations
    Integer size = 10; // Integer | Number of returned disciplines per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      DisciplinesDisciplineListResult result = apiInstance.getAllowedDisciplines(disciplineScheme, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedDisciplines");
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
 **disciplineScheme** | **String**| Identifier for the discipline scheme for external organizations |
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

<a name="getAllowedDocumentLicenses"></a>
# **getAllowedDocumentLicenses**
> ClassificationRefList getAllowedDocumentLicenses()

A list of allowed document licenses

Get a list of allowed document licenses that can be used for the &#39;documents.license&#39; attribute of external organizations

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
      ClassificationRefList result = apiInstance.getAllowedDocumentLicenses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedDocumentLicenses");
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

<a name="getAllowedDocumentTypes"></a>
# **getAllowedDocumentTypes**
> ClassificationRefList getAllowedDocumentTypes()

A list of allowed document types

Get a list of allowed document types that can be used for the &#39;documents.type&#39; attribute of external organizations

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
      ClassificationRefList result = apiInstance.getAllowedDocumentTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedDocumentTypes");
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
    Long id = 56L; // Long | Pure id of the keyword group configuration
    try {
      ClassificationRefList result = apiInstance.getAllowedKeywordGroupConfigurationClassifications(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedKeywordGroupConfigurationClassifications");
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
      KeywordGroupConfigurationList result = apiInstance.getAllowedKeywordGroupConfigurations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedKeywordGroupConfigurations");
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

<a name="getAllowedLinkTypes"></a>
# **getAllowedLinkTypes**
> ClassificationRefList getAllowedLinkTypes()

A list of allowed link types

Get a list of allowed link types that can be used for the &#39;links.linkType&#39; attribute of external organizations

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
      ClassificationRefList result = apiInstance.getAllowedLinkTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedLinkTypes");
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
      LocalesList result = apiInstance.getAllowedLocales();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getAllowedLocales");
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

<a name="getAllowedNatureTypes"></a>
# **getAllowedNatureTypes**
> ClassificationRefList getAllowedNatureTypes()

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
      ClassificationRefList result = apiInstance.getAllowedNatureTypes();
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

<a name="getAllowedTypes"></a>
# **getAllowedTypes**
> ClassificationRefList getAllowedTypes()

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
      ClassificationRefList result = apiInstance.getAllowedTypes();
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
      WorkflowListResult result = apiInstance.getAllowedWorkflowSteps();
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

Get disciplines from the discipline scheme associated with the external organization

Get disciplines from the discipline scheme associated with the external organization with specific UUID.

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
    UUID uuid = new UUID(); // UUID | UUID of the desired external organization
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    try {
      DisciplinesAssociation result = apiInstance.getDisciplineAssociation(uuid, disciplineScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the desired external organization |
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

<a name="getFile"></a>
# **getFile**
> File getFile(uuid, fileId)

Get file from the external organization

Get file from the external organization

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
    UUID uuid = new UUID(); // UUID | UUID of the external organization
    String fileId = "fileId_example"; // String | File id 
    try {
      File result = apiInstance.getFile(uuid, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#getFile");
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
 **uuid** | [**UUID**](.md)| UUID of the external organization |
 **fileId** | **String**| File id  |

### Return type

[**File**](File.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

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
    String order = "order_example"; // String | The order of the list, must be a value from externalOrganization_getOrderings
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
 **order** | **String**| The order of the list, must be a value from externalOrganization_getOrderings | [optional]

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

<a name="listDisciplineAssociations"></a>
# **listDisciplineAssociations**
> DisciplinesAssociationListResult listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery)

Query operation for disciplines associated with external organizations

Lists disciplines from the discipline scheme associated with external organizations in the Pure instance that matches the provided query.

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
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociationsQuery disciplinesAssociationsQuery = new DisciplinesAssociationsQuery(); // DisciplinesAssociationsQuery | The query to perform
    try {
      DisciplinesAssociationListResult result = apiInstance.listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#listDisciplineAssociations");
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

Lists notes associated with an external organization ordered by date (nulls last)

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
    UUID uuid = new UUID(); // UUID | UUID of the external organization to get notes for
    Integer size = 10; // Integer | Number of returned notes per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      NoteListResult result = apiInstance.listNotes(uuid, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#listNotes");
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
 **uuid** | [**UUID**](.md)| UUID of the external organization to get notes for |
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
**404** | External organization not found |  -  |

<a name="merge"></a>
# **merge**
> ExternalOrganization merge(externalOrganizationRefList)

Merge external organizations

Merge a list of external organizations together. Note that this operation is irreversible

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
    ExternalOrganizationRefList externalOrganizationRefList = new ExternalOrganizationRefList(); // ExternalOrganizationRefList | References to the entities to merge. The first will be the target. All additional entities will be merged into the target.
    try {
      ExternalOrganization result = apiInstance.merge(externalOrganizationRefList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#merge");
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
 **externalOrganizationRefList** | [**ExternalOrganizationRefList**](ExternalOrganizationRefList.md)| References to the entities to merge. The first will be the target. All additional entities will be merged into the target. |

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

<a name="previewDeduplication"></a>
# **previewDeduplication**
> ExternalOrganizationListResult previewDeduplication(externalOrganizationList)

Preview deduplication of external organizations

Runs through a list external organizations and returns the deduplicated and merged organizations. The operation does not touch the Pure database

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
    ExternalOrganizationList externalOrganizationList = new ExternalOrganizationList(); // ExternalOrganizationList | The content to deduplicate. The data do not need to exist in the database.
    try {
      ExternalOrganizationListResult result = apiInstance.previewDeduplication(externalOrganizationList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#previewDeduplication");
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
 **externalOrganizationList** | [**ExternalOrganizationList**](ExternalOrganizationList.md)| The content to deduplicate. The data do not need to exist in the database. |

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
**400** | Bad Request |  -  |

<a name="putDisciplineAssociation"></a>
# **putDisciplineAssociation**
> DisciplinesAssociation putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation)

Update disciplines from the discipline scheme associated with the external organization

Update disciplines from the discipline scheme associated with the external organization with specific UUID.

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
    UUID uuid = new UUID(); // UUID | UUID of the external organization to update
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociation disciplinesAssociation = new DisciplinesAssociation(); // DisciplinesAssociation | The disciplines association to create
    try {
      DisciplinesAssociation result = apiInstance.putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalOrganizationApi#putDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the external organization to update |
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
    UUID uuid = new UUID(); // UUID | UUID of the external organization to update
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
 **uuid** | [**UUID**](.md)| UUID of the external organization to update |
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

