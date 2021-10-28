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
import com.elsevier.pure.api.sample.stubs.model.PublisherRef;
import com.elsevier.pure.api.sample.stubs.model.ResearchOutput;
import com.elsevier.pure.api.sample.stubs.model.Visibility;
import com.elsevier.pure.api.sample.stubs.model.Workflow;
import com.elsevier.pure.api.sample.stubs.model.WorkingPaperAllOf;
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
 * A working paper is a document that constitutes an early version of a publication. Working papers are primarily used for exchanging ideas or to get feedback, before submitting it to a publisher. Working papers are usually published by the authors own institution.
 */
@ApiModel(description = "A working paper is a document that constitutes an early version of a publication. Working papers are primarily used for exchanging ideas or to get feedback, before submitting it to a publisher. Working papers are usually published by the authors own institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class WorkingPaper extends ResearchOutput {
  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private String pages;

  public static final String SERIALIZED_NAME_PUBLICATION_SERIES = "publicationSeries";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_SERIES)
  private List<PublicationSeries> publicationSeries = null;

  public static final String SERIALIZED_NAME_PLACE_OF_PUBLICATION = "placeOfPublication";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_PUBLICATION)
  private String placeOfPublication;

  public static final String SERIALIZED_NAME_EDITION = "edition";
  @SerializedName(SERIALIZED_NAME_EDITION)
  private String edition;

  public static final String SERIALIZED_NAME_PRINT_I_S_B_NS = "printISBNs";
  @SerializedName(SERIALIZED_NAME_PRINT_I_S_B_NS)
  private List<String> printISBNs = null;

  public static final String SERIALIZED_NAME_ELECTRONIC_I_S_B_NS = "electronicISBNs";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_I_S_B_NS)
  private List<String> electronicISBNs = null;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private PublisherRef publisher;

  public static final String SERIALIZED_NAME_BOOK_SERIES = "bookSeries";
  @SerializedName(SERIALIZED_NAME_BOOK_SERIES)
  private List<BookSeriesJournalAssociation> bookSeries = null;


  public WorkingPaper volume(String volume) {
    
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


  public WorkingPaper numberOfPages(Integer numberOfPages) {
    
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


  public WorkingPaper pages(String pages) {
    
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


  public WorkingPaper publicationSeries(List<PublicationSeries> publicationSeries) {
    
    this.publicationSeries = publicationSeries;
    return this;
  }

  public WorkingPaper addPublicationSeriesItem(PublicationSeries publicationSeriesItem) {
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


  public WorkingPaper placeOfPublication(String placeOfPublication) {
    
    this.placeOfPublication = placeOfPublication;
    return this;
  }

   /**
   * The place of publication.
   * @return placeOfPublication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The place of publication.")

  public String getPlaceOfPublication() {
    return placeOfPublication;
  }


  public void setPlaceOfPublication(String placeOfPublication) {
    this.placeOfPublication = placeOfPublication;
  }


  public WorkingPaper edition(String edition) {
    
    this.edition = edition;
    return this;
  }

   /**
   * The edition that the production was published in.
   * @return edition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The edition that the production was published in.")

  public String getEdition() {
    return edition;
  }


  public void setEdition(String edition) {
    this.edition = edition;
  }


  public WorkingPaper printISBNs(List<String> printISBNs) {
    
    this.printISBNs = printISBNs;
    return this;
  }

  public WorkingPaper addPrintISBNsItem(String printISBNsItem) {
    if (this.printISBNs == null) {
      this.printISBNs = new ArrayList<String>();
    }
    this.printISBNs.add(printISBNsItem);
    return this;
  }

   /**
   * The ISBN number for the printed versions of the production.
   * @return printISBNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISBN number for the printed versions of the production.")

  public List<String> getPrintISBNs() {
    return printISBNs;
  }


  public void setPrintISBNs(List<String> printISBNs) {
    this.printISBNs = printISBNs;
  }


  public WorkingPaper electronicISBNs(List<String> electronicISBNs) {
    
    this.electronicISBNs = electronicISBNs;
    return this;
  }

  public WorkingPaper addElectronicISBNsItem(String electronicISBNsItem) {
    if (this.electronicISBNs == null) {
      this.electronicISBNs = new ArrayList<String>();
    }
    this.electronicISBNs.add(electronicISBNsItem);
    return this;
  }

   /**
   * The ISBN number for the electronic versions of the production.
   * @return electronicISBNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISBN number for the electronic versions of the production.")

  public List<String> getElectronicISBNs() {
    return electronicISBNs;
  }


  public void setElectronicISBNs(List<String> electronicISBNs) {
    this.electronicISBNs = electronicISBNs;
  }


  public WorkingPaper publisher(PublisherRef publisher) {
    
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PublisherRef getPublisher() {
    return publisher;
  }


  public void setPublisher(PublisherRef publisher) {
    this.publisher = publisher;
  }


  public WorkingPaper bookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    
    this.bookSeries = bookSeries;
    return this;
  }

  public WorkingPaper addBookSeriesItem(BookSeriesJournalAssociation bookSeriesItem) {
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
    WorkingPaper workingPaper = (WorkingPaper) o;
    return Objects.equals(this.volume, workingPaper.volume) &&
        Objects.equals(this.numberOfPages, workingPaper.numberOfPages) &&
        Objects.equals(this.pages, workingPaper.pages) &&
        Objects.equals(this.publicationSeries, workingPaper.publicationSeries) &&
        Objects.equals(this.placeOfPublication, workingPaper.placeOfPublication) &&
        Objects.equals(this.edition, workingPaper.edition) &&
        Objects.equals(this.printISBNs, workingPaper.printISBNs) &&
        Objects.equals(this.electronicISBNs, workingPaper.electronicISBNs) &&
        Objects.equals(this.publisher, workingPaper.publisher) &&
        Objects.equals(this.bookSeries, workingPaper.bookSeries) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, numberOfPages, pages, publicationSeries, placeOfPublication, edition, printISBNs, electronicISBNs, publisher, bookSeries, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingPaper {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    publicationSeries: ").append(toIndentedString(publicationSeries)).append("\n");
    sb.append("    placeOfPublication: ").append(toIndentedString(placeOfPublication)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    printISBNs: ").append(toIndentedString(printISBNs)).append("\n");
    sb.append("    electronicISBNs: ").append(toIndentedString(electronicISBNs)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
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

