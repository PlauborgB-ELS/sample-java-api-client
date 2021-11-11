

# User

A user that can be attached to a person in Pure
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**uuid** | [**UUID**](UUID.md) | UUID, this is the primary identity of the entity |  [optional] [readonly]
**createdBy** | **String** | Username of creator |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of creation |  [optional] [readonly]
**modifiedBy** | **String** | Username of the user that performed a modification |  [optional] [readonly]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of last modification |  [optional] [readonly]
**portalUrl** | **String** | URL of the content on the Pure Portal |  [optional] [readonly]
**prettyUrlIdentifiers** | **List&lt;String&gt;** | All pretty URLs |  [optional] [readonly]
**previousUuids** | **List&lt;String&gt;** | UUIDs of other content items which have been merged into this content item (or similar) |  [optional] [readonly]
**version** | **String** | A hash representing the current version of the content. For new content this is null, and for existing content the current value. The property should never be modified explicitly by a client. |  [optional]
**username** | **String** | Username | 
**name** | [**Name**](Name.md) |  |  [optional]
**email** | **String** | The user&#39;s email address | 
**externallyAuthenticated** | **Boolean** | Is the user externally authenticated. |  [optional]
**pureSystemUser** | **Boolean** | Is the user a Pure system user. Set to false when creating normal Pure users. |  [optional]
**locked** | **Boolean** | Is the user locked. A locked user cannot log into Pure. |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



