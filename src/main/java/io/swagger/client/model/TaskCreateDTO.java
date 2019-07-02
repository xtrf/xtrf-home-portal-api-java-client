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
import io.swagger.client.model.InstructionsDTO;
import io.swagger.client.model.LanguageCombinationDTO;
import io.swagger.client.model.PeopleDTO;
import io.swagger.client.model.ProjectDatesDTO;
import io.swagger.client.model.TaskFileDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskCreateDTO
 */


public class TaskCreateDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("clientTaskPONumber")
  private String clientTaskPONumber = null;

  @SerializedName("languageCombination")
  private LanguageCombinationDTO languageCombination = null;

  @SerializedName("dates")
  private ProjectDatesDTO dates = null;

  @SerializedName("people")
  private PeopleDTO people = null;

  @SerializedName("instructions")
  private InstructionsDTO instructions = null;

  @SerializedName("specializationId")
  private Long specializationId = null;

  @SerializedName("workflowId")
  private Long workflowId = null;

  @SerializedName("files")
  private List<TaskFileDTO> files = null;

  public TaskCreateDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @Schema(description = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskCreateDTO clientTaskPONumber(String clientTaskPONumber) {
    this.clientTaskPONumber = clientTaskPONumber;
    return this;
  }

   /**
   * client task PO number
   * @return clientTaskPONumber
  **/
  @Schema(description = "client task PO number")
  public String getClientTaskPONumber() {
    return clientTaskPONumber;
  }

  public void setClientTaskPONumber(String clientTaskPONumber) {
    this.clientTaskPONumber = clientTaskPONumber;
  }

  public TaskCreateDTO languageCombination(LanguageCombinationDTO languageCombination) {
    this.languageCombination = languageCombination;
    return this;
  }

   /**
   * Get languageCombination
   * @return languageCombination
  **/
  @Schema(description = "")
  public LanguageCombinationDTO getLanguageCombination() {
    return languageCombination;
  }

  public void setLanguageCombination(LanguageCombinationDTO languageCombination) {
    this.languageCombination = languageCombination;
  }

  public TaskCreateDTO dates(ProjectDatesDTO dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @Schema(description = "")
  public ProjectDatesDTO getDates() {
    return dates;
  }

  public void setDates(ProjectDatesDTO dates) {
    this.dates = dates;
  }

  public TaskCreateDTO people(PeopleDTO people) {
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

  public TaskCreateDTO instructions(InstructionsDTO instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @Schema(description = "")
  public InstructionsDTO getInstructions() {
    return instructions;
  }

  public void setInstructions(InstructionsDTO instructions) {
    this.instructions = instructions;
  }

  public TaskCreateDTO specializationId(Long specializationId) {
    this.specializationId = specializationId;
    return this;
  }

   /**
   * specialization
   * @return specializationId
  **/
  @Schema(description = "specialization")
  public Long getSpecializationId() {
    return specializationId;
  }

  public void setSpecializationId(Long specializationId) {
    this.specializationId = specializationId;
  }

  public TaskCreateDTO workflowId(Long workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * workflow
   * @return workflowId
  **/
  @Schema(description = "workflow")
  public Long getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(Long workflowId) {
    this.workflowId = workflowId;
  }

  public TaskCreateDTO files(List<TaskFileDTO> files) {
    this.files = files;
    return this;
  }

  public TaskCreateDTO addFilesItem(TaskFileDTO filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<TaskFileDTO>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * files
   * @return files
  **/
  @Schema(description = "files")
  public List<TaskFileDTO> getFiles() {
    return files;
  }

  public void setFiles(List<TaskFileDTO> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreateDTO taskCreateDTO = (TaskCreateDTO) o;
    return Objects.equals(this.name, taskCreateDTO.name) &&
        Objects.equals(this.clientTaskPONumber, taskCreateDTO.clientTaskPONumber) &&
        Objects.equals(this.languageCombination, taskCreateDTO.languageCombination) &&
        Objects.equals(this.dates, taskCreateDTO.dates) &&
        Objects.equals(this.people, taskCreateDTO.people) &&
        Objects.equals(this.instructions, taskCreateDTO.instructions) &&
        Objects.equals(this.specializationId, taskCreateDTO.specializationId) &&
        Objects.equals(this.workflowId, taskCreateDTO.workflowId) &&
        Objects.equals(this.files, taskCreateDTO.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clientTaskPONumber, languageCombination, dates, people, instructions, specializationId, workflowId, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreateDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientTaskPONumber: ").append(toIndentedString(clientTaskPONumber)).append("\n");
    sb.append("    languageCombination: ").append(toIndentedString(languageCombination)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    specializationId: ").append(toIndentedString(specializationId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
