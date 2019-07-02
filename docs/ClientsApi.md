# ClientsApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ClientsApi.md#create) | **POST** /customers/persons | Creates a new person.
[**create1**](ClientsApi.md#create1) | **POST** /customers | Creates a new client.
[**delete1**](ClientsApi.md#delete1) | **DELETE** /customers/persons/{personId} | Removes a person.
[**delete1_0**](ClientsApi.md#delete1_0) | **DELETE** /customers/priceLists/{priceListId} | Removes a customer price list.
[**delete2**](ClientsApi.md#delete2) | **DELETE** /customers/{customerId} | Removes a client.
[**generateSingleUseSignInToken**](ClientsApi.md#generateSingleUseSignInToken) | **POST** /customers/persons/accessToken | Generates a single use sign-in token.
[**getAddress**](ClientsApi.md#getAddress) | **GET** /customers/{customerId}/address | Returns address of a given client.
[**getAllIds1**](ClientsApi.md#getAllIds1) | **GET** /customers/persons/ids | Returns persons&#x27; internal identifiers.
[**getAllIds2**](ClientsApi.md#getAllIds2) | **GET** /customers/ids | Returns clients&#x27; internal identifiers.
[**getAllNamesWithIds**](ClientsApi.md#getAllNamesWithIds) | **GET** /customers | Returns list of simple clients representations
[**getById1**](ClientsApi.md#getById1) | **GET** /customers/persons/{personId} | Returns person details.
[**getById2**](ClientsApi.md#getById2) | **GET** /customers/{customerId} | Returns client details.
[**getCategories**](ClientsApi.md#getCategories) | **GET** /customers/{customerId}/categories | Returns categories of a given client.
[**getContact**](ClientsApi.md#getContact) | **GET** /customers/persons/{personId}/contact | Returns contact of a given person.
[**getContact1**](ClientsApi.md#getContact1) | **GET** /customers/{customerId}/contact | Returns contact of a given client.
[**getCorrespondenceAddress**](ClientsApi.md#getCorrespondenceAddress) | **GET** /customers/{customerId}/correspondenceAddress | Returns correspondence address of a given client.
[**getCustomField**](ClientsApi.md#getCustomField) | **GET** /customers/{customerId}/customFields/{customFieldKey} | Returns custom field of a given client.
[**getCustomFields**](ClientsApi.md#getCustomFields) | **GET** /customers/persons/{personId}/customFields | Returns custom fields of a given person.
[**getCustomFields1**](ClientsApi.md#getCustomFields1) | **GET** /customers/{customerId}/customFields | Returns custom fields of a given client.
[**getIndustries**](ClientsApi.md#getIndustries) | **GET** /customers/{customerId}/industries | Returns industries of a given client.
[**update**](ClientsApi.md#update) | **PUT** /customers/persons/{personId} | Updates an existing person.
[**updateAddress**](ClientsApi.md#updateAddress) | **PUT** /customers/{customerId}/address | Updates address of a given client.
[**updateCategories**](ClientsApi.md#updateCategories) | **PUT** /customers/{customerId}/categories | Updates categories of a given client.
[**updateContact**](ClientsApi.md#updateContact) | **PUT** /customers/persons/{personId}/contact | Updates contact of a given person.
[**updateContact_0**](ClientsApi.md#updateContact_0) | **PUT** /customers/{customerId}/contact | Updates contact of a given client.
[**updateCorrespondenceAddress**](ClientsApi.md#updateCorrespondenceAddress) | **PUT** /customers/{customerId}/correspondenceAddress | Updates correspondence address of a given client.
[**updateCustomField**](ClientsApi.md#updateCustomField) | **PUT** /customers/{customerId}/customFields/{customFieldKey} | Updates given custom field of a given client.
[**updateCustomFields**](ClientsApi.md#updateCustomFields) | **PUT** /customers/persons/{personId}/customFields | Updates custom fields of a given person.
[**updateCustomFields_0**](ClientsApi.md#updateCustomFields_0) | **PUT** /customers/{customerId}/customFields | Updates custom fields of a given client.
[**updateIndustries**](ClientsApi.md#updateIndustries) | **PUT** /customers/{customerId}/industries | Updates industries of a given client.
[**update_0**](ClientsApi.md#update_0) | **PUT** /customers/{customerId} | Updates an existing client.

<a name="create"></a>
# **create**
> CustomerPersonDTO create(body)

Creates a new person.

Creates a new person. Required fields are presented in the example. Other fields (from PUT) may also be specified here.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
CustomerPersonDTO body = new CustomerPersonDTO(); // CustomerPersonDTO | Brand new person.
try {
    CustomerPersonDTO result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerPersonDTO**](CustomerPersonDTO.md)| Brand new person. |

### Return type

[**CustomerPersonDTO**](CustomerPersonDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="create1"></a>
# **create1**
> CustomerDTO create1(body)

Creates a new client.

Creates a new client. Required fields are presented in the example. Other fields (from PUT) may also be specified here.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
CustomerDTO body = new CustomerDTO(); // CustomerDTO | Created user object
try {
    CustomerDTO result = apiInstance.create1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerDTO**](CustomerDTO.md)| Created user object |

### Return type

[**CustomerDTO**](CustomerDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="delete1"></a>
# **delete1**
> delete1(personId)

Removes a person.

Removes a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    apiInstance.delete1(personId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#delete1");
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
 - **Accept**: Not defined

<a name="delete1_0"></a>
# **delete1_0**
> delete1_0(priceListId)

Removes a customer price list.

Removes a customer price list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long priceListId = 789L; // Long | customer price list's internal identifier
try {
    apiInstance.delete1_0(priceListId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#delete1_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceListId** | **Long**| customer price list&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete2"></a>
# **delete2**
> delete2(customerId)

Removes a client.

Removes a client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    apiInstance.delete2(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#delete2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="generateSingleUseSignInToken"></a>
# **generateSingleUseSignInToken**
> AccessTokenDTO generateSingleUseSignInToken(body)

Generates a single use sign-in token.

Generates a single use sign-in token for the customer person found for given login or e-mail. Returns &#x27;url&#x27; and &#x27;token&#x27; which allows to sign-in to customer portal as this person. Token is valid for two minutes and can be used only once. To sign-in to customer portal you should post &#x27;token&#x27; provided as the &#x27;accessToken&#x27; form param to the &#x27;url&#x27; using POST method.Detailed description is available in the Customer API &lt;a href&#x3D;\&quot;/api-doc/customer-api/authentication\&quot;&gt;authentication&lt;/a&gt;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
AccessTokenRequestDTO body = new AccessTokenRequestDTO(); // AccessTokenRequestDTO | Generated sign-in token.
try {
    AccessTokenDTO result = apiInstance.generateSingleUseSignInToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#generateSingleUseSignInToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessTokenRequestDTO**](AccessTokenRequestDTO.md)| Generated sign-in token. |

### Return type

[**AccessTokenDTO**](AccessTokenDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAddress"></a>
# **getAddress**
> AddressDTO getAddress(customerId)

Returns address of a given client.

Returns address of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    AddressDTO result = apiInstance.getAddress(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllIds1"></a>
# **getAllIds1**
> List&lt;Integer&gt; getAllIds1(updatedSince)

Returns persons&#x27; internal identifiers.

Returns persons&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long updatedSince = 789L; // Long | only persons modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds1(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getAllIds1");
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

<a name="getAllIds2"></a>
# **getAllIds2**
> List&lt;Integer&gt; getAllIds2(updatedSince, nameEquals)

Returns clients&#x27; internal identifiers.

Returns clients&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long updatedSince = 789L; // Long | only clients modified since this timestamp
String nameEquals = "nameEquals_example"; // String | exact name of client
try {
    List<Integer> result = apiInstance.getAllIds2(updatedSince, nameEquals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getAllIds2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only clients modified since this timestamp | [optional]
 **nameEquals** | **String**| exact name of client | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllNamesWithIds"></a>
# **getAllNamesWithIds**
> List&lt;EntityWithNameDTO&gt; getAllNamesWithIds(updatedSince)

Returns list of simple clients representations

Returns list of simple clients representations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long updatedSince = 789L; // Long | only clients modified since this timestamp
try {
    List<EntityWithNameDTO> result = apiInstance.getAllNamesWithIds(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getAllNamesWithIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only clients modified since this timestamp | [optional]

### Return type

[**List&lt;EntityWithNameDTO&gt;**](EntityWithNameDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById1"></a>
# **getById1**
> CustomerPersonDTO getById1(personId)

Returns person details.

Returns person details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    CustomerPersonDTO result = apiInstance.getById1(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**CustomerPersonDTO**](CustomerPersonDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById2"></a>
# **getById2**
> CustomerDTO getById2(customerId, embed)

Returns client details.

Returns client details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
String embed = "embed_example"; // String | list of adittional fields which should be embedded in the response (ie. persons)
try {
    CustomerDTO result = apiInstance.getById2(customerId, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getById2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |
 **embed** | **String**| list of adittional fields which should be embedded in the response (ie. persons) | [optional]

### Return type

[**CustomerDTO**](CustomerDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCategories"></a>
# **getCategories**
> CategoriesDTO getCategories(customerId)

Returns categories of a given client.

Returns categories of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    CategoriesDTO result = apiInstance.getCategories(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**CategoriesDTO**](CategoriesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getContact"></a>
# **getContact**
> PersonContactDTO getContact(personId)

Returns contact of a given person.

Returns contact of a given person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    PersonContactDTO result = apiInstance.getContact(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getContact");
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

<a name="getContact1"></a>
# **getContact1**
> ContactDTO getContact1(customerId)

Returns contact of a given client.

Returns contact of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    ContactDTO result = apiInstance.getContact1(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getContact1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**ContactDTO**](ContactDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCorrespondenceAddress"></a>
# **getCorrespondenceAddress**
> AddressDTO getCorrespondenceAddress(customerId)

Returns correspondence address of a given client.

Returns correspondence address of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    AddressDTO result = apiInstance.getCorrespondenceAddress(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getCorrespondenceAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomField"></a>
# **getCustomField**
> CustomFieldDTO getCustomField(customerId, customFieldKey)

Returns custom field of a given client.

Returns custom field of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
String customFieldKey = "customFieldKey_example"; // String | custom field's key
try {
    CustomFieldDTO result = apiInstance.getCustomField(customerId, customFieldKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |
 **customFieldKey** | **String**| custom field&#x27;s key |

### Return type

[**CustomFieldDTO**](CustomFieldDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields"></a>
# **getCustomFields**
> CustomFieldsDTO getCustomFields(personId)

Returns custom fields of a given person.

Returns custom fields of a given person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long personId = 789L; // Long | person's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getCustomFields");
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

<a name="getCustomFields1"></a>
# **getCustomFields1**
> CustomFieldsDTO getCustomFields1(customerId)

Returns custom fields of a given client.

Returns custom fields of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields1(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getCustomFields1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getIndustries"></a>
# **getIndustries**
> IndustriesDTO getIndustries(customerId)

Returns industries of a given client.

Returns industries of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
Long customerId = 789L; // Long | client's internal identifier
try {
    IndustriesDTO result = apiInstance.getIndustries(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getIndustries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**IndustriesDTO**](IndustriesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="update"></a>
# **update**
> CustomerPersonDTO update(body, personId)

Updates an existing person.

Only specified fields will be changed. One may not specify embeddable fields here - use separate API calls for updating them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
CustomerPersonDTO body = new CustomerPersonDTO(); // CustomerPersonDTO | Updated existing person.
Long personId = 789L; // Long | person's internal identifier
try {
    CustomerPersonDTO result = apiInstance.update(body, personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerPersonDTO**](CustomerPersonDTO.md)| Updated existing person. |
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**CustomerPersonDTO**](CustomerPersonDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateAddress"></a>
# **updateAddress**
> AddressDTO updateAddress(body, customerId)

Updates address of a given client.

Updates address of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
AddressDTO body = new AddressDTO(); // AddressDTO | Updated address of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    AddressDTO result = apiInstance.updateAddress(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressDTO**](AddressDTO.md)| Updated address of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCategories"></a>
# **updateCategories**
> CategoriesDTO updateCategories(body, customerId)

Updates categories of a given client.

Updates categories of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
List<Long> body = Arrays.asList({
  "description" : "ref",
  "value" : "/home-api/assets/examples/customers/updateCategories.json#requestBody"
}L); // List<Long> | Updated categories of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    CategoriesDTO result = apiInstance.updateCategories(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)| Updated categories of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**CategoriesDTO**](CategoriesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateContact"></a>
# **updateContact**
> PersonContactDTO updateContact(body, personId)

Updates contact of a given person.

Updates contact of a given person. Sets that this person uses specific address and contact (not the one from customer).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
PersonContactDTO body = new PersonContactDTO(); // PersonContactDTO | Updated contact of a given person.
Long personId = 789L; // Long | person's internal identifier
try {
    PersonContactDTO result = apiInstance.updateContact(body, personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonContactDTO**](PersonContactDTO.md)| Updated contact of a given person. |
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**PersonContactDTO**](PersonContactDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateContact_0"></a>
# **updateContact_0**
> ContactDTO updateContact_0(body, customerId)

Updates contact of a given client.

Updates contact of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
ContactDTO body = new ContactDTO(); // ContactDTO | Updated contact of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    ContactDTO result = apiInstance.updateContact_0(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateContact_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactDTO**](ContactDTO.md)| Updated contact of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**ContactDTO**](ContactDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCorrespondenceAddress"></a>
# **updateCorrespondenceAddress**
> AddressDTO updateCorrespondenceAddress(body, customerId)

Updates correspondence address of a given client.

Updates correspondence address of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
AddressDTO body = new AddressDTO(); // AddressDTO | Updated address of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    AddressDTO result = apiInstance.updateCorrespondenceAddress(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateCorrespondenceAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressDTO**](AddressDTO.md)| Updated address of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**AddressDTO**](AddressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomField"></a>
# **updateCustomField**
> CustomFieldDTO updateCustomField(body, customerId, customFieldKey)

Updates given custom field of a given client.

Updates given custom field of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
CustomFieldDTO body = new CustomFieldDTO(); // CustomFieldDTO | Updated custom field of a given client.
Long customerId = 789L; // Long | client's internal identifier
String customFieldKey = "customFieldKey_example"; // String | custom field's key
try {
    CustomFieldDTO result = apiInstance.updateCustomField(body, customerId, customFieldKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomFieldDTO**](CustomFieldDTO.md)| Updated custom field of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |
 **customFieldKey** | **String**| custom field&#x27;s key |

### Return type

[**CustomFieldDTO**](CustomFieldDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomFields"></a>
# **updateCustomFields**
> CustomFieldsDTO updateCustomFields(body, personId)

Updates custom fields of a given person.

Updates custom fields of a given person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields of a given person.
Long personId = 789L; // Long | person's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields(body, personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields of a given person. |
 **personId** | **Long**| person&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomFields_0"></a>
# **updateCustomFields_0**
> CustomFieldsDTO updateCustomFields_0(body, customerId)

Updates custom fields of a given client.

Updates custom fields of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields_0(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateCustomFields_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateIndustries"></a>
# **updateIndustries**
> IndustriesDTO updateIndustries(body, customerId)

Updates industries of a given client.

Updates industries of a given client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
List<Long> body = Arrays.asList({
  "description" : "ref",
  "value" : "/home-api/assets/examples/customers/updateIndustries.json#requestBody"
}L); // List<Long> | Updated industries of a given client.
Long customerId = 789L; // Long | client's internal identifier
try {
    IndustriesDTO result = apiInstance.updateIndustries(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateIndustries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)| Updated industries of a given client. |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**IndustriesDTO**](IndustriesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="update_0"></a>
# **update_0**
> CustomerDTO update_0(body, customerId)

Updates an existing client.

Only specified fields will be changed (id is required). One may not specify embeddable fields here - use separate API calls for updating them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientsApi apiInstance = new ClientsApi();
CustomerDTO body = new CustomerDTO(); // CustomerDTO | Updated client
Long customerId = 789L; // Long | client's internal identifier
try {
    CustomerDTO result = apiInstance.update_0(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#update_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerDTO**](CustomerDTO.md)| Updated client |
 **customerId** | **Long**| client&#x27;s internal identifier |

### Return type

[**CustomerDTO**](CustomerDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

