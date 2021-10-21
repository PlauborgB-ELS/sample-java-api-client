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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AdditionalISSN
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")

public class AdditionalISSN {
  public static final String SERIALIZED_NAME_ISSN = "issn";
  @SerializedName(SERIALIZED_NAME_ISSN)
  private String issn;

  public static final String SERIALIZED_NAME_TYPE_DISCRIMINATOR = "typeDiscriminator";
  @SerializedName(SERIALIZED_NAME_TYPE_DISCRIMINATOR)
  private String typeDiscriminator;

  public AdditionalISSN() {
    this.typeDiscriminator = this.getClass().getSimpleName();
  }

  public AdditionalISSN issn(String issn) {
    
    this.issn = issn;
    return this;
  }

   /**
   * The actual ISSN value
   * @return issn
  **/
  @ApiModelProperty(required = true, value = "The actual ISSN value")

  public String getIssn() {
    return issn;
  }


  public void setIssn(String issn) {
    this.issn = issn;
  }


  public AdditionalISSN typeDiscriminator(String typeDiscriminator) {
    
    this.typeDiscriminator = typeDiscriminator;
    return this;
  }

   /**
   * Get typeDiscriminator
   * @return typeDiscriminator
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTypeDiscriminator() {
    return typeDiscriminator;
  }


  public void setTypeDiscriminator(String typeDiscriminator) {
    this.typeDiscriminator = typeDiscriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalISSN additionalISSN = (AdditionalISSN) o;
    return Objects.equals(this.issn, additionalISSN.issn) &&
        Objects.equals(this.typeDiscriminator, additionalISSN.typeDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issn, typeDiscriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalISSN {\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    typeDiscriminator: ").append(toIndentedString(typeDiscriminator)).append("\n");
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

