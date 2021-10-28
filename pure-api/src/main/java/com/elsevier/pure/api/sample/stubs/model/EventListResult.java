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
import com.elsevier.pure.api.sample.stubs.model.Event;
import com.elsevier.pure.api.sample.stubs.model.PageInformation;
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
 * List of events. Can contain a subset of all items along with the full count
 */
@ApiModel(description = "List of events. Can contain a subset of all items along with the full count")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class EventListResult {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_PAGE_INFORMATION = "pageInformation";
  @SerializedName(SERIALIZED_NAME_PAGE_INFORMATION)
  private PageInformation pageInformation;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Event> items = null;


  public EventListResult count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The full count, ignoring paging
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full count, ignoring paging")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public EventListResult pageInformation(PageInformation pageInformation) {
    
    this.pageInformation = pageInformation;
    return this;
  }

   /**
   * Get pageInformation
   * @return pageInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageInformation getPageInformation() {
    return pageInformation;
  }


  public void setPageInformation(PageInformation pageInformation) {
    this.pageInformation = pageInformation;
  }


  public EventListResult items(List<Event> items) {
    
    this.items = items;
    return this;
  }

  public EventListResult addItemsItem(Event itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Event>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Events
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Events")

  public List<Event> getItems() {
    return items;
  }


  public void setItems(List<Event> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventListResult eventListResult = (EventListResult) o;
    return Objects.equals(this.count, eventListResult.count) &&
        Objects.equals(this.pageInformation, eventListResult.pageInformation) &&
        Objects.equals(this.items, eventListResult.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, pageInformation, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventListResult {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    pageInformation: ").append(toIndentedString(pageInformation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

