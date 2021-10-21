

# CaseNote

A note on a case, detailing title, judgement data and court processing case.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**court** | [**ExternalOrganizationRef**](ExternalOrganizationRef.md) |  |  [optional]
**title** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**judgementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The judgement date. | 
**sources** | [**List&lt;ClassifiedCaseNoteSource&gt;**](ClassifiedCaseNoteSource.md) | Classified case note sources |  [optional]



