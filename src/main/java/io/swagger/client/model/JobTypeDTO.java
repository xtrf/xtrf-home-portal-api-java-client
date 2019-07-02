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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * JobTypeDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class JobTypeDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  @SerializedName("filesNeeded")
  private Boolean filesNeeded = null;

  @SerializedName("providedByClient")
  private Boolean providedByClient = null;

  /**
   * Gets or Sets relationToLanguage
   */
  @JsonAdapter(RelationToLanguageEnum.Adapter.class)
  public enum RelationToLanguageEnum {
    LANGUAGE_COMBINATION_RELATED("LANGUAGE_COMBINATION_RELATED"),
    SOURCE_LANGUAGE_RELATED_ONLY("SOURCE_LANGUAGE_RELATED_ONLY"),
    TARGET_LANGUAGE_RELATED_ONLY("TARGET_LANGUAGE_RELATED_ONLY"),
    LANGUAGE_INDEPENDENT("LANGUAGE_INDEPENDENT");

    private String value;

    RelationToLanguageEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RelationToLanguageEnum fromValue(String text) {
      for (RelationToLanguageEnum b : RelationToLanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RelationToLanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationToLanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationToLanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RelationToLanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("relationToLanguage")
  private RelationToLanguageEnum relationToLanguage = null;

  @SerializedName("calculationUnitIds")
  private List<Long> calculationUnitIds = null;

  @SerializedName("vendorProductivity")
  private BigDecimal vendorProductivity = null;

  @SerializedName("vendorProductivityCalculationUnitId")
  private Long vendorProductivityCalculationUnitId = null;

  @SerializedName("default")
  private Boolean _default = null;

  public JobTypeDTO id(Long id) {
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

  public JobTypeDTO name(String name) {
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

  public JobTypeDTO active(Boolean active) {
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

  public JobTypeDTO preferred(Boolean preferred) {
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

  public JobTypeDTO filesNeeded(Boolean filesNeeded) {
    this.filesNeeded = filesNeeded;
    return this;
  }

   /**
   * Get filesNeeded
   * @return filesNeeded
  **/
  @Schema(description = "")
  public Boolean isFilesNeeded() {
    return filesNeeded;
  }

  public void setFilesNeeded(Boolean filesNeeded) {
    this.filesNeeded = filesNeeded;
  }

  public JobTypeDTO providedByClient(Boolean providedByClient) {
    this.providedByClient = providedByClient;
    return this;
  }

   /**
   * Get providedByClient
   * @return providedByClient
  **/
  @Schema(description = "")
  public Boolean isProvidedByClient() {
    return providedByClient;
  }

  public void setProvidedByClient(Boolean providedByClient) {
    this.providedByClient = providedByClient;
  }

  public JobTypeDTO relationToLanguage(RelationToLanguageEnum relationToLanguage) {
    this.relationToLanguage = relationToLanguage;
    return this;
  }

   /**
   * Get relationToLanguage
   * @return relationToLanguage
  **/
  @Schema(description = "")
  public RelationToLanguageEnum getRelationToLanguage() {
    return relationToLanguage;
  }

  public void setRelationToLanguage(RelationToLanguageEnum relationToLanguage) {
    this.relationToLanguage = relationToLanguage;
  }

  public JobTypeDTO calculationUnitIds(List<Long> calculationUnitIds) {
    this.calculationUnitIds = calculationUnitIds;
    return this;
  }

  public JobTypeDTO addCalculationUnitIdsItem(Long calculationUnitIdsItem) {
    if (this.calculationUnitIds == null) {
      this.calculationUnitIds = new ArrayList<Long>();
    }
    this.calculationUnitIds.add(calculationUnitIdsItem);
    return this;
  }

   /**
   * Get calculationUnitIds
   * @return calculationUnitIds
  **/
  @Schema(description = "")
  public List<Long> getCalculationUnitIds() {
    return calculationUnitIds;
  }

  public void setCalculationUnitIds(List<Long> calculationUnitIds) {
    this.calculationUnitIds = calculationUnitIds;
  }

  public JobTypeDTO vendorProductivity(BigDecimal vendorProductivity) {
    this.vendorProductivity = vendorProductivity;
    return this;
  }

   /**
   * Get vendorProductivity
   * @return vendorProductivity
  **/
  @Schema(description = "")
  public BigDecimal getVendorProductivity() {
    return vendorProductivity;
  }

  public void setVendorProductivity(BigDecimal vendorProductivity) {
    this.vendorProductivity = vendorProductivity;
  }

  public JobTypeDTO vendorProductivityCalculationUnitId(Long vendorProductivityCalculationUnitId) {
    this.vendorProductivityCalculationUnitId = vendorProductivityCalculationUnitId;
    return this;
  }

   /**
   * Get vendorProductivityCalculationUnitId
   * @return vendorProductivityCalculationUnitId
  **/
  @Schema(description = "")
  public Long getVendorProductivityCalculationUnitId() {
    return vendorProductivityCalculationUnitId;
  }

  public void setVendorProductivityCalculationUnitId(Long vendorProductivityCalculationUnitId) {
    this.vendorProductivityCalculationUnitId = vendorProductivityCalculationUnitId;
  }

  public JobTypeDTO _default(Boolean _default) {
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
    JobTypeDTO jobTypeDTO = (JobTypeDTO) o;
    return Objects.equals(this.id, jobTypeDTO.id) &&
        Objects.equals(this.name, jobTypeDTO.name) &&
        Objects.equals(this.active, jobTypeDTO.active) &&
        Objects.equals(this.preferred, jobTypeDTO.preferred) &&
        Objects.equals(this.filesNeeded, jobTypeDTO.filesNeeded) &&
        Objects.equals(this.providedByClient, jobTypeDTO.providedByClient) &&
        Objects.equals(this.relationToLanguage, jobTypeDTO.relationToLanguage) &&
        Objects.equals(this.calculationUnitIds, jobTypeDTO.calculationUnitIds) &&
        Objects.equals(this.vendorProductivity, jobTypeDTO.vendorProductivity) &&
        Objects.equals(this.vendorProductivityCalculationUnitId, jobTypeDTO.vendorProductivityCalculationUnitId) &&
        Objects.equals(this._default, jobTypeDTO._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, preferred, filesNeeded, providedByClient, relationToLanguage, calculationUnitIds, vendorProductivity, vendorProductivityCalculationUnitId, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTypeDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    filesNeeded: ").append(toIndentedString(filesNeeded)).append("\n");
    sb.append("    providedByClient: ").append(toIndentedString(providedByClient)).append("\n");
    sb.append("    relationToLanguage: ").append(toIndentedString(relationToLanguage)).append("\n");
    sb.append("    calculationUnitIds: ").append(toIndentedString(calculationUnitIds)).append("\n");
    sb.append("    vendorProductivity: ").append(toIndentedString(vendorProductivity)).append("\n");
    sb.append("    vendorProductivityCalculationUnitId: ").append(toIndentedString(vendorProductivityCalculationUnitId)).append("\n");
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