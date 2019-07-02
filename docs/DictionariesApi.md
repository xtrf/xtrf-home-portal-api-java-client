# DictionariesApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActive**](DictionariesApi.md#getActive) | **GET** /dictionaries/active | Returns active dictionary entities for all types.
[**getActiveByType**](DictionariesApi.md#getActiveByType) | **GET** /dictionaries/{type}/active | Returns active values from a given dictionary.
[**getAll1**](DictionariesApi.md#getAll1) | **GET** /dictionaries/all | Returns dictionary entities for all types. Both active and not active ones.
[**getAll3**](DictionariesApi.md#getAll3) | **GET** /services/all | Returns services list
[**getAllActive**](DictionariesApi.md#getAllActive) | **GET** /services/active | Returns active services list
[**getAllByType**](DictionariesApi.md#getAllByType) | **GET** /dictionaries/{type}/all | Returns all values (both active and not active) from a given dictionary.
[**getByTypeAndId**](DictionariesApi.md#getByTypeAndId) | **GET** /dictionaries/{type}/{id} | Returns specific value from a given dictionary.

<a name="getActive"></a>
# **getActive**
> ManyValuesPerTypeDTO getActive()

Returns active dictionary entities for all types.

Returns active dictionary entities for all types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
try {
    ManyValuesPerTypeDTO result = apiInstance.getActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getActive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManyValuesPerTypeDTO**](ManyValuesPerTypeDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getActiveByType"></a>
# **getActiveByType**
> DictionaryEntity getActiveByType(type, nameEquals)

Returns active values from a given dictionary.

Returns active values from a given dictionary.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
String type = "type_example"; // String | dictionary type
String nameEquals = "nameEquals_example"; // String | exact name of entity
try {
    DictionaryEntity result = apiInstance.getActiveByType(type, nameEquals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getActiveByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| dictionary type |
 **nameEquals** | **String**| exact name of entity | [optional]

### Return type

[**DictionaryEntity**](DictionaryEntity.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAll1"></a>
# **getAll1**
> ManyValuesPerTypeDTO getAll1()

Returns dictionary entities for all types. Both active and not active ones.

&lt;div&gt;   &lt;p&gt;     XTRF holds many user-defined dictionaries (ie. countries).     Each dictionary contains a set of values (ie. Poland or Germany).     A default value may be defined for a dictionary.   &lt;/p&gt;   &lt;p&gt;     Dictionary values are identified using internal identifier which is constant and unique among other values from the same dictionary.     Please note that name used in dictionary values is presented in the locale of the current identity.     The same dictionary value can have different names, ie. \&quot;Poland\&quot; for one user, \&quot;Polska\&quot; for another one.   &lt;p&gt;   &lt;p&gt;     Possible dictionary types:     &lt;ul&gt;       &lt;li&gt;category&lt;/li&gt;       &lt;li&gt;country&lt;/li&gt;       &lt;li&gt;currency&lt;/li&gt;       &lt;li&gt;industry&lt;/li&gt;       &lt;li&gt;language&lt;/li&gt;       &lt;li&gt;leadSource&lt;/li&gt;       &lt;li&gt;personDepartment&lt;/li&gt;       &lt;li&gt;personPosition&lt;/li&gt;       &lt;li&gt;province&lt;/li&gt;       &lt;li&gt;specialization&lt;/li&gt;     &lt;/ul&gt;   &lt;/p&gt; &lt;/div&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
try {
    ManyValuesPerTypeDTO result = apiInstance.getAll1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getAll1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManyValuesPerTypeDTO**](ManyValuesPerTypeDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAll3"></a>
# **getAll3**
> ServiceDTO getAll3(nameEquals)

Returns services list

Returns workflows list. Both active and not active ones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
String nameEquals = "nameEquals_example"; // String | exact name of entity
try {
    ServiceDTO result = apiInstance.getAll3(nameEquals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getAll3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameEquals** | **String**| exact name of entity | [optional]

### Return type

[**ServiceDTO**](ServiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllActive"></a>
# **getAllActive**
> ServiceDTO getAllActive(nameEquals)

Returns active services list

Returns active workflows list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
String nameEquals = "nameEquals_example"; // String | exact name of entity
try {
    ServiceDTO result = apiInstance.getAllActive(nameEquals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getAllActive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameEquals** | **String**| exact name of entity | [optional]

### Return type

[**ServiceDTO**](ServiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllByType"></a>
# **getAllByType**
> DictionaryEntity getAllByType(type, nameEquals)

Returns all values (both active and not active) from a given dictionary.

Returns all values (both active and not active) from a given dictionary.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
String type = "type_example"; // String | dictionary type
String nameEquals = "nameEquals_example"; // String | exact name of entity
try {
    DictionaryEntity result = apiInstance.getAllByType(type, nameEquals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getAllByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| dictionary type |
 **nameEquals** | **String**| exact name of entity | [optional]

### Return type

[**DictionaryEntity**](DictionaryEntity.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getByTypeAndId"></a>
# **getByTypeAndId**
> DictionaryEntity getByTypeAndId(type, id)

Returns specific value from a given dictionary.

Returns specific value from a given dictionary.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

DictionariesApi apiInstance = new DictionariesApi();
String type = "type_example"; // String | dictionary type
Long id = 789L; // Long | dictionary value identifier
try {
    DictionaryEntity result = apiInstance.getByTypeAndId(type, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesApi#getByTypeAndId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| dictionary type |
 **id** | **Long**| dictionary value identifier |

### Return type

[**DictionaryEntity**](DictionaryEntity.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

