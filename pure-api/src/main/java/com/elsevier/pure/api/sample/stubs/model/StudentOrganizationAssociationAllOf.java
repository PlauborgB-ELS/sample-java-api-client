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
import org.threeten.bp.OffsetDateTime;

/**
 * StudentOrganizationAssociationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class StudentOrganizationAssociationAllOf {
  public static final String SERIALIZED_NAME_AWARD_DATE = "awardDate";
  @SerializedName(SERIALIZED_NAME_AWARD_DATE)
  private OffsetDateTime awardDate;

  public static final String SERIALIZED_NAME_AWARD_GAINED = "awardGained";
  @SerializedName(SERIALIZED_NAME_AWARD_GAINED)
  private String awardGained;

  public static final String SERIALIZED_NAME_FTE = "fte";
  @SerializedName(SERIALIZED_NAME_FTE)
  private Double fte;

  public static final String SERIALIZED_NAME_PROGRAMME = "programme";
  @SerializedName(SERIALIZED_NAME_PROGRAMME)
  private String programme;

  public static final String SERIALIZED_NAME_PROJECT_TITLE = "projectTitle";
  @SerializedName(SERIALIZED_NAME_PROJECT_TITLE)
  private Map<String, String> projectTitle = null;


  public StudentOrganizationAssociationAllOf awardDate(OffsetDateTime awardDate) {
    
    this.awardDate = awardDate;
    return this;
  }

   /**
   * The date when the student received an award.
   * @return awardDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the student received an award.")

  public OffsetDateTime getAwardDate() {
    return awardDate;
  }


  public void setAwardDate(OffsetDateTime awardDate) {
    this.awardDate = awardDate;
  }


  public StudentOrganizationAssociationAllOf awardGained(String awardGained) {
    
    this.awardGained = awardGained;
    return this;
  }

   /**
   * Description of what award the student gained.
   * @return awardGained
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of what award the student gained.")

  public String getAwardGained() {
    return awardGained;
  }


  public void setAwardGained(String awardGained) {
    this.awardGained = awardGained;
  }


  public StudentOrganizationAssociationAllOf fte(Double fte) {
    
    this.fte = fte;
    return this;
  }

   /**
   * The FTE (Full-Time Equivalent). A decimal number ranging between 0 (0% equivalent of full time) and 1 (100% equivalent of full time).
   * @return fte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The FTE (Full-Time Equivalent). A decimal number ranging between 0 (0% equivalent of full time) and 1 (100% equivalent of full time).")

  public Double getFte() {
    return fte;
  }


  public void setFte(Double fte) {
    this.fte = fte;
  }


  public StudentOrganizationAssociationAllOf programme(String programme) {
    
    this.programme = programme;
    return this;
  }

   /**
   * The name or title of a program often consists of the degree (e.g., BS) and the discipline or field of study (e.g., Business Administration).
   * @return programme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or title of a program often consists of the degree (e.g., BS) and the discipline or field of study (e.g., Business Administration).")

  public String getProgramme() {
    return programme;
  }


  public void setProgramme(String programme) {
    this.programme = programme;
  }


  public StudentOrganizationAssociationAllOf projectTitle(Map<String, String> projectTitle) {
    
    this.projectTitle = projectTitle;
    return this;
  }

  public StudentOrganizationAssociationAllOf putProjectTitleItem(String key, String projectTitleItem) {
    if (this.projectTitle == null) {
      this.projectTitle = new HashMap<String, String>();
    }
    this.projectTitle.put(key, projectTitleItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return projectTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getProjectTitle() {
    return projectTitle;
  }


  public void setProjectTitle(Map<String, String> projectTitle) {
    this.projectTitle = projectTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentOrganizationAssociationAllOf studentOrganizationAssociationAllOf = (StudentOrganizationAssociationAllOf) o;
    return Objects.equals(this.awardDate, studentOrganizationAssociationAllOf.awardDate) &&
        Objects.equals(this.awardGained, studentOrganizationAssociationAllOf.awardGained) &&
        Objects.equals(this.fte, studentOrganizationAssociationAllOf.fte) &&
        Objects.equals(this.programme, studentOrganizationAssociationAllOf.programme) &&
        Objects.equals(this.projectTitle, studentOrganizationAssociationAllOf.projectTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardDate, awardGained, fte, programme, projectTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentOrganizationAssociationAllOf {\n");
    sb.append("    awardDate: ").append(toIndentedString(awardDate)).append("\n");
    sb.append("    awardGained: ").append(toIndentedString(awardGained)).append("\n");
    sb.append("    fte: ").append(toIndentedString(fte)).append("\n");
    sb.append("    programme: ").append(toIndentedString(programme)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
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

