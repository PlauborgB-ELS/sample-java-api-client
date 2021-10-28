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
 * Information about the uploaded file
 */
@ApiModel(description = "Information about the uploaded file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class UploadedFile {
  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_DIGEST_TYPE = "digestType";
  @SerializedName(SERIALIZED_NAME_DIGEST_TYPE)
  private String digestType;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private OffsetDateTime timeStamp;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


   /**
   * The calculated digest for the file in Pure
   * @return digest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The calculated digest for the file in Pure")

  public String getDigest() {
    return digest;
  }




   /**
   * The digest type
   * @return digestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The digest type")

  public String getDigestType() {
    return digestType;
  }




   /**
   * The file size of the file in Pure
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file size of the file in Pure")

  public Long getSize() {
    return size;
  }




   /**
   * The mime type detected for the file
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mime type detected for the file")

  public String getMimeType() {
    return mimeType;
  }




   /**
   * The timestamp Pure received the file
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp Pure received the file")

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }




   /**
   * The timestamp where Pure deletes the uploaded file if it has not been attached to any content
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp where Pure deletes the uploaded file if it has not been attached to any content")

  public OffsetDateTime getExpires() {
    return expires;
  }




   /**
   * Pure key identifer for the file upload
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Pure key identifer for the file upload")

  public String getKey() {
    return key;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedFile uploadedFile = (UploadedFile) o;
    return Objects.equals(this.digest, uploadedFile.digest) &&
        Objects.equals(this.digestType, uploadedFile.digestType) &&
        Objects.equals(this.size, uploadedFile.size) &&
        Objects.equals(this.mimeType, uploadedFile.mimeType) &&
        Objects.equals(this.timeStamp, uploadedFile.timeStamp) &&
        Objects.equals(this.expires, uploadedFile.expires) &&
        Objects.equals(this.key, uploadedFile.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, digestType, size, mimeType, timeStamp, expires, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFile {\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    digestType: ").append(toIndentedString(digestType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

