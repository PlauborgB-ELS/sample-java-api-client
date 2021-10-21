

# AdditionalFileElectronicVersion

An additional file related to a research output.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**accessType** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**embargoPeriod** | [**DateRange**](DateRange.md) |  |  [optional]
**licenseType** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**userDefinedLicense** | **String** | License defined by the user. |  [optional]
**visibleOnPortalDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date where this document is/will be visible on the portal. |  [optional] [readonly]
**creator** | **String** | Username of creator. |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of creation. |  [optional] [readonly]
**title** | **String** | The title of the file. |  [optional]
**file** | [**ElectronicVersionFile**](ElectronicVersionFile.md) |  |  [optional]



