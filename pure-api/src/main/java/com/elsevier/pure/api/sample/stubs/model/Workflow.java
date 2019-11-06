/*
 * Pure API
 * Description text
 *
 * The version of the OpenAPI document: 0.1-Alpha
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.model;

import java.util.Objects;
import java.util.Arrays;
import com.elsevier.pure.api.sample.stubs.model.LocalizedString;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about workflow
 */
@ApiModel(description = "Information about workflow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T09:45:25.329746+01:00[Europe/Copenhagen]")
public class Workflow {
  public static final String SERIALIZED_NAME_WORKFLOW_STEP = "workflowStep";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP)
  private String workflowStep;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private LocalizedString description;


  public Workflow workflowStep(String workflowStep) {
    
    this.workflowStep = workflowStep;
    return this;
  }

   /**
   * Current workflow step
   * @return workflowStep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current workflow step")

  public String getWorkflowStep() {
    return workflowStep;
  }


  public void setWorkflowStep(String workflowStep) {
    this.workflowStep = workflowStep;
  }


  public Workflow description(LocalizedString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalizedString getDescription() {
    return description;
  }


  public void setDescription(LocalizedString description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.workflowStep, workflow.workflowStep) &&
        Objects.equals(this.description, workflow.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowStep, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    sb.append("    workflowStep: ").append(toIndentedString(workflowStep)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

