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
 * Create a query for audit entries
 */
@ApiModel(description = "Create a query for audit entries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class AuditEntriesQuery {
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

  public static final String SERIALIZED_NAME_CONTENT_IDS = "contentIds";
  @SerializedName(SERIALIZED_NAME_CONTENT_IDS)
  private List<Long> contentIds = null;

  public static final String SERIALIZED_NAME_EVENT_NAMES = "eventNames";
  @SerializedName(SERIALIZED_NAME_EVENT_NAMES)
  private List<String> eventNames = null;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private String orderBy;


  public AuditEntriesQuery uuids(List<UUID> uuids) {
    
    this.uuids = uuids;
    return this;
  }

  public AuditEntriesQuery addUuidsItem(UUID uuidsItem) {
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


  public AuditEntriesQuery size(Integer size) {
    
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


  public AuditEntriesQuery offset(Integer offset) {
    
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


  public AuditEntriesQuery orderings(List<String> orderings) {
    
    this.orderings = orderings;
    return this;
  }

  public AuditEntriesQuery addOrderingsItem(String orderingsItem) {
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


  public AuditEntriesQuery contentIds(List<Long> contentIds) {
    
    this.contentIds = contentIds;
    return this;
  }

  public AuditEntriesQuery addContentIdsItem(Long contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = new ArrayList<Long>();
    }
    this.contentIds.add(contentIdsItem);
    return this;
  }

   /**
   * Limit to audit entries for these content IDs
   * @return contentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit to audit entries for these content IDs")

  public List<Long> getContentIds() {
    return contentIds;
  }


  public void setContentIds(List<Long> contentIds) {
    this.contentIds = contentIds;
  }


  public AuditEntriesQuery eventNames(List<String> eventNames) {
    
    this.eventNames = eventNames;
    return this;
  }

  public AuditEntriesQuery addEventNamesItem(String eventNamesItem) {
    if (this.eventNames == null) {
      this.eventNames = new ArrayList<String>();
    }
    this.eventNames.add(eventNamesItem);
    return this;
  }

   /**
   * Limit to audit entries with these event names
   * @return eventNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit to audit entries with these event names")

  public List<String> getEventNames() {
    return eventNames;
  }


  public void setEventNames(List<String> eventNames) {
    this.eventNames = eventNames;
  }


  public AuditEntriesQuery orderBy(String orderBy) {
    
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
    AuditEntriesQuery auditEntriesQuery = (AuditEntriesQuery) o;
    return Objects.equals(this.uuids, auditEntriesQuery.uuids) &&
        Objects.equals(this.size, auditEntriesQuery.size) &&
        Objects.equals(this.offset, auditEntriesQuery.offset) &&
        Objects.equals(this.orderings, auditEntriesQuery.orderings) &&
        Objects.equals(this.contentIds, auditEntriesQuery.contentIds) &&
        Objects.equals(this.eventNames, auditEntriesQuery.eventNames) &&
        Objects.equals(this.orderBy, auditEntriesQuery.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuids, size, offset, orderings, contentIds, eventNames, orderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEntriesQuery {\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderings: ").append(toIndentedString(orderings)).append("\n");
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
    sb.append("    eventNames: ").append(toIndentedString(eventNames)).append("\n");
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

