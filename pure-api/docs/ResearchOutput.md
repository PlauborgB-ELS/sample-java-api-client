

# ResearchOutput

Research output exists in many variations, from written to non-textual form. Templates are available for a range of these variations.
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
**title** | [**FormattedString**](FormattedString.md) |  |  [optional]
**subTitle** | [**FormattedString**](FormattedString.md) |  |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**category** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**peerReview** | **Boolean** | Indicates whether the research output is peer reviewed or not. Query the /research-outputs/allowed-peer-review-configurations endpoint for allowed values. |  [optional]
**internationalPeerReview** | **Boolean** | Indicates whether the research output is internationally peer reviewed or not. Query the /research-outputs/allowed-peer-review-configurations endpoint for allowed values. |  [optional]
**publicationStatuses** | [**List&lt;PublicationStatus&gt;**](PublicationStatus.md) | Manage the research output&#39;s different statuses and dates these were reached. |  [optional]
**language** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**translatedTitle** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**translatedSubTitle** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**contributors** | [**List&lt;ContributorAssociation&gt;**](ContributorAssociation.md) | Contributors and their affiliations |  [optional]
**organizations** | [**List&lt;OrganizationRef&gt;**](OrganizationRef.md) | A collection of organisational unit affiliations. |  [optional]
**externalOrganisations** | [**List&lt;ExternalOrganizationRef&gt;**](ExternalOrganizationRef.md) | A collection of external organisation affiliations. |  [optional]
**totalNumberOfContributors** | **Integer** | The total number of authors from author collaborations. |  [optional]
**managingOrganization** | [**OrganizationRef**](OrganizationRef.md) |  |  [optional]
**openAccessPermission** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**openAccessEmbargoDate** | [**OffsetDateTime**](OffsetDateTime.md) | The open access embargo end date describes the date at which the embargo on public consumption is lifted. |  [optional]
**submissionYear** | **Integer** | The submission year of the research output. |  [optional]
**mainResearchArea** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**electronicVersions** | [**List&lt;ElectronicVersion&gt;**](ElectronicVersion.md) | Electronic versions of this research output. |  [optional]
**additionalFiles** | [**List&lt;AdditionalFileElectronicVersion&gt;**](AdditionalFileElectronicVersion.md) | Additional files related to this research output. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Additional links associated with this research output. |  [optional]
**articleProcessingCharge** | [**ArticleProcessingCharge**](ArticleProcessingCharge.md) |  |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | Groups of keywords associated with the research output. |  [optional]
**bibliographicalNote** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**descriptions** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | A list of descriptions for this research output. Query the relevant /research-outputs/allowed-*-description-types endpoint for allowed types. |  [optional]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**workflow** | [**Workflow**](Workflow.md) |  |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | Identifiers related to the research output. |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]
**_abstract** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**typeDiscriminator** | **String** |  | 



