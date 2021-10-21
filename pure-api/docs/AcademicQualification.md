

# AcademicQualification

An object mapping the data of an education received by a person
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**awardDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the education was awarded at. |  [optional]
**period** | [**CompoundDateRange**](CompoundDateRange.md) |  |  [optional]
**fieldOfStudy** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**fieldOfStudyUnstructured** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**organization** | [**OrganizationOrExternalOrganizationRef**](OrganizationOrExternalOrganizationRef.md) |  |  [optional]
**projectTitle** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**qualification** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**qualificationUnstructured** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]



