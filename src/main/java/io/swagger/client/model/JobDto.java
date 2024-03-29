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
import io.swagger.client.model.JobCommunicationDto;
import io.swagger.client.model.JobDatesDto;
import io.swagger.client.model.JobDocumentsDto;
import io.swagger.client.model.JobFilesDto;
import io.swagger.client.model.JobLanguageCombinationDto;
import io.swagger.client.model.StepTypeDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * JobDto
 */


public class JobDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("idNumber")
  private String idNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("stepNumber")
  private Integer stepNumber = null;

  @SerializedName("vendorId")
  private Long vendorId = null;

  @SerializedName("vendorPriceProfileId")
  private Long vendorPriceProfileId = null;

  @SerializedName("stepType")
  private StepTypeDto stepType = null;

  @SerializedName("languages")
  private List<JobLanguageCombinationDto> languages = null;

  @SerializedName("dates")
  private JobDatesDto dates = null;

  @SerializedName("files")
  private JobFilesDto files = null;

  @SerializedName("communication")
  private JobCommunicationDto communication = null;

  @SerializedName("documents")
  private JobDocumentsDto documents = null;

  public JobDto id(String id) {
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

  public JobDto idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @Schema(description = "")
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public JobDto name(String name) {
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

  public JobDto status(String status) {
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

  public JobDto stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

   /**
   * Get stepNumber
   * @return stepNumber
  **/
  @Schema(description = "")
  public Integer getStepNumber() {
    return stepNumber;
  }

  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  public JobDto vendorId(Long vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @Schema(description = "")
  public Long getVendorId() {
    return vendorId;
  }

  public void setVendorId(Long vendorId) {
    this.vendorId = vendorId;
  }

  public JobDto vendorPriceProfileId(Long vendorPriceProfileId) {
    this.vendorPriceProfileId = vendorPriceProfileId;
    return this;
  }

   /**
   * Get vendorPriceProfileId
   * @return vendorPriceProfileId
  **/
  @Schema(description = "")
  public Long getVendorPriceProfileId() {
    return vendorPriceProfileId;
  }

  public void setVendorPriceProfileId(Long vendorPriceProfileId) {
    this.vendorPriceProfileId = vendorPriceProfileId;
  }

  public JobDto stepType(StepTypeDto stepType) {
    this.stepType = stepType;
    return this;
  }

   /**
   * Get stepType
   * @return stepType
  **/
  @Schema(description = "")
  public StepTypeDto getStepType() {
    return stepType;
  }

  public void setStepType(StepTypeDto stepType) {
    this.stepType = stepType;
  }

  public JobDto languages(List<JobLanguageCombinationDto> languages) {
    this.languages = languages;
    return this;
  }

  public JobDto addLanguagesItem(JobLanguageCombinationDto languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<JobLanguageCombinationDto>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @Schema(description = "")
  public List<JobLanguageCombinationDto> getLanguages() {
    return languages;
  }

  public void setLanguages(List<JobLanguageCombinationDto> languages) {
    this.languages = languages;
  }

  public JobDto dates(JobDatesDto dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @Schema(description = "")
  public JobDatesDto getDates() {
    return dates;
  }

  public void setDates(JobDatesDto dates) {
    this.dates = dates;
  }

  public JobDto files(JobFilesDto files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @Schema(description = "")
  public JobFilesDto getFiles() {
    return files;
  }

  public void setFiles(JobFilesDto files) {
    this.files = files;
  }

  public JobDto communication(JobCommunicationDto communication) {
    this.communication = communication;
    return this;
  }

   /**
   * Get communication
   * @return communication
  **/
  @Schema(description = "")
  public JobCommunicationDto getCommunication() {
    return communication;
  }

  public void setCommunication(JobCommunicationDto communication) {
    this.communication = communication;
  }

  public JobDto documents(JobDocumentsDto documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @Schema(description = "")
  public JobDocumentsDto getDocuments() {
    return documents;
  }

  public void setDocuments(JobDocumentsDto documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDto jobDto = (JobDto) o;
    return Objects.equals(this.id, jobDto.id) &&
        Objects.equals(this.idNumber, jobDto.idNumber) &&
        Objects.equals(this.name, jobDto.name) &&
        Objects.equals(this.status, jobDto.status) &&
        Objects.equals(this.stepNumber, jobDto.stepNumber) &&
        Objects.equals(this.vendorId, jobDto.vendorId) &&
        Objects.equals(this.vendorPriceProfileId, jobDto.vendorPriceProfileId) &&
        Objects.equals(this.stepType, jobDto.stepType) &&
        Objects.equals(this.languages, jobDto.languages) &&
        Objects.equals(this.dates, jobDto.dates) &&
        Objects.equals(this.files, jobDto.files) &&
        Objects.equals(this.communication, jobDto.communication) &&
        Objects.equals(this.documents, jobDto.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idNumber, name, status, stepNumber, vendorId, vendorPriceProfileId, stepType, languages, dates, files, communication, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorPriceProfileId: ").append(toIndentedString(vendorPriceProfileId)).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
