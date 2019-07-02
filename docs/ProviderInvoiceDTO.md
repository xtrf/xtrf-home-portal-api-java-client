# ProviderInvoiceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**totalGross** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**totalNetto** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currencyId** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**finalNumber** | **String** |  |  [optional]
**draftNumber** | **String** |  |  [optional]
**internalNumber** | **String** |  |  [optional]
**providerId** | **Long** |  |  [optional]
**totalGrossInWords** | **String** |  |  [optional]
**jobsNetValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional]
**dates** | [**ProviderInvoiceDatesDTO**](ProviderInvoiceDatesDTO.md) |  |  [optional]
**notesFromProvider** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
POSTPONED | &quot;POSTPONED&quot;
TO_BE_SENT | &quot;TO_BE_SENT&quot;
SENT | &quot;SENT&quot;
CONFIRMED | &quot;CONFIRMED&quot;
BILL_CREATED | &quot;BILL_CREATED&quot;

<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
NOT_PAID | &quot;NOT_PAID&quot;
FULLY_PAID | &quot;FULLY_PAID&quot;
IRRECOVERABLE | &quot;IRRECOVERABLE&quot;
PARTIALLY_PAID | &quot;PARTIALLY_PAID&quot;
