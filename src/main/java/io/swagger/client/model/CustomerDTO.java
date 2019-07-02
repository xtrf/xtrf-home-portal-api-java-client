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
import io.swagger.client.model.AddressDTO;
import io.swagger.client.model.ContactDTO;
import io.swagger.client.model.CustomFieldDTO;
import io.swagger.client.model.CustomerAccountingDTO;
import io.swagger.client.model.CustomerPersonDTO;
import io.swagger.client.model.CustomerResponsiblePersonsDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomerDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-02T16:14:58.802Z[GMT]")
public class CustomerDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("idNumber")
  private String idNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("billingAddress")
  private AddressDTO billingAddress = null;

  @SerializedName("correspondenceAddress")
  private AddressDTO correspondenceAddress = null;

  @SerializedName("contact")
  private ContactDTO contact = null;

  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("leadSourceId")
  private Long leadSourceId = null;

  @SerializedName("customFields")
  private List<CustomFieldDTO> customFields = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    POTENTIAL("POTENTIAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("responsiblePersons")
  private CustomerResponsiblePersonsDTO responsiblePersons = null;

  @SerializedName("accounting")
  private CustomerAccountingDTO accounting = null;

  @SerializedName("contractNumber")
  private String contractNumber = null;

  @SerializedName("salesNotes")
  private String salesNotes = null;

  @SerializedName("accountOnCustomerServer")
  private String accountOnCustomerServer = null;

  @SerializedName("persons")
  private List<CustomerPersonDTO> persons = null;

  @SerializedName("categoriesIds")
  private List<Long> categoriesIds = null;

  @SerializedName("industriesIds")
  private List<Long> industriesIds = null;

  public CustomerDTO id(Long id) {
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

  public CustomerDTO idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @Schema(description = "")
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public CustomerDTO name(String name) {
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

  public CustomerDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CustomerDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CustomerDTO billingAddress(AddressDTO billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @Schema(description = "")
  public AddressDTO getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressDTO billingAddress) {
    this.billingAddress = billingAddress;
  }

  public CustomerDTO correspondenceAddress(AddressDTO correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

   /**
   * Get correspondenceAddress
   * @return correspondenceAddress
  **/
  @Schema(description = "")
  public AddressDTO getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  public void setCorrespondenceAddress(AddressDTO correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
  }

  public CustomerDTO contact(ContactDTO contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Schema(description = "")
  public ContactDTO getContact() {
    return contact;
  }

  public void setContact(ContactDTO contact) {
    this.contact = contact;
  }

  public CustomerDTO branchId(Long branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @Schema(description = "")
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public CustomerDTO leadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
    return this;
  }

   /**
   * Get leadSourceId
   * @return leadSourceId
  **/
  @Schema(description = "")
  public Long getLeadSourceId() {
    return leadSourceId;
  }

  public void setLeadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
  }

  public CustomerDTO customFields(List<CustomFieldDTO> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CustomerDTO addCustomFieldsItem(CustomFieldDTO customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<CustomFieldDTO>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @Schema(description = "")
  public List<CustomFieldDTO> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<CustomFieldDTO> customFields) {
    this.customFields = customFields;
  }

  public CustomerDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomerDTO responsiblePersons(CustomerResponsiblePersonsDTO responsiblePersons) {
    this.responsiblePersons = responsiblePersons;
    return this;
  }

   /**
   * Get responsiblePersons
   * @return responsiblePersons
  **/
  @Schema(description = "")
  public CustomerResponsiblePersonsDTO getResponsiblePersons() {
    return responsiblePersons;
  }

  public void setResponsiblePersons(CustomerResponsiblePersonsDTO responsiblePersons) {
    this.responsiblePersons = responsiblePersons;
  }

  public CustomerDTO accounting(CustomerAccountingDTO accounting) {
    this.accounting = accounting;
    return this;
  }

   /**
   * Get accounting
   * @return accounting
  **/
  @Schema(description = "")
  public CustomerAccountingDTO getAccounting() {
    return accounting;
  }

  public void setAccounting(CustomerAccountingDTO accounting) {
    this.accounting = accounting;
  }

  public CustomerDTO contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

   /**
   * Get contractNumber
   * @return contractNumber
  **/
  @Schema(description = "")
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }

  public CustomerDTO salesNotes(String salesNotes) {
    this.salesNotes = salesNotes;
    return this;
  }

   /**
   * Get salesNotes
   * @return salesNotes
  **/
  @Schema(description = "")
  public String getSalesNotes() {
    return salesNotes;
  }

  public void setSalesNotes(String salesNotes) {
    this.salesNotes = salesNotes;
  }

  public CustomerDTO accountOnCustomerServer(String accountOnCustomerServer) {
    this.accountOnCustomerServer = accountOnCustomerServer;
    return this;
  }

   /**
   * Get accountOnCustomerServer
   * @return accountOnCustomerServer
  **/
  @Schema(description = "")
  public String getAccountOnCustomerServer() {
    return accountOnCustomerServer;
  }

  public void setAccountOnCustomerServer(String accountOnCustomerServer) {
    this.accountOnCustomerServer = accountOnCustomerServer;
  }

  public CustomerDTO persons(List<CustomerPersonDTO> persons) {
    this.persons = persons;
    return this;
  }

  public CustomerDTO addPersonsItem(CustomerPersonDTO personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<CustomerPersonDTO>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * Get persons
   * @return persons
  **/
  @Schema(description = "")
  public List<CustomerPersonDTO> getPersons() {
    return persons;
  }

  public void setPersons(List<CustomerPersonDTO> persons) {
    this.persons = persons;
  }

  public CustomerDTO categoriesIds(List<Long> categoriesIds) {
    this.categoriesIds = categoriesIds;
    return this;
  }

  public CustomerDTO addCategoriesIdsItem(Long categoriesIdsItem) {
    if (this.categoriesIds == null) {
      this.categoriesIds = new ArrayList<Long>();
    }
    this.categoriesIds.add(categoriesIdsItem);
    return this;
  }

   /**
   * Get categoriesIds
   * @return categoriesIds
  **/
  @Schema(description = "")
  public List<Long> getCategoriesIds() {
    return categoriesIds;
  }

  public void setCategoriesIds(List<Long> categoriesIds) {
    this.categoriesIds = categoriesIds;
  }

  public CustomerDTO industriesIds(List<Long> industriesIds) {
    this.industriesIds = industriesIds;
    return this;
  }

  public CustomerDTO addIndustriesIdsItem(Long industriesIdsItem) {
    if (this.industriesIds == null) {
      this.industriesIds = new ArrayList<Long>();
    }
    this.industriesIds.add(industriesIdsItem);
    return this;
  }

   /**
   * Get industriesIds
   * @return industriesIds
  **/
  @Schema(description = "")
  public List<Long> getIndustriesIds() {
    return industriesIds;
  }

  public void setIndustriesIds(List<Long> industriesIds) {
    this.industriesIds = industriesIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDTO customerDTO = (CustomerDTO) o;
    return Objects.equals(this.id, customerDTO.id) &&
        Objects.equals(this.idNumber, customerDTO.idNumber) &&
        Objects.equals(this.name, customerDTO.name) &&
        Objects.equals(this.fullName, customerDTO.fullName) &&
        Objects.equals(this.notes, customerDTO.notes) &&
        Objects.equals(this.billingAddress, customerDTO.billingAddress) &&
        Objects.equals(this.correspondenceAddress, customerDTO.correspondenceAddress) &&
        Objects.equals(this.contact, customerDTO.contact) &&
        Objects.equals(this.branchId, customerDTO.branchId) &&
        Objects.equals(this.leadSourceId, customerDTO.leadSourceId) &&
        Objects.equals(this.customFields, customerDTO.customFields) &&
        Objects.equals(this.status, customerDTO.status) &&
        Objects.equals(this.responsiblePersons, customerDTO.responsiblePersons) &&
        Objects.equals(this.accounting, customerDTO.accounting) &&
        Objects.equals(this.contractNumber, customerDTO.contractNumber) &&
        Objects.equals(this.salesNotes, customerDTO.salesNotes) &&
        Objects.equals(this.accountOnCustomerServer, customerDTO.accountOnCustomerServer) &&
        Objects.equals(this.persons, customerDTO.persons) &&
        Objects.equals(this.categoriesIds, customerDTO.categoriesIds) &&
        Objects.equals(this.industriesIds, customerDTO.industriesIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idNumber, name, fullName, notes, billingAddress, correspondenceAddress, contact, branchId, leadSourceId, customFields, status, responsiblePersons, accounting, contractNumber, salesNotes, accountOnCustomerServer, persons, categoriesIds, industriesIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    leadSourceId: ").append(toIndentedString(leadSourceId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responsiblePersons: ").append(toIndentedString(responsiblePersons)).append("\n");
    sb.append("    accounting: ").append(toIndentedString(accounting)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    salesNotes: ").append(toIndentedString(salesNotes)).append("\n");
    sb.append("    accountOnCustomerServer: ").append(toIndentedString(accountOnCustomerServer)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    categoriesIds: ").append(toIndentedString(categoriesIds)).append("\n");
    sb.append("    industriesIds: ").append(toIndentedString(industriesIds)).append("\n");
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