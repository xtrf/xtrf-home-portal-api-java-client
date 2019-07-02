# CustomerDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**idNumber** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**fullName** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**billingAddress** | [**AddressDTO**](AddressDTO.md) |  |  [optional]
**correspondenceAddress** | [**AddressDTO**](AddressDTO.md) |  |  [optional]
**contact** | [**ContactDTO**](ContactDTO.md) |  |  [optional]
**branchId** | **Long** |  |  [optional]
**leadSourceId** | **Long** |  |  [optional]
**customFields** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**responsiblePersons** | [**CustomerResponsiblePersonsDTO**](CustomerResponsiblePersonsDTO.md) |  |  [optional]
**accounting** | [**CustomerAccountingDTO**](CustomerAccountingDTO.md) |  |  [optional]
**contractNumber** | **String** |  |  [optional]
**salesNotes** | **String** |  |  [optional]
**accountOnCustomerServer** | **String** |  |  [optional]
**persons** | [**List&lt;CustomerPersonDTO&gt;**](CustomerPersonDTO.md) |  |  [optional]
**categoriesIds** | **List&lt;Long&gt;** |  |  [optional]
**industriesIds** | **List&lt;Long&gt;** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
POTENTIAL | &quot;POTENTIAL&quot;
