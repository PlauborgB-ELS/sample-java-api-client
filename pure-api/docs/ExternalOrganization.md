

# ExternalOrganization

An organization external to the institution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object |  [optional] [readonly]
**freeFormExternalIds** | [**List&lt;Id&gt;**](Id.md) | IDs from the external sources (part of) the object was imported from |  [optional]
**externallyManaged** | **Boolean** | Signals that the information is maintained by synchronization from an external system |  [optional]
**uuid** | **String** | UUID |  [optional] [readonly]
**name** | [**LocalizedString**](LocalizedString.md) |  |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**natureTypes** | [**List&lt;ClassificationRef&gt;**](ClassificationRef.md) | Nature of the organizations work |  [optional]
**parent** | [**ExternalOrganizationRef**](ExternalOrganizationRef.md) |  |  [optional]
**acronym** | **String** | Acronym of organization name |  [optional]
**alternativeNames** | **List&lt;String&gt;** | Alternative names of organization |  [optional]
**externalIds** | [**List&lt;ClassifiedId&gt;**](ClassifiedId.md) | IDs that this object corresponds to in external systems. Such as a Scopus ID. Used by Pure where it is necessary to identify objects to specific external systems |  [optional]
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
**info** | [**ContentInformation**](ContentInformation.md) |  |  [optional]



