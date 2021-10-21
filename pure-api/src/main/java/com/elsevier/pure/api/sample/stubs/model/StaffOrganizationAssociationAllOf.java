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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StaffOrganizationAssociationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class StaffOrganizationAssociationAllOf {
  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contractType";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private ClassificationRef contractType;

  public static final String SERIALIZED_NAME_FTE = "fte";
  @SerializedName(SERIALIZED_NAME_FTE)
  private Double fte;

  public static final String SERIALIZED_NAME_JOB_DESCRIPTION = "jobDescription";
  @SerializedName(SERIALIZED_NAME_JOB_DESCRIPTION)
  private Map<String, String> jobDescription = null;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private ClassificationRef jobTitle;

  public static final String SERIALIZED_NAME_STAFF_TYPE = "staffType";
  @SerializedName(SERIALIZED_NAME_STAFF_TYPE)
  private ClassificationRef staffType;


  public StaffOrganizationAssociationAllOf contractType(ClassificationRef contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getContractType() {
    return contractType;
  }


  public void setContractType(ClassificationRef contractType) {
    this.contractType = contractType;
  }


  public StaffOrganizationAssociationAllOf fte(Double fte) {
    
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


  public StaffOrganizationAssociationAllOf jobDescription(Map<String, String> jobDescription) {
    
    this.jobDescription = jobDescription;
    return this;
  }

  public StaffOrganizationAssociationAllOf putJobDescriptionItem(String key, String jobDescriptionItem) {
    if (this.jobDescription == null) {
      this.jobDescription = new HashMap<String, String>();
    }
    this.jobDescription.put(key, jobDescriptionItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return jobDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getJobDescription() {
    return jobDescription;
  }


  public void setJobDescription(Map<String, String> jobDescription) {
    this.jobDescription = jobDescription;
  }


  public StaffOrganizationAssociationAllOf jobTitle(ClassificationRef jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(ClassificationRef jobTitle) {
    this.jobTitle = jobTitle;
  }


  public StaffOrganizationAssociationAllOf staffType(ClassificationRef staffType) {
    
    this.staffType = staffType;
    return this;
  }

   /**
   * Get staffType
   * @return staffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getStaffType() {
    return staffType;
  }


  public void setStaffType(ClassificationRef staffType) {
    this.staffType = staffType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffOrganizationAssociationAllOf staffOrganizationAssociationAllOf = (StaffOrganizationAssociationAllOf) o;
    return Objects.equals(this.contractType, staffOrganizationAssociationAllOf.contractType) &&
        Objects.equals(this.fte, staffOrganizationAssociationAllOf.fte) &&
        Objects.equals(this.jobDescription, staffOrganizationAssociationAllOf.jobDescription) &&
        Objects.equals(this.jobTitle, staffOrganizationAssociationAllOf.jobTitle) &&
        Objects.equals(this.staffType, staffOrganizationAssociationAllOf.staffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractType, fte, jobDescription, jobTitle, staffType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffOrganizationAssociationAllOf {\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    fte: ").append(toIndentedString(fte)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    staffType: ").append(toIndentedString(staffType)).append("\n");
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

