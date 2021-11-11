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
import com.elsevier.pure.api.sample.stubs.model.DateRange;
import com.elsevier.pure.api.sample.stubs.model.ElectronicVersionFile;
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
 * An additional file related to a research output.
 */
@ApiModel(description = "An additional file related to a research output.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class AdditionalFileElectronicVersion {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "accessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private ClassificationRef accessType;

  public static final String SERIALIZED_NAME_EMBARGO_PERIOD = "embargoPeriod";
  @SerializedName(SERIALIZED_NAME_EMBARGO_PERIOD)
  private DateRange embargoPeriod;

  public static final String SERIALIZED_NAME_LICENSE_TYPE = "licenseType";
  @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
  private ClassificationRef licenseType;

  public static final String SERIALIZED_NAME_USER_DEFINED_LICENSE = "userDefinedLicense";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED_LICENSE)
  private String userDefinedLicense;

  public static final String SERIALIZED_NAME_VISIBLE_ON_PORTAL_DATE = "visibleOnPortalDate";
  @SerializedName(SERIALIZED_NAME_VISIBLE_ON_PORTAL_DATE)
  private OffsetDateTime visibleOnPortalDate;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private ElectronicVersionFile file;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public AdditionalFileElectronicVersion accessType(ClassificationRef accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getAccessType() {
    return accessType;
  }


  public void setAccessType(ClassificationRef accessType) {
    this.accessType = accessType;
  }


  public AdditionalFileElectronicVersion embargoPeriod(DateRange embargoPeriod) {
    
    this.embargoPeriod = embargoPeriod;
    return this;
  }

   /**
   * Get embargoPeriod
   * @return embargoPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRange getEmbargoPeriod() {
    return embargoPeriod;
  }


  public void setEmbargoPeriod(DateRange embargoPeriod) {
    this.embargoPeriod = embargoPeriod;
  }


  public AdditionalFileElectronicVersion licenseType(ClassificationRef licenseType) {
    
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getLicenseType() {
    return licenseType;
  }


  public void setLicenseType(ClassificationRef licenseType) {
    this.licenseType = licenseType;
  }


  public AdditionalFileElectronicVersion userDefinedLicense(String userDefinedLicense) {
    
    this.userDefinedLicense = userDefinedLicense;
    return this;
  }

   /**
   * License defined by the user.
   * @return userDefinedLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License defined by the user.")

  public String getUserDefinedLicense() {
    return userDefinedLicense;
  }


  public void setUserDefinedLicense(String userDefinedLicense) {
    this.userDefinedLicense = userDefinedLicense;
  }


   /**
   * Date where this document is/will be visible on the portal.
   * @return visibleOnPortalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date where this document is/will be visible on the portal.")

  public OffsetDateTime getVisibleOnPortalDate() {
    return visibleOnPortalDate;
  }




   /**
   * Username of creator.
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username of creator.")

  public String getCreator() {
    return creator;
  }




   /**
   * Date and time of creation.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of creation.")

  public OffsetDateTime getCreated() {
    return created;
  }




  public AdditionalFileElectronicVersion title(String title) {
    
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


  public AdditionalFileElectronicVersion file(ElectronicVersionFile file) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalFileElectronicVersion additionalFileElectronicVersion = (AdditionalFileElectronicVersion) o;
    return Objects.equals(this.pureId, additionalFileElectronicVersion.pureId) &&
        Objects.equals(this.accessType, additionalFileElectronicVersion.accessType) &&
        Objects.equals(this.embargoPeriod, additionalFileElectronicVersion.embargoPeriod) &&
        Objects.equals(this.licenseType, additionalFileElectronicVersion.licenseType) &&
        Objects.equals(this.userDefinedLicense, additionalFileElectronicVersion.userDefinedLicense) &&
        Objects.equals(this.visibleOnPortalDate, additionalFileElectronicVersion.visibleOnPortalDate) &&
        Objects.equals(this.creator, additionalFileElectronicVersion.creator) &&
        Objects.equals(this.created, additionalFileElectronicVersion.created) &&
        Objects.equals(this.title, additionalFileElectronicVersion.title) &&
        Objects.equals(this.file, additionalFileElectronicVersion.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, accessType, embargoPeriod, licenseType, userDefinedLicense, visibleOnPortalDate, creator, created, title, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalFileElectronicVersion {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    embargoPeriod: ").append(toIndentedString(embargoPeriod)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    userDefinedLicense: ").append(toIndentedString(userDefinedLicense)).append("\n");
    sb.append("    visibleOnPortalDate: ").append(toIndentedString(visibleOnPortalDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

