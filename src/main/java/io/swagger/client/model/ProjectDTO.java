/*
 * XTRF Home Portal API
 * XTRF Home Portal API enables you to perform operations on Projects, Quotes, Customers, Vendors etc. as a XTRF Home Portal user. <br>The documentation is generated from OpenAPI specification 3.0 available <a href=\"/home-api/openapi.json\">here</a> <br>   The API client/consumer code may be easily generated in 60+ programming languages using an open source code generator available at the time of writing this documentation at <a href='https://editor.swagger.io/'>https://editor.swagger.io/</a> Thank you for using XTRF Application Programming interface (XTRF API). By using the API you agree to the terms below. If you disagree with any of these terms, XTRF does not grant you a license to use the XTRF API. XTRF reserves the right to update and change these terms from time to time without a prior notice of API users. You can always find the most recent version of these terms here: 
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DocumentsDTO;
import io.swagger.client.model.PeopleDTO;
import io.swagger.client.model.ProjectLanguagesDTO;
import io.swagger.client.model.VolumeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProjectDTO
 */


public class ProjectDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("isClassicProject")
  private Boolean isClassicProject = null;

  @SerializedName("quoteIdNumber")
  private String quoteIdNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("categoryIds")
  private List<Long> categoryIds = null;

  @SerializedName("budgetCode")
  private String budgetCode = null;

  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("serviceId")
  private Long serviceId = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("clientDeadline")
  private Long clientDeadline = null;

  @SerializedName("clientReferenceNumber")
  private String clientReferenceNumber = null;

  @SerializedName("clientNotes")
  private String clientNotes = null;

  @SerializedName("internalNotes")
  private String internalNotes = null;

  @SerializedName("volume")
  private VolumeDTO volume = null;

  @SerializedName("languages")
  private ProjectLanguagesDTO languages = null;

  @SerializedName("documents")
  private DocumentsDTO documents = null;

  @SerializedName("people")
  private PeopleDTO people = null;

  @SerializedName("instructionsForAllJobs")
  private String instructionsForAllJobs = null;

  @SerializedName("projectIdNumber")
  private String projectIdNumber = null;

  @SerializedName("orderedOn")
  private Long orderedOn = null;

  public ProjectDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectDTO projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProjectDTO isClassicProject(Boolean isClassicProject) {
    this.isClassicProject = isClassicProject;
    return this;
  }

   /**
   * Get isClassicProject
   * @return isClassicProject
  **/
  @Schema(description = "")
  public Boolean isIsClassicProject() {
    return isClassicProject;
  }

  public void setIsClassicProject(Boolean isClassicProject) {
    this.isClassicProject = isClassicProject;
  }

  public ProjectDTO quoteIdNumber(String quoteIdNumber) {
    this.quoteIdNumber = quoteIdNumber;
    return this;
  }

   /**
   * Get quoteIdNumber
   * @return quoteIdNumber
  **/
  @Schema(description = "")
  public String getQuoteIdNumber() {
    return quoteIdNumber;
  }

  public void setQuoteIdNumber(String quoteIdNumber) {
    this.quoteIdNumber = quoteIdNumber;
  }

  public ProjectDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProjectDTO categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public ProjectDTO addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<Long>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  @Schema(description = "")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public ProjectDTO budgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
    return this;
  }

   /**
   * Get budgetCode
   * @return budgetCode
  **/
  @Schema(description = "")
  public String getBudgetCode() {
    return budgetCode;
  }

  public void setBudgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
  }

  public ProjectDTO clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public ProjectDTO serviceId(Long serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(description = "")
  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }

  public ProjectDTO origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(description = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ProjectDTO clientDeadline(Long clientDeadline) {
    this.clientDeadline = clientDeadline;
    return this;
  }

   /**
   * Get clientDeadline
   * @return clientDeadline
  **/
  @Schema(description = "")
  public Long getClientDeadline() {
    return clientDeadline;
  }

  public void setClientDeadline(Long clientDeadline) {
    this.clientDeadline = clientDeadline;
  }

  public ProjectDTO clientReferenceNumber(String clientReferenceNumber) {
    this.clientReferenceNumber = clientReferenceNumber;
    return this;
  }

   /**
   * Get clientReferenceNumber
   * @return clientReferenceNumber
  **/
  @Schema(description = "")
  public String getClientReferenceNumber() {
    return clientReferenceNumber;
  }

  public void setClientReferenceNumber(String clientReferenceNumber) {
    this.clientReferenceNumber = clientReferenceNumber;
  }

  public ProjectDTO clientNotes(String clientNotes) {
    this.clientNotes = clientNotes;
    return this;
  }

   /**
   * Get clientNotes
   * @return clientNotes
  **/
  @Schema(description = "")
  public String getClientNotes() {
    return clientNotes;
  }

  public void setClientNotes(String clientNotes) {
    this.clientNotes = clientNotes;
  }

  public ProjectDTO internalNotes(String internalNotes) {
    this.internalNotes = internalNotes;
    return this;
  }

   /**
   * Get internalNotes
   * @return internalNotes
  **/
  @Schema(description = "")
  public String getInternalNotes() {
    return internalNotes;
  }

  public void setInternalNotes(String internalNotes) {
    this.internalNotes = internalNotes;
  }

  public ProjectDTO volume(VolumeDTO volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public VolumeDTO getVolume() {
    return volume;
  }

  public void setVolume(VolumeDTO volume) {
    this.volume = volume;
  }

  public ProjectDTO languages(ProjectLanguagesDTO languages) {
    this.languages = languages;
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @Schema(description = "")
  public ProjectLanguagesDTO getLanguages() {
    return languages;
  }

  public void setLanguages(ProjectLanguagesDTO languages) {
    this.languages = languages;
  }

  public ProjectDTO documents(DocumentsDTO documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @Schema(description = "")
  public DocumentsDTO getDocuments() {
    return documents;
  }

  public void setDocuments(DocumentsDTO documents) {
    this.documents = documents;
  }

  public ProjectDTO people(PeopleDTO people) {
    this.people = people;
    return this;
  }

   /**
   * Get people
   * @return people
  **/
  @Schema(description = "")
  public PeopleDTO getPeople() {
    return people;
  }

  public void setPeople(PeopleDTO people) {
    this.people = people;
  }

  public ProjectDTO instructionsForAllJobs(String instructionsForAllJobs) {
    this.instructionsForAllJobs = instructionsForAllJobs;
    return this;
  }

   /**
   * Get instructionsForAllJobs
   * @return instructionsForAllJobs
  **/
  @Schema(description = "")
  public String getInstructionsForAllJobs() {
    return instructionsForAllJobs;
  }

  public void setInstructionsForAllJobs(String instructionsForAllJobs) {
    this.instructionsForAllJobs = instructionsForAllJobs;
  }

  public ProjectDTO projectIdNumber(String projectIdNumber) {
    this.projectIdNumber = projectIdNumber;
    return this;
  }

   /**
   * Get projectIdNumber
   * @return projectIdNumber
  **/
  @Schema(description = "")
  public String getProjectIdNumber() {
    return projectIdNumber;
  }

  public void setProjectIdNumber(String projectIdNumber) {
    this.projectIdNumber = projectIdNumber;
  }

  public ProjectDTO orderedOn(Long orderedOn) {
    this.orderedOn = orderedOn;
    return this;
  }

   /**
   * Get orderedOn
   * @return orderedOn
  **/
  @Schema(description = "")
  public Long getOrderedOn() {
    return orderedOn;
  }

  public void setOrderedOn(Long orderedOn) {
    this.orderedOn = orderedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDTO projectDTO = (ProjectDTO) o;
    return Objects.equals(this.id, projectDTO.id) &&
        Objects.equals(this.projectId, projectDTO.projectId) &&
        Objects.equals(this.isClassicProject, projectDTO.isClassicProject) &&
        Objects.equals(this.quoteIdNumber, projectDTO.quoteIdNumber) &&
        Objects.equals(this.name, projectDTO.name) &&
        Objects.equals(this.status, projectDTO.status) &&
        Objects.equals(this.categoryIds, projectDTO.categoryIds) &&
        Objects.equals(this.budgetCode, projectDTO.budgetCode) &&
        Objects.equals(this.clientId, projectDTO.clientId) &&
        Objects.equals(this.serviceId, projectDTO.serviceId) &&
        Objects.equals(this.origin, projectDTO.origin) &&
        Objects.equals(this.clientDeadline, projectDTO.clientDeadline) &&
        Objects.equals(this.clientReferenceNumber, projectDTO.clientReferenceNumber) &&
        Objects.equals(this.clientNotes, projectDTO.clientNotes) &&
        Objects.equals(this.internalNotes, projectDTO.internalNotes) &&
        Objects.equals(this.volume, projectDTO.volume) &&
        Objects.equals(this.languages, projectDTO.languages) &&
        Objects.equals(this.documents, projectDTO.documents) &&
        Objects.equals(this.people, projectDTO.people) &&
        Objects.equals(this.instructionsForAllJobs, projectDTO.instructionsForAllJobs) &&
        Objects.equals(this.projectIdNumber, projectDTO.projectIdNumber) &&
        Objects.equals(this.orderedOn, projectDTO.orderedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, isClassicProject, quoteIdNumber, name, status, categoryIds, budgetCode, clientId, serviceId, origin, clientDeadline, clientReferenceNumber, clientNotes, internalNotes, volume, languages, documents, people, instructionsForAllJobs, projectIdNumber, orderedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isClassicProject: ").append(toIndentedString(isClassicProject)).append("\n");
    sb.append("    quoteIdNumber: ").append(toIndentedString(quoteIdNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    budgetCode: ").append(toIndentedString(budgetCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    clientDeadline: ").append(toIndentedString(clientDeadline)).append("\n");
    sb.append("    clientReferenceNumber: ").append(toIndentedString(clientReferenceNumber)).append("\n");
    sb.append("    clientNotes: ").append(toIndentedString(clientNotes)).append("\n");
    sb.append("    internalNotes: ").append(toIndentedString(internalNotes)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    instructionsForAllJobs: ").append(toIndentedString(instructionsForAllJobs)).append("\n");
    sb.append("    projectIdNumber: ").append(toIndentedString(projectIdNumber)).append("\n");
    sb.append("    orderedOn: ").append(toIndentedString(orderedOn)).append("\n");
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
