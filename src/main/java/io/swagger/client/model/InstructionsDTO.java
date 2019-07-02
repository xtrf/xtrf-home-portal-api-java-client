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
 * InstructionsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class InstructionsDTO {
  @SerializedName("fromCustomer")
  private String fromCustomer = null;

  @SerializedName("forProvider")
  private String forProvider = null;

  @SerializedName("internal")
  private String internal = null;

  @SerializedName("paymentNoteForCustomer")
  private String paymentNoteForCustomer = null;

  @SerializedName("notes")
  private String notes = null;

  public InstructionsDTO fromCustomer(String fromCustomer) {
    this.fromCustomer = fromCustomer;
    return this;
  }

   /**
   * Get fromCustomer
   * @return fromCustomer
  **/
  @Schema(description = "")
  public String getFromCustomer() {
    return fromCustomer;
  }

  public void setFromCustomer(String fromCustomer) {
    this.fromCustomer = fromCustomer;
  }

  public InstructionsDTO forProvider(String forProvider) {
    this.forProvider = forProvider;
    return this;
  }

   /**
   * Get forProvider
   * @return forProvider
  **/
  @Schema(description = "")
  public String getForProvider() {
    return forProvider;
  }

  public void setForProvider(String forProvider) {
    this.forProvider = forProvider;
  }

  public InstructionsDTO internal(String internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @Schema(description = "")
  public String getInternal() {
    return internal;
  }

  public void setInternal(String internal) {
    this.internal = internal;
  }

  public InstructionsDTO paymentNoteForCustomer(String paymentNoteForCustomer) {
    this.paymentNoteForCustomer = paymentNoteForCustomer;
    return this;
  }

   /**
   * Get paymentNoteForCustomer
   * @return paymentNoteForCustomer
  **/
  @Schema(description = "")
  public String getPaymentNoteForCustomer() {
    return paymentNoteForCustomer;
  }

  public void setPaymentNoteForCustomer(String paymentNoteForCustomer) {
    this.paymentNoteForCustomer = paymentNoteForCustomer;
  }

  public InstructionsDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructionsDTO instructionsDTO = (InstructionsDTO) o;
    return Objects.equals(this.fromCustomer, instructionsDTO.fromCustomer) &&
        Objects.equals(this.forProvider, instructionsDTO.forProvider) &&
        Objects.equals(this.internal, instructionsDTO.internal) &&
        Objects.equals(this.paymentNoteForCustomer, instructionsDTO.paymentNoteForCustomer) &&
        Objects.equals(this.notes, instructionsDTO.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCustomer, forProvider, internal, paymentNoteForCustomer, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructionsDTO {\n");
    
    sb.append("    fromCustomer: ").append(toIndentedString(fromCustomer)).append("\n");
    sb.append("    forProvider: ").append(toIndentedString(forProvider)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    paymentNoteForCustomer: ").append(toIndentedString(paymentNoteForCustomer)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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