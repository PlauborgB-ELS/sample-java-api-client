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
import com.elsevier.pure.api.sample.stubs.model.Name;
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
import org.threeten.bp.OffsetDateTime;

/**
 * A user that can be attached to a person in Pure
 */
@ApiModel(description = "A user that can be attached to a person in Pure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-11T16:14:00.558+01:00[Europe/Copenhagen]")
public class User {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_PORTAL_URL = "portalUrl";
  @SerializedName(SERIALIZED_NAME_PORTAL_URL)
  private String portalUrl;

  public static final String SERIALIZED_NAME_PRETTY_URL_IDENTIFIERS = "prettyUrlIdentifiers";
  @SerializedName(SERIALIZED_NAME_PRETTY_URL_IDENTIFIERS)
  private List<String> prettyUrlIdentifiers = null;

  public static final String SERIALIZED_NAME_PREVIOUS_UUIDS = "previousUuids";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_UUIDS)
  private List<String> previousUuids = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNALLY_AUTHENTICATED = "externallyAuthenticated";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_AUTHENTICATED)
  private Boolean externallyAuthenticated;

  public static final String SERIALIZED_NAME_PURE_SYSTEM_USER = "pureSystemUser";
  @SerializedName(SERIALIZED_NAME_PURE_SYSTEM_USER)
  private Boolean pureSystemUser = false;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked = false;

  public static final String SERIALIZED_NAME_SYSTEM_NAME = "systemName";
  @SerializedName(SERIALIZED_NAME_SYSTEM_NAME)
  private String systemName;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




   /**
   * UUID, this is the primary identity of the entity
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID, this is the primary identity of the entity")

  public UUID getUuid() {
    return uuid;
  }




   /**
   * Username of creator
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username of creator")

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * Date and time of creation
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of creation")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




   /**
   * Username of the user that performed a modification
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username of the user that performed a modification")

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * Date and time of last modification
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of last modification")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * URL of the content on the Pure Portal
   * @return portalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the content on the Pure Portal")

  public String getPortalUrl() {
    return portalUrl;
  }




   /**
   * All pretty URLs
   * @return prettyUrlIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All pretty URLs")

  public List<String> getPrettyUrlIdentifiers() {
    return prettyUrlIdentifiers;
  }




   /**
   * UUIDs of other content items which have been merged into this content item (or similar)
   * @return previousUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUIDs of other content items which have been merged into this content item (or similar)")

  public List<String> getPreviousUuids() {
    return previousUuids;
  }




  public User version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * A hash representing the current version of the content. For new content this is null, and for existing content the current value. The property should never be modified explicitly by a client.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hash representing the current version of the content. For new content this is null, and for existing content the current value. The property should never be modified explicitly by a client.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public User username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public User name(Name name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    this.name = name;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The user's email address")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User externallyAuthenticated(Boolean externallyAuthenticated) {
    
    this.externallyAuthenticated = externallyAuthenticated;
    return this;
  }

   /**
   * Is the user externally authenticated.
   * @return externallyAuthenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the user externally authenticated.")

  public Boolean getExternallyAuthenticated() {
    return externallyAuthenticated;
  }


  public void setExternallyAuthenticated(Boolean externallyAuthenticated) {
    this.externallyAuthenticated = externallyAuthenticated;
  }


  public User pureSystemUser(Boolean pureSystemUser) {
    
    this.pureSystemUser = pureSystemUser;
    return this;
  }

   /**
   * Is the user a Pure system user. Set to false when creating normal Pure users.
   * @return pureSystemUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the user a Pure system user. Set to false when creating normal Pure users.")

  public Boolean getPureSystemUser() {
    return pureSystemUser;
  }


  public void setPureSystemUser(Boolean pureSystemUser) {
    this.pureSystemUser = pureSystemUser;
  }


  public User locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Is the user locked. A locked user cannot log into Pure.
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the user locked. A locked user cannot log into Pure.")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


   /**
   * The content system name
   * @return systemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content system name")

  public String getSystemName() {
    return systemName;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.pureId, user.pureId) &&
        Objects.equals(this.uuid, user.uuid) &&
        Objects.equals(this.createdBy, user.createdBy) &&
        Objects.equals(this.createdDate, user.createdDate) &&
        Objects.equals(this.modifiedBy, user.modifiedBy) &&
        Objects.equals(this.modifiedDate, user.modifiedDate) &&
        Objects.equals(this.portalUrl, user.portalUrl) &&
        Objects.equals(this.prettyUrlIdentifiers, user.prettyUrlIdentifiers) &&
        Objects.equals(this.previousUuids, user.previousUuids) &&
        Objects.equals(this.version, user.version) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.externallyAuthenticated, user.externallyAuthenticated) &&
        Objects.equals(this.pureSystemUser, user.pureSystemUser) &&
        Objects.equals(this.locked, user.locked) &&
        Objects.equals(this.systemName, user.systemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, uuid, createdBy, createdDate, modifiedBy, modifiedDate, portalUrl, prettyUrlIdentifiers, previousUuids, version, username, name, email, externallyAuthenticated, pureSystemUser, locked, systemName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
    sb.append("    prettyUrlIdentifiers: ").append(toIndentedString(prettyUrlIdentifiers)).append("\n");
    sb.append("    previousUuids: ").append(toIndentedString(previousUuids)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externallyAuthenticated: ").append(toIndentedString(externallyAuthenticated)).append("\n");
    sb.append("    pureSystemUser: ").append(toIndentedString(pureSystemUser)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
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

