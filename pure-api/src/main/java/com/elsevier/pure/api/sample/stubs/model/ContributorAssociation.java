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
import com.elsevier.pure.api.sample.stubs.model.AuthorCollaborationRef;
import com.elsevier.pure.api.sample.stubs.model.ClassificationRef;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.ExternalPersonRef;
import com.elsevier.pure.api.sample.stubs.model.Name;
import com.elsevier.pure.api.sample.stubs.model.OrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.PersonRef;
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
 * An association between research output and a person that has contributed to it
 */
@ApiModel(description = "An association between research output and a person that has contributed to it")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-21T09:12:55.713+02:00[Europe/Copenhagen]")
public class ContributorAssociation {
  public static final String SERIALIZED_NAME_PURE_ID = "pureId";
  @SerializedName(SERIALIZED_NAME_PURE_ID)
  private Long pureId;

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private PersonRef person;

  public static final String SERIALIZED_NAME_EXTERNAL_PERSON = "externalPerson";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PERSON)
  private ExternalPersonRef externalPerson;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private ClassificationRef role;

  public static final String SERIALIZED_NAME_ORGANISATIONAL_UNITS = "organisationalUnits";
  @SerializedName(SERIALIZED_NAME_ORGANISATIONAL_UNITS)
  private List<OrganizationRef> organisationalUnits = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ORGANISATIONS = "externalOrganisations";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORGANISATIONS)
  private List<ExternalOrganizationRef> externalOrganisations = null;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_CONTRIBUTION_DESCRIPTION = "contributionDescription";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_DESCRIPTION)
  private String contributionDescription;

  public static final String SERIALIZED_NAME_CONTRIBUTION_PERCENTAGE = "contributionPercentage";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_PERCENTAGE)
  private Double contributionPercentage;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private ClassificationRef country;

  public static final String SERIALIZED_NAME_CORRESPONDING_AUTHOR = "correspondingAuthor";
  @SerializedName(SERIALIZED_NAME_CORRESPONDING_AUTHOR)
  private Boolean correspondingAuthor;

  public static final String SERIALIZED_NAME_AUTHOR_COLLABORATION = "authorCollaboration";
  @SerializedName(SERIALIZED_NAME_AUTHOR_COLLABORATION)
  private AuthorCollaborationRef authorCollaboration;


   /**
   * Pure database ID of the object, prefer using the UUID if it is present on the entity
   * @return pureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pure database ID of the object, prefer using the UUID if it is present on the entity")

  public Long getPureId() {
    return pureId;
  }




  public ContributorAssociation person(PersonRef person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonRef getPerson() {
    return person;
  }


  public void setPerson(PersonRef person) {
    this.person = person;
  }


  public ContributorAssociation externalPerson(ExternalPersonRef externalPerson) {
    
    this.externalPerson = externalPerson;
    return this;
  }

   /**
   * Get externalPerson
   * @return externalPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPersonRef getExternalPerson() {
    return externalPerson;
  }


  public void setExternalPerson(ExternalPersonRef externalPerson) {
    this.externalPerson = externalPerson;
  }


  public ContributorAssociation name(Name name) {
    
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


  public ContributorAssociation role(ClassificationRef role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getRole() {
    return role;
  }


  public void setRole(ClassificationRef role) {
    this.role = role;
  }


  public ContributorAssociation organisationalUnits(List<OrganizationRef> organisationalUnits) {
    
    this.organisationalUnits = organisationalUnits;
    return this;
  }

  public ContributorAssociation addOrganisationalUnitsItem(OrganizationRef organisationalUnitsItem) {
    if (this.organisationalUnits == null) {
      this.organisationalUnits = new ArrayList<OrganizationRef>();
    }
    this.organisationalUnits.add(organisationalUnitsItem);
    return this;
  }

   /**
   * A collection of organisational unit affiliations.
   * @return organisationalUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of organisational unit affiliations.")

  public List<OrganizationRef> getOrganisationalUnits() {
    return organisationalUnits;
  }


  public void setOrganisationalUnits(List<OrganizationRef> organisationalUnits) {
    this.organisationalUnits = organisationalUnits;
  }


  public ContributorAssociation externalOrganisations(List<ExternalOrganizationRef> externalOrganisations) {
    
    this.externalOrganisations = externalOrganisations;
    return this;
  }

  public ContributorAssociation addExternalOrganisationsItem(ExternalOrganizationRef externalOrganisationsItem) {
    if (this.externalOrganisations == null) {
      this.externalOrganisations = new ArrayList<ExternalOrganizationRef>();
    }
    this.externalOrganisations.add(externalOrganisationsItem);
    return this;
  }

   /**
   * A collection of external organisation affiliations.
   * @return externalOrganisations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of external organisation affiliations.")

  public List<ExternalOrganizationRef> getExternalOrganisations() {
    return externalOrganisations;
  }


  public void setExternalOrganisations(List<ExternalOrganizationRef> externalOrganisations) {
    this.externalOrganisations = externalOrganisations;
  }


  public ContributorAssociation hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * If this contribution should be hidden, this is set to true, false otherwise. This is used for research output that have author collaborations. If they do, we hide the individual contributors.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this contribution should be hidden, this is set to true, false otherwise. This is used for research output that have author collaborations. If they do, we hide the individual contributors.")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public ContributorAssociation contributionDescription(String contributionDescription) {
    
    this.contributionDescription = contributionDescription;
    return this;
  }

   /**
   * A string that details the contribution of the associated person.
   * @return contributionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that details the contribution of the associated person.")

  public String getContributionDescription() {
    return contributionDescription;
  }


  public void setContributionDescription(String contributionDescription) {
    this.contributionDescription = contributionDescription;
  }


  public ContributorAssociation contributionPercentage(Double contributionPercentage) {
    
    this.contributionPercentage = contributionPercentage;
    return this;
  }

   /**
   * A real number between 0 and 100, describing the percentage of the contribution of the person.
   * @return contributionPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A real number between 0 and 100, describing the percentage of the contribution of the person.")

  public Double getContributionPercentage() {
    return contributionPercentage;
  }


  public void setContributionPercentage(Double contributionPercentage) {
    this.contributionPercentage = contributionPercentage;
  }


  public ContributorAssociation country(ClassificationRef country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getCountry() {
    return country;
  }


  public void setCountry(ClassificationRef country) {
    this.country = country;
  }


  public ContributorAssociation correspondingAuthor(Boolean correspondingAuthor) {
    
    this.correspondingAuthor = correspondingAuthor;
    return this;
  }

   /**
   * True if the contributor is the corresponding author, false otherwise.
   * @return correspondingAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the contributor is the corresponding author, false otherwise.")

  public Boolean getCorrespondingAuthor() {
    return correspondingAuthor;
  }


  public void setCorrespondingAuthor(Boolean correspondingAuthor) {
    this.correspondingAuthor = correspondingAuthor;
  }


  public ContributorAssociation authorCollaboration(AuthorCollaborationRef authorCollaboration) {
    
    this.authorCollaboration = authorCollaboration;
    return this;
  }

   /**
   * Get authorCollaboration
   * @return authorCollaboration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorCollaborationRef getAuthorCollaboration() {
    return authorCollaboration;
  }


  public void setAuthorCollaboration(AuthorCollaborationRef authorCollaboration) {
    this.authorCollaboration = authorCollaboration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributorAssociation contributorAssociation = (ContributorAssociation) o;
    return Objects.equals(this.pureId, contributorAssociation.pureId) &&
        Objects.equals(this.person, contributorAssociation.person) &&
        Objects.equals(this.externalPerson, contributorAssociation.externalPerson) &&
        Objects.equals(this.name, contributorAssociation.name) &&
        Objects.equals(this.role, contributorAssociation.role) &&
        Objects.equals(this.organisationalUnits, contributorAssociation.organisationalUnits) &&
        Objects.equals(this.externalOrganisations, contributorAssociation.externalOrganisations) &&
        Objects.equals(this.hidden, contributorAssociation.hidden) &&
        Objects.equals(this.contributionDescription, contributorAssociation.contributionDescription) &&
        Objects.equals(this.contributionPercentage, contributorAssociation.contributionPercentage) &&
        Objects.equals(this.country, contributorAssociation.country) &&
        Objects.equals(this.correspondingAuthor, contributorAssociation.correspondingAuthor) &&
        Objects.equals(this.authorCollaboration, contributorAssociation.authorCollaboration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pureId, person, externalPerson, name, role, organisationalUnits, externalOrganisations, hidden, contributionDescription, contributionPercentage, country, correspondingAuthor, authorCollaboration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributorAssociation {\n");
    sb.append("    pureId: ").append(toIndentedString(pureId)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    externalPerson: ").append(toIndentedString(externalPerson)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    organisationalUnits: ").append(toIndentedString(organisationalUnits)).append("\n");
    sb.append("    externalOrganisations: ").append(toIndentedString(externalOrganisations)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    contributionDescription: ").append(toIndentedString(contributionDescription)).append("\n");
    sb.append("    contributionPercentage: ").append(toIndentedString(contributionPercentage)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    correspondingAuthor: ").append(toIndentedString(correspondingAuthor)).append("\n");
    sb.append("    authorCollaboration: ").append(toIndentedString(authorCollaboration)).append("\n");
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
