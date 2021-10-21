

# ClassifiedAddress

A physical address
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**addressType** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**addressLines** | **String** | Address for personal residence |  [optional]
**street** | **String** | The name of the street |  [optional]
**building** | **String** | The name of the building |  [optional]
**postalcode** | **String** | The postal code of the city |  [optional]
**city** | **String** | The name of the city |  [optional]
**country** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**subdivision** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**geoLocation** | [**GeoLocation**](GeoLocation.md) |  |  [optional]



