

# BookSeriesJournalAssociation

A relation describing the association between a book series and the associated journal.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**title** | [**JournalTitleRef**](JournalTitleRef.md) |  |  [optional]
**issn** | [**ISSNRef**](ISSNRef.md) |  |  [optional]
**journal** | [**JournalRef**](JournalRef.md) |  | 
**no** | **String** |  |  [optional]
**volume** | **String** |  |  [optional]



