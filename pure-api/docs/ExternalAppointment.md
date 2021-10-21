

# ExternalAppointment

An appointment held in an external organizational unit
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**appointment** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**appointmentString** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**period** | [**CompoundDateRange**](CompoundDateRange.md) |  |  [optional]
**externalOrganization** | [**ExternalOrganizationRef**](ExternalOrganizationRef.md) |  |  [optional]



