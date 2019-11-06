/*
 * Pure API
 * Description text
 *
 * The version of the OpenAPI document: 0.1-Alpha
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
import com.elsevier.pure.api.sample.stubs.model.Id;
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
 * A classified ID
 */
@ApiModel(description = "A classified ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T09:45:25.329746+01:00[Europe/Copenhagen]")
public class ClassifiedId {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_FREE_FORM_EXTERNAL_IDS = "freeFormExternalIds";
  @SerializedName(SERIALIZED_NAME_FREE_FORM_EXTERNAL_IDS)
  private List<Id> freeFormExternalIds = null;

  public static final String SERIALIZED_NAME_EXTERNALLY_MANAGED = "externallyManaged";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_MANAGED)
  private Boolean externallyManaged;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ClassificationRef type;


   /**
   * Pure database ID of the object
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object")

  public Long getPureId() {
    return pureId;
  }




  public ClassifiedId freeFormExternalIds(List<Id> freeFormExternalIds) {
    
    this.freeFormExternalIds = freeFormExternalIds;
    return this;
  }

  public ClassifiedId addFreeFormExternalIdsItem(Id freeFormExternalIdsItem) {
    if (this.freeFormExternalIds == null) {
      this.freeFormExternalIds = new ArrayList<Id>();
    }
    this.freeFormExternalIds.add(freeFormExternalIdsItem);
    return this;
  }

   /**
   * IDs from the external sources (part of) the object was imported from
   * @return freeFormExternalIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDs from the external sources (part of) the object was imported from")

  public List<Id> getFreeFormExternalIds() {
    return freeFormExternalIds;
  }


  public void setFreeFormExternalIds(List<Id> freeFormExternalIds) {
    this.freeFormExternalIds = freeFormExternalIds;
  }


  public ClassifiedId externallyManaged(Boolean externallyManaged) {
    
    this.externallyManaged = externallyManaged;
    return this;
  }

   /**
   * Signals that the information is maintained by synchronization from an external system
   * @return externallyManaged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signals that the information is maintained by synchronization from an external system")

  public Boolean getExternallyManaged() {
    return externallyManaged;
  }


  public void setExternallyManaged(Boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
  }


  public ClassifiedId id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Classified ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Classified ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClassifiedId type(ClassificationRef type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getType() {
    return type;
  }


  public void setType(ClassificationRef type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifiedId classifiedId = (ClassifiedId) o;
    return Objects.equals(this.pureId, classifiedId.pureId) &&
        Objects.equals(this.freeFormExternalIds, classifiedId.freeFormExternalIds) &&
        Objects.equals(this.externallyManaged, classifiedId.externallyManaged) &&
        Objects.equals(this.id, classifiedId.id) &&
        Objects.equals(this.type, classifiedId.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, freeFormExternalIds, externallyManaged, id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifiedId {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    freeFormExternalIds: ").append(toIndentedString(freeFormExternalIds)).append("\n");
    sb.append("    externallyManaged: ").append(toIndentedString(externallyManaged)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

