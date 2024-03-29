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
import io.swagger.client.model.LanguageCombinationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FileCategorizationDto
 */


public class FileCategorizationDto {
  @SerializedName("category")
  private String category = null;

  @SerializedName("languageIds")
  private List<Long> languageIds = null;

  @SerializedName("languageCombinationIds")
  private List<LanguageCombinationDto> languageCombinationIds = null;

  @SerializedName("fileId")
  private String fileId = null;

  public FileCategorizationDto category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public FileCategorizationDto languageIds(List<Long> languageIds) {
    this.languageIds = languageIds;
    return this;
  }

  public FileCategorizationDto addLanguageIdsItem(Long languageIdsItem) {
    if (this.languageIds == null) {
      this.languageIds = new ArrayList<Long>();
    }
    this.languageIds.add(languageIdsItem);
    return this;
  }

   /**
   * Get languageIds
   * @return languageIds
  **/
  @Schema(description = "")
  public List<Long> getLanguageIds() {
    return languageIds;
  }

  public void setLanguageIds(List<Long> languageIds) {
    this.languageIds = languageIds;
  }

  public FileCategorizationDto languageCombinationIds(List<LanguageCombinationDto> languageCombinationIds) {
    this.languageCombinationIds = languageCombinationIds;
    return this;
  }

  public FileCategorizationDto addLanguageCombinationIdsItem(LanguageCombinationDto languageCombinationIdsItem) {
    if (this.languageCombinationIds == null) {
      this.languageCombinationIds = new ArrayList<LanguageCombinationDto>();
    }
    this.languageCombinationIds.add(languageCombinationIdsItem);
    return this;
  }

   /**
   * Get languageCombinationIds
   * @return languageCombinationIds
  **/
  @Schema(description = "")
  public List<LanguageCombinationDto> getLanguageCombinationIds() {
    return languageCombinationIds;
  }

  public void setLanguageCombinationIds(List<LanguageCombinationDto> languageCombinationIds) {
    this.languageCombinationIds = languageCombinationIds;
  }

  public FileCategorizationDto fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @Schema(description = "")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCategorizationDto fileCategorizationDto = (FileCategorizationDto) o;
    return Objects.equals(this.category, fileCategorizationDto.category) &&
        Objects.equals(this.languageIds, fileCategorizationDto.languageIds) &&
        Objects.equals(this.languageCombinationIds, fileCategorizationDto.languageCombinationIds) &&
        Objects.equals(this.fileId, fileCategorizationDto.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, languageIds, languageCombinationIds, fileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCategorizationDto {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    languageCombinationIds: ").append(toIndentedString(languageCombinationIds)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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
