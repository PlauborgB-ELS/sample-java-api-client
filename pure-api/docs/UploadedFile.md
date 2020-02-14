

# UploadedFile

Information about the uploaded file
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**digest** | **String** | The calculated digest for the file in Pure |  [optional] [readonly]
**digestType** | **String** | The digest type |  [optional] [readonly]
**size** | **Long** | The file size of the file in Pure |  [optional] [readonly]
**mimeType** | **String** | The mime type detected for the file |  [optional] [readonly]
**timeStamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp Pure received the file |  [optional] [readonly]
**expires** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp where Pure deletes the uploaded file if it has not been attached to any content |  [optional] [readonly]
**key** | **String** | Pure key identifer for the file upload |  [readonly]



