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
import com.elsevier.pure.api.sample.stubs.model.JournalAssociation;
import com.elsevier.pure.api.sample.stubs.model.PublisherRef;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContributionToPeriodicalAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class ContributionToPeriodicalAllOf {
  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private PublisherRef publisher;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_JOURNAL_ASSOCIATION = "journalAssociation";
  @SerializedName(SERIALIZED_NAME_JOURNAL_ASSOCIATION)
  private JournalAssociation journalAssociation;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private String pages;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;


  public ContributionToPeriodicalAllOf publisher(PublisherRef publisher) {
    
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


  public ContributionToPeriodicalAllOf volume(String volume) {
    
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


  public ContributionToPeriodicalAllOf journalAssociation(JournalAssociation journalAssociation) {
    
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


  public ContributionToPeriodicalAllOf number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The number of periodical.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of periodical.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public ContributionToPeriodicalAllOf pages(String pages) {
    
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


  public ContributionToPeriodicalAllOf numberOfPages(Integer numberOfPages) {
    
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
    ContributionToPeriodicalAllOf contributionToPeriodicalAllOf = (ContributionToPeriodicalAllOf) o;
    return Objects.equals(this.publisher, contributionToPeriodicalAllOf.publisher) &&
        Objects.equals(this.volume, contributionToPeriodicalAllOf.volume) &&
        Objects.equals(this.journalAssociation, contributionToPeriodicalAllOf.journalAssociation) &&
        Objects.equals(this.number, contributionToPeriodicalAllOf.number) &&
        Objects.equals(this.pages, contributionToPeriodicalAllOf.pages) &&
        Objects.equals(this.numberOfPages, contributionToPeriodicalAllOf.numberOfPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publisher, volume, journalAssociation, number, pages, numberOfPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionToPeriodicalAllOf {\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    journalAssociation: ").append(toIndentedString(journalAssociation)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

