# CategoryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | internal identifier |  [optional]
**name** | **String** | localised name (formatted in the current user&#x27;s locale) |  [optional]
**active** | **Boolean** | should this value be available on the XTRF selection lists |  [optional]
**preferred** | **Boolean** | should this value be available on the top of XTRF selection lists, in the Preferred section |  [optional]
**supportedClasses** | [**List&lt;SupportedClassesEnum&gt;**](#List&lt;SupportedClassesEnum&gt;) | set of types for which this category can be selected |  [optional]
**_default** | **Boolean** |  |  [optional]

<a name="List<SupportedClassesEnum>"></a>
## Enum: List&lt;SupportedClassesEnum&gt;
Name | Value
---- | -----
PROJECT | &quot;PROJECT&quot;
QUOTE | &quot;QUOTE&quot;
QUOTE_TASK | &quot;QUOTE_TASK&quot;
TASK | &quot;TASK&quot;
PROVIDER | &quot;PROVIDER&quot;
CUSTOMER | &quot;CUSTOMER&quot;
CUSTOMER_PERSON | &quot;CUSTOMER_PERSON&quot;
PROVIDER_PERSON | &quot;PROVIDER_PERSON&quot;
FINANCIAL_REPORT | &quot;FINANCIAL_REPORT&quot;
REMINDER | &quot;REMINDER&quot;
PROVIDER_INVOICE | &quot;PROVIDER_INVOICE&quot;
CUSTOMER_INVOICE | &quot;CUSTOMER_INVOICE&quot;
