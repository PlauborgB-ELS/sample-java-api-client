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
import com.elsevier.pure.api.sample.stubs.model.BookSeriesJournalAssociation;
import com.elsevier.pure.api.sample.stubs.model.EventRef;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.PublicationSeries;
import com.elsevier.pure.api.sample.stubs.model.PublisherRef;
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
 * BookAnthologyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class BookAnthologyAllOf {
  public static final String SERIALIZED_NAME_COMMISSIONING_BODY = "commissioningBody";
  @SerializedName(SERIALIZED_NAME_COMMISSIONING_BODY)
  private ExternalOrganizationRef commissioningBody;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

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

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventRef event;


  public BookAnthologyAllOf commissioningBody(ExternalOrganizationRef commissioningBody) {
    
    this.commissioningBody = commissioningBody;
    return this;
  }

   /**
   * Get commissioningBody
   * @return commissioningBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalOrganizationRef getCommissioningBody() {
    return commissioningBody;
  }


  public void setCommissioningBody(ExternalOrganizationRef commissioningBody) {
    this.commissioningBody = commissioningBody;
  }


  public BookAnthologyAllOf numberOfPages(Integer numberOfPages) {
    
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


  public BookAnthologyAllOf volume(String volume) {
    
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


  public BookAnthologyAllOf publicationSeries(List<PublicationSeries> publicationSeries) {
    
    this.publicationSeries = publicationSeries;
    return this;
  }

  public BookAnthologyAllOf addPublicationSeriesItem(PublicationSeries publicationSeriesItem) {
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


  public BookAnthologyAllOf placeOfPublication(String placeOfPublication) {
    
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


  public BookAnthologyAllOf edition(String edition) {
    
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


  public BookAnthologyAllOf printISBNs(List<String> printISBNs) {
    
    this.printISBNs = printISBNs;
    return this;
  }

  public BookAnthologyAllOf addPrintISBNsItem(String printISBNsItem) {
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


  public BookAnthologyAllOf electronicISBNs(List<String> electronicISBNs) {
    
    this.electronicISBNs = electronicISBNs;
    return this;
  }

  public BookAnthologyAllOf addElectronicISBNsItem(String electronicISBNsItem) {
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


  public BookAnthologyAllOf publisher(PublisherRef publisher) {
    
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


  public BookAnthologyAllOf bookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    
    this.bookSeries = bookSeries;
    return this;
  }

  public BookAnthologyAllOf addBookSeriesItem(BookSeriesJournalAssociation bookSeriesItem) {
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


  public BookAnthologyAllOf event(EventRef event) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookAnthologyAllOf bookAnthologyAllOf = (BookAnthologyAllOf) o;
    return Objects.equals(this.commissioningBody, bookAnthologyAllOf.commissioningBody) &&
        Objects.equals(this.numberOfPages, bookAnthologyAllOf.numberOfPages) &&
        Objects.equals(this.volume, bookAnthologyAllOf.volume) &&
        Objects.equals(this.publicationSeries, bookAnthologyAllOf.publicationSeries) &&
        Objects.equals(this.placeOfPublication, bookAnthologyAllOf.placeOfPublication) &&
        Objects.equals(this.edition, bookAnthologyAllOf.edition) &&
        Objects.equals(this.printISBNs, bookAnthologyAllOf.printISBNs) &&
        Objects.equals(this.electronicISBNs, bookAnthologyAllOf.electronicISBNs) &&
        Objects.equals(this.publisher, bookAnthologyAllOf.publisher) &&
        Objects.equals(this.bookSeries, bookAnthologyAllOf.bookSeries) &&
        Objects.equals(this.event, bookAnthologyAllOf.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissioningBody, numberOfPages, volume, publicationSeries, placeOfPublication, edition, printISBNs, electronicISBNs, publisher, bookSeries, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookAnthologyAllOf {\n");
    sb.append("    commissioningBody: ").append(toIndentedString(commissioningBody)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    publicationSeries: ").append(toIndentedString(publicationSeries)).append("\n");
    sb.append("    placeOfPublication: ").append(toIndentedString(placeOfPublication)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    printISBNs: ").append(toIndentedString(printISBNs)).append("\n");
    sb.append("    electronicISBNs: ").append(toIndentedString(electronicISBNs)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    bookSeries: ").append(toIndentedString(bookSeries)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

