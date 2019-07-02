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
 * CustomerInvoiceCreateDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class CustomerInvoiceCreateDTO {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FINAL("FINAL"),
    DRAFT("DRAFT");

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

  @SerializedName("tasksIds")
  private List<Long> tasksIds = null;

  @SerializedName("prepaymentsIds")
  private List<Long> prepaymentsIds = null;

  public CustomerInvoiceCreateDTO type(TypeEnum type) {
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

  public CustomerInvoiceCreateDTO tasksIds(List<Long> tasksIds) {
    this.tasksIds = tasksIds;
    return this;
  }

  public CustomerInvoiceCreateDTO addTasksIdsItem(Long tasksIdsItem) {
    if (this.tasksIds == null) {
      this.tasksIds = new ArrayList<Long>();
    }
    this.tasksIds.add(tasksIdsItem);
    return this;
  }

   /**
   * Get tasksIds
   * @return tasksIds
  **/
  @Schema(description = "")
  public List<Long> getTasksIds() {
    return tasksIds;
  }

  public void setTasksIds(List<Long> tasksIds) {
    this.tasksIds = tasksIds;
  }

  public CustomerInvoiceCreateDTO prepaymentsIds(List<Long> prepaymentsIds) {
    this.prepaymentsIds = prepaymentsIds;
    return this;
  }

  public CustomerInvoiceCreateDTO addPrepaymentsIdsItem(Long prepaymentsIdsItem) {
    if (this.prepaymentsIds == null) {
      this.prepaymentsIds = new ArrayList<Long>();
    }
    this.prepaymentsIds.add(prepaymentsIdsItem);
    return this;
  }

   /**
   * Get prepaymentsIds
   * @return prepaymentsIds
  **/
  @Schema(description = "")
  public List<Long> getPrepaymentsIds() {
    return prepaymentsIds;
  }

  public void setPrepaymentsIds(List<Long> prepaymentsIds) {
    this.prepaymentsIds = prepaymentsIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInvoiceCreateDTO customerInvoiceCreateDTO = (CustomerInvoiceCreateDTO) o;
    return Objects.equals(this.type, customerInvoiceCreateDTO.type) &&
        Objects.equals(this.tasksIds, customerInvoiceCreateDTO.tasksIds) &&
        Objects.equals(this.prepaymentsIds, customerInvoiceCreateDTO.prepaymentsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tasksIds, prepaymentsIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceCreateDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tasksIds: ").append(toIndentedString(tasksIds)).append("\n");
    sb.append("    prepaymentsIds: ").append(toIndentedString(prepaymentsIds)).append("\n");
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