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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KeywordGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")

public class KeywordGroup {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_LOGICAL_NAME = "logicalName";
  @SerializedName(SERIALIZED_NAME_LOGICAL_NAME)
  private String logicalName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Map<String, String> name = null;

  public static final String SERIALIZED_NAME_TYPE_DISCRIMINATOR = "typeDiscriminator";
  @SerializedName(SERIALIZED_NAME_TYPE_DISCRIMINATOR)
  private String typeDiscriminator;

  public KeywordGroup() {
    this.typeDiscriminator = this.getClass().getSimpleName();
  }

   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public KeywordGroup logicalName(String logicalName) {
    
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Unique name of the configuration that specifies this keyword group
   * @return logicalName
  **/
  @ApiModelProperty(required = true, value = "Unique name of the configuration that specifies this keyword group")

  public String getLogicalName() {
    return logicalName;
  }


  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }


  public KeywordGroup name(Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public KeywordGroup putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<String, String>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getName() {
    return name;
  }


  public void setName(Map<String, String> name) {
    this.name = name;
  }


  public KeywordGroup typeDiscriminator(String typeDiscriminator) {
    
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
    KeywordGroup keywordGroup = (KeywordGroup) o;
    return Objects.equals(this.pureId, keywordGroup.pureId) &&
        Objects.equals(this.logicalName, keywordGroup.logicalName) &&
        Objects.equals(this.name, keywordGroup.name) &&
        Objects.equals(this.typeDiscriminator, keywordGroup.typeDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, logicalName, name, typeDiscriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordGroup {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

