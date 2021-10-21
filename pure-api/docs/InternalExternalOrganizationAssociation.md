

# InternalExternalOrganizationAssociation

A relation to either an internal OR external organization, not both. Only one of the valuesshould be used at a time.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**organization** | [**OrganizationRef**](OrganizationRef.md) |  |  [optional]
**externalOrganization** | [**ExternalOrganizationRef**](ExternalOrganizationRef.md) |  |  [optional]



