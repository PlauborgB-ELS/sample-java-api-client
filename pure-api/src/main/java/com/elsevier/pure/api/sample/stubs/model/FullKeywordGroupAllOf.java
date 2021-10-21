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
import com.elsevier.pure.api.sample.stubs.model.KeywordContainer;
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
 * FullKeywordGroupAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class FullKeywordGroupAllOf {
  public static final String SERIALIZED_NAME_KEYWORD_CONTAINERS = "keywordContainers";
  @SerializedName(SERIALIZED_NAME_KEYWORD_CONTAINERS)
  private List<KeywordContainer> keywordContainers = null;


  public FullKeywordGroupAllOf keywordContainers(List<KeywordContainer> keywordContainers) {
    
    this.keywordContainers = keywordContainers;
    return this;
  }

  public FullKeywordGroupAllOf addKeywordContainersItem(KeywordContainer keywordContainersItem) {
    if (this.keywordContainers == null) {
      this.keywordContainers = new ArrayList<KeywordContainer>();
    }
    this.keywordContainers.add(keywordContainersItem);
    return this;
  }

   /**
   * Containers with structured keywords and/or free keywords
   * @return keywordContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Containers with structured keywords and/or free keywords")

  public List<KeywordContainer> getKeywordContainers() {
    return keywordContainers;
  }


  public void setKeywordContainers(List<KeywordContainer> keywordContainers) {
    this.keywordContainers = keywordContainers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullKeywordGroupAllOf fullKeywordGroupAllOf = (FullKeywordGroupAllOf) o;
    return Objects.equals(this.keywordContainers, fullKeywordGroupAllOf.keywordContainers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordContainers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullKeywordGroupAllOf {\n");
    sb.append("    keywordContainers: ").append(toIndentedString(keywordContainers)).append("\n");
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

