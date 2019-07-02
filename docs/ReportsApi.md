# ReportsApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete4**](ReportsApi.md#delete4) | **DELETE** /reports/{reportId} | Removes a report.
[**duplicate1**](ReportsApi.md#duplicate1) | **POST** /reports/{reportId}/duplicate | Duplicates a report.
[**exportToXML**](ReportsApi.md#exportToXML) | **POST** /reports/export/xml | Exports reports definition to XML.
[**generateCSV**](ReportsApi.md#generateCSV) | **GET** /reports/{reportId}/result/csv | Generates CSV content for a report.
[**generatePrinterFriendly**](ReportsApi.md#generatePrinterFriendly) | **GET** /reports/{reportId}/result/printerFriendly | Generates printer friendly content for a report.
[**importFromXML**](ReportsApi.md#importFromXML) | **POST** /reports/import/xml | Imports reports definition from XML.
[**setPreferred**](ReportsApi.md#setPreferred) | **PUT** /reports/{reportId}/preferred | Marks report as preferred or not.

<a name="delete4"></a>
# **delete4**
> delete4(reportId)

Removes a report.

Removes a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
Long reportId = 789L; // Long | report's internal identifier
try {
    apiInstance.delete4(reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#delete4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Long**| report&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="duplicate1"></a>
# **duplicate1**
> duplicate1(reportId)

Duplicates a report.

Duplicates a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
Long reportId = 789L; // Long | report's internal identifier
try {
    apiInstance.duplicate1(reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#duplicate1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Long**| report&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exportToXML"></a>
# **exportToXML**
> ReportResultDTO exportToXML(body)

Exports reports definition to XML.

Exports reports definition to XML.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
ExportRequestDTO body = new ExportRequestDTO(); // ExportRequestDTO | Exported reports definition to XML.
try {
    ReportResultDTO result = apiInstance.exportToXML(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#exportToXML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExportRequestDTO**](ExportRequestDTO.md)| Exported reports definition to XML. |

### Return type

[**ReportResultDTO**](ReportResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="generateCSV"></a>
# **generateCSV**
> ReportResultDTO generateCSV(reportId)

Generates CSV content for a report.

Generates CSV content for a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
Long reportId = 789L; // Long | report's internal identifier
try {
    ReportResultDTO result = apiInstance.generateCSV(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateCSV");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Long**| report&#x27;s internal identifier |

### Return type

[**ReportResultDTO**](ReportResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="generatePrinterFriendly"></a>
# **generatePrinterFriendly**
> ReportResultDTO generatePrinterFriendly(reportId)

Generates printer friendly content for a report.

Generates printer friendly content for a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
Long reportId = 789L; // Long | report's internal identifier
try {
    ReportResultDTO result = apiInstance.generatePrinterFriendly(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generatePrinterFriendly");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Long**| report&#x27;s internal identifier |

### Return type

[**ReportResultDTO**](ReportResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="importFromXML"></a>
# **importFromXML**
> ImportResultDTO importFromXML(body)

Imports reports definition from XML.

Imports a report definition from an XML using a file token. To obtain the token, you first need to upload a temporary XML file, as specified in the Files section. Note that the name of the imported report must be unique.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
ImportRequestDTO body = new ImportRequestDTO(); // ImportRequestDTO | Imported reports definition from XML.
try {
    ImportResultDTO result = apiInstance.importFromXML(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#importFromXML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportRequestDTO**](ImportRequestDTO.md)| Imported reports definition from XML. |

### Return type

[**ImportResultDTO**](ImportResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="setPreferred"></a>
# **setPreferred**
> setPreferred(body, reportId)

Marks report as preferred or not.

Marks report as preferred or not.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
PreferredRequestDTO body = new PreferredRequestDTO(); // PreferredRequestDTO | Marked report as preferred or not.
Long reportId = 789L; // Long | report's internal identifier
try {
    apiInstance.setPreferred(body, reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#setPreferred");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreferredRequestDTO**](PreferredRequestDTO.md)| Marked report as preferred or not. |
 **reportId** | **Long**| report&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: Not defined

