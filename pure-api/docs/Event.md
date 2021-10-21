

# Event

An event typically a conference, workshop or similar
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
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**abbreviatedTitle** | **Map&lt;String, String&gt;** | A set of potentially formatted string values each localized for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**geoLocation** | [**GeoLocation**](GeoLocation.md) |  |  [optional]
**city** | **String** | The city of the event |  [optional]
**conferenceNumber** | **String** | The conference number of the event |  [optional]
**country** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**degreeOfRecognition** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**description** | **Map&lt;String, String&gt;** | A set of potentially formatted string values each localized for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | A group for each type of keyword present |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Links to information about the event |  [optional]
**location** | **String** | The actual location of the event |  [optional]
**organizers** | [**List&lt;OrganizationOrExternalOrganizationRef&gt;**](OrganizationOrExternalOrganizationRef.md) | The organizers of the event |  [optional]
**lifecycle** | [**DateRange**](DateRange.md) |  |  [optional]
**events** | [**List&lt;EventRef&gt;**](EventRef.md) | Other events related to this event |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | IDs that this object corresponds to in external systems. Such as a Scopus ID. Used by Pure where it is necessary to identify objects to specific external systems |  [optional]
**sponsorOrganizations** | [**List&lt;OrganizationOrExternalOrganizationRef&gt;**](OrganizationOrExternalOrganizationRef.md) | The event sponsors |  [optional]
**subdivision** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**title** | **Map&lt;String, String&gt;** | A set of potentially formatted string values each localized for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**subTitle** | **Map&lt;String, String&gt;** | A set of potentially formatted string values each localized for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**workflow** | [**Workflow**](Workflow.md) |  |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



