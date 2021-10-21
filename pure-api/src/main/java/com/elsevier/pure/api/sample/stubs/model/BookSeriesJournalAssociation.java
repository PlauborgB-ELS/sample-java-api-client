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
import com.elsevier.pure.api.sample.stubs.model.ISSN;
import com.elsevier.pure.api.sample.stubs.model.JournalRef;
import com.elsevier.pure.api.sample.stubs.model.JournalTitle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A relation describing the association between a book series and the associated journal.
 */
@ApiModel(description = "A relation describing the association between a book series and the associated journal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class BookSeriesJournalAssociation {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private JournalTitle title;

  public static final String SERIALIZED_NAME_ISSN = "issn";
  @SerializedName(SERIALIZED_NAME_ISSN)
  private ISSN issn;

  public static final String SERIALIZED_NAME_JOURNAL = "journal";
  @SerializedName(SERIALIZED_NAME_JOURNAL)
  private JournalRef journal;

  public static final String SERIALIZED_NAME_NO = "no";
  @SerializedName(SERIALIZED_NAME_NO)
  private String no;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public BookSeriesJournalAssociation title(JournalTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JournalTitle getTitle() {
    return title;
  }


  public void setTitle(JournalTitle title) {
    this.title = title;
  }


  public BookSeriesJournalAssociation issn(ISSN issn) {
    
    this.issn = issn;
    return this;
  }

   /**
   * Get issn
   * @return issn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ISSN getIssn() {
    return issn;
  }


  public void setIssn(ISSN issn) {
    this.issn = issn;
  }


  public BookSeriesJournalAssociation journal(JournalRef journal) {
    
    this.journal = journal;
    return this;
  }

   /**
   * Get journal
   * @return journal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JournalRef getJournal() {
    return journal;
  }


  public void setJournal(JournalRef journal) {
    this.journal = journal;
  }


  public BookSeriesJournalAssociation no(String no) {
    
    this.no = no;
    return this;
  }

   /**
   * Get no
   * @return no
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNo() {
    return no;
  }


  public void setNo(String no) {
    this.no = no;
  }


  public BookSeriesJournalAssociation volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookSeriesJournalAssociation bookSeriesJournalAssociation = (BookSeriesJournalAssociation) o;
    return Objects.equals(this.pureId, bookSeriesJournalAssociation.pureId) &&
        Objects.equals(this.title, bookSeriesJournalAssociation.title) &&
        Objects.equals(this.issn, bookSeriesJournalAssociation.issn) &&
        Objects.equals(this.journal, bookSeriesJournalAssociation.journal) &&
        Objects.equals(this.no, bookSeriesJournalAssociation.no) &&
        Objects.equals(this.volume, bookSeriesJournalAssociation.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, title, issn, journal, no, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookSeriesJournalAssociation {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    journal: ").append(toIndentedString(journal)).append("\n");
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

