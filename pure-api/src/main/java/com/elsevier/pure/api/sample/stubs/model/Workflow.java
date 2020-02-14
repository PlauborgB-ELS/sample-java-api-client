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

/**
 * Information about workflow
 */
@ApiModel(description = "Information about workflow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T14:15:05.724242+01:00[Europe/Copenhagen]")
public class Workflow {
  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private String step;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Map<String, String> description = null;


  public Workflow step(String step) {
    
    this.step = step;
    return this;
  }

   /**
   * Current workflow step
   * @return step
  **/
  @ApiModelProperty(required = true, value = "Current workflow step")

  public String getStep() {
    return step;
  }


  public void setStep(String step) {
    this.step = step;
  }


   /**
   * A set of localized string values each for a specific UI locale.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_UK\":\"Some text\"}", value = "A set of localized string values each for a specific UI locale.")

  public Map<String, String> getDescription() {
    return description;
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
    return Objects.equals(this.step, workflow.step) &&
        Objects.equals(this.description, workflow.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

