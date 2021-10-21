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
import com.elsevier.pure.api.sample.stubs.model.DateRange;
import com.elsevier.pure.api.sample.stubs.model.ElectronicVersion;
import com.elsevier.pure.api.sample.stubs.model.LinkElectronicVersionAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Link electronic version related to a research output.
 */
@ApiModel(description = "Link electronic version related to a research output.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class LinkElectronicVersion extends ElectronicVersion {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_VERSION_TYPE = "versionType";
  @SerializedName(SERIALIZED_NAME_VERSION_TYPE)
  private ClassificationRef versionType;


  public LinkElectronicVersion link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * A link to the electronic version.
   * @return link
  **/
  @ApiModelProperty(required = true, value = "A link to the electronic version.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public LinkElectronicVersion versionType(ClassificationRef versionType) {
    
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
    LinkElectronicVersion linkElectronicVersion = (LinkElectronicVersion) o;
    return Objects.equals(this.link, linkElectronicVersion.link) &&
        Objects.equals(this.versionType, linkElectronicVersion.versionType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, versionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkElectronicVersion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

