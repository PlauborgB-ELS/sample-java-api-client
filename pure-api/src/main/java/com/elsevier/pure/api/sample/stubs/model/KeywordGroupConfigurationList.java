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
import com.elsevier.pure.api.sample.stubs.model.KeywordGroupConfiguration;
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
 * List of keyword group configurations
 */
@ApiModel(description = "List of keyword group configurations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class KeywordGroupConfigurationList {
  public static final String SERIALIZED_NAME_CONFIGURATIONS = "configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  private List<KeywordGroupConfiguration> configurations = null;


  public KeywordGroupConfigurationList configurations(List<KeywordGroupConfiguration> configurations) {
    
    this.configurations = configurations;
    return this;
  }

  public KeywordGroupConfigurationList addConfigurationsItem(KeywordGroupConfiguration configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<KeywordGroupConfiguration>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeywordGroupConfiguration> getConfigurations() {
    return configurations;
  }


  public void setConfigurations(List<KeywordGroupConfiguration> configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordGroupConfigurationList keywordGroupConfigurationList = (KeywordGroupConfigurationList) o;
    return Objects.equals(this.configurations, keywordGroupConfigurationList.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordGroupConfigurationList {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

