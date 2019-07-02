# QuotesClassicApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLanguageCombination1**](QuotesClassicApi.md#createLanguageCombination1) | **POST** /quotes/{quoteId}/languageCombinations | Creates a new language combination for a given quote without creating a task.
[**createTask1**](QuotesClassicApi.md#createTask1) | **POST** /quotes/{quoteId}/tasks | Creates a new task for a given quote.
[**delete5**](QuotesClassicApi.md#delete5) | **DELETE** /quotes/{quoteId} | Removes a quote.
[**getAllIds7**](QuotesClassicApi.md#getAllIds7) | **GET** /quotes/ids | Returns quotes&#x27; internal identifiers.
[**getById8**](QuotesClassicApi.md#getById8) | **GET** /quotes/{quoteId} | Returns quote details.
[**getCustomFields6**](QuotesClassicApi.md#getCustomFields6) | **GET** /quotes/{quoteId}/customFields | Returns custom fields of a given quote.
[**getDates2**](QuotesClassicApi.md#getDates2) | **GET** /quotes/{quoteId}/dates | Returns dates of a given quote.
[**getFinance1**](QuotesClassicApi.md#getFinance1) | **GET** /quotes/{quoteId}/finance | Returns finance of a given quote.
[**send1**](QuotesClassicApi.md#send1) | **POST** /quotes/{quoteId}/confirmation/send | Sends a quote for customer confirmation.
[**start**](QuotesClassicApi.md#start) | **POST** /quotes/{quoteId}/start | Starts a quote.
[**updateCustomFields**](QuotesClassicApi.md#updateCustomFields) | **PUT** /quotes/{quoteId}/customFields | Updates custom fields of a given quote.

<a name="createLanguageCombination1"></a>
# **createLanguageCombination1**
> LanguageCombinationDTO createLanguageCombination1(body, quoteId)

Creates a new language combination for a given quote without creating a task.

Creates a new language combination for a given quote without creating a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
LanguageCombinationDTO body = new LanguageCombinationDTO(); // LanguageCombinationDTO | Created a new language combination for a given quote without creating a task.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    LanguageCombinationDTO result = apiInstance.createLanguageCombination1(body, quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#createLanguageCombination1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LanguageCombinationDTO**](LanguageCombinationDTO.md)| Created a new language combination for a given quote without creating a task. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**LanguageCombinationDTO**](LanguageCombinationDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="createTask1"></a>
# **createTask1**
> TaskDTO createTask1(body, quoteId)

Creates a new task for a given quote.

Creates a new task for a given quote. Required fields are presented in the example.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
TaskDTO body = new TaskDTO(); // TaskDTO | Updated custom fields of a given quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    TaskDTO result = apiInstance.createTask1(body, quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#createTask1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskDTO**](TaskDTO.md)| Updated custom fields of a given quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**TaskDTO**](TaskDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="delete5"></a>
# **delete5**
> delete5(quoteId)

Removes a quote.

Removes a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.delete5(quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#delete5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllIds7"></a>
# **getAllIds7**
> List&lt;Integer&gt; getAllIds7(updatedSince)

Returns quotes&#x27; internal identifiers.

Returns quotes&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
Long updatedSince = 789L; // Long | only quotes modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds7(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#getAllIds7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only quotes modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById8"></a>
# **getById8**
> QuoteDTO getById8(quoteId, embed)

Returns quote details.

Returns quote details. If the specified quote ID refers to Smart Quote, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
String embed = "embed_example"; // String | list of adittional fields which should be embedded in the response (ie. tasks)
try {
    QuoteDTO result = apiInstance.getById8(quoteId, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#getById8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |
 **embed** | **String**| list of adittional fields which should be embedded in the response (ie. tasks) | [optional]

### Return type

[**QuoteDTO**](QuoteDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields6"></a>
# **getCustomFields6**
> CustomFieldsDTO getCustomFields6(quoteId)

Returns custom fields of a given quote.

Returns custom fields of a given quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields6(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#getCustomFields6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDates2"></a>
# **getDates2**
> QuoteDatesDTO getDates2(quoteId)

Returns dates of a given quote.

Returns dates of a given quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    QuoteDatesDTO result = apiInstance.getDates2(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#getDates2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**QuoteDatesDTO**](QuoteDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getFinance1"></a>
# **getFinance1**
> FinanceDTO getFinance1(quoteId)

Returns finance of a given quote.

Returns finance of a given quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    FinanceDTO result = apiInstance.getFinance1(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#getFinance1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**FinanceDTO**](FinanceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="send1"></a>
# **send1**
> send1(quoteId)

Sends a quote for customer confirmation.

Sends a quote for customer confirmation. Quote status is changed to SENT and a document is sent to the customer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.send1(quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#send1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="start"></a>
# **start**
> start(quoteId)

Starts a quote.

Starts a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.start(quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#start");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCustomFields"></a>
# **updateCustomFields**
> CustomFieldsDTO updateCustomFields(body, quoteId)

Updates custom fields of a given quote.

Updates custom fields of a given quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesClassicApi apiInstance = new QuotesClassicApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields of a given quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields(body, quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesClassicApi#updateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields of a given quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

