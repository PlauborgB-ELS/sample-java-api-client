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

/**
 * A specification for a publication category and it&#39;s interrelated fields: peerReview and internationalPeerReview
 */
@ApiModel(description = "A specification for a publication category and it's interrelated fields: peerReview and internationalPeerReview")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class ResearchOutputPeerReviewConfigurationCombination {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private ClassificationRef category;

  /**
   * Research output peer reviewable
   */
  @JsonAdapter(PeerReviewableEnum.Adapter.class)
  public enum PeerReviewableEnum {
    NOT_PEER_REVIEWABLE("NOT_PEER_REVIEWABLE"),
    
    PEER_REVIEWABLE("PEER_REVIEWABLE"),
    
    INTERNATIONAL_PEER_REVIEWABLE("INTERNATIONAL_PEER_REVIEWABLE");

    private String value;

    PeerReviewableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeerReviewableEnum fromValue(String value) {
      for (PeerReviewableEnum b : PeerReviewableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PeerReviewableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeerReviewableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeerReviewableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeerReviewableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PEER_REVIEWABLE = "peerReviewable";
  @SerializedName(SERIALIZED_NAME_PEER_REVIEWABLE)
  private PeerReviewableEnum peerReviewable;


  public ResearchOutputPeerReviewConfigurationCombination category(ClassificationRef category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getCategory() {
    return category;
  }


  public void setCategory(ClassificationRef category) {
    this.category = category;
  }


   /**
   * Research output peer reviewable
   * @return peerReviewable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Research output peer reviewable")

  public PeerReviewableEnum getPeerReviewable() {
    return peerReviewable;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResearchOutputPeerReviewConfigurationCombination researchOutputPeerReviewConfigurationCombination = (ResearchOutputPeerReviewConfigurationCombination) o;
    return Objects.equals(this.category, researchOutputPeerReviewConfigurationCombination.category) &&
        Objects.equals(this.peerReviewable, researchOutputPeerReviewConfigurationCombination.peerReviewable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, peerReviewable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResearchOutputPeerReviewConfigurationCombination {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    peerReviewable: ").append(toIndentedString(peerReviewable)).append("\n");
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

