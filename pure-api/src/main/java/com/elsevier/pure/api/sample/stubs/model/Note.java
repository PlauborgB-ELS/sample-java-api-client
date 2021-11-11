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
import org.threeten.bp.OffsetDateTime;

/**
 * A note
 */
@ApiModel(description = "A note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class Note {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public Note date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date and time of when the note was created, an event occurred or similar. Can be any point in time, but &lt;now&gt; is normally preferred
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of when the note was created, an event occurred or similar. Can be any point in time, but <now> is normally preferred")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Note username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username related to the note. Usually a username of the user creating the note. Does not have to be a username of a Pure user
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username related to the note. Usually a username of the user creating the note. Does not have to be a username of a Pure user")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public Note text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Note text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Note text")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.date, note.date) &&
        Objects.equals(this.username, note.username) &&
        Objects.equals(this.text, note.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, username, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

