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
import io.swagger.client.model.ChargeLanguageCombinationDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ReceivableDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class ReceivableDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("jobTypeId")
  private Long jobTypeId = null;

  @SerializedName("languageCombination")
  private ChargeLanguageCombinationDTO languageCombination = null;

  @SerializedName("languageCombinationIdNumber")
  private String languageCombinationIdNumber = null;

  /**
   * Gets or Sets rateOrigin
   */
  @JsonAdapter(RateOriginEnum.Adapter.class)
  public enum RateOriginEnum {
    PRICE_PROFILE("PRICE_PROFILE"),
    PRICE_LIST("PRICE_LIST"),
    FILLED_MANUALLY("FILLED_MANUALLY"),
    AUTOCALCULATED("AUTOCALCULATED");

    private String value;

    RateOriginEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RateOriginEnum fromValue(String text) {
      for (RateOriginEnum b : RateOriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RateOriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RateOriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RateOriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RateOriginEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("rateOrigin")
  private RateOriginEnum rateOrigin = null;

  @SerializedName("currencyId")
  private Long currencyId = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("invoiceId")
  private String invoiceId = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SIMPLE("SIMPLE"),
    CAT("CAT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("calculationUnitId")
  private Long calculationUnitId = null;

  @SerializedName("ignoreMinimumCharge")
  private Boolean ignoreMinimumCharge = null;

  @SerializedName("minimumCharge")
  private BigDecimal minimumCharge = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("rate")
  private BigDecimal rate = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  public ReceivableDTO id(Long id) {
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

  public ReceivableDTO jobTypeId(Long jobTypeId) {
    this.jobTypeId = jobTypeId;
    return this;
  }

   /**
   * Get jobTypeId
   * @return jobTypeId
  **/
  @Schema(description = "")
  public Long getJobTypeId() {
    return jobTypeId;
  }

  public void setJobTypeId(Long jobTypeId) {
    this.jobTypeId = jobTypeId;
  }

  public ReceivableDTO languageCombination(ChargeLanguageCombinationDTO languageCombination) {
    this.languageCombination = languageCombination;
    return this;
  }

   /**
   * Get languageCombination
   * @return languageCombination
  **/
  @Schema(description = "")
  public ChargeLanguageCombinationDTO getLanguageCombination() {
    return languageCombination;
  }

  public void setLanguageCombination(ChargeLanguageCombinationDTO languageCombination) {
    this.languageCombination = languageCombination;
  }

  public ReceivableDTO languageCombinationIdNumber(String languageCombinationIdNumber) {
    this.languageCombinationIdNumber = languageCombinationIdNumber;
    return this;
  }

   /**
   * Get languageCombinationIdNumber
   * @return languageCombinationIdNumber
  **/
  @Schema(description = "")
  public String getLanguageCombinationIdNumber() {
    return languageCombinationIdNumber;
  }

  public void setLanguageCombinationIdNumber(String languageCombinationIdNumber) {
    this.languageCombinationIdNumber = languageCombinationIdNumber;
  }

  public ReceivableDTO rateOrigin(RateOriginEnum rateOrigin) {
    this.rateOrigin = rateOrigin;
    return this;
  }

   /**
   * Get rateOrigin
   * @return rateOrigin
  **/
  @Schema(description = "")
  public RateOriginEnum getRateOrigin() {
    return rateOrigin;
  }

  public void setRateOrigin(RateOriginEnum rateOrigin) {
    this.rateOrigin = rateOrigin;
  }

  public ReceivableDTO currencyId(Long currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @Schema(description = "")
  public Long getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Long currencyId) {
    this.currencyId = currencyId;
  }

  public ReceivableDTO total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public ReceivableDTO invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @Schema(description = "")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public ReceivableDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ReceivableDTO calculationUnitId(Long calculationUnitId) {
    this.calculationUnitId = calculationUnitId;
    return this;
  }

   /**
   * Get calculationUnitId
   * @return calculationUnitId
  **/
  @Schema(description = "")
  public Long getCalculationUnitId() {
    return calculationUnitId;
  }

  public void setCalculationUnitId(Long calculationUnitId) {
    this.calculationUnitId = calculationUnitId;
  }

  public ReceivableDTO ignoreMinimumCharge(Boolean ignoreMinimumCharge) {
    this.ignoreMinimumCharge = ignoreMinimumCharge;
    return this;
  }

   /**
   * Get ignoreMinimumCharge
   * @return ignoreMinimumCharge
  **/
  @Schema(description = "")
  public Boolean isIgnoreMinimumCharge() {
    return ignoreMinimumCharge;
  }

  public void setIgnoreMinimumCharge(Boolean ignoreMinimumCharge) {
    this.ignoreMinimumCharge = ignoreMinimumCharge;
  }

  public ReceivableDTO minimumCharge(BigDecimal minimumCharge) {
    this.minimumCharge = minimumCharge;
    return this;
  }

   /**
   * Get minimumCharge
   * @return minimumCharge
  **/
  @Schema(description = "")
  public BigDecimal getMinimumCharge() {
    return minimumCharge;
  }

  public void setMinimumCharge(BigDecimal minimumCharge) {
    this.minimumCharge = minimumCharge;
  }

  public ReceivableDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReceivableDTO rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(description = "")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public ReceivableDTO quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivableDTO receivableDTO = (ReceivableDTO) o;
    return Objects.equals(this.id, receivableDTO.id) &&
        Objects.equals(this.jobTypeId, receivableDTO.jobTypeId) &&
        Objects.equals(this.languageCombination, receivableDTO.languageCombination) &&
        Objects.equals(this.languageCombinationIdNumber, receivableDTO.languageCombinationIdNumber) &&
        Objects.equals(this.rateOrigin, receivableDTO.rateOrigin) &&
        Objects.equals(this.currencyId, receivableDTO.currencyId) &&
        Objects.equals(this.total, receivableDTO.total) &&
        Objects.equals(this.invoiceId, receivableDTO.invoiceId) &&
        Objects.equals(this.type, receivableDTO.type) &&
        Objects.equals(this.calculationUnitId, receivableDTO.calculationUnitId) &&
        Objects.equals(this.ignoreMinimumCharge, receivableDTO.ignoreMinimumCharge) &&
        Objects.equals(this.minimumCharge, receivableDTO.minimumCharge) &&
        Objects.equals(this.description, receivableDTO.description) &&
        Objects.equals(this.rate, receivableDTO.rate) &&
        Objects.equals(this.quantity, receivableDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobTypeId, languageCombination, languageCombinationIdNumber, rateOrigin, currencyId, total, invoiceId, type, calculationUnitId, ignoreMinimumCharge, minimumCharge, description, rate, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivableDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
    sb.append("    languageCombination: ").append(toIndentedString(languageCombination)).append("\n");
    sb.append("    languageCombinationIdNumber: ").append(toIndentedString(languageCombinationIdNumber)).append("\n");
    sb.append("    rateOrigin: ").append(toIndentedString(rateOrigin)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    calculationUnitId: ").append(toIndentedString(calculationUnitId)).append("\n");
    sb.append("    ignoreMinimumCharge: ").append(toIndentedString(ignoreMinimumCharge)).append("\n");
    sb.append("    minimumCharge: ").append(toIndentedString(minimumCharge)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
