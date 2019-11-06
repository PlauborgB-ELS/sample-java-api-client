

# ExternalOrganisationListResult

List of organizations external to the institution. Can contain a subset of all items along with the full count
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | The full count, ignoring paging |  [optional]
**pageInformation** | [**PageInformation**](PageInformation.md) |  |  [optional]
**navigationLinks** | [**List&lt;NavigationLink&gt;**](NavigationLink.md) | Links to navigate from this result. Such as a &#39;prev&#39; link to link to the previous page of items |  [optional]
**items** | [**List&lt;ExternalOrganization&gt;**](ExternalOrganization.md) | External organisations |  [optional]



