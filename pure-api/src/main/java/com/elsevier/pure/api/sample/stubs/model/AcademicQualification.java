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
import com.elsevier.pure.api.sample.stubs.model.CompoundDateRange;
import com.elsevier.pure.api.sample.stubs.model.OrganizationOrExternalOrganizationRef;
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
 * An object mapping the data of an education received by a person
 */
@ApiModel(description = "An object mapping the data of an education received by a person")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class AcademicQualification {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_AWARD_DATE = "awardDate";
  @SerializedName(SERIALIZED_NAME_AWARD_DATE)
  private OffsetDateTime awardDate;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private CompoundDateRange period;

  public static final String SERIALIZED_NAME_FIELD_OF_STUDY = "fieldOfStudy";
  @SerializedName(SERIALIZED_NAME_FIELD_OF_STUDY)
  private ClassificationRef fieldOfStudy;

  public static final String SERIALIZED_NAME_FIELD_OF_STUDY_UNSTRUCTURED = "fieldOfStudyUnstructured";
  @SerializedName(SERIALIZED_NAME_FIELD_OF_STUDY_UNSTRUCTURED)
  private Map<String, String> fieldOfStudyUnstructured = null;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationOrExternalOrganizationRef organization;

  public static final String SERIALIZED_NAME_PROJECT_TITLE = "projectTitle";
  @SerializedName(SERIALIZED_NAME_PROJECT_TITLE)
  private Map<String, String> projectTitle = null;

  public static final String SERIALIZED_NAME_QUALIFICATION = "qualification";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION)
  private ClassificationRef qualification;

  public static final String SERIALIZED_NAME_QUALIFICATION_UNSTRUCTURED = "qualificationUnstructured";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_UNSTRUCTURED)
  private Map<String, String> qualificationUnstructured = null;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public AcademicQualification awardDate(OffsetDateTime awardDate) {
    
    this.awardDate = awardDate;
    return this;
  }

   /**
   * Date that the education was awarded at.
   * @return awardDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date that the education was awarded at.")

  public OffsetDateTime getAwardDate() {
    return awardDate;
  }


  public void setAwardDate(OffsetDateTime awardDate) {
    this.awardDate = awardDate;
  }


  public AcademicQualification period(CompoundDateRange period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompoundDateRange getPeriod() {
    return period;
  }


  public void setPeriod(CompoundDateRange period) {
    this.period = period;
  }


  public AcademicQualification fieldOfStudy(ClassificationRef fieldOfStudy) {
    
    this.fieldOfStudy = fieldOfStudy;
    return this;
  }

   /**
   * Get fieldOfStudy
   * @return fieldOfStudy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getFieldOfStudy() {
    return fieldOfStudy;
  }


  public void setFieldOfStudy(ClassificationRef fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }


  public AcademicQualification fieldOfStudyUnstructured(Map<String, String> fieldOfStudyUnstructured) {
    
    this.fieldOfStudyUnstructured = fieldOfStudyUnstructured;
    return this;
  }

  public AcademicQualification putFieldOfStudyUnstructuredItem(String key, String fieldOfStudyUnstructuredItem) {
    if (this.fieldOfStudyUnstructured == null) {
      this.fieldOfStudyUnstructured = new HashMap<String, String>();
    }
    this.fieldOfStudyUnstructured.put(key, fieldOfStudyUnstructuredItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return fieldOfStudyUnstructured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getFieldOfStudyUnstructured() {
    return fieldOfStudyUnstructured;
  }


  public void setFieldOfStudyUnstructured(Map<String, String> fieldOfStudyUnstructured) {
    this.fieldOfStudyUnstructured = fieldOfStudyUnstructured;
  }


  public AcademicQualification organization(OrganizationOrExternalOrganizationRef organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationOrExternalOrganizationRef getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationOrExternalOrganizationRef organization) {
    this.organization = organization;
  }


  public AcademicQualification projectTitle(Map<String, String> projectTitle) {
    
    this.projectTitle = projectTitle;
    return this;
  }

  public AcademicQualification putProjectTitleItem(String key, String projectTitleItem) {
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


  public AcademicQualification qualification(ClassificationRef qualification) {
    
    this.qualification = qualification;
    return this;
  }

   /**
   * Get qualification
   * @return qualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getQualification() {
    return qualification;
  }


  public void setQualification(ClassificationRef qualification) {
    this.qualification = qualification;
  }


  public AcademicQualification qualificationUnstructured(Map<String, String> qualificationUnstructured) {
    
    this.qualificationUnstructured = qualificationUnstructured;
    return this;
  }

  public AcademicQualification putQualificationUnstructuredItem(String key, String qualificationUnstructuredItem) {
    if (this.qualificationUnstructured == null) {
      this.qualificationUnstructured = new HashMap<String, String>();
    }
    this.qualificationUnstructured.put(key, qualificationUnstructuredItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return qualificationUnstructured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getQualificationUnstructured() {
    return qualificationUnstructured;
  }


  public void setQualificationUnstructured(Map<String, String> qualificationUnstructured) {
    this.qualificationUnstructured = qualificationUnstructured;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicQualification academicQualification = (AcademicQualification) o;
    return Objects.equals(this.pureId, academicQualification.pureId) &&
        Objects.equals(this.awardDate, academicQualification.awardDate) &&
        Objects.equals(this.period, academicQualification.period) &&
        Objects.equals(this.fieldOfStudy, academicQualification.fieldOfStudy) &&
        Objects.equals(this.fieldOfStudyUnstructured, academicQualification.fieldOfStudyUnstructured) &&
        Objects.equals(this.organization, academicQualification.organization) &&
        Objects.equals(this.projectTitle, academicQualification.projectTitle) &&
        Objects.equals(this.qualification, academicQualification.qualification) &&
        Objects.equals(this.qualificationUnstructured, academicQualification.qualificationUnstructured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, awardDate, period, fieldOfStudy, fieldOfStudyUnstructured, organization, projectTitle, qualification, qualificationUnstructured);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicQualification {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    awardDate: ").append(toIndentedString(awardDate)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    fieldOfStudy: ").append(toIndentedString(fieldOfStudy)).append("\n");
    sb.append("    fieldOfStudyUnstructured: ").append(toIndentedString(fieldOfStudyUnstructured)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    qualificationUnstructured: ").append(toIndentedString(qualificationUnstructured)).append("\n");
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

