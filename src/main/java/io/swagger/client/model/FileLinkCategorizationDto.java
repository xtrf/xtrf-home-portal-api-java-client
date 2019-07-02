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
 * FileLinkCategorizationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class FileLinkCategorizationDto {
  @SerializedName("category")
  private String category = null;

  @SerializedName("languageIds")
  private List<Long> languageIds = null;

  @SerializedName("languageCombinationIds")
  private List<LanguageCombinationDto> languageCombinationIds = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("filename")
  private String filename = null;

  public FileLinkCategorizationDto category(String category) {
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

  public FileLinkCategorizationDto languageIds(List<Long> languageIds) {
    this.languageIds = languageIds;
    return this;
  }

  public FileLinkCategorizationDto addLanguageIdsItem(Long languageIdsItem) {
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

  public FileLinkCategorizationDto languageCombinationIds(List<LanguageCombinationDto> languageCombinationIds) {
    this.languageCombinationIds = languageCombinationIds;
    return this;
  }

  public FileLinkCategorizationDto addLanguageCombinationIdsItem(LanguageCombinationDto languageCombinationIdsItem) {
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

  public FileLinkCategorizationDto url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public FileLinkCategorizationDto filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @Schema(description = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLinkCategorizationDto fileLinkCategorizationDto = (FileLinkCategorizationDto) o;
    return Objects.equals(this.category, fileLinkCategorizationDto.category) &&
        Objects.equals(this.languageIds, fileLinkCategorizationDto.languageIds) &&
        Objects.equals(this.languageCombinationIds, fileLinkCategorizationDto.languageCombinationIds) &&
        Objects.equals(this.url, fileLinkCategorizationDto.url) &&
        Objects.equals(this.filename, fileLinkCategorizationDto.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, languageIds, languageCombinationIds, url, filename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLinkCategorizationDto {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    languageCombinationIds: ").append(toIndentedString(languageCombinationIds)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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