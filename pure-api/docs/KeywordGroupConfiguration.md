

# KeywordGroupConfiguration

A specification of the allowed behavior of a specified keyword group
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**targetSystemName** | **String** | The content system name this configuration applies to |  [optional]
**keywordGroupType** | **String** | The OpenAPI schema type of this keyword configuration |  [optional]
**name** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**description** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]
**classificationScheme** | [**ClassificationSchemeRef**](ClassificationSchemeRef.md) |  |  [optional]
**allowUserdefinedKeywords** | **Boolean** | Defines if user defined keywords are allowed |  [optional]
**limitToLeafSelection** | **Boolean** |  |  [optional]
**logicalName** | **String** |  |  [optional]



