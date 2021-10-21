

# Journal

A periodical presenting articles on a particular subject.
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
**issns** | [**List&lt;ISSN&gt;**](ISSN.md) | International Standard Serial Numbers of the journal, ISSNs in this list are searchable and selectable when relating the journal to other content |  [optional]
**additionalSearchableIssns** | [**List&lt;AdditionalISSN&gt;**](AdditionalISSN.md) | Additional International Standard Serial Numbers of the journal, ISSNs in this list are searchable but not selectable when relating the journal to other content |  [optional]
**country** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**indexedInDoaj** | **Boolean** | Whether the journal is present in the Directory of Open Access Journals |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | Keywords associated with the journal |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Links to websites or other URLs associated with the journal |  [optional]
**publisher** | [**PublisherRef**](PublisherRef.md) |  |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | Identifiers of the Journal, often used to identify the journal in other sources, an example could be the Scopus Id of the journal |  [optional]
**titles** | [**List&lt;JournalTitle&gt;**](JournalTitle.md) | Titles of the journal, these titles will be available for use when relating the journal to other content. |  [optional]
**additionalSearchableTitles** | **List&lt;String&gt;** | Additional searchable titles of the journal, often abbreviations that are not used to show a journal, cannot be used when relating the journal to other content. |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**workflow** | [**Workflow**](Workflow.md) |  |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



