

# Person

An academic professional, student, or other individual attatched to the institution.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pureId** | **Long** | Pure database ID of the object, prefer using the UUID if it is present on the entity |  [optional] [readonly]
**uuid** | [**UUID**](UUID.md) | UUID, this is the primary identity of the entity |  [optional] [readonly]
**createdBy** | **String** | Username of creator |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of creation |  [optional] [readonly]
**modifiedBy** | **String** | Username of the user that performed a modification |  [optional] [readonly]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of last modification |  [optional] [readonly]
**portalUrl** | **String** | URL of the content on the Pure Portal |  [optional] [readonly]
**prettyUrlIdentifiers** | **List&lt;String&gt;** | All pretty URLs |  [optional] [readonly]
**previousUuids** | **List&lt;String&gt;** | UUIDs of other content items which have been merged into this content item (or similar) |  [optional] [readonly]
**version** | **String** | A hash representing the current version of the content. For new content this is null, and for existing content the current value. The property should never be modified explicitly by a client. |  [optional]
**startDateAsResearcher** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the person entered into the academic profession. |  [optional]
**affiliationNote** | **String** | Notes regarding affiliations of the person. |  [optional]
**dateOfBirth** | [**OffsetDateTime**](OffsetDateTime.md) | The person&#39;s date of birth. |  [optional]
**employeeStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the persons first day of the institution. |  [optional]
**externalPositions** | [**List&lt;ExternalAppointment&gt;**](ExternalAppointment.md) | positions held by the person, that are external to the institution |  [optional]
**keywordGroups** | [**List&lt;KeywordGroup&gt;**](KeywordGroup.md) | Groups of Keyword associated with the person. |  [optional]
**leavesOfAbsence** | [**List&lt;PersonClassifiedLeaveOfAbsence&gt;**](PersonClassifiedLeaveOfAbsence.md) | Leaves of absence had by the person. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Links associated with the person. |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]
**names** | [**List&lt;ClassifiedName&gt;**](ClassifiedName.md) | Variant names of the person, Known aliases, ect. |  [optional]
**nationality** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**orcid** | **String** | orcid of the person . |  [optional]
**honoraryStaffOrganizationAssociations** | [**List&lt;HonoraryStaffOrganizationAssociation&gt;**](HonoraryStaffOrganizationAssociation.md) | Organisations that the person is associated with under the title of &#39;Honorary Staff&#39; |  [optional]
**staffOrganizationAssociations** | [**List&lt;StaffOrganizationAssociation&gt;**](StaffOrganizationAssociation.md) | Organizations that the person is associated with as &#39;Staff&#39; |  [optional]
**studentOrganizationAssociations** | [**List&lt;StudentOrganizationAssociation&gt;**](StudentOrganizationAssociation.md) | Organizations that the person is associated with as a &#39;Student&#39; |  [optional]
**visitingScholarOrganizationAssociations** | [**List&lt;VisitingScholarOrganizationAssociation&gt;**](VisitingScholarOrganizationAssociation.md) | Organizations that the person is associated with as a &#39;Visiting Scholar |  [optional]
**academicQualifications** | [**List&lt;AcademicQualification&gt;**](AcademicQualification.md) | Levels of academic qualifications that the person has achieved. |  [optional]
**profilePhotos** | [**List&lt;ClassifiedFile&gt;**](ClassifiedFile.md) | Profile photos in the form of Image files. The maximum file size is 1mb |  [optional]
**privateAddress** | [**Address**](Address.md) |  |  [optional]
**professionalQualifications** | [**List&lt;ProfessionalQualification&gt;**](ProfessionalQualification.md) | The professional qualifications held by the person |  [optional]
**selectedForProfileRefinementService** | **Boolean** | If the person has been profiled. |  [optional]
**profileInformation** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | Information objects making up profiles made of the person |  [optional]
**retirementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of retirement for the person |  [optional]
**gender** | [**ClassificationRef**](ClassificationRef.md) |  |  [optional]
**titles** | [**List&lt;ClassifiedLocalizedValue&gt;**](ClassifiedLocalizedValue.md) | Titles held by the person |  [optional]
**visibility** | [**Visibility**](Visibility.md) |  |  [optional]
**willingToTakePhdStudents** | **Boolean** | Boolean to define if the Person is willing to take on Phd Students. |  [optional]
**willingToTakePhdStudentsDescription** | **String** | Field to describe or list phd projects that the person will participate in. |  [optional]
**identifiers** | [**List&lt;Identifier&gt;**](Identifier.md) | Identifiers related to the person |  [optional]
**user** | [**UserRef**](UserRef.md) |  |  [optional]
**systemName** | **String** | The content system name |  [optional] [readonly]



