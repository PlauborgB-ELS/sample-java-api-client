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
import com.elsevier.pure.api.sample.stubs.model.CaseNote;
import com.elsevier.pure.api.sample.stubs.model.ConferenceSeriesRef;
import com.elsevier.pure.api.sample.stubs.model.EventRef;
import com.elsevier.pure.api.sample.stubs.model.ExternalOrganizationRef;
import com.elsevier.pure.api.sample.stubs.model.FormattedString;
import com.elsevier.pure.api.sample.stubs.model.Name;
import com.elsevier.pure.api.sample.stubs.model.PublicationSeries;
import com.elsevier.pure.api.sample.stubs.model.PublisherRef;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ContributionToBookAnthologyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T22:49:29.739+02:00[Europe/Copenhagen]")
public class ContributionToBookAnthologyAllOf {
  public static final String SERIALIZED_NAME_PLACE_OF_PUBLICATION = "placeOfPublication";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_PUBLICATION)
  private String placeOfPublication;

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

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventRef event;

  public static final String SERIALIZED_NAME_PUBLICATION_SERIES = "publicationSeries";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_SERIES)
  private List<PublicationSeries> publicationSeries = null;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private String pages;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_HOST_PUBLICATION_EDITORS = "hostPublicationEditors";
  @SerializedName(SERIALIZED_NAME_HOST_PUBLICATION_EDITORS)
  private List<Name> hostPublicationEditors = null;

  public static final String SERIALIZED_NAME_HOST_PUBLICATION_TITLE = "hostPublicationTitle";
  @SerializedName(SERIALIZED_NAME_HOST_PUBLICATION_TITLE)
  private FormattedString hostPublicationTitle;

  public static final String SERIALIZED_NAME_HOST_PUBLICATION_SUB_TITLE = "hostPublicationSubTitle";
  @SerializedName(SERIALIZED_NAME_HOST_PUBLICATION_SUB_TITLE)
  private FormattedString hostPublicationSubTitle;

  public static final String SERIALIZED_NAME_TRANSLATED_HOST_PUBLICATION_TITLE = "translatedHostPublicationTitle";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_HOST_PUBLICATION_TITLE)
  private Map<String, String> translatedHostPublicationTitle = null;

  public static final String SERIALIZED_NAME_TRANSLATED_HOST_PUBLICATION_SUBTITLE = "translatedHostPublicationSubtitle";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_HOST_PUBLICATION_SUBTITLE)
  private Map<String, String> translatedHostPublicationSubtitle = null;

  public static final String SERIALIZED_NAME_ARTICLE_NUMBER = "articleNumber";
  @SerializedName(SERIALIZED_NAME_ARTICLE_NUMBER)
  private String articleNumber;

  public static final String SERIALIZED_NAME_CASE_NOTES = "caseNotes";
  @SerializedName(SERIALIZED_NAME_CASE_NOTES)
  private List<CaseNote> caseNotes = null;

  public static final String SERIALIZED_NAME_COMMISSIONING_BODY = "commissioningBody";
  @SerializedName(SERIALIZED_NAME_COMMISSIONING_BODY)
  private ExternalOrganizationRef commissioningBody;

  public static final String SERIALIZED_NAME_BOOK_SERIES = "bookSeries";
  @SerializedName(SERIALIZED_NAME_BOOK_SERIES)
  private List<BookSeriesJournalAssociation> bookSeries = null;

  public static final String SERIALIZED_NAME_CHAPTER = "chapter";
  @SerializedName(SERIALIZED_NAME_CHAPTER)
  private String chapter;

  public static final String SERIALIZED_NAME_CONFERENCE_SERIES = "conferenceSeries";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_SERIES)
  private ConferenceSeriesRef conferenceSeries;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAGES = "numberOfPages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAGES)
  private Integer numberOfPages;


  public ContributionToBookAnthologyAllOf placeOfPublication(String placeOfPublication) {
    
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


  public ContributionToBookAnthologyAllOf edition(String edition) {
    
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


  public ContributionToBookAnthologyAllOf printISBNs(List<String> printISBNs) {
    
    this.printISBNs = printISBNs;
    return this;
  }

  public ContributionToBookAnthologyAllOf addPrintISBNsItem(String printISBNsItem) {
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


  public ContributionToBookAnthologyAllOf electronicISBNs(List<String> electronicISBNs) {
    
    this.electronicISBNs = electronicISBNs;
    return this;
  }

  public ContributionToBookAnthologyAllOf addElectronicISBNsItem(String electronicISBNsItem) {
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


  public ContributionToBookAnthologyAllOf publisher(PublisherRef publisher) {
    
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


  public ContributionToBookAnthologyAllOf event(EventRef event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventRef getEvent() {
    return event;
  }


  public void setEvent(EventRef event) {
    this.event = event;
  }


  public ContributionToBookAnthologyAllOf publicationSeries(List<PublicationSeries> publicationSeries) {
    
    this.publicationSeries = publicationSeries;
    return this;
  }

  public ContributionToBookAnthologyAllOf addPublicationSeriesItem(PublicationSeries publicationSeriesItem) {
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


  public ContributionToBookAnthologyAllOf pages(String pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * The pages of the host publication covered by this contribution, for example 10-15.
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pages of the host publication covered by this contribution, for example 10-15.")

  public String getPages() {
    return pages;
  }


  public void setPages(String pages) {
    this.pages = pages;
  }


  public ContributionToBookAnthologyAllOf volume(String volume) {
    
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


  public ContributionToBookAnthologyAllOf hostPublicationEditors(List<Name> hostPublicationEditors) {
    
    this.hostPublicationEditors = hostPublicationEditors;
    return this;
  }

  public ContributionToBookAnthologyAllOf addHostPublicationEditorsItem(Name hostPublicationEditorsItem) {
    if (this.hostPublicationEditors == null) {
      this.hostPublicationEditors = new ArrayList<Name>();
    }
    this.hostPublicationEditors.add(hostPublicationEditorsItem);
    return this;
  }

   /**
   * A list of host publication editors.
   * @return hostPublicationEditors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of host publication editors.")

  public List<Name> getHostPublicationEditors() {
    return hostPublicationEditors;
  }


  public void setHostPublicationEditors(List<Name> hostPublicationEditors) {
    this.hostPublicationEditors = hostPublicationEditors;
  }


  public ContributionToBookAnthologyAllOf hostPublicationTitle(FormattedString hostPublicationTitle) {
    
    this.hostPublicationTitle = hostPublicationTitle;
    return this;
  }

   /**
   * Get hostPublicationTitle
   * @return hostPublicationTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormattedString getHostPublicationTitle() {
    return hostPublicationTitle;
  }


  public void setHostPublicationTitle(FormattedString hostPublicationTitle) {
    this.hostPublicationTitle = hostPublicationTitle;
  }


  public ContributionToBookAnthologyAllOf hostPublicationSubTitle(FormattedString hostPublicationSubTitle) {
    
    this.hostPublicationSubTitle = hostPublicationSubTitle;
    return this;
  }

   /**
   * Get hostPublicationSubTitle
   * @return hostPublicationSubTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FormattedString getHostPublicationSubTitle() {
    return hostPublicationSubTitle;
  }


  public void setHostPublicationSubTitle(FormattedString hostPublicationSubTitle) {
    this.hostPublicationSubTitle = hostPublicationSubTitle;
  }


  public ContributionToBookAnthologyAllOf translatedHostPublicationTitle(Map<String, String> translatedHostPublicationTitle) {
    
    this.translatedHostPublicationTitle = translatedHostPublicationTitle;
    return this;
  }

  public ContributionToBookAnthologyAllOf putTranslatedHostPublicationTitleItem(String key, String translatedHostPublicationTitleItem) {
    if (this.translatedHostPublicationTitle == null) {
      this.translatedHostPublicationTitle = new HashMap<String, String>();
    }
    this.translatedHostPublicationTitle.put(key, translatedHostPublicationTitleItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return translatedHostPublicationTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getTranslatedHostPublicationTitle() {
    return translatedHostPublicationTitle;
  }


  public void setTranslatedHostPublicationTitle(Map<String, String> translatedHostPublicationTitle) {
    this.translatedHostPublicationTitle = translatedHostPublicationTitle;
  }


  public ContributionToBookAnthologyAllOf translatedHostPublicationSubtitle(Map<String, String> translatedHostPublicationSubtitle) {
    
    this.translatedHostPublicationSubtitle = translatedHostPublicationSubtitle;
    return this;
  }

  public ContributionToBookAnthologyAllOf putTranslatedHostPublicationSubtitleItem(String key, String translatedHostPublicationSubtitleItem) {
    if (this.translatedHostPublicationSubtitle == null) {
      this.translatedHostPublicationSubtitle = new HashMap<String, String>();
    }
    this.translatedHostPublicationSubtitle.put(key, translatedHostPublicationSubtitleItem);
    return this;
  }

   /**
   * A set of string values, one for each submission locale. Note: invalid locale values will be ignored.
   * @return translatedHostPublicationSubtitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en_GB\":\"Some text\"}", value = "A set of string values, one for each submission locale. Note: invalid locale values will be ignored.")

  public Map<String, String> getTranslatedHostPublicationSubtitle() {
    return translatedHostPublicationSubtitle;
  }


  public void setTranslatedHostPublicationSubtitle(Map<String, String> translatedHostPublicationSubtitle) {
    this.translatedHostPublicationSubtitle = translatedHostPublicationSubtitle;
  }


  public ContributionToBookAnthologyAllOf articleNumber(String articleNumber) {
    
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * The article number.
   * @return articleNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The article number.")

  public String getArticleNumber() {
    return articleNumber;
  }


  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }


  public ContributionToBookAnthologyAllOf caseNotes(List<CaseNote> caseNotes) {
    
    this.caseNotes = caseNotes;
    return this;
  }

  public ContributionToBookAnthologyAllOf addCaseNotesItem(CaseNote caseNotesItem) {
    if (this.caseNotes == null) {
      this.caseNotes = new ArrayList<CaseNote>();
    }
    this.caseNotes.add(caseNotesItem);
    return this;
  }

   /**
   * A collection of court case notes related to this research output.
   * @return caseNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of court case notes related to this research output.")

  public List<CaseNote> getCaseNotes() {
    return caseNotes;
  }


  public void setCaseNotes(List<CaseNote> caseNotes) {
    this.caseNotes = caseNotes;
  }


  public ContributionToBookAnthologyAllOf commissioningBody(ExternalOrganizationRef commissioningBody) {
    
    this.commissioningBody = commissioningBody;
    return this;
  }

   /**
   * Get commissioningBody
   * @return commissioningBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalOrganizationRef getCommissioningBody() {
    return commissioningBody;
  }


  public void setCommissioningBody(ExternalOrganizationRef commissioningBody) {
    this.commissioningBody = commissioningBody;
  }


  public ContributionToBookAnthologyAllOf bookSeries(List<BookSeriesJournalAssociation> bookSeries) {
    
    this.bookSeries = bookSeries;
    return this;
  }

  public ContributionToBookAnthologyAllOf addBookSeriesItem(BookSeriesJournalAssociation bookSeriesItem) {
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


  public ContributionToBookAnthologyAllOf chapter(String chapter) {
    
    this.chapter = chapter;
    return this;
  }

   /**
   * The chapter of the host publication covered by this contribution, for example 2.
   * @return chapter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The chapter of the host publication covered by this contribution, for example 2.")

  public String getChapter() {
    return chapter;
  }


  public void setChapter(String chapter) {
    this.chapter = chapter;
  }


  public ContributionToBookAnthologyAllOf conferenceSeries(ConferenceSeriesRef conferenceSeries) {
    
    this.conferenceSeries = conferenceSeries;
    return this;
  }

   /**
   * Get conferenceSeries
   * @return conferenceSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConferenceSeriesRef getConferenceSeries() {
    return conferenceSeries;
  }


  public void setConferenceSeries(ConferenceSeriesRef conferenceSeries) {
    this.conferenceSeries = conferenceSeries;
  }


  public ContributionToBookAnthologyAllOf numberOfPages(Integer numberOfPages) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributionToBookAnthologyAllOf contributionToBookAnthologyAllOf = (ContributionToBookAnthologyAllOf) o;
    return Objects.equals(this.placeOfPublication, contributionToBookAnthologyAllOf.placeOfPublication) &&
        Objects.equals(this.edition, contributionToBookAnthologyAllOf.edition) &&
        Objects.equals(this.printISBNs, contributionToBookAnthologyAllOf.printISBNs) &&
        Objects.equals(this.electronicISBNs, contributionToBookAnthologyAllOf.electronicISBNs) &&
        Objects.equals(this.publisher, contributionToBookAnthologyAllOf.publisher) &&
        Objects.equals(this.event, contributionToBookAnthologyAllOf.event) &&
        Objects.equals(this.publicationSeries, contributionToBookAnthologyAllOf.publicationSeries) &&
        Objects.equals(this.pages, contributionToBookAnthologyAllOf.pages) &&
        Objects.equals(this.volume, contributionToBookAnthologyAllOf.volume) &&
        Objects.equals(this.hostPublicationEditors, contributionToBookAnthologyAllOf.hostPublicationEditors) &&
        Objects.equals(this.hostPublicationTitle, contributionToBookAnthologyAllOf.hostPublicationTitle) &&
        Objects.equals(this.hostPublicationSubTitle, contributionToBookAnthologyAllOf.hostPublicationSubTitle) &&
        Objects.equals(this.translatedHostPublicationTitle, contributionToBookAnthologyAllOf.translatedHostPublicationTitle) &&
        Objects.equals(this.translatedHostPublicationSubtitle, contributionToBookAnthologyAllOf.translatedHostPublicationSubtitle) &&
        Objects.equals(this.articleNumber, contributionToBookAnthologyAllOf.articleNumber) &&
        Objects.equals(this.caseNotes, contributionToBookAnthologyAllOf.caseNotes) &&
        Objects.equals(this.commissioningBody, contributionToBookAnthologyAllOf.commissioningBody) &&
        Objects.equals(this.bookSeries, contributionToBookAnthologyAllOf.bookSeries) &&
        Objects.equals(this.chapter, contributionToBookAnthologyAllOf.chapter) &&
        Objects.equals(this.conferenceSeries, contributionToBookAnthologyAllOf.conferenceSeries) &&
        Objects.equals(this.numberOfPages, contributionToBookAnthologyAllOf.numberOfPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeOfPublication, edition, printISBNs, electronicISBNs, publisher, event, publicationSeries, pages, volume, hostPublicationEditors, hostPublicationTitle, hostPublicationSubTitle, translatedHostPublicationTitle, translatedHostPublicationSubtitle, articleNumber, caseNotes, commissioningBody, bookSeries, chapter, conferenceSeries, numberOfPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionToBookAnthologyAllOf {\n");
    sb.append("    placeOfPublication: ").append(toIndentedString(placeOfPublication)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    printISBNs: ").append(toIndentedString(printISBNs)).append("\n");
    sb.append("    electronicISBNs: ").append(toIndentedString(electronicISBNs)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    publicationSeries: ").append(toIndentedString(publicationSeries)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    hostPublicationEditors: ").append(toIndentedString(hostPublicationEditors)).append("\n");
    sb.append("    hostPublicationTitle: ").append(toIndentedString(hostPublicationTitle)).append("\n");
    sb.append("    hostPublicationSubTitle: ").append(toIndentedString(hostPublicationSubTitle)).append("\n");
    sb.append("    translatedHostPublicationTitle: ").append(toIndentedString(translatedHostPublicationTitle)).append("\n");
    sb.append("    translatedHostPublicationSubtitle: ").append(toIndentedString(translatedHostPublicationSubtitle)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    caseNotes: ").append(toIndentedString(caseNotes)).append("\n");
    sb.append("    commissioningBody: ").append(toIndentedString(commissioningBody)).append("\n");
    sb.append("    bookSeries: ").append(toIndentedString(bookSeries)).append("\n");
    sb.append("    chapter: ").append(toIndentedString(chapter)).append("\n");
    sb.append("    conferenceSeries: ").append(toIndentedString(conferenceSeries)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
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

