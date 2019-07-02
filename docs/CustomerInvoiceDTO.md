# CustomerInvoiceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**totalGross** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**totalNetto** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currencyId** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**tasksValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**vatCalculationRule** | [**VatCalculationRuleEnum**](#VatCalculationRuleEnum) |  |  [optional]
**totalInWords** | **String** |  |  [optional]
**paymentMethodId** | **Long** |  |  [optional]
**paymentTerms** | [**PaymentTermsDTO**](PaymentTermsDTO.md) |  |  [optional]
**customerId** | **Long** |  |  [optional]
**dates** | [**CustomerInvoiceDatesDTO**](CustomerInvoiceDatesDTO.md) |  |  [optional]
**tasks** | [**List&lt;TaskDTO&gt;**](TaskDTO.md) |  |  [optional]
**customerDetails** | [**CustomerDetailsDTO**](CustomerDetailsDTO.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_READY | &quot;NOT_READY&quot;
READY | &quot;READY&quot;
SENT | &quot;SENT&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FINAL | &quot;FINAL&quot;
DRAFT | &quot;DRAFT&quot;

<a name="VatCalculationRuleEnum"></a>
## Enum: VatCalculationRuleEnum
Name | Value
---- | -----
SUM_ITEMS | &quot;SUM_ITEMS&quot;
BY_NET_TOTAL | &quot;BY_NET_TOTAL&quot;
