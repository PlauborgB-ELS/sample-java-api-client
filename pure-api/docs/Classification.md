

# Classification

A way to annotate another object with a type/role/etc.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object |  [optional] [readonly]
**freeFormExternalIds** | [**List&lt;Id&gt;**](Id.md) | IDs from the external sources (part of) the object was imported from |  [optional]
**externallyManaged** | **Boolean** | Signals that the information is maintained by synchronization from an external system |  [optional]
**uri** | **String** | URI used to uniquely identify this object |  [optional]
**term** | [**LocalizedString**](LocalizedString.md) |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**description** | [**LocalizedString**](LocalizedString.md) |  |  [optional]
**classificationRelations** | [**List&lt;ClassificationRelation&gt;**](ClassificationRelation.md) |  |  [optional]



