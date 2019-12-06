

# ExternalOrganization

An organization external to the institution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | UUID |  [optional] [readonly]
**createdBy** | **String** | Username of creator |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of creation |  [optional] [readonly]
**modifiedBy** | **String** | Username of the user that performed a modification |  [optional] [readonly]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of last modification |  [optional] [readonly]
**portalUrl** | **String** | URL of the content on the Pure Portal |  [optional] [readonly]
**prettyUrlIdentifiers** | **List&lt;String&gt;** | All pretty URLs |  [optional] [readonly]
**previousUuids** | **List&lt;String&gt;** | UUIDs of other content items which have been merged into this content item (or similar) |  [optional] [readonly]
**externallyManaged** | **Boolean** | Signals that the information is maintained by synchronization from an external system |  [optional]
**name** | **Map&lt;String, String&gt;** | A set of localized string values each for a specific submission locale. Please note that invalid locale values will be ignored. |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**natureTypes** | [**List&lt;ClassificationRef&gt;**](ClassificationRef.md) | Nature of the organizations work |  [optional]
**acronym** | **String** | Acronym of organization name |  [optional]
**alternativeNames** | **List&lt;String&gt;** | Alternative names of organization |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | IDs that this object corresponds to in external systems. Such as a Scopus ID. Used by Pure where it is necessary to identify objects to specific external systems |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**phoneNumber** | **String** | Phone number |  [optional]
**mobilePhoneNumber** | **String** | Phone number (mobile) |  [optional]
**fax** | **String** | Fax number |  [optional]
**email** | **String** | Email address |  [optional]
**bankAccountNumber** | **String** | Bank account number |  [optional]
**vatNumber** | **String** | VAT number |  [optional]
**documents** | [**List&lt;Document&gt;**](Document.md) | Arbitrary documents relevant to the organization |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Links to information about the organization |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | A group for each type of keyword present |  [optional]
**note** | **String** | A free-form note about the organization |  [optional]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**workflow** | [**Workflow**](Workflow.md) |  |  [optional]
**family** | **String** | The content family |  [optional] [readonly]



