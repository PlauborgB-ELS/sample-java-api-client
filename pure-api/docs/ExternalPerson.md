

# ExternalPerson

A person not known to the institution
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
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | IDs that this object corresponds to in external systems. Such as a Scopus ID. Used by Pure where it is necessary to identify objects to specific external systems |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**title** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**country** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**gender** | [**Gender**](Gender.md) |  |  [optional]
**externalOrganisations** | [**List&lt;ExternalOrganizationRef&gt;**](ExternalOrganizationRef.md) |  |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) |  |  [optional]
**workflow** | [**Workflow**](Workflow.md) |  |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



