

# AccessDefinitionSystemNameFieldFilter

The field filters applicable for a system name
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**systemName** | **String** | systemName | 
**allowedFields** | [**List&lt;AccessDefinitionAllowedField&gt;**](AccessDefinitionAllowedField.md) | List of allowed properties |  [optional]
**allowAll** | **Boolean** | allowAll |  [optional]
**accessEnum** | [**AccessEnumEnum**](#AccessEnumEnum) | Field Access value | 



## Enum: AccessEnumEnum

Name | Value
---- | -----
READ | &quot;READ&quot;
READ_AND_MODIFY | &quot;READ_AND_MODIFY&quot;



