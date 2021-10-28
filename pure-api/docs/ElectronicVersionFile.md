

# ElectronicVersionFile

Information about an electronic version file
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



