

# PersonSupervisorAssociation

The association data of a person and their supervisor
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**period** | [**DateRange**](DateRange.md) |  |  [optional]
**supervisionPercentage** | **Integer** | Percentage for which the Supervisor is responsible for the total supervision |  [optional]
**supervisorRole** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**supervisor** | [**InternalOrExternalSupervisor**](InternalOrExternalSupervisor.md) |  |  [optional]



