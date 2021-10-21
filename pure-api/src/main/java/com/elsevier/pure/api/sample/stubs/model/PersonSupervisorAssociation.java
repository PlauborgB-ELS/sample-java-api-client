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
import com.elsevier.pure.api.sample.stubs.model.DateRange;
import com.elsevier.pure.api.sample.stubs.model.InternalOrExternalSupervisor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The association data of a person and their supervisor
 */
@ApiModel(description = "The association data of a person and their supervisor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class PersonSupervisorAssociation {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private DateRange period;

  public static final String SERIALIZED_NAME_SUPERVISION_PERCENTAGE = "supervisionPercentage";
  @SerializedName(SERIALIZED_NAME_SUPERVISION_PERCENTAGE)
  private Integer supervisionPercentage;

  public static final String SERIALIZED_NAME_SUPERVISOR_ROLE = "supervisorRole";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR_ROLE)
  private ClassificationRef supervisorRole;

  public static final String SERIALIZED_NAME_SUPERVISOR = "supervisor";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR)
  private InternalOrExternalSupervisor supervisor;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public PersonSupervisorAssociation period(DateRange period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRange getPeriod() {
    return period;
  }


  public void setPeriod(DateRange period) {
    this.period = period;
  }


  public PersonSupervisorAssociation supervisionPercentage(Integer supervisionPercentage) {
    
    this.supervisionPercentage = supervisionPercentage;
    return this;
  }

   /**
   * Percentage for which the Supervisor is responsible for the total supervision
   * minimum: 0
   * maximum: 100
   * @return supervisionPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage for which the Supervisor is responsible for the total supervision")

  public Integer getSupervisionPercentage() {
    return supervisionPercentage;
  }


  public void setSupervisionPercentage(Integer supervisionPercentage) {
    this.supervisionPercentage = supervisionPercentage;
  }


  public PersonSupervisorAssociation supervisorRole(ClassificationRef supervisorRole) {
    
    this.supervisorRole = supervisorRole;
    return this;
  }

   /**
   * Get supervisorRole
   * @return supervisorRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getSupervisorRole() {
    return supervisorRole;
  }


  public void setSupervisorRole(ClassificationRef supervisorRole) {
    this.supervisorRole = supervisorRole;
  }


  public PersonSupervisorAssociation supervisor(InternalOrExternalSupervisor supervisor) {
    
    this.supervisor = supervisor;
    return this;
  }

   /**
   * Get supervisor
   * @return supervisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InternalOrExternalSupervisor getSupervisor() {
    return supervisor;
  }


  public void setSupervisor(InternalOrExternalSupervisor supervisor) {
    this.supervisor = supervisor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonSupervisorAssociation personSupervisorAssociation = (PersonSupervisorAssociation) o;
    return Objects.equals(this.pureId, personSupervisorAssociation.pureId) &&
        Objects.equals(this.period, personSupervisorAssociation.period) &&
        Objects.equals(this.supervisionPercentage, personSupervisorAssociation.supervisionPercentage) &&
        Objects.equals(this.supervisorRole, personSupervisorAssociation.supervisorRole) &&
        Objects.equals(this.supervisor, personSupervisorAssociation.supervisor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, period, supervisionPercentage, supervisorRole, supervisor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonSupervisorAssociation {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    supervisionPercentage: ").append(toIndentedString(supervisionPercentage)).append("\n");
    sb.append("    supervisorRole: ").append(toIndentedString(supervisorRole)).append("\n");
    sb.append("    supervisor: ").append(toIndentedString(supervisor)).append("\n");
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
