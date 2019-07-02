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
 * origin of a customer (ie. recomendation from another customer)
 */
@Schema(description = "origin of a customer (ie. recomendation from another customer)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class LeadSourceDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  @SerializedName("availableForProvider")
  private Boolean availableForProvider = null;

  @SerializedName("availableForCustomer")
  private Boolean availableForCustomer = null;

  @SerializedName("default")
  private Boolean _default = null;

  public LeadSourceDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * internal identifier
   * @return id
  **/
  @Schema(description = "internal identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LeadSourceDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * localised name (formatted in the current user&#x27;s locale)
   * @return name
  **/
  @Schema(description = "localised name (formatted in the current user's locale)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadSourceDTO active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * should this value be available on the XTRF selection lists
   * @return active
  **/
  @Schema(description = "should this value be available on the XTRF selection lists")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LeadSourceDTO preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * should this value be available on the top of XTRF selection lists, in the Preferred section
   * @return preferred
  **/
  @Schema(description = "should this value be available on the top of XTRF selection lists, in the Preferred section")
  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public LeadSourceDTO availableForProvider(Boolean availableForProvider) {
    this.availableForProvider = availableForProvider;
    return this;
  }

   /**
   * should be available for provider
   * @return availableForProvider
  **/
  @Schema(description = "should be available for provider")
  public Boolean isAvailableForProvider() {
    return availableForProvider;
  }

  public void setAvailableForProvider(Boolean availableForProvider) {
    this.availableForProvider = availableForProvider;
  }

  public LeadSourceDTO availableForCustomer(Boolean availableForCustomer) {
    this.availableForCustomer = availableForCustomer;
    return this;
  }

   /**
   * should be available for customer
   * @return availableForCustomer
  **/
  @Schema(description = "should be available for customer")
  public Boolean isAvailableForCustomer() {
    return availableForCustomer;
  }

  public void setAvailableForCustomer(Boolean availableForCustomer) {
    this.availableForCustomer = availableForCustomer;
  }

  public LeadSourceDTO _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadSourceDTO leadSourceDTO = (LeadSourceDTO) o;
    return Objects.equals(this.id, leadSourceDTO.id) &&
        Objects.equals(this.name, leadSourceDTO.name) &&
        Objects.equals(this.active, leadSourceDTO.active) &&
        Objects.equals(this.preferred, leadSourceDTO.preferred) &&
        Objects.equals(this.availableForProvider, leadSourceDTO.availableForProvider) &&
        Objects.equals(this.availableForCustomer, leadSourceDTO.availableForCustomer) &&
        Objects.equals(this._default, leadSourceDTO._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, preferred, availableForProvider, availableForCustomer, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSourceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    availableForProvider: ").append(toIndentedString(availableForProvider)).append("\n");
    sb.append("    availableForCustomer: ").append(toIndentedString(availableForCustomer)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
