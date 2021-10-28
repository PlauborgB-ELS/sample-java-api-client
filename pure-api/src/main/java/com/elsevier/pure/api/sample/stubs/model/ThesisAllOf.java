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
import com.elsevier.pure.api.sample.stubs.model.BookSeriesJournalAssociation;
import com.elsevier.pure.api.sample.stubs.model.ClassificationRef;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.OrganizationOrExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.OrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.PublicationSeries;
import com.elsevier.pure.api.sample.stubs.model.PublisherRef;
import com.elsevier.pure.api.sample.stubs.model.SupervisorAssociation;
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
import org.threeten.bp.OffsetDateTime;

/**
 * ThesisAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class ThesisAllOf {
  public static final String SERIALIZED_NAME_PLACE_OF_PUBLICATION = "placeOfPublication";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_PUBLICATION)
  private String placeOfPublication;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;

  public static final String SERIALIZED_NAME_EDITION = "edition";
  @SerializedName(SERIALIZED_NAME_EDITION)
  private String edition;

  public static final String SERIALIZED_NAME_PRINT_I_S_B_NS = "printISBNs";
  @SerializedName(SERIALIZED_NAME_PRINT_I_S_B_NS)
  private List<String> printISBNs = null;

  public static final String SERIALIZED_NAME_ELECTRONIC_I_S_B_NS = "electronicISBNs";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_I_S_B_NS)
  private List<String> electronicISBNs = null;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private PublisherRef publisher;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_PUBLICATION_SERIES = "publicationSeries";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_SERIES)
  private List<PublicationSeries> publicationSeries = null;

  public static final String SERIALIZED_NAME_BOOK_SERIES = "bookSeries";
  @SerializedName(SERIALIZED_NAME_BOOK_SERIES)
  private List<BookSeriesJournalAssociation> bookSeries = null;

  public static final String SERIALIZED_NAME_QUALIFICATION = "qualification";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION)
  private ClassificationRef qualification;

  public static final String SERIALIZED_NAME_AWARDING_INSTITUTIONS = "awardingInstitutions";
  @SerializedName(SERIALIZED_NAME_AWARDING_INSTITUTIONS)
  private List<OrganizationOrExternalOrganizationRef> awardingInstitutions = null;

  public static final String SERIALIZED_NAME_SUPERVISOR_ORGANISATIONS = "supervisorOrganisations";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR_ORGANISATIONS)
  private List<OrganizationRef> supervisorOrganisations = null;

  public static final String SERIALIZED_NAME_SUPERVISOR_EXTERNAL_ORGANISATIONS = "supervisorExternalOrganisations";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR_EXTERNAL_ORGANISATIONS)
  private List<ExternalOrganizationRef> supervisorExternalOrganisations = null;

  public static final String SERIALIZED_NAME_SUPERVISORS = "supervisors";
  @SerializedName(SERIALIZED_NAME_SUPERVISORS)
  private List<SupervisorAssociation> supervisors = null;

  public static final String SERIALIZED_NAME_SPONSORS = "sponsors";
  @SerializedName(SERIALIZED_NAME_SPONSORS)
  private List<ExternalOrganizationRef> sponsors = null;

  public static final String SERIALIZED_NAME_AWARD_DATE = "awardDate";
  @SerializedName(SERIALIZED_NAME_AWARD_DATE)
  private OffsetDateTime awardDate;


  public ThesisAllOf placeOfPublication(String placeOfPublication) {
    
    this.placeOfPublication = placeOfPublication;
    return this;
  }

   /**
   * The place of publication.
   * @return placeOfPublication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The place of publication.")

  public String getPlaceOfPublication() {
    return placeOfPublication;
  }


  public void setPlaceOfPublication(String placeOfPublication) {
    this.placeOfPublication = placeOfPublication;
  }


  public ThesisAllOf numberOfPages(Integer numberOfPages) {
    
    this.numberOfPages = numberOfPages;
    return this;
  }

   /**
   * The number of pages in the research output.
   * @return numberOfPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages in the research output.")

  public Integer getNumberOfPages() {
    return numberOfPages;
  }


  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }


  public ThesisAllOf edition(String edition) {
    
    this.edition = edition;
    return this;
  }

   /**
   * The edition that the production was published in.
   * @return edition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The edition that the production was published in.")

  public String getEdition() {
    return edition;
  }


  public void setEdition(String edition) {
    this.edition = edition;
  }


  public ThesisAllOf printISBNs(List<String> printISBNs) {
    
    this.printISBNs = printISBNs;
    return this;
  }

  public ThesisAllOf addPrintISBNsItem(String printISBNsItem) {
    if (this.printISBNs == null) {
      this.printISBNs = new ArrayList<String>();
    }
    this.printISBNs.add(printISBNsItem);
    return this;
  }

   /**
   * The ISBN number for the printed versions of the production.
   * @return printISBNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISBN number for the printed versions of the production.")

  public List<String> getPrintISBNs() {
    return printISBNs;
  }


  public void setPrintISBNs(List<String> printISBNs) {
    this.printISBNs = printISBNs;
  }


  public ThesisAllOf electronicISBNs(List<String> electronicISBNs) {
    
    this.electronicISBNs = electronicISBNs;
    return this;
  }

  public ThesisAllOf addElectronicISBNsItem(String electronicISBNsItem) {
    if (this.electronicISBNs == null) {
      this.electronicISBNs = new ArrayList<String>();
    }
    this.electronicISBNs.add(electronicISBNsItem);
    return this;
  }

   /**
   * The ISBN number for the electronic versions of the production.
   * @return electronicISBNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISBN number for the electronic versions of the production.")

  public List<String> getElectronicISBNs() {
    return electronicISBNs;
  }


  public void setElectronicISBNs(List<String> electronicISBNs) {
    this.electronicISBNs = electronicISBNs;
  }


  public ThesisAllOf publisher(PublisherRef publisher) {
    
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PublisherRef getPublisher() {
    return publisher;
  }


  public void setPublisher(PublisherRef publisher) {
    this.publisher = publisher;
  }


  public ThesisAllOf volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * The volume that the research output was published in.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The volume that the research output was published in.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public ThesisAllOf publicationSeries(List<PublicationSeries> publicationSeries) {
    
    this.publicationSeries = publicationSeries;
    return this;
  }

  public ThesisAllOf addPublicationSeriesItem(PublicationSeries publicationSeriesItem) {
    if (this.publicationSeries == null) {
      this.publicationSeries = new ArrayList<PublicationSeries>();
    }
    this.publicationSeries.add(publicationSeriesItem);
    return this;
  }

   /**
   * The publication series this research output is part of.
   * @return publicationSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The publication series this research output is part of.")

  public List<PublicationSeries> getPublicationSeries() {
    return publicationSeries;
  }


  public void setPublicationSeries(List<PublicationSeries> publicationSeries) {
    this.publicationSeries = publicationSeries;
  }


  public ThesisAllOf bookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    
    this.bookSeries = bookSeries;
    return this;
  }

  public ThesisAllOf addBookSeriesItem(BookSeriesJournalAssociation bookSeriesItem) {
    if (this.bookSeries == null) {
      this.bookSeries = new ArrayList<BookSeriesJournalAssociation>();
    }
    this.bookSeries.add(bookSeriesItem);
    return this;
  }

   /**
   * The book series this research output is part of.
   * @return bookSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The book series this research output is part of.")

  public List<BookSeriesJournalAssociation> getBookSeries() {
    return bookSeries;
  }


  public void setBookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    this.bookSeries = bookSeries;
  }


  public ThesisAllOf qualification(ClassificationRef qualification) {
    
    this.qualification = qualification;
    return this;
  }

   /**
   * Get qualification
   * @return qualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassificationRef getQualification() {
    return qualification;
  }


  public void setQualification(ClassificationRef qualification) {
    this.qualification = qualification;
  }


  public ThesisAllOf awardingInstitutions(List<OrganizationOrExternalOrganizationRef> awardingInstitutions) {
    
    this.awardingInstitutions = awardingInstitutions;
    return this;
  }

  public ThesisAllOf addAwardingInstitutionsItem(OrganizationOrExternalOrganizationRef awardingInstitutionsItem) {
    if (this.awardingInstitutions == null) {
      this.awardingInstitutions = new ArrayList<OrganizationOrExternalOrganizationRef>();
    }
    this.awardingInstitutions.add(awardingInstitutionsItem);
    return this;
  }

   /**
   * The awarding institution.
   * @return awardingInstitutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The awarding institution.")

  public List<OrganizationOrExternalOrganizationRef> getAwardingInstitutions() {
    return awardingInstitutions;
  }


  public void setAwardingInstitutions(List<OrganizationOrExternalOrganizationRef> awardingInstitutions) {
    this.awardingInstitutions = awardingInstitutions;
  }


  public ThesisAllOf supervisorOrganisations(List<OrganizationRef> supervisorOrganisations) {
    
    this.supervisorOrganisations = supervisorOrganisations;
    return this;
  }

  public ThesisAllOf addSupervisorOrganisationsItem(OrganizationRef supervisorOrganisationsItem) {
    if (this.supervisorOrganisations == null) {
      this.supervisorOrganisations = new ArrayList<OrganizationRef>();
    }
    this.supervisorOrganisations.add(supervisorOrganisationsItem);
    return this;
  }

   /**
   * A collection of organisational unit affiliations associated with supervisors of this research output.
   * @return supervisorOrganisations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of organisational unit affiliations associated with supervisors of this research output.")

  public List<OrganizationRef> getSupervisorOrganisations() {
    return supervisorOrganisations;
  }


  public void setSupervisorOrganisations(List<OrganizationRef> supervisorOrganisations) {
    this.supervisorOrganisations = supervisorOrganisations;
  }


  public ThesisAllOf supervisorExternalOrganisations(List<ExternalOrganizationRef> supervisorExternalOrganisations) {
    
    this.supervisorExternalOrganisations = supervisorExternalOrganisations;
    return this;
  }

  public ThesisAllOf addSupervisorExternalOrganisationsItem(ExternalOrganizationRef supervisorExternalOrganisationsItem) {
    if (this.supervisorExternalOrganisations == null) {
      this.supervisorExternalOrganisations = new ArrayList<ExternalOrganizationRef>();
    }
    this.supervisorExternalOrganisations.add(supervisorExternalOrganisationsItem);
    return this;
  }

   /**
   * A collection of external organisation affiliations associated with supervisors of this research output.
   * @return supervisorExternalOrganisations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of external organisation affiliations associated with supervisors of this research output.")

  public List<ExternalOrganizationRef> getSupervisorExternalOrganisations() {
    return supervisorExternalOrganisations;
  }


  public void setSupervisorExternalOrganisations(List<ExternalOrganizationRef> supervisorExternalOrganisations) {
    this.supervisorExternalOrganisations = supervisorExternalOrganisations;
  }


  public ThesisAllOf supervisors(List<SupervisorAssociation> supervisors) {
    
    this.supervisors = supervisors;
    return this;
  }

  public ThesisAllOf addSupervisorsItem(SupervisorAssociation supervisorsItem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<SupervisorAssociation>();
    }
    this.supervisors.add(supervisorsItem);
    return this;
  }

   /**
   * The supervisors of this research output.
   * @return supervisors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The supervisors of this research output.")

  public List<SupervisorAssociation> getSupervisors() {
    return supervisors;
  }


  public void setSupervisors(List<SupervisorAssociation> supervisors) {
    this.supervisors = supervisors;
  }


  public ThesisAllOf sponsors(List<ExternalOrganizationRef> sponsors) {
    
    this.sponsors = sponsors;
    return this;
  }

  public ThesisAllOf addSponsorsItem(ExternalOrganizationRef sponsorsItem) {
    if (this.sponsors == null) {
      this.sponsors = new ArrayList<ExternalOrganizationRef>();
    }
    this.sponsors.add(sponsorsItem);
    return this;
  }

   /**
   * The sponsors of this research output.
   * @return sponsors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sponsors of this research output.")

  public List<ExternalOrganizationRef> getSponsors() {
    return sponsors;
  }


  public void setSponsors(List<ExternalOrganizationRef> sponsors) {
    this.sponsors = sponsors;
  }


  public ThesisAllOf awardDate(OffsetDateTime awardDate) {
    
    this.awardDate = awardDate;
    return this;
  }

   /**
   * Get awardDate
   * @return awardDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAwardDate() {
    return awardDate;
  }


  public void setAwardDate(OffsetDateTime awardDate) {
    this.awardDate = awardDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThesisAllOf thesisAllOf = (ThesisAllOf) o;
    return Objects.equals(this.placeOfPublication, thesisAllOf.placeOfPublication) &&
        Objects.equals(this.numberOfPages, thesisAllOf.numberOfPages) &&
        Objects.equals(this.edition, thesisAllOf.edition) &&
        Objects.equals(this.printISBNs, thesisAllOf.printISBNs) &&
        Objects.equals(this.electronicISBNs, thesisAllOf.electronicISBNs) &&
        Objects.equals(this.publisher, thesisAllOf.publisher) &&
        Objects.equals(this.volume, thesisAllOf.volume) &&
        Objects.equals(this.publicationSeries, thesisAllOf.publicationSeries) &&
        Objects.equals(this.bookSeries, thesisAllOf.bookSeries) &&
        Objects.equals(this.qualification, thesisAllOf.qualification) &&
        Objects.equals(this.awardingInstitutions, thesisAllOf.awardingInstitutions) &&
        Objects.equals(this.supervisorOrganisations, thesisAllOf.supervisorOrganisations) &&
        Objects.equals(this.supervisorExternalOrganisations, thesisAllOf.supervisorExternalOrganisations) &&
        Objects.equals(this.supervisors, thesisAllOf.supervisors) &&
        Objects.equals(this.sponsors, thesisAllOf.sponsors) &&
        Objects.equals(this.awardDate, thesisAllOf.awardDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeOfPublication, numberOfPages, edition, printISBNs, electronicISBNs, publisher, volume, publicationSeries, bookSeries, qualification, awardingInstitutions, supervisorOrganisations, supervisorExternalOrganisations, supervisors, sponsors, awardDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThesisAllOf {\n");
    sb.append("    placeOfPublication: ").append(toIndentedString(placeOfPublication)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    printISBNs: ").append(toIndentedString(printISBNs)).append("\n");
    sb.append("    electronicISBNs: ").append(toIndentedString(electronicISBNs)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    publicationSeries: ").append(toIndentedString(publicationSeries)).append("\n");
    sb.append("    bookSeries: ").append(toIndentedString(bookSeries)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    awardingInstitutions: ").append(toIndentedString(awardingInstitutions)).append("\n");
    sb.append("    supervisorOrganisations: ").append(toIndentedString(supervisorOrganisations)).append("\n");
    sb.append("    supervisorExternalOrganisations: ").append(toIndentedString(supervisorExternalOrganisations)).append("\n");
    sb.append("    supervisors: ").append(toIndentedString(supervisors)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
    sb.append("    awardDate: ").append(toIndentedString(awardDate)).append("\n");
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

