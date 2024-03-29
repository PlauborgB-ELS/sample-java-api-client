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
import com.elsevier.pure.api.sample.stubs.model.CompoundDateRange;
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
 * The professional qualifications held by a person
 */
@ApiModel(description = "The professional qualifications held by a person")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class ProfessionalQualification {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_ABBREVIATED_QUALIFICATION = "abbreviatedQualification";
  @SerializedName(SERIALIZED_NAME_ABBREVIATED_QUALIFICATION)
  private Map<String, String> abbreviatedQualification = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private CompoundDateRange period;

  public static final String SERIALIZED_NAME_QUALIFICATION = "qualification";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION)
  private Map<String, String> qualification = null;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public ProfessionalQualification abbreviatedQualification(Map<String, String> abbreviatedQualification) {
    
    this.abbreviatedQualification = abbreviatedQualification;
    return this;
  }

  public ProfessionalQualification putAbbreviatedQualificationItem(String key, String abbreviatedQualificationItem) {
    if (this.abbreviatedQualification == null) {
      this.abbreviatedQualification = new HashMap<String, String>();
    }
    this.abbreviatedQualification.put(key, abbreviatedQualificationItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return abbreviatedQualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getAbbreviatedQualification() {
    return abbreviatedQualification;
  }


  public void setAbbreviatedQualification(Map<String, String> abbreviatedQualification) {
    this.abbreviatedQualification = abbreviatedQualification;
  }


  public ProfessionalQualification period(CompoundDateRange period) {
    
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


  public ProfessionalQualification qualification(Map<String, String> qualification) {
    
    this.qualification = qualification;
    return this;
  }

  public ProfessionalQualification putQualificationItem(String key, String qualificationItem) {
    if (this.qualification == null) {
      this.qualification = new HashMap<String, String>();
    }
    this.qualification.put(key, qualificationItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return qualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getQualification() {
    return qualification;
  }


  public void setQualification(Map<String, String> qualification) {
    this.qualification = qualification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalQualification professionalQualification = (ProfessionalQualification) o;
    return Objects.equals(this.pureId, professionalQualification.pureId) &&
        Objects.equals(this.abbreviatedQualification, professionalQualification.abbreviatedQualification) &&
        Objects.equals(this.period, professionalQualification.period) &&
        Objects.equals(this.qualification, professionalQualification.qualification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, abbreviatedQualification, period, qualification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalQualification {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    abbreviatedQualification: ").append(toIndentedString(abbreviatedQualification)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
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

