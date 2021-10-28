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
import com.elsevier.pure.api.sample.stubs.model.ClassificationSchemeRef;
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
 * A specification of the allowed behavior of a specified keyword group
 */
@ApiModel(description = "A specification of the allowed behavior of a specified keyword group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class KeywordGroupConfiguration {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_TARGET_SYSTEM_NAME = "targetSystemName";
  @SerializedName(SERIALIZED_NAME_TARGET_SYSTEM_NAME)
  private String targetSystemName;

  public static final String SERIALIZED_NAME_KEYWORD_GROUP_TYPE = "keywordGroupType";
  @SerializedName(SERIALIZED_NAME_KEYWORD_GROUP_TYPE)
  private String keywordGroupType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Map<String, String> name = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Map<String, String> description = null;

  public static final String SERIALIZED_NAME_CLASSIFICATION_SCHEME = "classificationScheme";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_SCHEME)
  private ClassificationSchemeRef classificationScheme;

  public static final String SERIALIZED_NAME_ALLOW_USERDEFINED_KEYWORDS = "allowUserdefinedKeywords";
  @SerializedName(SERIALIZED_NAME_ALLOW_USERDEFINED_KEYWORDS)
  private Boolean allowUserdefinedKeywords;

  public static final String SERIALIZED_NAME_LIMIT_TO_LEAF_SELECTION = "limitToLeafSelection";
  @SerializedName(SERIALIZED_NAME_LIMIT_TO_LEAF_SELECTION)
  private Boolean limitToLeafSelection;

  public static final String SERIALIZED_NAME_LOGICAL_NAME = "logicalName";
  @SerializedName(SERIALIZED_NAME_LOGICAL_NAME)
  private String logicalName;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public KeywordGroupConfiguration targetSystemName(String targetSystemName) {
    
    this.targetSystemName = targetSystemName;
    return this;
  }

   /**
   * The content system name this configuration applies to
   * @return targetSystemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content system name this configuration applies to")

  public String getTargetSystemName() {
    return targetSystemName;
  }


  public void setTargetSystemName(String targetSystemName) {
    this.targetSystemName = targetSystemName;
  }


  public KeywordGroupConfiguration keywordGroupType(String keywordGroupType) {
    
    this.keywordGroupType = keywordGroupType;
    return this;
  }

   /**
   * The OpenAPI schema type of this keyword configuration
   * @return keywordGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OpenAPI schema type of this keyword configuration")

  public String getKeywordGroupType() {
    return keywordGroupType;
  }


  public void setKeywordGroupType(String keywordGroupType) {
    this.keywordGroupType = keywordGroupType;
  }


  public KeywordGroupConfiguration name(Map<String, String> name) {
    
    this.name = name;
    return this;
  }

  public KeywordGroupConfiguration putNameItem(String key, String nameItem) {
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


  public KeywordGroupConfiguration description(Map<String, String> description) {
    
    this.description = description;
    return this;
  }

  public KeywordGroupConfiguration putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<String, String>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getDescription() {
    return description;
  }


  public void setDescription(Map<String, String> description) {
    this.description = description;
  }


  public KeywordGroupConfiguration classificationScheme(ClassificationSchemeRef classificationScheme) {
    
    this.classificationScheme = classificationScheme;
    return this;
  }

   /**
   * Get classificationScheme
   * @return classificationScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationSchemeRef getClassificationScheme() {
    return classificationScheme;
  }


  public void setClassificationScheme(ClassificationSchemeRef classificationScheme) {
    this.classificationScheme = classificationScheme;
  }


  public KeywordGroupConfiguration allowUserdefinedKeywords(Boolean allowUserdefinedKeywords) {
    
    this.allowUserdefinedKeywords = allowUserdefinedKeywords;
    return this;
  }

   /**
   * Defines if user defined keywords are allowed
   * @return allowUserdefinedKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if user defined keywords are allowed")

  public Boolean getAllowUserdefinedKeywords() {
    return allowUserdefinedKeywords;
  }


  public void setAllowUserdefinedKeywords(Boolean allowUserdefinedKeywords) {
    this.allowUserdefinedKeywords = allowUserdefinedKeywords;
  }


  public KeywordGroupConfiguration limitToLeafSelection(Boolean limitToLeafSelection) {
    
    this.limitToLeafSelection = limitToLeafSelection;
    return this;
  }

   /**
   * Get limitToLeafSelection
   * @return limitToLeafSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLimitToLeafSelection() {
    return limitToLeafSelection;
  }


  public void setLimitToLeafSelection(Boolean limitToLeafSelection) {
    this.limitToLeafSelection = limitToLeafSelection;
  }


  public KeywordGroupConfiguration logicalName(String logicalName) {
    
    this.logicalName = logicalName;
    return this;
  }

   /**
   * Get logicalName
   * @return logicalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogicalName() {
    return logicalName;
  }


  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordGroupConfiguration keywordGroupConfiguration = (KeywordGroupConfiguration) o;
    return Objects.equals(this.pureId, keywordGroupConfiguration.pureId) &&
        Objects.equals(this.targetSystemName, keywordGroupConfiguration.targetSystemName) &&
        Objects.equals(this.keywordGroupType, keywordGroupConfiguration.keywordGroupType) &&
        Objects.equals(this.name, keywordGroupConfiguration.name) &&
        Objects.equals(this.description, keywordGroupConfiguration.description) &&
        Objects.equals(this.classificationScheme, keywordGroupConfiguration.classificationScheme) &&
        Objects.equals(this.allowUserdefinedKeywords, keywordGroupConfiguration.allowUserdefinedKeywords) &&
        Objects.equals(this.limitToLeafSelection, keywordGroupConfiguration.limitToLeafSelection) &&
        Objects.equals(this.logicalName, keywordGroupConfiguration.logicalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, targetSystemName, keywordGroupType, name, description, classificationScheme, allowUserdefinedKeywords, limitToLeafSelection, logicalName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordGroupConfiguration {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    targetSystemName: ").append(toIndentedString(targetSystemName)).append("\n");
    sb.append("    keywordGroupType: ").append(toIndentedString(keywordGroupType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    classificationScheme: ").append(toIndentedString(classificationScheme)).append("\n");
    sb.append("    allowUserdefinedKeywords: ").append(toIndentedString(allowUserdefinedKeywords)).append("\n");
    sb.append("    limitToLeafSelection: ").append(toIndentedString(limitToLeafSelection)).append("\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
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

