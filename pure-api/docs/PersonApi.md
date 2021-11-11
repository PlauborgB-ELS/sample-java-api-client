# PersonApi

All URIs are relative to *http://localhost:8080/ws/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PersonApi.md#create) | **PUT** /persons | Create person
[**createNote**](PersonApi.md#createNote) | **PUT** /persons/{uuid}/notes | Create note
[**delete**](PersonApi.md#delete) | **DELETE** /persons/{uuid} | Delete person
[**fileUploads**](PersonApi.md#fileUploads) | **PUT** /persons/file-uploads | Upload file to a specific person
[**get**](PersonApi.md#get) | **GET** /persons/{uuid} | Get person
[**getAllowedAcademicQualificationsFieldOfStudies**](PersonApi.md#getAllowedAcademicQualificationsFieldOfStudies) | **GET** /persons/allowed-academic-qualifications-field-of-studies | A list of the allowed values for field of study
[**getAllowedAcademicQualificationsTypes**](PersonApi.md#getAllowedAcademicQualificationsTypes) | **GET** /persons/allowed-allowed-academic-qualification-types | A list of allowed academic qualification types for persons
[**getAllowedAddressCountries**](PersonApi.md#getAllowedAddressCountries) | **GET** /persons/allowed-address-countries | A list of allowed address countries
[**getAllowedAddressSubdivisions**](PersonApi.md#getAllowedAddressSubdivisions) | **GET** /persons/allowed-address-subdivisions | A list of allowed subdivisions
[**getAllowedAddressTypes**](PersonApi.md#getAllowedAddressTypes) | **GET** /persons/allowed-address-types | A list of allowed address types
[**getAllowedClassifiedIdentifierTypes**](PersonApi.md#getAllowedClassifiedIdentifierTypes) | **GET** /persons/allowed-classified-identifier-types | A list of allowed classified identifier types
[**getAllowedDisciplineSchemes**](PersonApi.md#getAllowedDisciplineSchemes) | **GET** /persons/disciplines/allowed-discipline-schemes | A list of allowed discipline schemes
[**getAllowedDisciplines**](PersonApi.md#getAllowedDisciplines) | **GET** /persons/disciplines/{discipline-scheme}/allowed-disciplines | A list of allowed disciplines for a specific discipline scheme
[**getAllowedExternalPositionsAppointments**](PersonApi.md#getAllowedExternalPositionsAppointments) | **GET** /persons/allowed-external-positions-appointments | A list of the allowed values for appointments
[**getAllowedGenders**](PersonApi.md#getAllowedGenders) | **GET** /persons/allowed-genders | A list of allowed classifications for the gender property
[**getAllowedKeywordGroupConfigurationClassifications**](PersonApi.md#getAllowedKeywordGroupConfigurationClassifications) | **GET** /persons/allowed-keyword-group-configurations/{id}/classifications | A list of allowed classifications for the specified keyword group
[**getAllowedKeywordGroupConfigurations**](PersonApi.md#getAllowedKeywordGroupConfigurations) | **GET** /persons/allowed-keyword-group-configurations | A list of keyword group configurations
[**getAllowedLeavesOfAbsenceClassifications**](PersonApi.md#getAllowedLeavesOfAbsenceClassifications) | **GET** /persons/allowed-leave-of-absense | A list of allowed classifications for the leave of absence property
[**getAllowedLinkTypes**](PersonApi.md#getAllowedLinkTypes) | **GET** /persons/allowed-link-types | A list of allowed link types
[**getAllowedLocales**](PersonApi.md#getAllowedLocales) | **GET** /persons/allowed-locales | A list of allowed locales in localized strings
[**getAllowedNamesTypes**](PersonApi.md#getAllowedNamesTypes) | **GET** /persons/allowed-names-types | A list of allowed classifications for classified names
[**getAllowedNationalities**](PersonApi.md#getAllowedNationalities) | **GET** /persons/allowed-nationalities | A list of allowed classifications for the nationalities property
[**getAllowedPersonOrganizationAssociationsEmailTypes**](PersonApi.md#getAllowedPersonOrganizationAssociationsEmailTypes) | **GET** /persons/allowed-person-organization-associations-email-types | A list of allowed email types
[**getAllowedPersonOrganizationAssociationsEmploymentTypes**](PersonApi.md#getAllowedPersonOrganizationAssociationsEmploymentTypes) | **GET** /persons/allowed-person-organization-associations-employment-types | A list of allowed employment types
[**getAllowedPersonOrganizationAssociationsJobTitles**](PersonApi.md#getAllowedPersonOrganizationAssociationsJobTitles) | **GET** /persons/allowed-person-organization-associations-job-titles | A list of allowed job titles
[**getAllowedPersonOrganizationAssociationsPhoneNumberTypes**](PersonApi.md#getAllowedPersonOrganizationAssociationsPhoneNumberTypes) | **GET** /persons/allowed-person-organization-associations-phonenumber-types | A list of allowed phone number types
[**getAllowedPersonOrganizationAssociationsSupervisorRoles**](PersonApi.md#getAllowedPersonOrganizationAssociationsSupervisorRoles) | **GET** /persons/allowed-person-organization-associations-supervisor-roles | A list of allowed supervisor roles
[**getAllowedPersonOrganizationAssociationsWebAddressTypes**](PersonApi.md#getAllowedPersonOrganizationAssociationsWebAddressTypes) | **GET** /persons/allowed-person-organization-associations-webaddress-types | A list of allowed web address types
[**getAllowedPrivateAddressCountries**](PersonApi.md#getAllowedPrivateAddressCountries) | **GET** /persons/allowed-private-address-countries | A list of allowed country classifications for private address
[**getAllowedProfileInformationTypes**](PersonApi.md#getAllowedProfileInformationTypes) | **GET** /persons/allowed-profile-information-types | A list of allowed classifications for the profile information property
[**getAllowedProfilePhotoTypes**](PersonApi.md#getAllowedProfilePhotoTypes) | **GET** /persons/allowed-profile-photo-types | A list of allowed photo types
[**getAllowedProfilePhotosTypes**](PersonApi.md#getAllowedProfilePhotosTypes) | **GET** /persons/allowed-allowed-profile-photo-types | A list of allowed types for person profile photos
[**getAllowedStaffOrganizationAssociationsContractTypes**](PersonApi.md#getAllowedStaffOrganizationAssociationsContractTypes) | **GET** /persons/allowed-staff-organization-associations-contract-types | A list of allowed contract types
[**getAllowedStaffOrganizationAssociationsStaffTypes**](PersonApi.md#getAllowedStaffOrganizationAssociationsStaffTypes) | **GET** /persons/allowed-staff-organization-associations-staff-types | A list of allowed staff types
[**getAllowedStudentAssociationsEmploymentTypes**](PersonApi.md#getAllowedStudentAssociationsEmploymentTypes) | **GET** /persons/allowed-student-organization-associations-employment-types | A list of allowed employment types
[**getAllowedTitlesTypes**](PersonApi.md#getAllowedTitlesTypes) | **GET** /persons/allowed-titles-types | A list of allowed classifications for the titles property
[**getAllowedVisitingScholarAssociationsEmploymentTypes**](PersonApi.md#getAllowedVisitingScholarAssociationsEmploymentTypes) | **GET** /persons/allowed-visiting-scholar-organization-associations-employment-types | A list of allowed employment types
[**getDisciplineAssociation**](PersonApi.md#getDisciplineAssociation) | **GET** /persons/{uuid}/disciplines/{discipline-scheme} | Get disciplines from the discipline scheme associated with the person
[**getFile**](PersonApi.md#getFile) | **GET** /persons/{uuid}/files/{fileId} | Get file from the person
[**getHighlightedContent**](PersonApi.md#getHighlightedContent) | **GET** /persons/{uuid}/highlighted-content | Get highlighted content
[**getOrderings**](PersonApi.md#getOrderings) | **GET** /persons/orderings | Lists available orderings
[**list**](PersonApi.md#list) | **GET** /persons | Lists all persons
[**listDisciplineAssociations**](PersonApi.md#listDisciplineAssociations) | **POST** /persons/disciplines/{discipline-scheme}/search | Query operation for disciplines associated with persons
[**listNotes**](PersonApi.md#listNotes) | **GET** /persons/{uuid}/notes | Lists notes
[**putDisciplineAssociation**](PersonApi.md#putDisciplineAssociation) | **PUT** /persons/{uuid}/disciplines/{discipline-scheme} | Update disciplines from the discipline scheme associated with the person
[**query**](PersonApi.md#query) | **POST** /persons/search | Query operation for persons
[**supervisee**](PersonApi.md#supervisee) | **GET** /persons/{uuid}/supervisee | person supervisees
[**update**](PersonApi.md#update) | **PUT** /persons/{uuid} | Update person
[**updateHighlightedContent**](PersonApi.md#updateHighlightedContent) | **PUT** /persons/{uuid}/highlighted-content | Update highlighted content


<a name="create"></a>
# **create**
> Person create(person)

Create person

Create person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    Person person = new Person(); // Person | The content to create
    try {
      Person result = apiInstance.create(person);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#create");
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
 **person** | [**Person**](Person.md)| The content to create |

### Return type

[**Person**](Person.md)

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

Create note and associate it with a person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to add note to
    Note note = new Note(); // Note | The note to create
    try {
      Note result = apiInstance.createNote(uuid, note);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#createNote");
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
 **uuid** | [**UUID**](.md)| UUID of the person to add note to |
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

Delete person

Delete person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person
    try {
      apiInstance.delete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#delete");
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
 **uuid** | [**UUID**](.md)| UUID of the person |

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

<a name="fileUploads"></a>
# **fileUploads**
> UploadedFile fileUploads(body, contentType)

Upload file to a specific person

Uploads file for the person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    File body = new File("/path/to/file"); // File | 
    String contentType = "contentType_example"; // String | Set the mime type for the file
    try {
      UploadedFile result = apiInstance.fileUploads(body, contentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#fileUploads");
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
> Person get(uuid)

Get person

Get person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired person
    try {
      Person result = apiInstance.get(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#get");
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
 **uuid** | [**UUID**](.md)| UUID of the desired person |

### Return type

[**Person**](Person.md)

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

<a name="getAllowedAcademicQualificationsFieldOfStudies"></a>
# **getAllowedAcademicQualificationsFieldOfStudies**
> ClassificationRefList getAllowedAcademicQualificationsFieldOfStudies()

A list of the allowed values for field of study

Get a list of classifications that can be used for the &#39;academicQualifications.fieldOfStudy&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedAcademicQualificationsFieldOfStudies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedAcademicQualificationsFieldOfStudies");
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

<a name="getAllowedAcademicQualificationsTypes"></a>
# **getAllowedAcademicQualificationsTypes**
> ClassificationRefList getAllowedAcademicQualificationsTypes()

A list of allowed academic qualification types for persons

Get a list of allowed academic qualification types for persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedAcademicQualificationsTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedAcademicQualificationsTypes");
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

<a name="getAllowedAddressCountries"></a>
# **getAllowedAddressCountries**
> ClassificationRefList getAllowedAddressCountries()

A list of allowed address countries

Get a list of allowed countries that can be used for the &#39;addresses.country&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedAddressCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedAddressCountries");
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

A list of allowed subdivisions

Get a list of allowed subdivisions can be used for the &#39;subdivision&#39; attribute of person organization associations

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedAddressSubdivisions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedAddressSubdivisions");
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

<a name="getAllowedAddressTypes"></a>
# **getAllowedAddressTypes**
> ClassificationRefList getAllowedAddressTypes()

A list of allowed address types

Get a list of allowed address types that can be used for the &#39;addresses.type&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedAddressTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedAddressTypes");
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

Get a list of allowed classified identifier types that can be used for the &#39;identifiers.type&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedClassifiedIdentifierTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedClassifiedIdentifierTypes");
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

Get a list fo a allowed discipline schemes for persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      DisciplinesDisciplineSchemeListResult result = apiInstance.getAllowedDisciplineSchemes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedDisciplineSchemes");
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

Get a list of a allowed disciplines for specific discipline scheme for persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme for persons
    Integer size = 10; // Integer | Number of returned disciplines per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      DisciplinesDisciplineListResult result = apiInstance.getAllowedDisciplines(disciplineScheme, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedDisciplines");
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
 **disciplineScheme** | **String**| Identifier for the discipline scheme for persons |
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

<a name="getAllowedExternalPositionsAppointments"></a>
# **getAllowedExternalPositionsAppointments**
> ClassificationRefList getAllowedExternalPositionsAppointments()

A list of the allowed values for appointments

Get a list of classifications that can be used for the &#39;externalPositions.appointment&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedExternalPositionsAppointments();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedExternalPositionsAppointments");
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

<a name="getAllowedGenders"></a>
# **getAllowedGenders**
> ClassificationRefList getAllowedGenders()

A list of allowed classifications for the gender property

Get a list of classifications that can be used when submitting the person gender property.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedGenders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedGenders");
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
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    Long id = 56L; // Long | Pure id of the keyword group configuration
    try {
      ClassificationRefList result = apiInstance.getAllowedKeywordGroupConfigurationClassifications(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedKeywordGroupConfigurationClassifications");
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
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      KeywordGroupConfigurationList result = apiInstance.getAllowedKeywordGroupConfigurations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedKeywordGroupConfigurations");
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

<a name="getAllowedLeavesOfAbsenceClassifications"></a>
# **getAllowedLeavesOfAbsenceClassifications**
> ClassificationRefList getAllowedLeavesOfAbsenceClassifications()

A list of allowed classifications for the leave of absence property

Get a list of classifications that can be used when submitting the leaveOfAbsence property.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedLeavesOfAbsenceClassifications();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedLeavesOfAbsenceClassifications");
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

<a name="getAllowedLinkTypes"></a>
# **getAllowedLinkTypes**
> ClassificationRefList getAllowedLinkTypes()

A list of allowed link types

Get a list of allowed link types that can be used for the &#39;links.linkType&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedLinkTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedLinkTypes");
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
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      LocalesList result = apiInstance.getAllowedLocales();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedLocales");
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

<a name="getAllowedNamesTypes"></a>
# **getAllowedNamesTypes**
> ClassificationRefList getAllowedNamesTypes()

A list of allowed classifications for classified names

Get a list of allowed classifications that can be used when submitting a classified name.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedNamesTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedNamesTypes");
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

<a name="getAllowedNationalities"></a>
# **getAllowedNationalities**
> ClassificationRefList getAllowedNationalities()

A list of allowed classifications for the nationalities property

Get a list of classifications that can be used when submitting the nationality property.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedNationalities();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedNationalities");
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

<a name="getAllowedPersonOrganizationAssociationsEmailTypes"></a>
# **getAllowedPersonOrganizationAssociationsEmailTypes**
> ClassificationRefList getAllowedPersonOrganizationAssociationsEmailTypes()

A list of allowed email types

Get a list of allowed email types for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsEmailTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsEmailTypes");
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

<a name="getAllowedPersonOrganizationAssociationsEmploymentTypes"></a>
# **getAllowedPersonOrganizationAssociationsEmploymentTypes**
> ClassificationRefList getAllowedPersonOrganizationAssociationsEmploymentTypes()

A list of allowed employment types

Get a list of allowed employment types for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsEmploymentTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsEmploymentTypes");
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

<a name="getAllowedPersonOrganizationAssociationsJobTitles"></a>
# **getAllowedPersonOrganizationAssociationsJobTitles**
> ClassificationRefList getAllowedPersonOrganizationAssociationsJobTitles()

A list of allowed job titles

Get a list of allowed job titles for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsJobTitles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsJobTitles");
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

<a name="getAllowedPersonOrganizationAssociationsPhoneNumberTypes"></a>
# **getAllowedPersonOrganizationAssociationsPhoneNumberTypes**
> ClassificationRefList getAllowedPersonOrganizationAssociationsPhoneNumberTypes()

A list of allowed phone number types

Get a list of allowed phone numbers types for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsPhoneNumberTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsPhoneNumberTypes");
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

<a name="getAllowedPersonOrganizationAssociationsSupervisorRoles"></a>
# **getAllowedPersonOrganizationAssociationsSupervisorRoles**
> ClassificationRefList getAllowedPersonOrganizationAssociationsSupervisorRoles()

A list of allowed supervisor roles

Get a list of allowed supervisor roles for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsSupervisorRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsSupervisorRoles");
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

<a name="getAllowedPersonOrganizationAssociationsWebAddressTypes"></a>
# **getAllowedPersonOrganizationAssociationsWebAddressTypes**
> ClassificationRefList getAllowedPersonOrganizationAssociationsWebAddressTypes()

A list of allowed web address types

Get a list of allowed web address types for person organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPersonOrganizationAssociationsWebAddressTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPersonOrganizationAssociationsWebAddressTypes");
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

<a name="getAllowedPrivateAddressCountries"></a>
# **getAllowedPrivateAddressCountries**
> ClassificationRefList getAllowedPrivateAddressCountries()

A list of allowed country classifications for private address

Get a list of allowed country classifications for private address on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedPrivateAddressCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedPrivateAddressCountries");
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

<a name="getAllowedProfileInformationTypes"></a>
# **getAllowedProfileInformationTypes**
> ClassificationRefList getAllowedProfileInformationTypes()

A list of allowed classifications for the profile information property

Get a list of classifications that can be used when submitting an entry in profile information.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedProfileInformationTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedProfileInformationTypes");
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

<a name="getAllowedProfilePhotoTypes"></a>
# **getAllowedProfilePhotoTypes**
> ClassificationRefList getAllowedProfilePhotoTypes()

A list of allowed photo types

Get a list of allowed photo types that can be used for the &#39;profilePhotos.type&#39; attribute of persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedProfilePhotoTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedProfilePhotoTypes");
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

<a name="getAllowedProfilePhotosTypes"></a>
# **getAllowedProfilePhotosTypes**
> ClassificationRefList getAllowedProfilePhotosTypes()

A list of allowed types for person profile photos

Get a list of allowed types for person profile photos

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedProfilePhotosTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedProfilePhotosTypes");
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

<a name="getAllowedStaffOrganizationAssociationsContractTypes"></a>
# **getAllowedStaffOrganizationAssociationsContractTypes**
> ClassificationRefList getAllowedStaffOrganizationAssociationsContractTypes()

A list of allowed contract types

Get a list of allowed contract types for staff organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedStaffOrganizationAssociationsContractTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedStaffOrganizationAssociationsContractTypes");
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

<a name="getAllowedStaffOrganizationAssociationsStaffTypes"></a>
# **getAllowedStaffOrganizationAssociationsStaffTypes**
> ClassificationRefList getAllowedStaffOrganizationAssociationsStaffTypes()

A list of allowed staff types

Get a list of allowed staff types for staff organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedStaffOrganizationAssociationsStaffTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedStaffOrganizationAssociationsStaffTypes");
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

<a name="getAllowedStudentAssociationsEmploymentTypes"></a>
# **getAllowedStudentAssociationsEmploymentTypes**
> ClassificationRefList getAllowedStudentAssociationsEmploymentTypes()

A list of allowed employment types

Get a list of allowed employment types for student organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedStudentAssociationsEmploymentTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedStudentAssociationsEmploymentTypes");
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

<a name="getAllowedTitlesTypes"></a>
# **getAllowedTitlesTypes**
> ClassificationRefList getAllowedTitlesTypes()

A list of allowed classifications for the titles property

Get a list of classifications that can be used when submitting a title.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedTitlesTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedTitlesTypes");
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

<a name="getAllowedVisitingScholarAssociationsEmploymentTypes"></a>
# **getAllowedVisitingScholarAssociationsEmploymentTypes**
> ClassificationRefList getAllowedVisitingScholarAssociationsEmploymentTypes()

A list of allowed employment types

Get a list of allowed employment types for visiting scholar organisation associations on persons

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      ClassificationRefList result = apiInstance.getAllowedVisitingScholarAssociationsEmploymentTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getAllowedVisitingScholarAssociationsEmploymentTypes");
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

<a name="getDisciplineAssociation"></a>
# **getDisciplineAssociation**
> DisciplinesAssociation getDisciplineAssociation(uuid, disciplineScheme)

Get disciplines from the discipline scheme associated with the person

Get disciplines from the discipline scheme associated with the person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the desired person
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    try {
      DisciplinesAssociation result = apiInstance.getDisciplineAssociation(uuid, disciplineScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the desired person |
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

Get file from the person

Get file from the person

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person
    String fileId = "fileId_example"; // String | File id 
    try {
      File result = apiInstance.getFile(uuid, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getFile");
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
 **uuid** | [**UUID**](.md)| UUID of the person |
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

<a name="getHighlightedContent"></a>
# **getHighlightedContent**
> HighlightedContent getHighlightedContent(uuid)

Get highlighted content

Get highlighted content for the person with the specific UUID. Highlights are only available for editorial types

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the owner (person) of the highlighted content
    try {
      HighlightedContent result = apiInstance.getHighlightedContent(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getHighlightedContent");
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
 **uuid** | [**UUID**](.md)| UUID of the owner (person) of the highlighted content |

### Return type

[**HighlightedContent**](HighlightedContent.md)

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

Lists all orderings available to the person endpoint. These values can be used by the order parameter.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    try {
      OrderingsList result = apiInstance.getOrderings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#getOrderings");
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
> PersonListResult list(size, offset, order)

Lists all persons

Lists all persons in the Pure instance. If you need to filter the persons returned, see the POST version which supports additional filtering.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    Integer size = 10; // Integer | Number of returned persons per request.
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    String order = "order_example"; // String | The order of the list, must be a value from getPersonOrderings
    try {
      PersonListResult result = apiInstance.list(size, offset, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#list");
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
 **size** | **Integer**| Number of returned persons per request. | [optional] [default to 10]
 **offset** | **Integer**| The offset for the returned list. 0 or null value is from the start | [optional] [default to 0]
 **order** | **String**| The order of the list, must be a value from getPersonOrderings | [optional]

### Return type

[**PersonListResult**](PersonListResult.md)

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

Query operation for disciplines associated with persons

Lists disciplines from the discipline scheme associated with persons in the Pure instance that matches the provided query.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociationsQuery disciplinesAssociationsQuery = new DisciplinesAssociationsQuery(); // DisciplinesAssociationsQuery | The query to perform
    try {
      DisciplinesAssociationListResult result = apiInstance.listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#listDisciplineAssociations");
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

Lists notes associated with an person ordered by date (nulls last)

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to get notes for
    Integer size = 10; // Integer | Number of returned notes per request
    Integer offset = 0; // Integer | The offset for the returned list. 0 or null value is from the start
    try {
      NoteListResult result = apiInstance.listNotes(uuid, size, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#listNotes");
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
 **uuid** | [**UUID**](.md)| UUID of the person to get notes for |
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
**404** | person not found |  -  |

<a name="putDisciplineAssociation"></a>
# **putDisciplineAssociation**
> DisciplinesAssociation putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation)

Update disciplines from the discipline scheme associated with the person

Update disciplines from the discipline scheme associated with the person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to update
    String disciplineScheme = "disciplineScheme_example"; // String | Identifier for the discipline scheme
    DisciplinesAssociation disciplinesAssociation = new DisciplinesAssociation(); // DisciplinesAssociation | The disciplines association to create
    try {
      DisciplinesAssociation result = apiInstance.putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#putDisciplineAssociation");
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
 **uuid** | [**UUID**](.md)| UUID of the person to update |
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
> PersonListResult query(personsQuery)

Query operation for persons

Lists persons in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    PersonsQuery personsQuery = new PersonsQuery(); // PersonsQuery | The query to perform
    try {
      PersonListResult result = apiInstance.query(personsQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#query");
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
 **personsQuery** | [**PersonsQuery**](PersonsQuery.md)| The query to perform |

### Return type

[**PersonListResult**](PersonListResult.md)

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

<a name="supervisee"></a>
# **supervisee**
> PersonSuperviseeAssociationListResult supervisee(uuid)

person supervisees

Find supervisees of a person by their specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person
    try {
      PersonSuperviseeAssociationListResult result = apiInstance.supervisee(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#supervisee");
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
 **uuid** | [**UUID**](.md)| UUID of the person |

### Return type

[**PersonSuperviseeAssociationListResult**](PersonSuperviseeAssociationListResult.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | Resource not found |  -  |

<a name="update"></a>
# **update**
> Person update(uuid, person)

Update person

Update person with specific UUID.

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to update
    Person person = new Person(); // Person | The content to update
    try {
      Person result = apiInstance.update(uuid, person);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#update");
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
 **uuid** | [**UUID**](.md)| UUID of the person to update |
 **person** | [**Person**](Person.md)| The content to update |

### Return type

[**Person**](Person.md)

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

<a name="updateHighlightedContent"></a>
# **updateHighlightedContent**
> HighlightedContent updateHighlightedContent(uuid, highlightedContent)

Update highlighted content

Update highlighted content references. Add an empty array of references for a content type to not highlight any items of this type. Types that are not present will be ignored. Highlights can only be updated for editorial types

### Example
```java
// Import classes:
import com.elsevier.pure.api.sample.stubs.invoker.ApiClient;
import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.invoker.Configuration;
import com.elsevier.pure.api.sample.stubs.invoker.auth.*;
import com.elsevier.pure.api.sample.stubs.invoker.models.*;
import com.elsevier.pure.api.sample.stubs.api.PersonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ws/api");
    
    // Configure API key authorization: api-key
    ApiKeyAuth api-key = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
    api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api-key.setApiKeyPrefix("Token");

    PersonApi apiInstance = new PersonApi(defaultClient);
    UUID uuid = new UUID(); // UUID | UUID of the person to update highlighted content for
    HighlightedContent highlightedContent = new HighlightedContent(); // HighlightedContent | The highlighted content references to set on the person
    try {
      HighlightedContent result = apiInstance.updateHighlightedContent(uuid, highlightedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonApi#updateHighlightedContent");
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
 **uuid** | [**UUID**](.md)| UUID of the person to update highlighted content for |
 **highlightedContent** | [**HighlightedContent**](HighlightedContent.md)| The highlighted content references to set on the person |

### Return type

[**HighlightedContent**](HighlightedContent.md)

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

