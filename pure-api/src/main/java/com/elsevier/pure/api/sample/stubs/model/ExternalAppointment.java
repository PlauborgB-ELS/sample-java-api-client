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
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
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
 * An appointment held in an external organizational unit
 */
@ApiModel(description = "An appointment held in an external organizational unit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class ExternalAppointment {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_APPOINTMENT = "appointment";
  @SerializedName(SERIALIZED_NAME_APPOINTMENT)
  private ClassificationRef appointment;

  public static final String SERIALIZED_NAME_APPOINTMENT_STRING = "appointmentString";
  @SerializedName(SERIALIZED_NAME_APPOINTMENT_STRING)
  private Map<String, String> appointmentString = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private CompoundDateRange period;

  public static final String SERIALIZED_NAME_EXTERNAL_ORGANIZATION = "externalOrganization";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORGANIZATION)
  private ExternalOrganizationRef externalOrganization;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public ExternalAppointment appointment(ClassificationRef appointment) {
    
    this.appointment = appointment;
    return this;
  }

   /**
   * Get appointment
   * @return appointment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getAppointment() {
    return appointment;
  }


  public void setAppointment(ClassificationRef appointment) {
    this.appointment = appointment;
  }


  public ExternalAppointment appointmentString(Map<String, String> appointmentString) {
    
    this.appointmentString = appointmentString;
    return this;
  }

  public ExternalAppointment putAppointmentStringItem(String key, String appointmentStringItem) {
    if (this.appointmentString == null) {
      this.appointmentString = new HashMap<String, String>();
    }
    this.appointmentString.put(key, appointmentStringItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return appointmentString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getAppointmentString() {
    return appointmentString;
  }


  public void setAppointmentString(Map<String, String> appointmentString) {
    this.appointmentString = appointmentString;
  }


  public ExternalAppointment period(CompoundDateRange period) {
    
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


  public ExternalAppointment externalOrganization(ExternalOrganizationRef externalOrganization) {
    
    this.externalOrganization = externalOrganization;
    return this;
  }

   /**
   * Get externalOrganization
   * @return externalOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalOrganizationRef getExternalOrganization() {
    return externalOrganization;
  }


  public void setExternalOrganization(ExternalOrganizationRef externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAppointment externalAppointment = (ExternalAppointment) o;
    return Objects.equals(this.pureId, externalAppointment.pureId) &&
        Objects.equals(this.appointment, externalAppointment.appointment) &&
        Objects.equals(this.appointmentString, externalAppointment.appointmentString) &&
        Objects.equals(this.period, externalAppointment.period) &&
        Objects.equals(this.externalOrganization, externalAppointment.externalOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, appointment, appointmentString, period, externalOrganization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAppointment {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    appointmentString: ").append(toIndentedString(appointmentString)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
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

