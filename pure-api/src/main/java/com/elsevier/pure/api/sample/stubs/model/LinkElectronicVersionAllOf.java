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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinkElectronicVersionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class LinkElectronicVersionAllOf {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_VERSION_TYPE = "versionType";
  @SerializedName(SERIALIZED_NAME_VERSION_TYPE)
  private ClassificationRef versionType;


  public LinkElectronicVersionAllOf link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * A link to the electronic version.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to the electronic version.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public LinkElectronicVersionAllOf versionType(ClassificationRef versionType) {
    
    this.versionType = versionType;
    return this;
  }

   /**
   * Get versionType
   * @return versionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getVersionType() {
    return versionType;
  }


  public void setVersionType(ClassificationRef versionType) {
    this.versionType = versionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkElectronicVersionAllOf linkElectronicVersionAllOf = (LinkElectronicVersionAllOf) o;
    return Objects.equals(this.link, linkElectronicVersionAllOf.link) &&
        Objects.equals(this.versionType, linkElectronicVersionAllOf.versionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, versionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkElectronicVersionAllOf {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
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

