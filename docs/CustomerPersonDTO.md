# CustomerPersonDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**contact** | [**PersonContactDTO**](PersonContactDTO.md) |  |  [optional]
**positionId** | **Long** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**active** | **Boolean** |  |  [optional]
**motherTonguesIds** | **List&lt;Long&gt;** |  |  [optional]
**customFields** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md) |  |  [optional]
**customerId** | **Long** |  |  [optional]

<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
FEMALE | &quot;FEMALE&quot;
MALE | &quot;MALE&quot;
