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
import com.elsevier.pure.api.sample.stubs.model.FreeKeywordsKeywordGroupAllOf;
import com.elsevier.pure.api.sample.stubs.model.Keyword;
import com.elsevier.pure.api.sample.stubs.model.KeywordGroup;
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
import java.util.Map;

/**
 * De-normalized version of the full keyword group representation for instances where only free keywords can be selected
 */
@ApiModel(description = "De-normalized version of the full keyword group representation for instances where only free keywords can be selected")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class FreeKeywordsKeywordGroup extends KeywordGroup {
  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<Keyword> keywords = null;


  public FreeKeywordsKeywordGroup keywords(List<Keyword> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public FreeKeywordsKeywordGroup addKeywordsItem(Keyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<Keyword>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Free keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Free keywords")

  public List<Keyword> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<Keyword> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeKeywordsKeywordGroup freeKeywordsKeywordGroup = (FreeKeywordsKeywordGroup) o;
    return Objects.equals(this.keywords, freeKeywordsKeywordGroup.keywords) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeKeywordsKeywordGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

