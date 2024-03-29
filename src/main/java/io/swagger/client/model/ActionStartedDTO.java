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
 * ActionStartedDTO
 */


public class ActionStartedDTO {
  @SerializedName("actionId")
  private String actionId = null;

  @SerializedName("statusUrl")
  private String statusUrl = null;

  @SerializedName("resultUrl")
  private String resultUrl = null;

  public ActionStartedDTO actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @Schema(description = "")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public ActionStartedDTO statusUrl(String statusUrl) {
    this.statusUrl = statusUrl;
    return this;
  }

   /**
   * Get statusUrl
   * @return statusUrl
  **/
  @Schema(description = "")
  public String getStatusUrl() {
    return statusUrl;
  }

  public void setStatusUrl(String statusUrl) {
    this.statusUrl = statusUrl;
  }

  public ActionStartedDTO resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

   /**
   * Get resultUrl
   * @return resultUrl
  **/
  @Schema(description = "")
  public String getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionStartedDTO actionStartedDTO = (ActionStartedDTO) o;
    return Objects.equals(this.actionId, actionStartedDTO.actionId) &&
        Objects.equals(this.statusUrl, actionStartedDTO.statusUrl) &&
        Objects.equals(this.resultUrl, actionStartedDTO.resultUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, statusUrl, resultUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionStartedDTO {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
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
