# CalculationUnitDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | internal identifier |  [optional]
**name** | **String** | localised name (formatted in the current user&#x27;s locale) |  [optional]
**active** | **Boolean** | should this value be available on the XTRF selection lists |  [optional]
**preferred** | **Boolean** | should this value be available on the top of XTRF selection lists, in the Preferred section |  [optional]
**symbol** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**exchangeRatio** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**canBeUsedInCatAnalysis** | **Boolean** |  |  [optional]
**catQuantityConversionExpression** | **String** |  |  [optional]
**fileStatsConversionExpression** | **String** |  |  [optional]
**timeToQuantityConversionExpression** | **String** |  |  [optional]
**jobTypeIds** | **List&lt;Long&gt;** |  |  [optional]
**_default** | **Boolean** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TIME | &quot;TIME&quot;
VOLUME | &quot;VOLUME&quot;
PERCENT | &quot;PERCENT&quot;
