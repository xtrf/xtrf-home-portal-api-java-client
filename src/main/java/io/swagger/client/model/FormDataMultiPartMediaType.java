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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * FormDataMultiPartMediaType
 */


public class FormDataMultiPartMediaType {
  @SerializedName("type")
  private String type = null;

  @SerializedName("subtype")
  private String subtype = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("wildcardType")
  private Boolean wildcardType = null;

  @SerializedName("wildcardSubtype")
  private Boolean wildcardSubtype = null;

  public FormDataMultiPartMediaType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FormDataMultiPartMediaType subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @Schema(description = "")
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public FormDataMultiPartMediaType parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public FormDataMultiPartMediaType putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public FormDataMultiPartMediaType wildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
    return this;
  }

   /**
   * Get wildcardType
   * @return wildcardType
  **/
  @Schema(description = "")
  public Boolean isWildcardType() {
    return wildcardType;
  }

  public void setWildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
  }

  public FormDataMultiPartMediaType wildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
    return this;
  }

   /**
   * Get wildcardSubtype
   * @return wildcardSubtype
  **/
  @Schema(description = "")
  public Boolean isWildcardSubtype() {
    return wildcardSubtype;
  }

  public void setWildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataMultiPartMediaType formDataMultiPartMediaType = (FormDataMultiPartMediaType) o;
    return Objects.equals(this.type, formDataMultiPartMediaType.type) &&
        Objects.equals(this.subtype, formDataMultiPartMediaType.subtype) &&
        Objects.equals(this.parameters, formDataMultiPartMediaType.parameters) &&
        Objects.equals(this.wildcardType, formDataMultiPartMediaType.wildcardType) &&
        Objects.equals(this.wildcardSubtype, formDataMultiPartMediaType.wildcardSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, parameters, wildcardType, wildcardSubtype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataMultiPartMediaType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
    sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
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
