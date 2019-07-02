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
import java.util.ArrayList;
import java.util.List;
/**
 * ImportResultDTO
 */


public class ImportResultDTO {
  @SerializedName("currentSystemVersion")
  private String currentSystemVersion = null;

  @SerializedName("targetSystemVersion")
  private String targetSystemVersion = null;

  @SerializedName("invalidReportsNames")
  private List<String> invalidReportsNames = null;

  @SerializedName("importedReportsNames")
  private List<String> importedReportsNames = null;

  public ImportResultDTO currentSystemVersion(String currentSystemVersion) {
    this.currentSystemVersion = currentSystemVersion;
    return this;
  }

   /**
   * Get currentSystemVersion
   * @return currentSystemVersion
  **/
  @Schema(description = "")
  public String getCurrentSystemVersion() {
    return currentSystemVersion;
  }

  public void setCurrentSystemVersion(String currentSystemVersion) {
    this.currentSystemVersion = currentSystemVersion;
  }

  public ImportResultDTO targetSystemVersion(String targetSystemVersion) {
    this.targetSystemVersion = targetSystemVersion;
    return this;
  }

   /**
   * Get targetSystemVersion
   * @return targetSystemVersion
  **/
  @Schema(description = "")
  public String getTargetSystemVersion() {
    return targetSystemVersion;
  }

  public void setTargetSystemVersion(String targetSystemVersion) {
    this.targetSystemVersion = targetSystemVersion;
  }

  public ImportResultDTO invalidReportsNames(List<String> invalidReportsNames) {
    this.invalidReportsNames = invalidReportsNames;
    return this;
  }

  public ImportResultDTO addInvalidReportsNamesItem(String invalidReportsNamesItem) {
    if (this.invalidReportsNames == null) {
      this.invalidReportsNames = new ArrayList<String>();
    }
    this.invalidReportsNames.add(invalidReportsNamesItem);
    return this;
  }

   /**
   * Get invalidReportsNames
   * @return invalidReportsNames
  **/
  @Schema(description = "")
  public List<String> getInvalidReportsNames() {
    return invalidReportsNames;
  }

  public void setInvalidReportsNames(List<String> invalidReportsNames) {
    this.invalidReportsNames = invalidReportsNames;
  }

  public ImportResultDTO importedReportsNames(List<String> importedReportsNames) {
    this.importedReportsNames = importedReportsNames;
    return this;
  }

  public ImportResultDTO addImportedReportsNamesItem(String importedReportsNamesItem) {
    if (this.importedReportsNames == null) {
      this.importedReportsNames = new ArrayList<String>();
    }
    this.importedReportsNames.add(importedReportsNamesItem);
    return this;
  }

   /**
   * Get importedReportsNames
   * @return importedReportsNames
  **/
  @Schema(description = "")
  public List<String> getImportedReportsNames() {
    return importedReportsNames;
  }

  public void setImportedReportsNames(List<String> importedReportsNames) {
    this.importedReportsNames = importedReportsNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportResultDTO importResultDTO = (ImportResultDTO) o;
    return Objects.equals(this.currentSystemVersion, importResultDTO.currentSystemVersion) &&
        Objects.equals(this.targetSystemVersion, importResultDTO.targetSystemVersion) &&
        Objects.equals(this.invalidReportsNames, importResultDTO.invalidReportsNames) &&
        Objects.equals(this.importedReportsNames, importResultDTO.importedReportsNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSystemVersion, targetSystemVersion, invalidReportsNames, importedReportsNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportResultDTO {\n");
    
    sb.append("    currentSystemVersion: ").append(toIndentedString(currentSystemVersion)).append("\n");
    sb.append("    targetSystemVersion: ").append(toIndentedString(targetSystemVersion)).append("\n");
    sb.append("    invalidReportsNames: ").append(toIndentedString(invalidReportsNames)).append("\n");
    sb.append("    importedReportsNames: ").append(toIndentedString(importedReportsNames)).append("\n");
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
