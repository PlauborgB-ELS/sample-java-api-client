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
import com.elsevier.pure.api.sample.stubs.model.Event;
import com.elsevier.pure.api.sample.stubs.model.EventListResult;
import com.elsevier.pure.api.sample.stubs.model.EventsQuery;
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
 * API tests for EventApi
 */
@Ignore
public class EventApiTest {

    private final EventApi api = new EventApi();

    
    /**
     * Create event
     *
     * Create event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Event event = null;
        Event response = api.create(event);

        // TODO: test validations
    }
    
    /**
     * Create note
     *
     * Create note and associate it with an event
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
     * Delete event
     *
     * Delete event with specific UUID.
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
     * Get event
     *
     * Get event with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        UUID uuid = null;
        Event response = api.get(uuid);

        // TODO: test validations
    }
    
    /**
     * A list of allowed classified identifier types
     *
     * Get a list of allowed classified identifier types that can be used for the &#39;identifiers.type&#39; attribute of events
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
     * Get a list of allowed countries that can be used for the &#39;country&#39; attribute of events
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
     * A list of allowed degree of recognitions
     *
     * Get a list of allowed degree of recognitions that can be used for the &#39;degreeOfRecognition&#39; attribute of events
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedDegreeOfRecognitionsTest() throws ApiException {
        ClassificationRefList response = api.getAllowedDegreeOfRecognitions();

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
     * Get a list of allowed link types that can be used for the &#39;links.linkType&#39; attribute of events
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
     * A list of allowed subdivisions
     *
     * Get a list of allowed subdivisions can be used for the &#39;subdivision&#39; attribute of events
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedSubdivisionsTest() throws ApiException {
        ClassificationRefList response = api.getAllowedSubdivisions();

        // TODO: test validations
    }
    
    /**
     * A list of allowed event types
     *
     * Get a list of allowed types that can be used for the &#39;type&#39; attribute of events
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
     * Get a list of allowed workflow steps that can be used for the &#39;workflow&#39; attribute of events
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
     * Lists available orderings
     *
     * Lists all orderings available to the event endpoint. These values can be used by the order parameter.
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
     * Lists all events
     *
     * Lists all events in the Pure instance. If you need to filter the events returned, see the POST version which supports additional filtering.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer size = null;
        Integer offset = null;
        String order = null;
        EventListResult response = api.list(size, offset, order);

        // TODO: test validations
    }
    
    /**
     * Lists notes
     *
     * Lists notes associated with an event ordered by date (nulls last)
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
     * Query operation for events
     *
     * Lists events in the Pure instance that matches the provided query, similar to the GET version, instead of using parameters to alter the response, an JSON document is posted with the request. The JSON document contains fields for all the parameters available for the GET version, but also additional filtering options.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTest() throws ApiException {
        EventsQuery eventsQuery = null;
        EventListResult response = api.query(eventsQuery);

        // TODO: test validations
    }
    
    /**
     * Update event
     *
     * Update event with specific UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        UUID uuid = null;
        Event event = null;
        Event response = api.update(uuid, event);

        // TODO: test validations
    }
    
}
