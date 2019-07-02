# ProviderDTO

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
**competencies** | [**CompetenciesDTO**](CompetenciesDTO.md) |  |  [optional]
**persons** | [**List&lt;ProviderPersonDTO&gt;**](ProviderPersonDTO.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
WAITING_FOR_APPROVAL | &quot;WAITING_FOR_APPROVAL&quot;
REJECTED | &quot;REJECTED&quot;
TOO_EXPENSIVE | &quot;TOO_EXPENSIVE&quot;
INCOMPLETE_DATA | &quot;INCOMPLETE_DATA&quot;
POTENTIAL | &quot;POTENTIAL&quot;
NOT_CONFIRMED | &quot;NOT_CONFIRMED&quot;
