

# KeywordGroup

Keywords of a specific type. A type of keyword can be configured to solely support free keywords, to solely support structured keywords, or to both support structured keywords supplemented by optional free keywords
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object |  [optional] [readonly]
**freeFormExternalIds** | [**List&lt;Id&gt;**](Id.md) | IDs from the external sources (part of) the object was imported from |  [optional]
**externallyManaged** | **Boolean** | Signals that the information is maintained by synchronization from an external system |  [optional]
**logicalName** | **String** | Unique name of the configuration that makes it possible to have this kind of keywords |  [optional]
**type** | [**Classification**](Classification.md) |  |  [optional]
**keywordContainers** | [**List&lt;KeywordContainer&gt;**](KeywordContainer.md) | Containers with structured keywords and/or free keywords |  [optional]



