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
import java.util.ArrayList;
import java.util.List;

/**
 * ClassificationsKeywordGroupAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T14:49:57.094851+01:00[Europe/Copenhagen]")
public class ClassificationsKeywordGroupAllOf {
  public static final String SERIALIZED_NAME_CLASSIFICATIONS = "classifications";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATIONS)
  private List<ClassificationRef> classifications = null;


  public ClassificationsKeywordGroupAllOf classifications(List<ClassificationRef> classifications) {
    
    this.classifications = classifications;
    return this;
  }

  public ClassificationsKeywordGroupAllOf addClassificationsItem(ClassificationRef classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<ClassificationRef>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * A list classifications extracted from the keyword group structured keyword concept
   * @return classifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list classifications extracted from the keyword group structured keyword concept")

  public List<ClassificationRef> getClassifications() {
    return classifications;
  }


  public void setClassifications(List<ClassificationRef> classifications) {
    this.classifications = classifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationsKeywordGroupAllOf classificationsKeywordGroupAllOf = (ClassificationsKeywordGroupAllOf) o;
    return Objects.equals(this.classifications, classificationsKeywordGroupAllOf.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationsKeywordGroupAllOf {\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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
