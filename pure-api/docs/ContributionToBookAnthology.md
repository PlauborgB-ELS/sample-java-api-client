

# ContributionToBookAnthology

Books, reports and anthologies/collected works where the author(s) are only responsible for part of the work, e.g. a chapter.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placeOfPublication** | **String** | The place of publication. |  [optional]
**edition** | **String** | The edition that the production was published in. |  [optional]
**printISBNs** | **List&lt;String&gt;** | The ISBN number for the printed versions of the production. |  [optional]
**electronicISBNs** | **List&lt;String&gt;** | The ISBN number for the electronic versions of the production. |  [optional]
**publisher** | [**PublisherRef**](PublisherRef.md) |  |  [optional]
**event** | [**EventRef**](EventRef.md) |  |  [optional]
**publicationSeries** | [**List&lt;PublicationSeries&gt;**](PublicationSeries.md) | The publication series this research output is part of. |  [optional]
**pages** | **String** | The pages of the host publication covered by this contribution, for example 10-15. |  [optional]
**volume** | **String** | The volume that the research output was published in. |  [optional]
**hostPublicationEditors** | [**List&lt;Name&gt;**](Name.md) | A list of host publication editors. |  [optional]
**hostPublicationTitle** | [**FormattedString**](FormattedString.md) |  |  [optional]
**hostPublicationSubTitle** | [**FormattedString**](FormattedString.md) |  |  [optional]
**translatedHostPublicationTitle** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**translatedHostPublicationSubtitle** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**articleNumber** | **String** | The article number. |  [optional]
**caseNotes** | [**List&lt;CaseNote&gt;**](CaseNote.md) | A collection of court case notes related to this research output. |  [optional]
**commissioningBody** | [**ExternalOrganizationRef**](ExternalOrganizationRef.md) |  |  [optional]
**bookSeries** | [**List&lt;BookSeriesJournalAssociation&gt;**](BookSeriesJournalAssociation.md) | The book series this research output is part of. |  [optional]
**chapter** | **String** | The chapter of the host publication covered by this contribution, for example 2. |  [optional]
**conferenceSeries** | [**ConferenceSeriesRef**](ConferenceSeriesRef.md) |  |  [optional]
**numberOfPages** | **Integer** | The number of pages in the research output. |  [optional]



