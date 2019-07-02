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
import io.swagger.client.model.LanguageCombinationDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CompetenciesDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class CompetenciesDTO {
  @SerializedName("languageCombinations")
  private List<LanguageCombinationDTO> languageCombinations = null;

  public CompetenciesDTO languageCombinations(List<LanguageCombinationDTO> languageCombinations) {
    this.languageCombinations = languageCombinations;
    return this;
  }

  public CompetenciesDTO addLanguageCombinationsItem(LanguageCombinationDTO languageCombinationsItem) {
    if (this.languageCombinations == null) {
      this.languageCombinations = new ArrayList<LanguageCombinationDTO>();
    }
    this.languageCombinations.add(languageCombinationsItem);
    return this;
  }

   /**
   * Get languageCombinations
   * @return languageCombinations
  **/
  @Schema(description = "")
  public List<LanguageCombinationDTO> getLanguageCombinations() {
    return languageCombinations;
  }

  public void setLanguageCombinations(List<LanguageCombinationDTO> languageCombinations) {
    this.languageCombinations = languageCombinations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetenciesDTO competenciesDTO = (CompetenciesDTO) o;
    return Objects.equals(this.languageCombinations, competenciesDTO.languageCombinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCombinations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetenciesDTO {\n");
    
    sb.append("    languageCombinations: ").append(toIndentedString(languageCombinations)).append("\n");
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
