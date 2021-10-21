

# PublicationStatus

A representation of a point in time when the status of a publication changed, e.g. the submission date or publication date of the publication.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**current** | **Boolean** | True when this status element is the current, false otherwise. |  [optional] [readonly]
**publicationStatus** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**publicationDate** | [**CompoundDate**](CompoundDate.md) |  |  [optional]



