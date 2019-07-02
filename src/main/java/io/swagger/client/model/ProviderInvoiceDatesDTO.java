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
import io.swagger.client.model.TimeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProviderInvoiceDatesDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class ProviderInvoiceDatesDTO {
  @SerializedName("draftDate")
  private TimeDTO draftDate = null;

  @SerializedName("finalDate")
  private TimeDTO finalDate = null;

  @SerializedName("paymentDueDate")
  private TimeDTO paymentDueDate = null;

  @SerializedName("invoiceUploadedDate")
  private TimeDTO invoiceUploadedDate = null;

  public ProviderInvoiceDatesDTO draftDate(TimeDTO draftDate) {
    this.draftDate = draftDate;
    return this;
  }

   /**
   * Get draftDate
   * @return draftDate
  **/
  @Schema(description = "")
  public TimeDTO getDraftDate() {
    return draftDate;
  }

  public void setDraftDate(TimeDTO draftDate) {
    this.draftDate = draftDate;
  }

  public ProviderInvoiceDatesDTO finalDate(TimeDTO finalDate) {
    this.finalDate = finalDate;
    return this;
  }

   /**
   * Get finalDate
   * @return finalDate
  **/
  @Schema(description = "")
  public TimeDTO getFinalDate() {
    return finalDate;
  }

  public void setFinalDate(TimeDTO finalDate) {
    this.finalDate = finalDate;
  }

  public ProviderInvoiceDatesDTO paymentDueDate(TimeDTO paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }

   /**
   * Get paymentDueDate
   * @return paymentDueDate
  **/
  @Schema(description = "")
  public TimeDTO getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(TimeDTO paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }

  public ProviderInvoiceDatesDTO invoiceUploadedDate(TimeDTO invoiceUploadedDate) {
    this.invoiceUploadedDate = invoiceUploadedDate;
    return this;
  }

   /**
   * Get invoiceUploadedDate
   * @return invoiceUploadedDate
  **/
  @Schema(description = "")
  public TimeDTO getInvoiceUploadedDate() {
    return invoiceUploadedDate;
  }

  public void setInvoiceUploadedDate(TimeDTO invoiceUploadedDate) {
    this.invoiceUploadedDate = invoiceUploadedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderInvoiceDatesDTO providerInvoiceDatesDTO = (ProviderInvoiceDatesDTO) o;
    return Objects.equals(this.draftDate, providerInvoiceDatesDTO.draftDate) &&
        Objects.equals(this.finalDate, providerInvoiceDatesDTO.finalDate) &&
        Objects.equals(this.paymentDueDate, providerInvoiceDatesDTO.paymentDueDate) &&
        Objects.equals(this.invoiceUploadedDate, providerInvoiceDatesDTO.invoiceUploadedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftDate, finalDate, paymentDueDate, invoiceUploadedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderInvoiceDatesDTO {\n");
    
    sb.append("    draftDate: ").append(toIndentedString(draftDate)).append("\n");
    sb.append("    finalDate: ").append(toIndentedString(finalDate)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    invoiceUploadedDate: ").append(toIndentedString(invoiceUploadedDate)).append("\n");
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