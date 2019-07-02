# JobTypeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | internal identifier |  [optional]
**name** | **String** | localised name (formatted in the current user&#x27;s locale) |  [optional]
**active** | **Boolean** | should this value be available on the XTRF selection lists |  [optional]
**preferred** | **Boolean** | should this value be available on the top of XTRF selection lists, in the Preferred section |  [optional]
**filesNeeded** | **Boolean** |  |  [optional]
**providedByClient** | **Boolean** |  |  [optional]
**relationToLanguage** | [**RelationToLanguageEnum**](#RelationToLanguageEnum) |  |  [optional]
**calculationUnitIds** | **List&lt;Long&gt;** |  |  [optional]
**vendorProductivity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**vendorProductivityCalculationUnitId** | **Long** |  |  [optional]
**_default** | **Boolean** |  |  [optional]

<a name="RelationToLanguageEnum"></a>
## Enum: RelationToLanguageEnum
Name | Value
---- | -----
LANGUAGE_COMBINATION_RELATED | &quot;LANGUAGE_COMBINATION_RELATED&quot;
SOURCE_LANGUAGE_RELATED_ONLY | &quot;SOURCE_LANGUAGE_RELATED_ONLY&quot;
TARGET_LANGUAGE_RELATED_ONLY | &quot;TARGET_LANGUAGE_RELATED_ONLY&quot;
LANGUAGE_INDEPENDENT | &quot;LANGUAGE_INDEPENDENT&quot;
