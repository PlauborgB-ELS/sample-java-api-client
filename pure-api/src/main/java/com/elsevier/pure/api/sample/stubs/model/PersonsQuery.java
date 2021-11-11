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
import java.util.UUID;

/**
 * Create a query for persons
 */
@ApiModel(description = "Create a query for persons")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class PersonsQuery {
  public static final String SERIALIZED_NAME_UUIDS = "uuids";
  @SerializedName(SERIALIZED_NAME_UUIDS)
  private List<UUID> uuids = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ORDERINGS = "orderings";
  @SerializedName(SERIALIZED_NAME_ORDERINGS)
  private List<String> orderings = null;

  public static final String SERIALIZED_NAME_KEYWORD_U_R_IS = "keywordURIs";
  @SerializedName(SERIALIZED_NAME_KEYWORD_U_R_IS)
  private List<String> keywordURIs = null;

  public static final String SERIALIZED_NAME_SEARCH_STRING = "searchString";
  @SerializedName(SERIALIZED_NAME_SEARCH_STRING)
  private String searchString;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private String orderBy;


  public PersonsQuery uuids(List<UUID> uuids) {
    
    this.uuids = uuids;
    return this;
  }

  public PersonsQuery addUuidsItem(UUID uuidsItem) {
    if (this.uuids == null) {
      this.uuids = new ArrayList<UUID>();
    }
    this.uuids.add(uuidsItem);
    return this;
  }

   /**
   * Get uuids
   * @return uuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getUuids() {
    return uuids;
  }


  public void setUuids(List<UUID> uuids) {
    this.uuids = uuids;
  }


  public PersonsQuery size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public PersonsQuery offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public PersonsQuery orderings(List<String> orderings) {
    
    this.orderings = orderings;
    return this;
  }

  public PersonsQuery addOrderingsItem(String orderingsItem) {
    if (this.orderings == null) {
      this.orderings = new ArrayList<String>();
    }
    this.orderings.add(orderingsItem);
    return this;
  }

   /**
   * Get orderings
   * @return orderings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOrderings() {
    return orderings;
  }


  public void setOrderings(List<String> orderings) {
    this.orderings = orderings;
  }


  public PersonsQuery keywordURIs(List<String> keywordURIs) {
    
    this.keywordURIs = keywordURIs;
    return this;
  }

  public PersonsQuery addKeywordURIsItem(String keywordURIsItem) {
    if (this.keywordURIs == null) {
      this.keywordURIs = new ArrayList<String>();
    }
    this.keywordURIs.add(keywordURIsItem);
    return this;
  }

   /**
   * Get keywordURIs
   * @return keywordURIs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeywordURIs() {
    return keywordURIs;
  }


  public void setKeywordURIs(List<String> keywordURIs) {
    this.keywordURIs = keywordURIs;
  }


  public PersonsQuery searchString(String searchString) {
    
    this.searchString = searchString;
    return this;
  }

   /**
   * String used to perform search
   * @return searchString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String used to perform search")

  public String getSearchString() {
    return searchString;
  }


  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }


  public PersonsQuery orderBy(String orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonsQuery personsQuery = (PersonsQuery) o;
    return Objects.equals(this.uuids, personsQuery.uuids) &&
        Objects.equals(this.size, personsQuery.size) &&
        Objects.equals(this.offset, personsQuery.offset) &&
        Objects.equals(this.orderings, personsQuery.orderings) &&
        Objects.equals(this.keywordURIs, personsQuery.keywordURIs) &&
        Objects.equals(this.searchString, personsQuery.searchString) &&
        Objects.equals(this.orderBy, personsQuery.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuids, size, offset, orderings, keywordURIs, searchString, orderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsQuery {\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderings: ").append(toIndentedString(orderings)).append("\n");
    sb.append("    keywordURIs: ").append(toIndentedString(keywordURIs)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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

