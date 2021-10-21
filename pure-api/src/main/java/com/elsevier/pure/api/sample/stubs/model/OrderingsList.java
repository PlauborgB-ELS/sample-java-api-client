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
import java.util.ArrayList;
import java.util.List;

/**
 * List of available orderings
 */
@ApiModel(description = "List of available orderings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class OrderingsList {
  public static final String SERIALIZED_NAME_ORDERINGS = "orderings";
  @SerializedName(SERIALIZED_NAME_ORDERINGS)
  private List<String> orderings = null;


  public OrderingsList orderings(List<String> orderings) {
    
    this.orderings = orderings;
    return this;
  }

  public OrderingsList addOrderingsItem(String orderingsItem) {
    if (this.orderings == null) {
      this.orderings = new ArrayList<String>();
    }
    this.orderings.add(orderingsItem);
    return this;
  }

   /**
   * IDs of ways content can be ordered
   * @return orderings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDs of ways content can be ordered")

  public List<String> getOrderings() {
    return orderings;
  }


  public void setOrderings(List<String> orderings) {
    this.orderings = orderings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderingsList orderingsList = (OrderingsList) o;
    return Objects.equals(this.orderings, orderingsList.orderings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderingsList {\n");
    sb.append("    orderings: ").append(toIndentedString(orderings)).append("\n");
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

