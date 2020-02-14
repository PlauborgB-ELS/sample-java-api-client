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
import com.elsevier.pure.api.sample.stubs.model.Workflow;
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
 * List of workflow steps.
 */
@ApiModel(description = "List of workflow steps.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T14:15:05.724242+01:00[Europe/Copenhagen]")
public class WorkflowListResult {
  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  private List<Workflow> workflows = null;


  public WorkflowListResult workflows(List<Workflow> workflows) {
    
    this.workflows = workflows;
    return this;
  }

  public WorkflowListResult addWorkflowsItem(Workflow workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<Workflow>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * Allowed workflow steps.
   * @return workflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed workflow steps.")

  public List<Workflow> getWorkflows() {
    return workflows;
  }


  public void setWorkflows(List<Workflow> workflows) {
    this.workflows = workflows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowListResult workflowListResult = (WorkflowListResult) o;
    return Objects.equals(this.workflows, workflowListResult.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowListResult {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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

