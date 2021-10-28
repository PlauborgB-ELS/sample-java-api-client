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
import com.elsevier.pure.api.sample.stubs.model.AdditionalFileElectronicVersion;
import com.elsevier.pure.api.sample.stubs.model.ArticleProcessingCharge;
import com.elsevier.pure.api.sample.stubs.model.BookSeriesJournalAssociation;
import com.elsevier.pure.api.sample.stubs.model.ClassificationRef;
import com.elsevier.pure.api.sample.stubs.model.ClassifiedLocalizedValue;
import com.elsevier.pure.api.sample.stubs.model.ContributionToMemorandumAllOf;
import com.elsevier.pure.api.sample.stubs.model.ContributorAssociation;
import com.elsevier.pure.api.sample.stubs.model.ElectronicVersion;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.FormattedString;
import com.elsevier.pure.api.sample.stubs.model.Identifier;
import com.elsevier.pure.api.sample.stubs.model.KeywordGroup;
import com.elsevier.pure.api.sample.stubs.model.Link;
import com.elsevier.pure.api.sample.stubs.model.OrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.PublicationSeries;
import com.elsevier.pure.api.sample.stubs.model.PublicationStatus;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutput;
import com.elsevier.pure.api.sample.stubs.model.Visibility;
import com.elsevier.pure.api.sample.stubs.model.Workflow;
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
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A memorandum or exposition.
 */
@ApiModel(description = "A memorandum or exposition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class Memorandum extends ResearchOutput {
  public static final String SERIALIZED_NAME_APPLICANT = "applicant";
  @SerializedName(SERIALIZED_NAME_APPLICANT)
  private ExternalOrganizationRef applicant;

  public static final String SERIALIZED_NAME_PROJECT_NUMBER = "projectNumber";
  @SerializedName(SERIALIZED_NAME_PROJECT_NUMBER)
  private String projectNumber;

  public static final String SERIALIZED_NAME_JOURNAL_NUMBER = "journalNumber";
  @SerializedName(SERIALIZED_NAME_JOURNAL_NUMBER)
  private String journalNumber;

  public static final String SERIALIZED_NAME_DATE_FINISHED = "dateFinished";
  @SerializedName(SERIALIZED_NAME_DATE_FINISHED)
  private OffsetDateTime dateFinished;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;

  public static final String SERIALIZED_NAME_PUBLICATION_SERIES = "publicationSeries";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_SERIES)
  private List<PublicationSeries> publicationSeries = null;

  public static final String SERIALIZED_NAME_BOOK_SERIES = "bookSeries";
  @SerializedName(SERIALIZED_NAME_BOOK_SERIES)
  private List<BookSeriesJournalAssociation> bookSeries = null;


  public Memorandum applicant(ExternalOrganizationRef applicant) {
    
    this.applicant = applicant;
    return this;
  }

   /**
   * Get applicant
   * @return applicant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalOrganizationRef getApplicant() {
    return applicant;
  }


  public void setApplicant(ExternalOrganizationRef applicant) {
    this.applicant = applicant;
  }


  public Memorandum projectNumber(String projectNumber) {
    
    this.projectNumber = projectNumber;
    return this;
  }

   /**
   * The project number.
   * @return projectNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The project number.")

  public String getProjectNumber() {
    return projectNumber;
  }


  public void setProjectNumber(String projectNumber) {
    this.projectNumber = projectNumber;
  }


  public Memorandum journalNumber(String journalNumber) {
    
    this.journalNumber = journalNumber;
    return this;
  }

   /**
   * The journal number.
   * @return journalNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The journal number.")

  public String getJournalNumber() {
    return journalNumber;
  }


  public void setJournalNumber(String journalNumber) {
    this.journalNumber = journalNumber;
  }


  public Memorandum dateFinished(OffsetDateTime dateFinished) {
    
    this.dateFinished = dateFinished;
    return this;
  }

   /**
   * The date finished.
   * @return dateFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date finished.")

  public OffsetDateTime getDateFinished() {
    return dateFinished;
  }


  public void setDateFinished(OffsetDateTime dateFinished) {
    this.dateFinished = dateFinished;
  }


  public Memorandum numberOfPages(Integer numberOfPages) {
    
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


  public Memorandum publicationSeries(List<PublicationSeries> publicationSeries) {
    
    this.publicationSeries = publicationSeries;
    return this;
  }

  public Memorandum addPublicationSeriesItem(PublicationSeries publicationSeriesItem) {
    if (this.publicationSeries == null) {
      this.publicationSeries = new ArrayList<PublicationSeries>();
    }
    this.publicationSeries.add(publicationSeriesItem);
    return this;
  }

   /**
   * The publication series this research output is part of.
   * @return publicationSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The publication series this research output is part of.")

  public List<PublicationSeries> getPublicationSeries() {
    return publicationSeries;
  }


  public void setPublicationSeries(List<PublicationSeries> publicationSeries) {
    this.publicationSeries = publicationSeries;
  }


  public Memorandum bookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    
    this.bookSeries = bookSeries;
    return this;
  }

  public Memorandum addBookSeriesItem(BookSeriesJournalAssociation bookSeriesItem) {
    if (this.bookSeries == null) {
      this.bookSeries = new ArrayList<BookSeriesJournalAssociation>();
    }
    this.bookSeries.add(bookSeriesItem);
    return this;
  }

   /**
   * The book series this research output is part of.
   * @return bookSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The book series this research output is part of.")

  public List<BookSeriesJournalAssociation> getBookSeries() {
    return bookSeries;
  }


  public void setBookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    this.bookSeries = bookSeries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memorandum memorandum = (Memorandum) o;
    return Objects.equals(this.applicant, memorandum.applicant) &&
        Objects.equals(this.projectNumber, memorandum.projectNumber) &&
        Objects.equals(this.journalNumber, memorandum.journalNumber) &&
        Objects.equals(this.dateFinished, memorandum.dateFinished) &&
        Objects.equals(this.numberOfPages, memorandum.numberOfPages) &&
        Objects.equals(this.publicationSeries, memorandum.publicationSeries) &&
        Objects.equals(this.bookSeries, memorandum.bookSeries) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicant, projectNumber, journalNumber, dateFinished, numberOfPages, publicationSeries, bookSeries, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memorandum {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applicant: ").append(toIndentedString(applicant)).append("\n");
    sb.append("    projectNumber: ").append(toIndentedString(projectNumber)).append("\n");
    sb.append("    journalNumber: ").append(toIndentedString(journalNumber)).append("\n");
    sb.append("    dateFinished: ").append(toIndentedString(dateFinished)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    publicationSeries: ").append(toIndentedString(publicationSeries)).append("\n");
    sb.append("    bookSeries: ").append(toIndentedString(bookSeries)).append("\n");
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

