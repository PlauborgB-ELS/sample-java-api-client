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

/**
 * Geographical location
 */
@ApiModel(description = "Geographical location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class GeoLocation {
  public static final String SERIALIZED_NAME_POINT = "point";
  @SerializedName(SERIALIZED_NAME_POINT)
  private String point;

  public static final String SERIALIZED_NAME_POLYGON = "polygon";
  @SerializedName(SERIALIZED_NAME_POLYGON)
  private String polygon;

  public static final String SERIALIZED_NAME_CALCULATED_POINT = "calculatedPoint";
  @SerializedName(SERIALIZED_NAME_CALCULATED_POINT)
  private String calculatedPoint;


  public GeoLocation point(String point) {
    
    this.point = point;
    return this;
  }

   /**
   * Location expressed as a point
   * @return point
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location expressed as a point")

  public String getPoint() {
    return point;
  }


  public void setPoint(String point) {
    this.point = point;
  }


  public GeoLocation polygon(String polygon) {
    
    this.polygon = polygon;
    return this;
  }

   /**
   * Location expressed as a polygon
   * @return polygon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location expressed as a polygon")

  public String getPolygon() {
    return polygon;
  }


  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }


   /**
   * Used to determine whether or not we may update the point. An end-user has not entered a point manually if the value of the calculated point is the same as point
   * @return calculatedPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to determine whether or not we may update the point. An end-user has not entered a point manually if the value of the calculated point is the same as point")

  public String getCalculatedPoint() {
    return calculatedPoint;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.point, geoLocation.point) &&
        Objects.equals(this.polygon, geoLocation.polygon) &&
        Objects.equals(this.calculatedPoint, geoLocation.calculatedPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, polygon, calculatedPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    calculatedPoint: ").append(toIndentedString(calculatedPoint)).append("\n");
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

