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
import com.elsevier.pure.api.sample.stubs.model.IdAllOf;
import com.elsevier.pure.api.sample.stubs.model.Identifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An external ID
 */
@ApiModel(description = "An external ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class Id extends Identifier {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_ID_SOURCE = "idSource";
  @SerializedName(SERIALIZED_NAME_ID_SOURCE)
  private String idSource;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


   /**
   * Pure database ID of the object
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object")

  public Long getPureId() {
    return pureId;
  }




  public Id idSource(String idSource) {
    
    this.idSource = idSource;
    return this;
  }

   /**
   * Name of the external source
   * @return idSource
  **/
  @ApiModelProperty(required = true, value = "Name of the external source")

  public String getIdSource() {
    return idSource;
  }


  public void setIdSource(String idSource) {
    this.idSource = idSource;
  }


  public Id value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * External ID
   * @return value
  **/
  @ApiModelProperty(required = true, value = "External ID")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Id id = (Id) o;
    return Objects.equals(this.pureId, id.pureId) &&
        Objects.equals(this.idSource, id.idSource) &&
        Objects.equals(this.value, id.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, idSource, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    idSource: ").append(toIndentedString(idSource)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

