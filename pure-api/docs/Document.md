

# Document

Document
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object |  [optional] [readonly]
**title** | **String** | Document title |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  | 
**url** | **String** | Download url for the binary file |  [optional] [readonly]
**license** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**visibleOnPortalDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the document will be available on the portal |  [optional] [readonly]
**visibility** | [**Visibility**](Visibility.md) |  | 
**creator** | **String** | The user that created the document |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Create date for the document |  [optional] [readonly]
**fileContent** | [**UploadedFile**](UploadedFile.md) |  |  [optional]
**fileName** | **String** | The documents file name | 
**mimeType** | **String** | The documents mime type |  [optional]
**size** | **Long** | The documents size in bytes |  [optional]



