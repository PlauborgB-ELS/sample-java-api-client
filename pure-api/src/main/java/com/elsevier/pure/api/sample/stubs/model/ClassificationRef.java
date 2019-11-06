/*
 * Pure API
 * Description text
 *
 * The version of the OpenAPI document: 0.1-Alpha
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.model;

import java.util.Objects;
import java.util.Arrays;
import com.elsevier.pure.api.sample.stubs.model.LocalizedString;
import com.elsevier.pure.api.sample.stubs.model.NavigationLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A reference to a classification value
 */
@ApiModel(description = "A reference to a classification value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T09:45:25.329746+01:00[Europe/Copenhagen]")
public class ClassificationRef {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private NavigationLink link;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private LocalizedString term;


   /**
   * Classification URI of the referred classification
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Classification URI of the referred classification")

  public String getUri() {
    return uri;
  }




  public ClassificationRef link(NavigationLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NavigationLink getLink() {
    return link;
  }


  public void setLink(NavigationLink link) {
    this.link = link;
  }


  public ClassificationRef term(LocalizedString term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalizedString getTerm() {
    return term;
  }


  public void setTerm(LocalizedString term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationRef classificationRef = (ClassificationRef) o;
    return Objects.equals(this.uri, classificationRef.uri) &&
        Objects.equals(this.link, classificationRef.link) &&
        Objects.equals(this.term, classificationRef.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, link, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationRef {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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
