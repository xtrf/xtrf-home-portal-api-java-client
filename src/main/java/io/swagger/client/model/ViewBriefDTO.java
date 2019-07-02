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
import io.swagger.client.model.AccessDTO;
import io.swagger.client.model.LastModificationDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ViewBriefDTO
 */


public class ViewBriefDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("current")
  private Boolean current = null;

  @SerializedName("mine")
  private Boolean mine = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("access")
  private AccessDTO access = null;

  @SerializedName("lastModification")
  private LastModificationDTO lastModification = null;

  public ViewBriefDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ViewBriefDTO name(String name) {
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

  public ViewBriefDTO current(Boolean current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @Schema(description = "")
  public Boolean isCurrent() {
    return current;
  }

  public void setCurrent(Boolean current) {
    this.current = current;
  }

  public ViewBriefDTO mine(Boolean mine) {
    this.mine = mine;
    return this;
  }

   /**
   * Get mine
   * @return mine
  **/
  @Schema(description = "")
  public Boolean isMine() {
    return mine;
  }

  public void setMine(Boolean mine) {
    this.mine = mine;
  }

  public ViewBriefDTO owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ViewBriefDTO access(AccessDTO access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @Schema(description = "")
  public AccessDTO getAccess() {
    return access;
  }

  public void setAccess(AccessDTO access) {
    this.access = access;
  }

  public ViewBriefDTO lastModification(LastModificationDTO lastModification) {
    this.lastModification = lastModification;
    return this;
  }

   /**
   * Get lastModification
   * @return lastModification
  **/
  @Schema(description = "")
  public LastModificationDTO getLastModification() {
    return lastModification;
  }

  public void setLastModification(LastModificationDTO lastModification) {
    this.lastModification = lastModification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewBriefDTO viewBriefDTO = (ViewBriefDTO) o;
    return Objects.equals(this.id, viewBriefDTO.id) &&
        Objects.equals(this.name, viewBriefDTO.name) &&
        Objects.equals(this.current, viewBriefDTO.current) &&
        Objects.equals(this.mine, viewBriefDTO.mine) &&
        Objects.equals(this.owner, viewBriefDTO.owner) &&
        Objects.equals(this.access, viewBriefDTO.access) &&
        Objects.equals(this.lastModification, viewBriefDTO.lastModification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, current, mine, owner, access, lastModification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewBriefDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    mine: ").append(toIndentedString(mine)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    lastModification: ").append(toIndentedString(lastModification)).append("\n");
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
