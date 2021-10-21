

# KeywordGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**typeDiscriminator** | **String** | A KeywordGroup type discriminator property so we can differentiate between the different sub-types, this is the schema type name of the child type. | 
**logicalName** | **String** | Unique name of the configuration that specifies this keyword group | 
**name** | **Map&lt;String, String&gt;** | A set of string values, one for each submission locale. Note: invalid locale values will be ignored. |  [optional]



