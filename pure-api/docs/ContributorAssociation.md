

# ContributorAssociation

An association between research output and a person that has contributed to it
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**person** | [**PersonRef**](PersonRef.md) |  |  [optional]
**externalPerson** | [**ExternalPersonRef**](ExternalPersonRef.md) |  |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]
**role** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**organisationalUnits** | [**List&lt;OrganizationRef&gt;**](OrganizationRef.md) | A collection of organisational unit affiliations. |  [optional]
**externalOrganisations** | [**List&lt;ExternalOrganizationRef&gt;**](ExternalOrganizationRef.md) | A collection of external organisation affiliations. |  [optional]
**hidden** | **Boolean** | If this contribution should be hidden, this is set to true, false otherwise. This is used for research output that have author collaborations. If they do, we hide the individual contributors. |  [optional]
**contributionDescription** | **String** | A string that details the contribution of the associated person. |  [optional]
**contributionPercentage** | **Double** | A real number between 0 and 100, describing the percentage of the contribution of the person. |  [optional]
**country** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**correspondingAuthor** | **Boolean** | True if the contributor is the corresponding author, false otherwise. |  [optional]
**authorCollaboration** | [**AuthorCollaborationRef**](AuthorCollaborationRef.md) |  |  [optional]



