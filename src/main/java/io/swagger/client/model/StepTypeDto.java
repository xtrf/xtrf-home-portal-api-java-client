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
import io.swagger.client.model.StepTypeSemanticsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StepTypeDto
 */


public class StepTypeDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("jobTypeId")
  private Long jobTypeId = null;

  @SerializedName("semantics")
  private StepTypeSemanticsDto semantics = null;

  public StepTypeDto id(String id) {
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

  public StepTypeDto name(String name) {
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

  public StepTypeDto jobTypeId(Long jobTypeId) {
    this.jobTypeId = jobTypeId;
    return this;
  }

   /**
   * Get jobTypeId
   * @return jobTypeId
  **/
  @Schema(description = "")
  public Long getJobTypeId() {
    return jobTypeId;
  }

  public void setJobTypeId(Long jobTypeId) {
    this.jobTypeId = jobTypeId;
  }

  public StepTypeDto semantics(StepTypeSemanticsDto semantics) {
    this.semantics = semantics;
    return this;
  }

   /**
   * Get semantics
   * @return semantics
  **/
  @Schema(description = "")
  public StepTypeSemanticsDto getSemantics() {
    return semantics;
  }

  public void setSemantics(StepTypeSemanticsDto semantics) {
    this.semantics = semantics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepTypeDto stepTypeDto = (StepTypeDto) o;
    return Objects.equals(this.id, stepTypeDto.id) &&
        Objects.equals(this.name, stepTypeDto.name) &&
        Objects.equals(this.jobTypeId, stepTypeDto.jobTypeId) &&
        Objects.equals(this.semantics, stepTypeDto.semantics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, jobTypeId, semantics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepTypeDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
    sb.append("    semantics: ").append(toIndentedString(semantics)).append("\n");
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
