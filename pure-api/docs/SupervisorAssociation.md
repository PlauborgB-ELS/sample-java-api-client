

# SupervisorAssociation

A supervisor on a research output.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**person** | [**PersonRef**](PersonRef.md) |  |  [optional]
**externalPerson** | [**ExternalPersonRef**](ExternalPersonRef.md) |  |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]
**role** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**organisationalUnits** | [**List&lt;OrganizationRef&gt;**](OrganizationRef.md) | A collection of organisational unit affiliations. |  [optional]
**externalOrganisations** | [**List&lt;ExternalOrganizationRef&gt;**](ExternalOrganizationRef.md) | A collection of external organisation affiliations. |  [optional]



