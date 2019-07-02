# UsersApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](UsersApi.md#changePassword) | **PUT** /users/{userId}/password | Sets user&#x27;s password to a new value.
[**getAllNamesWithIds1**](UsersApi.md#getAllNamesWithIds1) | **GET** /users | Returns list of simple users representations
[**getById6**](UsersApi.md#getById6) | **GET** /users/{userId} | Returns user details.
[**getCustomField1**](UsersApi.md#getCustomField1) | **GET** /users/{userId}/customFields/{customFieldKey} | Returns custom field of a given user.
[**getCustomFields4**](UsersApi.md#getCustomFields4) | **GET** /users/{userId}/customFields | Returns custom fields of a given user.
[**getMe**](UsersApi.md#getMe) | **GET** /users/me | Returns currently signed in user details.
[**update**](UsersApi.md#update) | **PUT** /users/{userId} | Updates an existing user.
[**updateCustomField**](UsersApi.md#updateCustomField) | **PUT** /users/{userId}/customFields/{customFieldKey} | Updates given custom field of a given user.
[**updateCustomFields**](UsersApi.md#updateCustomFields) | **PUT** /users/{userId}/customFields | Updates custom fields of a given user.

<a name="changePassword"></a>
# **changePassword**
> changePassword(userId, oldPassword, newPassword)

Sets user&#x27;s password to a new value.

Sets user&#x27;s password to a new value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | user's internal identifier
String oldPassword = "oldPassword_example"; // String | 
String newPassword = "newPassword_example"; // String | 
try {
    apiInstance.changePassword(userId, oldPassword, newPassword);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user&#x27;s internal identifier |
 **oldPassword** | **String**|  | [optional]
 **newPassword** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAllNamesWithIds1"></a>
# **getAllNamesWithIds1**
> List&lt;EntityWithNameDTO&gt; getAllNamesWithIds1()

Returns list of simple users representations

Returns list of simple users representations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    List<EntityWithNameDTO> result = apiInstance.getAllNamesWithIds1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAllNamesWithIds1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EntityWithNameDTO&gt;**](EntityWithNameDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById6"></a>
# **getById6**
> UserDTO getById6(userId)

Returns user details.

Returns user details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | user's internal identifier
try {
    UserDTO result = apiInstance.getById6(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getById6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user&#x27;s internal identifier |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomField1"></a>
# **getCustomField1**
> CustomFieldDTO getCustomField1(userId, customFieldKey)

Returns custom field of a given user.

Returns custom field of a given user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | user's internal identifier
String customFieldKey = "customFieldKey_example"; // String | custom field's key
try {
    CustomFieldDTO result = apiInstance.getCustomField1(userId, customFieldKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getCustomField1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user&#x27;s internal identifier |
 **customFieldKey** | **String**| custom field&#x27;s key |

### Return type

[**CustomFieldDTO**](CustomFieldDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields4"></a>
# **getCustomFields4**
> CustomFieldsDTO getCustomFields4(userId)

Returns custom fields of a given user.

Returns custom fields of a given user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | user's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields4(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getCustomFields4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getMe"></a>
# **getMe**
> UserDTO getMe()

Returns currently signed in user details.

Returns currently signed in user details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserDTO result = apiInstance.getMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getMe");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="update"></a>
# **update**
> UserDTO update(body, userId)

Updates an existing user.

Updates an existing user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserDTO body = new UserDTO(); // UserDTO | Updated existing user.
Long userId = 789L; // Long | user's internal identifier
try {
    UserDTO result = apiInstance.update(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDTO**](UserDTO.md)| Updated existing user. |
 **userId** | **Long**| user&#x27;s internal identifier |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomField"></a>
# **updateCustomField**
> CustomFieldDTO updateCustomField(body, userId, customFieldKey)

Updates given custom field of a given user.

Updates given custom field of a given user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
CustomFieldDTO body = new CustomFieldDTO(); // CustomFieldDTO | Updated custom fields of a given user.
Long userId = 789L; // Long | user's internal identifier
String customFieldKey = "customFieldKey_example"; // String | custom field's key
try {
    CustomFieldDTO result = apiInstance.updateCustomField(body, userId, customFieldKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomFieldDTO**](CustomFieldDTO.md)| Updated custom fields of a given user. |
 **userId** | **Long**| user&#x27;s internal identifier |
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
> CustomFieldsDTO updateCustomFields(body, userId)

Updates custom fields of a given user.

Updates custom fields of a given user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields of a given user.
Long userId = 789L; // Long | user's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields of a given user. |
 **userId** | **Long**| user&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

