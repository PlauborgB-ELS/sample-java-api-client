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
import com.elsevier.pure.api.sample.stubs.model.DisciplinesAssociation;
import com.elsevier.pure.api.sample.stubs.model.DisciplinesAssociationListResult;
import com.elsevier.pure.api.sample.stubs.model.DisciplinesAssociationsQuery;
import com.elsevier.pure.api.sample.stubs.model.DisciplinesDisciplineListResult;
import com.elsevier.pure.api.sample.stubs.model.DisciplinesDisciplineSchemeListResult;
import com.elsevier.pure.api.sample.stubs.model.Journal;
import com.elsevier.pure.api.sample.stubs.model.JournalListResult;
import com.elsevier.pure.api.sample.stubs.model.JournalsQuery;
import com.elsevier.pure.api.sample.stubs.model.KeywordGroupConfigurationList;
import com.elsevier.pure.api.sample.stubs.model.LocalesList;
import com.elsevier.pure.api.sample.stubs.model.Note;
import com.elsevier.pure.api.sample.stubs.model.NoteListResult;
import com.elsevier.pure.api.sample.stubs.model.OrderingsList;
import com.elsevier.pure.api.sample.stubs.model.ProblemDetails;
import java.util.UUID;
import com.elsevier.pure.api.sample.stubs.model.WorkflowListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JournalApi
 */
@Ignore
public class JournalApiTest {

    private final JournalApi api = new JournalApi();

    
    /**
     * Create journal
     *
     * Create journal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Journal journal = null;
        Journal response = api.create(journal);

        // TODO: test validations
    }
    
    /**
     * Create note
     *
     * Create note and associate it with a journal
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
     * Delete journal
     *
     * Delete journal with specific UUID.
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
     * Lists all dependents to a journal
     *
     * Lists all dependents to a journal with the specified UUID. If the user dont have access to view all the dependent content, an authorization error will be thrown. 
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
     * Get journal
     *
     * Get journal with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        UUID uuid = null;
        Journal response = api.get(uuid);

        // TODO: test validations
    }
    
    /**
     * A list of allowed classified identifier types
     *
     * Get a list of allowed classified identifier types that can be used for the &#39;identifiers.type&#39; attribute of journals
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedClassifiedIdentifierTypesTest() throws ApiException {
        ClassificationRefList response = api.getAllowedClassifiedIdentifierTypes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed countries
     *
     * Get a list of allowed countries that can be used for the &#39;journal.country&#39; attribute of journals
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
     * A list of allowed discipline schemes
     *
     * Get a list fo a allowed discipline schemes for journals
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedDisciplineSchemesTest() throws ApiException {
        DisciplinesDisciplineSchemeListResult response = api.getAllowedDisciplineSchemes();

        // TODO: test validations
    }
    
    /**
     * A list of allowed disciplines for a specific discipline scheme
     *
     * Get a list of a allowed disciplines for specific discipline scheme for journals
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedDisciplinesTest() throws ApiException {
        String disciplineScheme = null;
        Integer size = null;
        Integer offset = null;
        DisciplinesDisciplineListResult response = api.getAllowedDisciplines(disciplineScheme, size, offset);

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
     * A list of allowed link types
     *
     * Get a list of allowed link types that can be used for the &#39;links.linkType&#39; attribute of journals
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
     * A list of allowed journal types
     *
     * Get a list of allowed types that can be used for the &#39;type&#39; attribute of journal
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
     * Get a list of allowed workflow steps that can be used for the &#39;workflow&#39; attribute of journals
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
     * Get disciplines from the discipline scheme associated with the journal
     *
     * Get disciplines from the discipline scheme associated with the journal with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDisciplineAssociationTest() throws ApiException {
        UUID uuid = null;
        String disciplineScheme = null;
        DisciplinesAssociation response = api.getDisciplineAssociation(uuid, disciplineScheme);

        // TODO: test validations
    }
    
    /**
     * Lists available orderings
     *
     * Lists all orderings available to the journal endpoint. These values can be used by the order parameter.
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
     * Lists all journals
     *
     * Lists all journals in the Pure instance. If you need to filter the journals returned, see the POST version which supports additional filtering.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer size = null;
        Integer offset = null;
        String order = null;
        JournalListResult response = api.list(size, offset, order);

        // TODO: test validations
    }
    
    /**
     * Query operation for disciplines associated with journals
     *
     * Lists disciplines from the discipline scheme associated with journals in the Pure instance that matches the provided query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDisciplineAssociationsTest() throws ApiException {
        String disciplineScheme = null;
        DisciplinesAssociationsQuery disciplinesAssociationsQuery = null;
        DisciplinesAssociationListResult response = api.listDisciplineAssociations(disciplineScheme, disciplinesAssociationsQuery);

        // TODO: test validations
    }
    
    /**
     * Lists notes
     *
     * Lists notes associated with the journal ordered by date (nulls last)
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
     * Update disciplines from the discipline scheme associated with the journal
     *
     * Update disciplines from the discipline scheme associated with the journal with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putDisciplineAssociationTest() throws ApiException {
        UUID uuid = null;
        String disciplineScheme = null;
        DisciplinesAssociation disciplinesAssociation = null;
        DisciplinesAssociation response = api.putDisciplineAssociation(uuid, disciplineScheme, disciplinesAssociation);

        // TODO: test validations
    }
    
    /**
     * Query operation for journals
     *
     * Lists journals in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTest() throws ApiException {
        JournalsQuery journalsQuery = null;
        JournalListResult response = api.query(journalsQuery);

        // TODO: test validations
    }
    
    /**
     * Update journal
     *
     * Update journal with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        UUID uuid = null;
        Journal journal = null;
        Journal response = api.update(uuid, journal);

        // TODO: test validations
    }
    
}
