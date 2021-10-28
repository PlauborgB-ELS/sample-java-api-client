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


package com.elsevier.pure.api.sample.stubs.model;

import java.util.Objects;
import java.util.Arrays;
import com.elsevier.pure.api.sample.stubs.model.CaseNote;
import com.elsevier.pure.api.sample.stubs.model.ConferenceSeriesRef;
import com.elsevier.pure.api.sample.stubs.model.EventRef;
import com.elsevier.pure.api.sample.stubs.model.JournalAssociation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ContributionToJournalAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class ContributionToJournalAllOf {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventRef event;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private String pages;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_JOURNAL_ASSOCIATION = "journalAssociation";
  @SerializedName(SERIALIZED_NAME_JOURNAL_ASSOCIATION)
  private JournalAssociation journalAssociation;

  public static final String SERIALIZED_NAME_ARTICLE_NUMBER = "articleNumber";
  @SerializedName(SERIALIZED_NAME_ARTICLE_NUMBER)
  private String articleNumber;

  public static final String SERIALIZED_NAME_JOURNAL_NUMBER = "journalNumber";
  @SerializedName(SERIALIZED_NAME_JOURNAL_NUMBER)
  private String journalNumber;

  public static final String SERIALIZED_NAME_CASE_NOTES = "caseNotes";
  @SerializedName(SERIALIZED_NAME_CASE_NOTES)
  private List<CaseNote> caseNotes = null;

  public static final String SERIALIZED_NAME_CONFERENCE_SERIES = "conferenceSeries";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_SERIES)
  private ConferenceSeriesRef conferenceSeries;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;


  public ContributionToJournalAllOf event(EventRef event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventRef getEvent() {
    return event;
  }


  public void setEvent(EventRef event) {
    this.event = event;
  }


  public ContributionToJournalAllOf pages(String pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * The pages of the host publication covered by this contribution, for example 10-15.
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pages of the host publication covered by this contribution, for example 10-15.")

  public String getPages() {
    return pages;
  }


  public void setPages(String pages) {
    this.pages = pages;
  }


  public ContributionToJournalAllOf volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * The volume that the research output was published in.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The volume that the research output was published in.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public ContributionToJournalAllOf journalAssociation(JournalAssociation journalAssociation) {
    
    this.journalAssociation = journalAssociation;
    return this;
  }

   /**
   * Get journalAssociation
   * @return journalAssociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JournalAssociation getJournalAssociation() {
    return journalAssociation;
  }


  public void setJournalAssociation(JournalAssociation journalAssociation) {
    this.journalAssociation = journalAssociation;
  }


  public ContributionToJournalAllOf articleNumber(String articleNumber) {
    
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * The article number.
   * @return articleNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The article number.")

  public String getArticleNumber() {
    return articleNumber;
  }


  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }


  public ContributionToJournalAllOf journalNumber(String journalNumber) {
    
    this.journalNumber = journalNumber;
    return this;
  }

   /**
   * The issue number of the journal the research output is published in.
   * @return journalNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The issue number of the journal the research output is published in.")

  public String getJournalNumber() {
    return journalNumber;
  }


  public void setJournalNumber(String journalNumber) {
    this.journalNumber = journalNumber;
  }


  public ContributionToJournalAllOf caseNotes(List<CaseNote> caseNotes) {
    
    this.caseNotes = caseNotes;
    return this;
  }

  public ContributionToJournalAllOf addCaseNotesItem(CaseNote caseNotesItem) {
    if (this.caseNotes == null) {
      this.caseNotes = new ArrayList<CaseNote>();
    }
    this.caseNotes.add(caseNotesItem);
    return this;
  }

   /**
   * A collection of court case notes related to this research output.
   * @return caseNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of court case notes related to this research output.")

  public List<CaseNote> getCaseNotes() {
    return caseNotes;
  }


  public void setCaseNotes(List<CaseNote> caseNotes) {
    this.caseNotes = caseNotes;
  }


  public ContributionToJournalAllOf conferenceSeries(ConferenceSeriesRef conferenceSeries) {
    
    this.conferenceSeries = conferenceSeries;
    return this;
  }

   /**
   * Get conferenceSeries
   * @return conferenceSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConferenceSeriesRef getConferenceSeries() {
    return conferenceSeries;
  }


  public void setConferenceSeries(ConferenceSeriesRef conferenceSeries) {
    this.conferenceSeries = conferenceSeries;
  }


  public ContributionToJournalAllOf numberOfPages(Integer numberOfPages) {
    
    this.numberOfPages = numberOfPages;
    return this;
  }

   /**
   * The number of pages in the research output.
   * @return numberOfPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages in the research output.")

  public Integer getNumberOfPages() {
    return numberOfPages;
  }


  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributionToJournalAllOf contributionToJournalAllOf = (ContributionToJournalAllOf) o;
    return Objects.equals(this.event, contributionToJournalAllOf.event) &&
        Objects.equals(this.pages, contributionToJournalAllOf.pages) &&
        Objects.equals(this.volume, contributionToJournalAllOf.volume) &&
        Objects.equals(this.journalAssociation, contributionToJournalAllOf.journalAssociation) &&
        Objects.equals(this.articleNumber, contributionToJournalAllOf.articleNumber) &&
        Objects.equals(this.journalNumber, contributionToJournalAllOf.journalNumber) &&
        Objects.equals(this.caseNotes, contributionToJournalAllOf.caseNotes) &&
        Objects.equals(this.conferenceSeries, contributionToJournalAllOf.conferenceSeries) &&
        Objects.equals(this.numberOfPages, contributionToJournalAllOf.numberOfPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, pages, volume, journalAssociation, articleNumber, journalNumber, caseNotes, conferenceSeries, numberOfPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionToJournalAllOf {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    journalAssociation: ").append(toIndentedString(journalAssociation)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    journalNumber: ").append(toIndentedString(journalNumber)).append("\n");
    sb.append("    caseNotes: ").append(toIndentedString(caseNotes)).append("\n");
    sb.append("    conferenceSeries: ").append(toIndentedString(conferenceSeries)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

