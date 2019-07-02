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
 * emails
 */
@Schema(description = "emails")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class CustomerContactEmailsDTO {
  @SerializedName("primary")
  private String primary = null;

  @SerializedName("cc")
  private List<String> cc = null;

  @SerializedName("additional")
  private List<String> additional = null;

  public CustomerContactEmailsDTO primary(String primary) {
    this.primary = primary;
    return this;
  }

   /**
   * primary e-mail
   * @return primary
  **/
  @Schema(required = true, description = "primary e-mail")
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public CustomerContactEmailsDTO cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public CustomerContactEmailsDTO addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * e-mails which will be included in the CC list
   * @return cc
  **/
  @Schema(description = "e-mails which will be included in the CC list")
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public CustomerContactEmailsDTO additional(List<String> additional) {
    this.additional = additional;
    return this;
  }

  public CustomerContactEmailsDTO addAdditionalItem(String additionalItem) {
    if (this.additional == null) {
      this.additional = new ArrayList<String>();
    }
    this.additional.add(additionalItem);
    return this;
  }

   /**
   * additional e-mails addresses
   * @return additional
  **/
  @Schema(description = "additional e-mails addresses")
  public List<String> getAdditional() {
    return additional;
  }

  public void setAdditional(List<String> additional) {
    this.additional = additional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContactEmailsDTO customerContactEmailsDTO = (CustomerContactEmailsDTO) o;
    return Objects.equals(this.primary, customerContactEmailsDTO.primary) &&
        Objects.equals(this.cc, customerContactEmailsDTO.cc) &&
        Objects.equals(this.additional, customerContactEmailsDTO.additional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, cc, additional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContactEmailsDTO {\n");
    
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
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