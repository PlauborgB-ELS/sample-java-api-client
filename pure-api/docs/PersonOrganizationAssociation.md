

# PersonOrganizationAssociation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**addresses** | [**List&lt;ClassifiedAddress&gt;**](ClassifiedAddress.md) | List of physical addresses. |  [optional]
**affiliationId** | **String** | Affiliation identification. This could be a student ID or a staff ID. |  [optional]
**employmentType** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**organization** | [**OrganizationRef**](OrganizationRef.md) |  |  [optional]
**emails** | [**List&lt;ClassifiedValue&gt;**](ClassifiedValue.md) | List of emails. |  [optional]
**webAddresses** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | List of web addresses. |  [optional]
**phoneNumbers** | [**List&lt;ClassifiedValue&gt;**](ClassifiedValue.md) |  |  [optional]
**period** | [**DateRange**](DateRange.md) |  |  [optional]
**supervisorAssociations** | [**List&lt;PersonSupervisorAssociation&gt;**](PersonSupervisorAssociation.md) | List of associations to persons who supervise this person. |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | List of keyword groups. |  [optional]
**primaryAssociation** | **Boolean** | A boolean value indicating whether this is the primary association or not. Only one of the associations from a person to an organisation will be primary. |  [optional]
**typeDiscriminator** | **String** |  | 



