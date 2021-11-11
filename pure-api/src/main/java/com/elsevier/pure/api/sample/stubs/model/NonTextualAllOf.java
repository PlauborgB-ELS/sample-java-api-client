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
import com.elsevier.pure.api.sample.stubs.model.ClassificationRef;
import com.elsevier.pure.api.sample.stubs.model.EventRef;
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
 * NonTextualAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class NonTextualAllOf {
  public static final String SERIALIZED_NAME_PLACE_OF_PUBLICATION = "placeOfPublication";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_PUBLICATION)
  private String placeOfPublication;

  public static final String SERIALIZED_NAME_EDITION = "edition";
  @SerializedName(SERIALIZED_NAME_EDITION)
  private String edition;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private PublisherRef publisher;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventRef event;

  public static final String SERIALIZED_NAME_OUTPUT_MEDIA = "outputMedia";
  @SerializedName(SERIALIZED_NAME_OUTPUT_MEDIA)
  private ClassificationRef outputMedia;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;


  public NonTextualAllOf placeOfPublication(String placeOfPublication) {
    
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


  public NonTextualAllOf edition(String edition) {
    
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


  public NonTextualAllOf publisher(PublisherRef publisher) {
    
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


  public NonTextualAllOf event(EventRef event) {
    
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


  public NonTextualAllOf outputMedia(ClassificationRef outputMedia) {
    
    this.outputMedia = outputMedia;
    return this;
  }

   /**
   * Get outputMedia
   * @return outputMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getOutputMedia() {
    return outputMedia;
  }


  public void setOutputMedia(ClassificationRef outputMedia) {
    this.outputMedia = outputMedia;
  }


  public NonTextualAllOf size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the production.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the production.")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonTextualAllOf nonTextualAllOf = (NonTextualAllOf) o;
    return Objects.equals(this.placeOfPublication, nonTextualAllOf.placeOfPublication) &&
        Objects.equals(this.edition, nonTextualAllOf.edition) &&
        Objects.equals(this.publisher, nonTextualAllOf.publisher) &&
        Objects.equals(this.event, nonTextualAllOf.event) &&
        Objects.equals(this.outputMedia, nonTextualAllOf.outputMedia) &&
        Objects.equals(this.size, nonTextualAllOf.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeOfPublication, edition, publisher, event, outputMedia, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonTextualAllOf {\n");
    sb.append("    placeOfPublication: ").append(toIndentedString(placeOfPublication)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    outputMedia: ").append(toIndentedString(outputMedia)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

