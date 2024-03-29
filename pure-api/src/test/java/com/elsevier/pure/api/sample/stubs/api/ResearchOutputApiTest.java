/*
 * Pure API
 * This is an early access version of the new Pure write API.
 *
 * The version of the OpenAPI document: 0.1 Early Access
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.api;

import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.ClassificationRefList;
import com.elsevier.pure.api.sample.stubs.model.ContentRefListResult;
import java.io.File;
import com.elsevier.pure.api.sample.stubs.model.KeywordGroupConfigurationList;
import com.elsevier.pure.api.sample.stubs.model.LocalesList;
import com.elsevier.pure.api.sample.stubs.model.Note;
import com.elsevier.pure.api.sample.stubs.model.NoteListResult;
import com.elsevier.pure.api.sample.stubs.model.OrderingsList;
import com.elsevier.pure.api.sample.stubs.model.ProblemDetails;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutput;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutputListResult;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutputPeerReviewConfigurationListResult;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutputsQuery;
import java.util.UUID;
import com.elsevier.pure.api.sample.stubs.model.UploadedFile;
import com.elsevier.pure.api.sample.stubs.model.WorkflowListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResearchOutputApi
 */
@Ignore
public class ResearchOutputApiTest {

    private final ResearchOutputApi api = new ResearchOutputApi();

    
    /**
     * Create research output
     *
     * Create research output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        ResearchOutput researchOutput = null;
        ResearchOutput response = api.create(researchOutput);

        // TODO: test validations
    }
    
    /**
     * Create note
     *
     * Create note and associate it with a research output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNoteTest() throws ApiException {
        UUID uuid = null;
        Note note = null;
        Note response = api.createNote(uuid, note);

        // TODO: test validations
    }
    
    /**
     * Delete research output
     *
     * Delete research output with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        UUID uuid = null;
        api.delete(uuid);

        // TODO: test validations
    }
    
    /**
     * Lists all dependents to a research output
     *
     * Lists all dependents to a research output with the specified UUID. If the user dont have access to view all the dependent content, an authorization error will be thrown. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dependentsTest() throws ApiException {
        UUID uuid = null;
        Boolean verbose = null;
        ContentRefListResult response = api.dependents(uuid, verbose);

        // TODO: test validations
    }
    
    /**
     * Upload file to a specific research output
     *
     * Uploads file for the research output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fileUploadsTest() throws ApiException {
        File body = null;
        String contentType = null;
        UploadedFile response = api.fileUploads(body, contentType);

        // TODO: test validations
    }
    
    /**
     * Get research output
     *
     * Get research output with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        UUID uuid = null;
        ResearchOutput response = api.get(uuid);

        // TODO: test validations
    }
    
    /**
     * A list of allowed access types
     *
     * Get a list of allowed access types for additional files on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedAdditionalFileAccessTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedAdditionalFileAccessTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed license types
     *
     * Get a list of allowed license types for additional files on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedAdditionalFileLicenseTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedAdditionalFileLicenseTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed article processing charge currencies
     *
     * Get a list of allowed article processing charge currencies on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedArticleProcessingChargeCurrenciesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedArticleProcessingChargeCurrencies();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the book anthology subtype
     *
     * Get a list of allowed roles for contributors on the book anthology subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedBookAnthologyContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedBookAnthologyContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the book anthology subtype
     *
     * Get a list of allowed description types on the book anthology subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedBookAnthologyDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedBookAnthologyDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed case note sources
     *
     * Get a list of allowed case note sources for select subtypes of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedCaseNoteSourcesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedCaseNoteSources();

        // TODO: test validations
    }
    
    /**
     * A list of allowed categories
     *
     * Get a list of allowed categories on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedCategoriesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedCategories();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the contribution to book anthology subtype
     *
     * Get a list of allowed roles for contributors on the contribution to book anthology subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToBookAnthologyContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToBookAnthologyContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the contribution to book anthology subtype
     *
     * Get a list of allowed description types on the contribution to book anthology subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToBookAnthologyDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToBookAnthologyDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the contribution to conference subtype
     *
     * Get a list of allowed roles for contributors on the contribution to conference subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToConferenceContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToConferenceContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the contribution to conference subtype
     *
     * Get a list of allowed description types on the contribution to conference subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToConferenceDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToConferenceDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the contribution to journal subtype
     *
     * Get a list of allowed roles for contributors on the contribution to journal subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToJournalContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToJournalContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the contribution to journal subtype
     *
     * Get a list of allowed description types on the contribution to journal subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToJournalDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToJournalDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the contribution to memorandum subtype
     *
     * Get a list of allowed roles for contributors on the contribution to memorandum subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToMemorandumContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToMemorandumContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the contribution to memorandum subtype
     *
     * Get a list of allowed description types on the contribution to memorandum subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToMemorandumDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToMemorandumDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the contribution to periodical subtype
     *
     * Get a list of allowed roles for contributors on the contribution to periodical subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToPeriodicalContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToPeriodicalContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the contribution to periodical subtype
     *
     * Get a list of allowed description types on the contribution to periodical subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributionToPeriodicalDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributionToPeriodicalDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor countries
     *
     * Get a list of allowed countries for contributors on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedContributorCountriesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedContributorCountries();

        // TODO: test validations
    }
    
    /**
     * A list of allowed countries
     *
     * Get a list of allowed countries that can be used for the &#39;countries&#39; attribute of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedCountriesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedCountries();

        // TODO: test validations
    }
    
    /**
     * A list of allowed access types
     *
     * Get a list of allowed access types for electronic versions on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedElectronicVersionAccessTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedElectronicVersionAccessTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed license types
     *
     * Get a list of allowed license types for electronic versions on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedElectronicVersionLicenseTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedElectronicVersionLicenseTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed version types
     *
     * Get a list of allowed version types for electronic versions on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedElectronicVersionVersionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedElectronicVersionVersionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed classifications for the specified keyword group
     *
     * Get a list of allowed classifications that can be used when submitting a specified keyword group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedKeywordGroupConfigurationClassificationsTest() throws ApiException {
        Long id = null;
        ClassificationRefList response = api.getAllowedKeywordGroupConfigurationClassifications(id);

        // TODO: test validations
    }
    
    /**
     * A list of keyword group configurations
     *
     * Get a list of allowed keyword group configurations that can be used when submitting keyword groups.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedKeywordGroupConfigurationsTest() throws ApiException {
        KeywordGroupConfigurationList response = api.getAllowedKeywordGroupConfigurations();

        // TODO: test validations
    }
    
    /**
     * A list of allowed languages
     *
     * Get a list of allowed languages on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedLanguagesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedLanguages();

        // TODO: test validations
    }
    
    /**
     * A list of allowed link types
     *
     * Get a list of allowed link types on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedLinkTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedLinkTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed locales in localized strings
     *
     * Get a list of allowed locales that can be used when submitting localized string entities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedLocalesTest() throws ApiException {
        LocalesList response = api.getAllowedLocales();

        // TODO: test validations
    }
    
    /**
     * A list of allowed main research areas
     *
     * Get a list of allowed main research areas on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedMainResearchAreasTest() throws ApiException {
        ClassificationRefList response = api.getAllowedMainResearchAreas();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the memorandum subtype
     *
     * Get a list of allowed roles for contributors on the memorandum subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedMemorandumContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedMemorandumContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the memorandum subtype
     *
     * Get a list of allowed description types on the memorandum subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedMemorandumDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedMemorandumDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the non-textual subtype
     *
     * Get a list of allowed roles for contributors on the non-textual subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedNonTextualContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedNonTextualContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the non-textual subtype
     *
     * Get a list of allowed description types on the non-textual subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedNonTextualDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedNonTextualDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed open access permissions
     *
     * Get a list of allowed open access permissions on research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedOpenAccessPermissionsTest() throws ApiException {
        ClassificationRefList response = api.getAllowedOpenAccessPermissions();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the other contribution subtype
     *
     * Get a list of allowed roles for contributors on the other contribution subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedOtherContributionContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedOtherContributionContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the other contribution subtype
     *
     * Get a list of allowed description types on the other contribution subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedOtherContributionDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedOtherContributionDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed output medias
     *
     * Get a list of allowed output medias for the non-textual subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedOutputMediasTest() throws ApiException {
        ClassificationRefList response = api.getAllowedOutputMedias();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the patent subtype
     *
     * Get a list of allowed roles for contributors on the patent subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedPatentContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedPatentContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the patent subtype
     *
     * Get a list of allowed description types on the patent subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedPatentDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedPatentDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of peer review configurations
     *
     * Get a list of peer review configurations that describe the allowed combinations of values for the interrelated fields: type, category, peerReview, and internationalPeerReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedPeerReviewConfigurationsTest() throws ApiException {
        ResearchOutputPeerReviewConfigurationListResult response = api.getAllowedPeerReviewConfigurations();

        // TODO: test validations
    }
    
    /**
     * A list of allowed publication statuses
     *
     * Get a list of allowed publication statuses on research output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedPublicationStatusesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedPublicationStatuses();

        // TODO: test validations
    }
    
    /**
     * A list of allowed qualifications
     *
     * Get a list of allowed qualifications for the thesis subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedQualificationsTest() throws ApiException {
        ClassificationRefList response = api.getAllowedQualifications();

        // TODO: test validations
    }
    
    /**
     * A list of allowed supervisor roles
     *
     * Get a list of allowed supervisors roles for the thesis subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedSupervisorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedSupervisorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the thesis subtype
     *
     * Get a list of allowed roles for contributors on the thesis subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedThesisContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedThesisContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the thesis subtype
     *
     * Get a list of allowed description types on the thesis subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedThesisDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedThesisDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed research output types
     *
     * Get a list of allowed types that can be used for the &#39;type&#39; attribute of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed workflow steps
     *
     * Get a list of allowed workflow steps that can be used for the &#39;workflow&#39; attribute of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedWorkflowStepsTest() throws ApiException {
        WorkflowListResult response = api.getAllowedWorkflowSteps();

        // TODO: test validations
    }
    
    /**
     * A list of allowed contributor roles for the working paper subtype
     *
     * Get a list of allowed roles for contributors on the working paper subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedWorkingPaperContributorRolesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedWorkingPaperContributorRoles();

        // TODO: test validations
    }
    
    /**
     * A list of allowed description types for the working paper subtype
     *
     * Get a list of allowed description types on the working paper subtype of research outputs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedWorkingPaperDescriptionTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedWorkingPaperDescriptionTypes();

        // TODO: test validations
    }
    
    /**
     * Get file from the research output
     *
     * Get file from the research output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileTest() throws ApiException {
        UUID uuid = null;
        String fileId = null;
        File response = api.getFile(uuid, fileId);

        // TODO: test validations
    }
    
    /**
     * Lists available orderings
     *
     * Lists all orderings available to the research output endpoint. These values can be used by the order parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderingsTest() throws ApiException {
        OrderingsList response = api.getOrderings();

        // TODO: test validations
    }
    
    /**
     * Lists all  research outputs
     *
     * Lists all  research outputs in the Pure instance. If you need to filter the research outputs returned, see the POST version which supports additional filtering.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer size = null;
        Integer offset = null;
        String order = null;
        ResearchOutputListResult response = api.list(size, offset, order);

        // TODO: test validations
    }
    
    /**
     * Lists notes
     *
     * Lists notes associated with a research output ordered by date (nulls last)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNotesTest() throws ApiException {
        UUID uuid = null;
        Integer size = null;
        Integer offset = null;
        NoteListResult response = api.listNotes(uuid, size, offset);

        // TODO: test validations
    }
    
    /**
     * Query operation for research outputs
     *
     * Lists research outputs in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTest() throws ApiException {
        ResearchOutputsQuery researchOutputsQuery = null;
        ResearchOutputListResult response = api.query(researchOutputsQuery);

        // TODO: test validations
    }
    
    /**
     * Update research outputs
     *
     * Update research outputs with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        UUID uuid = null;
        ResearchOutput researchOutput = null;
        ResearchOutput response = api.update(uuid, researchOutput);

        // TODO: test validations
    }
    
}
