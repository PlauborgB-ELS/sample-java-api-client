

# PersonSuperviseeAssociation

Association between a person and their supervisee
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**period** | [**DateRange**](DateRange.md) |  |  [optional]
**supervisionPercentage** | **Integer** | Percentage for which the Supervisor is responsible for the total supervision |  [optional]
**supervisorRole** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**supervisee** | [**PersonRef**](PersonRef.md) |  |  [optional]



