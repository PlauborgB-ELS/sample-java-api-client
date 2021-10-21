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
import com.elsevier.pure.api.sample.stubs.model.ExternalPersonRef;
import com.elsevier.pure.api.sample.stubs.model.PersonRef;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A supervisor, either internal or external, use as mutually exclusive
 */
@ApiModel(description = "A supervisor, either internal or external, use as mutually exclusive")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class InternalOrExternalSupervisor {
  public static final String SERIALIZED_NAME_EXTERNAL_SUPERVISOR = "externalSupervisor";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUPERVISOR)
  private ExternalPersonRef externalSupervisor;

  public static final String SERIALIZED_NAME_SUPERVISOR = "supervisor";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR)
  private PersonRef supervisor;


  public InternalOrExternalSupervisor externalSupervisor(ExternalPersonRef externalSupervisor) {
    
    this.externalSupervisor = externalSupervisor;
    return this;
  }

   /**
   * Get externalSupervisor
   * @return externalSupervisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPersonRef getExternalSupervisor() {
    return externalSupervisor;
  }


  public void setExternalSupervisor(ExternalPersonRef externalSupervisor) {
    this.externalSupervisor = externalSupervisor;
  }


  public InternalOrExternalSupervisor supervisor(PersonRef supervisor) {
    
    this.supervisor = supervisor;
    return this;
  }

   /**
   * Get supervisor
   * @return supervisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonRef getSupervisor() {
    return supervisor;
  }


  public void setSupervisor(PersonRef supervisor) {
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
    InternalOrExternalSupervisor internalOrExternalSupervisor = (InternalOrExternalSupervisor) o;
    return Objects.equals(this.externalSupervisor, internalOrExternalSupervisor.externalSupervisor) &&
        Objects.equals(this.supervisor, internalOrExternalSupervisor.supervisor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSupervisor, supervisor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalOrExternalSupervisor {\n");
    sb.append("    externalSupervisor: ").append(toIndentedString(externalSupervisor)).append("\n");
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

