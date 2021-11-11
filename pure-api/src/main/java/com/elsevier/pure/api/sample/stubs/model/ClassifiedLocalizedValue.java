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
 * A classified localized value
 */
@ApiModel(description = "A classified localized value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class ClassifiedLocalizedValue {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Map<String, String> value = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ClassificationRef type;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public ClassifiedLocalizedValue value(Map<String, String> value) {
    
    this.value = value;
    return this;
  }

  public ClassifiedLocalizedValue putValueItem(String key, String valueItem) {
    if (this.value == null) {
      this.value = new HashMap<String, String>();
    }
    this.value.put(key, valueItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getValue() {
    return value;
  }


  public void setValue(Map<String, String> value) {
    this.value = value;
  }


  public ClassifiedLocalizedValue type(ClassificationRef type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getType() {
    return type;
  }


  public void setType(ClassificationRef type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifiedLocalizedValue classifiedLocalizedValue = (ClassifiedLocalizedValue) o;
    return Objects.equals(this.pureId, classifiedLocalizedValue.pureId) &&
        Objects.equals(this.value, classifiedLocalizedValue.value) &&
        Objects.equals(this.type, classifiedLocalizedValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, value, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifiedLocalizedValue {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

