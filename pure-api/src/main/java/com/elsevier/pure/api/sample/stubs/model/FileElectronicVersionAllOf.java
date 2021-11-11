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
import com.elsevier.pure.api.sample.stubs.model.ElectronicVersionFile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileElectronicVersionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class FileElectronicVersionAllOf {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RIGHTS_STATEMENT = "rightsStatement";
  @SerializedName(SERIALIZED_NAME_RIGHTS_STATEMENT)
  private String rightsStatement;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private ElectronicVersionFile file;

  public static final String SERIALIZED_NAME_VERSION_TYPE = "versionType";
  @SerializedName(SERIALIZED_NAME_VERSION_TYPE)
  private ClassificationRef versionType;


  public FileElectronicVersionAllOf title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the file.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the file.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public FileElectronicVersionAllOf rightsStatement(String rightsStatement) {
    
    this.rightsStatement = rightsStatement;
    return this;
  }

   /**
   * A description of property rights for the file.
   * @return rightsStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of property rights for the file.")

  public String getRightsStatement() {
    return rightsStatement;
  }


  public void setRightsStatement(String rightsStatement) {
    this.rightsStatement = rightsStatement;
  }


  public FileElectronicVersionAllOf file(ElectronicVersionFile file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElectronicVersionFile getFile() {
    return file;
  }


  public void setFile(ElectronicVersionFile file) {
    this.file = file;
  }


  public FileElectronicVersionAllOf versionType(ClassificationRef versionType) {
    
    this.versionType = versionType;
    return this;
  }

   /**
   * Get versionType
   * @return versionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getVersionType() {
    return versionType;
  }


  public void setVersionType(ClassificationRef versionType) {
    this.versionType = versionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileElectronicVersionAllOf fileElectronicVersionAllOf = (FileElectronicVersionAllOf) o;
    return Objects.equals(this.title, fileElectronicVersionAllOf.title) &&
        Objects.equals(this.rightsStatement, fileElectronicVersionAllOf.rightsStatement) &&
        Objects.equals(this.file, fileElectronicVersionAllOf.file) &&
        Objects.equals(this.versionType, fileElectronicVersionAllOf.versionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, rightsStatement, file, versionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileElectronicVersionAllOf {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rightsStatement: ").append(toIndentedString(rightsStatement)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
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

