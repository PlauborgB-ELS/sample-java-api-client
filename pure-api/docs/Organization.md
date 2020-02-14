

# Organization

An organization in the institution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object |  [optional] [readonly]
**uuid** | [**UUID**](UUID.md) | UUID |  [optional] [readonly]
**createdBy** | **String** | Username of creator |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of creation |  [optional] [readonly]
**modifiedBy** | **String** | Username of the user that performed a modification |  [optional] [readonly]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of last modification |  [optional] [readonly]
**portalUrl** | **String** | URL of the content on the Pure Portal |  [optional] [readonly]
**prettyUrlIdentifiers** | **List&lt;String&gt;** | All pretty URLs |  [optional] [readonly]
**previousUuids** | **List&lt;String&gt;** | UUIDs of other content items which have been merged into this content item (or similar) |  [optional] [readonly]
**externallyManaged** | **Boolean** | Signals that the information is maintained by synchronization from an external system |  [optional] [readonly]
**name** | **Map&lt;String, String&gt;** | A set of localized string values each for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | IDs that this object corresponds to in external systems. Such as a Scopus ID. Used by Pure where it is necessary to identify objects to specific external systems |  [optional]
**nameVariants** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | A list of organization name variants |  [optional]
**profileInformations** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | A list of organization profile information entries |  [optional]
**photos** | [**List&lt;ClassifiedFile&gt;**](ClassifiedFile.md) | A list of organization photos |  [optional]
**addresses** | [**List&lt;ClassifiedAddress&gt;**](ClassifiedAddress.md) | A list of organization addresses |  [optional]
**phoneNumbers** | [**List&lt;ClassifiedValue&gt;**](ClassifiedValue.md) | A list of organization phone numbers |  [optional]
**emails** | [**List&lt;ClassifiedValue&gt;**](ClassifiedValue.md) | A list of organization email addresses |  [optional]
**webAddresses** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | A list of organization web addresses |  [optional]
**lifecycle** | [**DateRange**](DateRange.md) |  |  [optional]
**takenOverBy** | [**OrganizationRef**](OrganizationRef.md) |  |  [optional]
**parents** | [**List&lt;OrganizationRef&gt;**](OrganizationRef.md) | A list of parent organizations |  [optional]
**contactPersons** | [**List&lt;PersonRef&gt;**](PersonRef.md) | A list of organization contact persons |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | A group for each type of keyword present |  [optional]
**costCenters** | [**List&lt;ClassificationRef&gt;**](ClassificationRef.md) | A list of cost center classifications |  [optional]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**family** | **String** | The content family |  [optional] [readonly]



