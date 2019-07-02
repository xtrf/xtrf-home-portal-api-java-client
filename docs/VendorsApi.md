# VendorsApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete3**](VendorsApi.md#delete3) | **DELETE** /providers/persons/{personId} | Removes a person.
[**delete3_0**](VendorsApi.md#delete3_0) | **DELETE** /providers/priceLists/{priceListId} | Removes a provider price list.
[**delete4**](VendorsApi.md#delete4) | **DELETE** /providers/{providerId} | Removes a provider.
[**getAddress1**](VendorsApi.md#getAddress1) | **GET** /providers/{providerId}/address | Returns address of a given provider.
[**getAllIds4**](VendorsApi.md#getAllIds4) | **GET** /providers/persons/ids | Returns persons&#x27; internal identifiers.
[**getAllIds5**](VendorsApi.md#getAllIds5) | **GET** /providers/ids | Returns providers&#x27; internal identifiers.
[**getById4**](VendorsApi.md#getById4) | **GET** /providers/persons/{personId} | Returns person details.
[**getById5**](VendorsApi.md#getById5) | **GET** /providers/{providerId} | Returns provider details.
[**getCompetencies**](VendorsApi.md#getCompetencies) | **GET** /providers/{providerId}/competencies | Returns competencies of a given provider.
[**getContact2**](VendorsApi.md#getContact2) | **GET** /providers/persons/{personId}/contact | Returns contact of a given person.
[**getContact3**](VendorsApi.md#getContact3) | **GET** /providers/{providerId}/contact | Returns contact of a given provider.
[**getCorrespondenceAddress1**](VendorsApi.md#getCorrespondenceAddress1) | **GET** /providers/{providerId}/correspondenceAddress | Returns correspondence address of a given provider.
[**getCustomFields2**](VendorsApi.md#getCustomFields2) | **GET** /providers/persons/{personId}/customFields | Returns custom fields of a given person.
[**getCustomFields3**](VendorsApi.md#getCustomFields3) | **GET** /providers/{providerId}/customFields | Returns custom fields of a given provider.
[**sendInvitations**](VendorsApi.md#sendInvitations) | **POST** /providers/persons/{personId}/notification/invitation | Sends invitation to Vendor Portal.
[**sendInvitations1**](VendorsApi.md#sendInvitations1) | **POST** /providers/{providerId}/notification/invitation | Sends invitations to Vendor Portal.

<a name="delete3"></a>
# **delete3**
> delete3(personId)

Removes a person.

Removes a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    apiInstance.delete3(personId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#delete3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="delete3_0"></a>
# **delete3_0**
> delete3_0(priceListId)

Removes a provider price list.

Removes a provider price list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long priceListId = 789L; // Long | provider price list's internal identifier
try {
    apiInstance.delete3_0(priceListId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#delete3_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceListId** | **Long**| provider price list&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete4"></a>
# **delete4**
> delete4(providerId)

Removes a provider.

Removes a provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    apiInstance.delete4(providerId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#delete4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAddress1"></a>
# **getAddress1**
> AddressDTO getAddress1(providerId)

Returns address of a given provider.

Returns address of a given provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    AddressDTO result = apiInstance.getAddress1(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getAddress1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllIds4"></a>
# **getAllIds4**
> List&lt;Integer&gt; getAllIds4(updatedSince)

Returns persons&#x27; internal identifiers.

Returns persons&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long updatedSince = 789L; // Long | only persons modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds4(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getAllIds4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only persons modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllIds5"></a>
# **getAllIds5**
> List&lt;Integer&gt; getAllIds5(updatedSince)

Returns providers&#x27; internal identifiers.

Returns providers&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long updatedSince = 789L; // Long | only providers modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds5(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getAllIds5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only providers modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById4"></a>
# **getById4**
> ProviderPersonDTO getById4(personId)

Returns person details.

Returns person details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    ProviderPersonDTO result = apiInstance.getById4(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getById4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**ProviderPersonDTO**](ProviderPersonDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById5"></a>
# **getById5**
> ProviderDTO getById5(providerId, embed)

Returns provider details.

Returns provider details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
String embed = "embed_example"; // String | list of adittional fields which should be embedded in the response (ie. persons)
try {
    ProviderDTO result = apiInstance.getById5(providerId, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getById5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |
 **embed** | **String**| list of adittional fields which should be embedded in the response (ie. persons) | [optional]

### Return type

[**ProviderDTO**](ProviderDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCompetencies"></a>
# **getCompetencies**
> CompetenciesDTO getCompetencies(providerId)

Returns competencies of a given provider.

Returns competencies of a given provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    CompetenciesDTO result = apiInstance.getCompetencies(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getCompetencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**CompetenciesDTO**](CompetenciesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getContact2"></a>
# **getContact2**
> PersonContactDTO getContact2(personId)

Returns contact of a given person.

Returns contact of a given person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    PersonContactDTO result = apiInstance.getContact2(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getContact2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**PersonContactDTO**](PersonContactDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getContact3"></a>
# **getContact3**
> ContactDTO getContact3(providerId)

Returns contact of a given provider.

Returns contact of a given provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    ContactDTO result = apiInstance.getContact3(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getContact3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**ContactDTO**](ContactDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCorrespondenceAddress1"></a>
# **getCorrespondenceAddress1**
> AddressDTO getCorrespondenceAddress1(providerId)

Returns correspondence address of a given provider.

Returns correspondence address of a given provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    AddressDTO result = apiInstance.getCorrespondenceAddress1(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getCorrespondenceAddress1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields2"></a>
# **getCustomFields2**
> CustomFieldsDTO getCustomFields2(personId)

Returns custom fields of a given person.

Returns custom fields of a given person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields2(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getCustomFields2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields3"></a>
# **getCustomFields3**
> CustomFieldsDTO getCustomFields3(providerId)

Returns custom fields of a given provider.

Returns custom fields of a given provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields3(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#getCustomFields3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="sendInvitations"></a>
# **sendInvitations**
> InvitationStatisticsDTO sendInvitations(personId)

Sends invitation to Vendor Portal.

Sends invitation to Vendor Portal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    InvitationStatisticsDTO result = apiInstance.sendInvitations(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#sendInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**InvitationStatisticsDTO**](InvitationStatisticsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="sendInvitations1"></a>
# **sendInvitations1**
> InvitationStatisticsDTO sendInvitations1(providerId)

Sends invitations to Vendor Portal.

Sends invitations to Vendor Portal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorsApi apiInstance = new VendorsApi();
Long providerId = 789L; // Long | provider's internal identifier
try {
    InvitationStatisticsDTO result = apiInstance.sendInvitations1(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorsApi#sendInvitations1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider&#x27;s internal identifier |

### Return type

[**InvitationStatisticsDTO**](InvitationStatisticsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

