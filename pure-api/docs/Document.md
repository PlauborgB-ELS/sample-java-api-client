

# Document

Document
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**fileId** | **String** | The id of the file |  [optional] [readonly]
**fileName** | **String** | The documents file name | 
**mimeType** | **String** | The documents mime type | 
**size** | **Long** | The documents size in bytes | 
**url** | **String** | Download url for the binary file |  [optional] [readonly]
**uploadedFile** | [**UploadedFile**](UploadedFile.md) |  |  [optional]
**fileData** | **byte[]** | Base64 encoded file data for new files. This property can be used instead of uploadedFile for small files |  [optional]
**title** | **String** | Document title |  [optional]
**type** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**license** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**visibleOnPortalDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the document will be available on the portal |  [optional] [readonly]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**creator** | **String** | The user that created the document |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Create date for the document |  [optional] [readonly]



