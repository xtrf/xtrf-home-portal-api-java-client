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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * JobCommunicationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class JobCommunicationDto {
  @SerializedName("instructionsForAllJobs")
  private String instructionsForAllJobs = null;

  @SerializedName("instructionsForJob")
  private String instructionsForJob = null;

  @SerializedName("noteFromVendor")
  private String noteFromVendor = null;

  public JobCommunicationDto instructionsForAllJobs(String instructionsForAllJobs) {
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

  public JobCommunicationDto instructionsForJob(String instructionsForJob) {
    this.instructionsForJob = instructionsForJob;
    return this;
  }

   /**
   * Get instructionsForJob
   * @return instructionsForJob
  **/
  @Schema(description = "")
  public String getInstructionsForJob() {
    return instructionsForJob;
  }

  public void setInstructionsForJob(String instructionsForJob) {
    this.instructionsForJob = instructionsForJob;
  }

  public JobCommunicationDto noteFromVendor(String noteFromVendor) {
    this.noteFromVendor = noteFromVendor;
    return this;
  }

   /**
   * Get noteFromVendor
   * @return noteFromVendor
  **/
  @Schema(description = "")
  public String getNoteFromVendor() {
    return noteFromVendor;
  }

  public void setNoteFromVendor(String noteFromVendor) {
    this.noteFromVendor = noteFromVendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCommunicationDto jobCommunicationDto = (JobCommunicationDto) o;
    return Objects.equals(this.instructionsForAllJobs, jobCommunicationDto.instructionsForAllJobs) &&
        Objects.equals(this.instructionsForJob, jobCommunicationDto.instructionsForJob) &&
        Objects.equals(this.noteFromVendor, jobCommunicationDto.noteFromVendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionsForAllJobs, instructionsForJob, noteFromVendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCommunicationDto {\n");
    
    sb.append("    instructionsForAllJobs: ").append(toIndentedString(instructionsForAllJobs)).append("\n");
    sb.append("    instructionsForJob: ").append(toIndentedString(instructionsForJob)).append("\n");
    sb.append("    noteFromVendor: ").append(toIndentedString(noteFromVendor)).append("\n");
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