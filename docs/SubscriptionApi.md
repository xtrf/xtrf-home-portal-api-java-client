# SubscriptionApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areHooksSupported**](SubscriptionApi.md#areHooksSupported) | **GET** /subscription/supports | This method can be used to determine if hooks are supported.
[**getAll4**](SubscriptionApi.md#getAll4) | **GET** /subscription | Returns all subscriptions
[**subscribe**](SubscriptionApi.md#subscribe) | **POST** /subscription | Subscribe to event
[**unsubscribe**](SubscriptionApi.md#unsubscribe) | **DELETE** /subscription/{subscriptionId} | Unsubscribe from event

<a name="areHooksSupported"></a>
# **areHooksSupported**
> Boolean areHooksSupported()

This method can be used to determine if hooks are supported.

This method can be used to determine if hooks are supported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
try {
    Boolean result = apiInstance.areHooksSupported();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#areHooksSupported");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAll4"></a>
# **getAll4**
> List&lt;ActiveSubscriptionDTO&gt; getAll4()

Returns all subscriptions

Returns all subscriptions. Subscriptions are automatically removed if they do not work (ie. if 404 status is returned). To improve notification reliability one can use this method to check if subscription is still active and re-subscribe if necessary.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
try {
    List<ActiveSubscriptionDTO> result = apiInstance.getAll4();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#getAll4");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ActiveSubscriptionDTO&gt;**](ActiveSubscriptionDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="subscribe"></a>
# **subscribe**
> String subscribe(body)

Subscribe to event

Subscribe to event. Returns subscription Id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
SubscriptionDTO body = new SubscriptionDTO(); // SubscriptionDTO | Returns subscription Id.
try {
    String result = apiInstance.subscribe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#subscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDTO**](SubscriptionDTO.md)| Returns subscription Id. |

### Return type

**String**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="unsubscribe"></a>
# **unsubscribe**
> unsubscribe(subscriptionId)

Unsubscribe from event

Unsubscribe from job status changed event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubscriptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

SubscriptionApi apiInstance = new SubscriptionApi();
String subscriptionId = "subscriptionId_example"; // String | 
try {
    apiInstance.unsubscribe(subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#unsubscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

