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
import com.elsevier.pure.api.sample.stubs.model.UploadedFile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A classified file
 */
@ApiModel(description = "A classified file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T14:15:05.724242+01:00[Europe/Copenhagen]")
public class ClassifiedFile {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ClassificationRef type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_FILE_CONTENT = "fileContent";
  @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
  private UploadedFile fileContent;


   /**
   * Pure database ID of the object
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object")

  public Long getPureId() {
    return pureId;
  }




  public ClassifiedFile type(ClassificationRef type) {
    
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


   /**
   * File URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File URL")

  public String getUrl() {
    return url;
  }




  public ClassifiedFile fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * File name
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "File name")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public ClassifiedFile mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * File mime-type
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File mime-type")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public ClassifiedFile size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * File size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File size")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public ClassifiedFile fileContent(UploadedFile fileContent) {
    
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Get fileContent
   * @return fileContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadedFile getFileContent() {
    return fileContent;
  }


  public void setFileContent(UploadedFile fileContent) {
    this.fileContent = fileContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifiedFile classifiedFile = (ClassifiedFile) o;
    return Objects.equals(this.pureId, classifiedFile.pureId) &&
        Objects.equals(this.type, classifiedFile.type) &&
        Objects.equals(this.url, classifiedFile.url) &&
        Objects.equals(this.fileName, classifiedFile.fileName) &&
        Objects.equals(this.mimeType, classifiedFile.mimeType) &&
        Objects.equals(this.size, classifiedFile.size) &&
        Objects.equals(this.fileContent, classifiedFile.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, type, url, fileName, mimeType, size, fileContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifiedFile {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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

