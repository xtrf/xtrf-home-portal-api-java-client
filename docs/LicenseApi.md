# LicenseApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLicense**](LicenseApi.md#getLicense) | **GET** /license | Returns license content.
[**refresh**](LicenseApi.md#refresh) | **POST** /license/refresh | Refreshes license content.

<a name="getLicense"></a>
# **getLicense**
> GetLicenseResult getLicense()

Returns license content.

Returns license content.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

LicenseApi apiInstance = new LicenseApi();
try {
    GetLicenseResult result = apiInstance.getLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLicenseResult**](GetLicenseResult.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="refresh"></a>
# **refresh**
> refresh()

Refreshes license content.

Refreshes license content. This method returns OK immediately and license is refreshed asynchronously. It takes a while (usually a few seconds) for the license to be actually refreshed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

LicenseApi apiInstance = new LicenseApi();
try {
    apiInstance.refresh();
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#refresh");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

