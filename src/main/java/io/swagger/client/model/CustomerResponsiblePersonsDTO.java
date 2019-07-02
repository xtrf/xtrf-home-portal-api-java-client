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
 * CustomerResponsiblePersonsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class CustomerResponsiblePersonsDTO {
  @SerializedName("projectManagerId")
  private Long projectManagerId = null;

  @SerializedName("salesPersonId")
  private Long salesPersonId = null;

  @SerializedName("accountManagerId")
  private Long accountManagerId = null;

  @SerializedName("projectCoordinatorId")
  private Long projectCoordinatorId = null;

  public CustomerResponsiblePersonsDTO projectManagerId(Long projectManagerId) {
    this.projectManagerId = projectManagerId;
    return this;
  }

   /**
   * project manager
   * @return projectManagerId
  **/
  @Schema(required = true, description = "project manager")
  public Long getProjectManagerId() {
    return projectManagerId;
  }

  public void setProjectManagerId(Long projectManagerId) {
    this.projectManagerId = projectManagerId;
  }

  public CustomerResponsiblePersonsDTO salesPersonId(Long salesPersonId) {
    this.salesPersonId = salesPersonId;
    return this;
  }

   /**
   * sales person
   * @return salesPersonId
  **/
  @Schema(required = true, description = "sales person")
  public Long getSalesPersonId() {
    return salesPersonId;
  }

  public void setSalesPersonId(Long salesPersonId) {
    this.salesPersonId = salesPersonId;
  }

  public CustomerResponsiblePersonsDTO accountManagerId(Long accountManagerId) {
    this.accountManagerId = accountManagerId;
    return this;
  }

   /**
   * account manager
   * @return accountManagerId
  **/
  @Schema(description = "account manager")
  public Long getAccountManagerId() {
    return accountManagerId;
  }

  public void setAccountManagerId(Long accountManagerId) {
    this.accountManagerId = accountManagerId;
  }

  public CustomerResponsiblePersonsDTO projectCoordinatorId(Long projectCoordinatorId) {
    this.projectCoordinatorId = projectCoordinatorId;
    return this;
  }

   /**
   * project coordinator
   * @return projectCoordinatorId
  **/
  @Schema(description = "project coordinator")
  public Long getProjectCoordinatorId() {
    return projectCoordinatorId;
  }

  public void setProjectCoordinatorId(Long projectCoordinatorId) {
    this.projectCoordinatorId = projectCoordinatorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponsiblePersonsDTO customerResponsiblePersonsDTO = (CustomerResponsiblePersonsDTO) o;
    return Objects.equals(this.projectManagerId, customerResponsiblePersonsDTO.projectManagerId) &&
        Objects.equals(this.salesPersonId, customerResponsiblePersonsDTO.salesPersonId) &&
        Objects.equals(this.accountManagerId, customerResponsiblePersonsDTO.accountManagerId) &&
        Objects.equals(this.projectCoordinatorId, customerResponsiblePersonsDTO.projectCoordinatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectManagerId, salesPersonId, accountManagerId, projectCoordinatorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponsiblePersonsDTO {\n");
    
    sb.append("    projectManagerId: ").append(toIndentedString(projectManagerId)).append("\n");
    sb.append("    salesPersonId: ").append(toIndentedString(salesPersonId)).append("\n");
    sb.append("    accountManagerId: ").append(toIndentedString(accountManagerId)).append("\n");
    sb.append("    projectCoordinatorId: ").append(toIndentedString(projectCoordinatorId)).append("\n");
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