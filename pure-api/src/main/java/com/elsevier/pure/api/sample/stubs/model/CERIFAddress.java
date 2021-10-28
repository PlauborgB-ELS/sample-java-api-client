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
import com.elsevier.pure.api.sample.stubs.model.GeoLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A physical address
 */
@ApiModel(description = "A physical address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class CERIFAddress {
  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_ADDRESS4 = "address4";
  @SerializedName(SERIALIZED_NAME_ADDRESS4)
  private String address4;

  public static final String SERIALIZED_NAME_ADDRESS5 = "address5";
  @SerializedName(SERIALIZED_NAME_ADDRESS5)
  private String address5;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private ClassificationRef country;

  public static final String SERIALIZED_NAME_SUBDIVISION = "subdivision";
  @SerializedName(SERIALIZED_NAME_SUBDIVISION)
  private ClassificationRef subdivision;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "geoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private GeoLocation geoLocation;


  public CERIFAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Address line 1
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 1")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public CERIFAddress address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Address line 2
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public CERIFAddress address3(String address3) {
    
    this.address3 = address3;
    return this;
  }

   /**
   * Address line 3
   * @return address3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 3")

  public String getAddress3() {
    return address3;
  }


  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public CERIFAddress address4(String address4) {
    
    this.address4 = address4;
    return this;
  }

   /**
   * Address line 4
   * @return address4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 4")

  public String getAddress4() {
    return address4;
  }


  public void setAddress4(String address4) {
    this.address4 = address4;
  }


  public CERIFAddress address5(String address5) {
    
    this.address5 = address5;
    return this;
  }

   /**
   * Address line 5
   * @return address5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 5")

  public String getAddress5() {
    return address5;
  }


  public void setAddress5(String address5) {
    this.address5 = address5;
  }


  public CERIFAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of city
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal code of city")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CERIFAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public CERIFAddress country(ClassificationRef country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getCountry() {
    return country;
  }


  public void setCountry(ClassificationRef country) {
    this.country = country;
  }


  public CERIFAddress subdivision(ClassificationRef subdivision) {
    
    this.subdivision = subdivision;
    return this;
  }

   /**
   * Get subdivision
   * @return subdivision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getSubdivision() {
    return subdivision;
  }


  public void setSubdivision(ClassificationRef subdivision) {
    this.subdivision = subdivision;
  }


  public CERIFAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State. Mutually exclusive with state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State. Mutually exclusive with state")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public CERIFAddress geoLocation(GeoLocation geoLocation) {
    
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }


  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CERIFAddress ceRIFAddress = (CERIFAddress) o;
    return Objects.equals(this.address1, ceRIFAddress.address1) &&
        Objects.equals(this.address2, ceRIFAddress.address2) &&
        Objects.equals(this.address3, ceRIFAddress.address3) &&
        Objects.equals(this.address4, ceRIFAddress.address4) &&
        Objects.equals(this.address5, ceRIFAddress.address5) &&
        Objects.equals(this.postalCode, ceRIFAddress.postalCode) &&
        Objects.equals(this.city, ceRIFAddress.city) &&
        Objects.equals(this.country, ceRIFAddress.country) &&
        Objects.equals(this.subdivision, ceRIFAddress.subdivision) &&
        Objects.equals(this.state, ceRIFAddress.state) &&
        Objects.equals(this.geoLocation, ceRIFAddress.geoLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, address5, postalCode, city, country, subdivision, state, geoLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CERIFAddress {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    address5: ").append(toIndentedString(address5)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    subdivision: ").append(toIndentedString(subdivision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
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

