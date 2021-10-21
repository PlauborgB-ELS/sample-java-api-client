

# ApiKey

A Web service Api key
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
**key** | **String** | key |  [readonly]
**description** | **String** | description |  [optional]
**locked** | **Boolean** | locked |  [optional]
**user** | [**UserRef**](UserRef.md) |  |  [optional]
**allowedContentFamilies** | **List&lt;String&gt;** | The content families that this api key has access to. The list contains system names of the content families. |  [optional]
**accessDefinition** | [**AccessDefinitionRef**](AccessDefinitionRef.md) |  |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



