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
 * The assigned discipline and its split percentage
 */
@ApiModel(description = "The assigned discipline and its split percentage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class DisciplinesDisciplineAssignment {
  public static final String SERIALIZED_NAME_DISCIPLINE_ID = "disciplineId";
  @SerializedName(SERIALIZED_NAME_DISCIPLINE_ID)
  private String disciplineId;

  public static final String SERIALIZED_NAME_SPLIT_PERCENTAGE = "splitPercentage";
  @SerializedName(SERIALIZED_NAME_SPLIT_PERCENTAGE)
  private Double splitPercentage;


  public DisciplinesDisciplineAssignment disciplineId(String disciplineId) {
    
    this.disciplineId = disciplineId;
    return this;
  }

   /**
   * The assigned discipline
   * @return disciplineId
  **/
  @ApiModelProperty(required = true, value = "The assigned discipline")

  public String getDisciplineId() {
    return disciplineId;
  }


  public void setDisciplineId(String disciplineId) {
    this.disciplineId = disciplineId;
  }


  public DisciplinesDisciplineAssignment splitPercentage(Double splitPercentage) {
    
    this.splitPercentage = splitPercentage;
    return this;
  }

   /**
   * The split percentages within an assigned discipline scheme must sum up to 100%
   * @return splitPercentage
  **/
  @ApiModelProperty(required = true, value = "The split percentages within an assigned discipline scheme must sum up to 100%")

  public Double getSplitPercentage() {
    return splitPercentage;
  }


  public void setSplitPercentage(Double splitPercentage) {
    this.splitPercentage = splitPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisciplinesDisciplineAssignment disciplinesDisciplineAssignment = (DisciplinesDisciplineAssignment) o;
    return Objects.equals(this.disciplineId, disciplinesDisciplineAssignment.disciplineId) &&
        Objects.equals(this.splitPercentage, disciplinesDisciplineAssignment.splitPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disciplineId, splitPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisciplinesDisciplineAssignment {\n");
    sb.append("    disciplineId: ").append(toIndentedString(disciplineId)).append("\n");
    sb.append("    splitPercentage: ").append(toIndentedString(splitPercentage)).append("\n");
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

