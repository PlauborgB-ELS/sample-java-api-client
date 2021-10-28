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
import com.elsevier.pure.api.sample.stubs.model.FormattedString;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A publication series.
 */
@ApiModel(description = "A publication series.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class PublicationSeries {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private FormattedString name;

  public static final String SERIALIZED_NAME_PUBLISHER_NAME = "publisherName";
  @SerializedName(SERIALIZED_NAME_PUBLISHER_NAME)
  private String publisherName;

  public static final String SERIALIZED_NAME_PRINT_ISSN = "printIssn";
  @SerializedName(SERIALIZED_NAME_PRINT_ISSN)
  private String printIssn;

  public static final String SERIALIZED_NAME_ELECTRONIC_ISSN = "electronicIssn";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_ISSN)
  private String electronicIssn;

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




  public PublicationSeries name(FormattedString name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormattedString getName() {
    return name;
  }


  public void setName(FormattedString name) {
    this.name = name;
  }


  public PublicationSeries publisherName(String publisherName) {
    
    this.publisherName = publisherName;
    return this;
  }

   /**
   * The publisher of the publication series.
   * @return publisherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The publisher of the publication series.")

  public String getPublisherName() {
    return publisherName;
  }


  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }


  public PublicationSeries printIssn(String printIssn) {
    
    this.printIssn = printIssn;
    return this;
  }

   /**
   * The print ISSN of the publication series.
   * @return printIssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The print ISSN of the publication series.")

  public String getPrintIssn() {
    return printIssn;
  }


  public void setPrintIssn(String printIssn) {
    this.printIssn = printIssn;
  }


  public PublicationSeries electronicIssn(String electronicIssn) {
    
    this.electronicIssn = electronicIssn;
    return this;
  }

   /**
   * The electronic ISSN of the publication series.
   * @return electronicIssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The electronic ISSN of the publication series.")

  public String getElectronicIssn() {
    return electronicIssn;
  }


  public void setElectronicIssn(String electronicIssn) {
    this.electronicIssn = electronicIssn;
  }


  public PublicationSeries no(String no) {
    
    this.no = no;
    return this;
  }

   /**
   * The number of the publication series.
   * @return no
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the publication series.")

  public String getNo() {
    return no;
  }


  public void setNo(String no) {
    this.no = no;
  }


  public PublicationSeries volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * The volume of the publication series.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The volume of the publication series.")

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
    PublicationSeries publicationSeries = (PublicationSeries) o;
    return Objects.equals(this.pureId, publicationSeries.pureId) &&
        Objects.equals(this.name, publicationSeries.name) &&
        Objects.equals(this.publisherName, publicationSeries.publisherName) &&
        Objects.equals(this.printIssn, publicationSeries.printIssn) &&
        Objects.equals(this.electronicIssn, publicationSeries.electronicIssn) &&
        Objects.equals(this.no, publicationSeries.no) &&
        Objects.equals(this.volume, publicationSeries.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, name, publisherName, printIssn, electronicIssn, no, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationSeries {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
    sb.append("    printIssn: ").append(toIndentedString(printIssn)).append("\n");
    sb.append("    electronicIssn: ").append(toIndentedString(electronicIssn)).append("\n");
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

