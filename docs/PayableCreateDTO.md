# PayableCreateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**jobTypeId** | **Long** |  |  [optional]
**languageCombination** | [**ChargeLanguageCombinationDTO**](ChargeLanguageCombinationDTO.md) |  |  [optional]
**languageCombinationIdNumber** | **String** |  |  [optional]
**rateOrigin** | [**RateOriginEnum**](#RateOriginEnum) |  |  [optional]
**currencyId** | **Long** |  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**invoiceId** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**calculationUnitId** | **Long** |  |  [optional]
**ignoreMinimumCharge** | **Boolean** |  |  [optional]
**minimumCharge** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**description** | **String** |  |  [optional]
**rate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**jobId** | **String** |  |  [optional]
**catLogFile** | [**FileDTO**](FileDTO.md) |  |  [optional]

<a name="RateOriginEnum"></a>
## Enum: RateOriginEnum
Name | Value
---- | -----
PRICE_PROFILE | &quot;PRICE_PROFILE&quot;
PRICE_LIST | &quot;PRICE_LIST&quot;
FILLED_MANUALLY | &quot;FILLED_MANUALLY&quot;
AUTOCALCULATED | &quot;AUTOCALCULATED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SIMPLE | &quot;SIMPLE&quot;
CAT | &quot;CAT&quot;
