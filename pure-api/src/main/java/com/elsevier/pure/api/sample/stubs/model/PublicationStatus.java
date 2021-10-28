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
import com.elsevier.pure.api.sample.stubs.model.CompoundDate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A representation of a point in time when the status of a publication changed, e.g. the submission date or publication date of the publication.
 */
@ApiModel(description = "A representation of a point in time when the status of a publication changed, e.g. the submission date or publication date of the publication.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class PublicationStatus {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private Boolean current;

  public static final String SERIALIZED_NAME_PUBLICATION_STATUS = "publicationStatus";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_STATUS)
  private ClassificationRef publicationStatus;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private CompoundDate publicationDate;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




   /**
   * True when this status element is the current, false otherwise.
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True when this status element is the current, false otherwise.")

  public Boolean getCurrent() {
    return current;
  }




  public PublicationStatus publicationStatus(ClassificationRef publicationStatus) {
    
    this.publicationStatus = publicationStatus;
    return this;
  }

   /**
   * Get publicationStatus
   * @return publicationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getPublicationStatus() {
    return publicationStatus;
  }


  public void setPublicationStatus(ClassificationRef publicationStatus) {
    this.publicationStatus = publicationStatus;
  }


  public PublicationStatus publicationDate(CompoundDate publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompoundDate getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(CompoundDate publicationDate) {
    this.publicationDate = publicationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationStatus publicationStatus = (PublicationStatus) o;
    return Objects.equals(this.pureId, publicationStatus.pureId) &&
        Objects.equals(this.current, publicationStatus.current) &&
        Objects.equals(this.publicationStatus, publicationStatus.publicationStatus) &&
        Objects.equals(this.publicationDate, publicationStatus.publicationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, current, publicationStatus, publicationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationStatus {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    publicationStatus: ").append(toIndentedString(publicationStatus)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
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

