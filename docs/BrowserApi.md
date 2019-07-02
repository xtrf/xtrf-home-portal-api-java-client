# BrowserApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**browseCSV**](BrowserApi.md#browseCSV) | **GET** /browser/csv | Searches for data (ie. customer, task, etc) and returns it in a CSV form.
[**browseJSON**](BrowserApi.md#browseJSON) | **GET** /browser | Searches for data (ie. customer, task, etc) and returns it in a tabular form.
[**create**](BrowserApi.md#create) | **POST** /browser/views/for/{className} | Creates view for given class.
[**delete**](BrowserApi.md#delete) | **DELETE** /browser/views/{viewId} | Removes a view.
[**deleteColumn**](BrowserApi.md#deleteColumn) | **DELETE** /browser/views/{viewId}/columns/{columnName} | Deletes a single column from view.
[**get**](BrowserApi.md#get) | **GET** /browser/views/{viewId} | Returns all view&#x27;s information.
[**getColumnSettings**](BrowserApi.md#getColumnSettings) | **GET** /browser/views/{viewId}/columns/{columnName}/settings | Returns column&#x27;s specific settings.
[**getColumns**](BrowserApi.md#getColumns) | **GET** /browser/views/{viewId}/columns | Returns columns defined in view.
[**getCurrentViewDetails**](BrowserApi.md#getCurrentViewDetails) | **GET** /browser/views/details/for/{className} | Returns current view&#x27;s detailed information, suitable for browser.
[**getFilter**](BrowserApi.md#getFilter) | **GET** /browser/views/{viewId}/filter | Returns view&#x27;s filter.
[**getLocalSettings**](BrowserApi.md#getLocalSettings) | **GET** /browser/views/{viewId}/settings/local | Returns view&#x27;s local settings (for current user).
[**getOrder**](BrowserApi.md#getOrder) | **GET** /browser/views/{viewId}/order | Returns view&#x27;s order settings.
[**getPermissions**](BrowserApi.md#getPermissions) | **GET** /browser/views/{viewId}/permissions | Returns view&#x27;s permissions.
[**getSettings**](BrowserApi.md#getSettings) | **GET** /browser/views/{viewId}/settings | Returns view&#x27;s settings.
[**getViewDetails**](BrowserApi.md#getViewDetails) | **GET** /browser/views/details/for/{className}/{viewId} | Returns view&#x27;s detailed information, suitable for browser.
[**getViewsBrief**](BrowserApi.md#getViewsBrief) | **GET** /browser/views/for/{className} | Returns views&#x27; brief.
[**selectViewAndGetItsDetails**](BrowserApi.md#selectViewAndGetItsDetails) | **POST** /browser/views/details/for/{className}/{viewId} | Selects given view as current and returns its detailed information, suitable for browser.
[**update**](BrowserApi.md#update) | **PUT** /browser/views/{viewId} | Updates all view&#x27;s information.
[**updateColumnSettings**](BrowserApi.md#updateColumnSettings) | **PUT** /browser/views/{viewId}/columns/{columnName}/settings | Updates column&#x27;s specific settings.
[**updateColumns**](BrowserApi.md#updateColumns) | **PUT** /browser/views/{viewId}/columns | Updates columns in view.
[**updateFilter**](BrowserApi.md#updateFilter) | **PUT** /browser/views/{viewId}/filter | Updates view&#x27;s filter.
[**updateFilterProperty**](BrowserApi.md#updateFilterProperty) | **PUT** /browser/views/{viewId}/filter/{filterProperty} | Updates view&#x27;s filter property.
[**updateLocalSettings**](BrowserApi.md#updateLocalSettings) | **PUT** /browser/views/{viewId}/settings/local | Updates view&#x27;s local settings (for current user).
[**updateOrder**](BrowserApi.md#updateOrder) | **PUT** /browser/views/{viewId}/order | Updates view&#x27;s order settings.
[**updatePermissions**](BrowserApi.md#updatePermissions) | **PUT** /browser/views/{viewId}/permissions | Updates view&#x27;s permissions.
[**updateSettings**](BrowserApi.md#updateSettings) | **PUT** /browser/views/{viewId}/settings | Updates view&#x27;s settings.

<a name="browseCSV"></a>
# **browseCSV**
> Object browseCSV(viewId, separator, additionalOrder)

Searches for data (ie. customer, task, etc) and returns it in a CSV form.

Searches for data (ie. customer, task, etc) and returns it in a CSV form.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
String separator = "separator_example"; // String | csv field separator
String additionalOrder = "additionalOrder_example"; // String | 
try {
    Object result = apiInstance.browseCSV(viewId, separator, additionalOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#browseCSV");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier | [optional]
 **separator** | **String**| csv field separator | [optional]
 **additionalOrder** | **String**|  | [optional]

### Return type

**Object**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="browseJSON"></a>
# **browseJSON**
> Object browseJSON(viewId, page, additionalOrder, useDeferredColumns, maxRows)

Searches for data (ie. customer, task, etc) and returns it in a tabular form.

Searches for data (ie. customer, task, etc) and returns it in a tabular form.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
Integer page = 56; // Integer | 
String additionalOrder = "additionalOrder_example"; // String | 
String useDeferredColumns = "useDeferredColumns_example"; // String | 
Integer maxRows = 56; // Integer | overrides view's default rows limit, supported values 10 to 1000
try {
    Object result = apiInstance.browseJSON(viewId, page, additionalOrder, useDeferredColumns, maxRows);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#browseJSON");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier | [optional]
 **page** | **Integer**|  | [optional]
 **additionalOrder** | **String**|  | [optional]
 **useDeferredColumns** | **String**|  | [optional]
 **maxRows** | **Integer**| overrides view&#x27;s default rows limit, supported values 10 to 1000 | [optional]

### Return type

**Object**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="create"></a>
# **create**
> ViewWithIdDTO create(body, className)

Creates view for given class.

Creates view for given class.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
ViewDTO body = new ViewDTO(); // ViewDTO | Created view for given class.
String className = "className_example"; // String | view's class name
try {
    ViewWithIdDTO result = apiInstance.create(body, className);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ViewDTO**](ViewDTO.md)| Created view for given class. |
 **className** | **String**| view&#x27;s class name |

### Return type

[**ViewWithIdDTO**](ViewWithIdDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="delete"></a>
# **delete**
> delete(viewId)

Removes a view.

Removes a view. No content is returned upon success (204).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's internal identifier
try {
    apiInstance.delete(viewId);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteColumn"></a>
# **deleteColumn**
> List&lt;ColumnDTO&gt; deleteColumn(viewId, columnName)

Deletes a single column from view.

Deletes a single column from view.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
String columnName = "columnName_example"; // String | column's name
try {
    List<ColumnDTO> result = apiInstance.deleteColumn(viewId, columnName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#deleteColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |
 **columnName** | **String**| column&#x27;s name |

### Return type

[**List&lt;ColumnDTO&gt;**](ColumnDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="get"></a>
# **get**
> ViewDTO get(viewId)

Returns all view&#x27;s information.

Returns all view&#x27;s information (ie. name, columns, filters, etc).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    ViewDTO result = apiInstance.get(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**ViewDTO**](ViewDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getColumnSettings"></a>
# **getColumnSettings**
> Object getColumnSettings(viewId, columnName)

Returns column&#x27;s specific settings.

Returns column&#x27;s specific settings. For example when column describes money amount we can decide whether it should display currency or not.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
String columnName = "columnName_example"; // String | column's name
try {
    Object result = apiInstance.getColumnSettings(viewId, columnName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getColumnSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |
 **columnName** | **String**| column&#x27;s name |

### Return type

**Object**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getColumns"></a>
# **getColumns**
> List&lt;ColumnDTO&gt; getColumns(viewId)

Returns columns defined in view.

Returns columns defined in view.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    List<ColumnDTO> result = apiInstance.getColumns(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**List&lt;ColumnDTO&gt;**](ColumnDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCurrentViewDetails"></a>
# **getCurrentViewDetails**
> ViewDetailsDTO getCurrentViewDetails(className, placeName)

Returns current view&#x27;s detailed information, suitable for browser.

Returns current view&#x27;s detailed information, suitable for browser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
String className = "className_example"; // String | views' class name
String placeName = "placeName_example"; // String | place name (denotes specific place in system with the table)
try {
    ViewDetailsDTO result = apiInstance.getCurrentViewDetails(className, placeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getCurrentViewDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| views&#x27; class name |
 **placeName** | **String**| place name (denotes specific place in system with the table) | [optional]

### Return type

[**ViewDetailsDTO**](ViewDetailsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getFilter"></a>
# **getFilter**
> FilterDTO getFilter(viewId)

Returns view&#x27;s filter.

Returns view&#x27;s filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    FilterDTO result = apiInstance.getFilter(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**FilterDTO**](FilterDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getLocalSettings"></a>
# **getLocalSettings**
> LocalSettingsDTO getLocalSettings(viewId)

Returns view&#x27;s local settings (for current user).

Returns view&#x27;s local settings (for current user).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    LocalSettingsDTO result = apiInstance.getLocalSettings(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getLocalSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**LocalSettingsDTO**](LocalSettingsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getOrder"></a>
# **getOrder**
> OrderDTO getOrder(viewId)

Returns view&#x27;s order settings.

Returns view&#x27;s order settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    OrderDTO result = apiInstance.getOrder(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**OrderDTO**](OrderDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getPermissions"></a>
# **getPermissions**
> PermissionsDTO getPermissions(viewId)

Returns view&#x27;s permissions.

Returns view&#x27;s permissions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    PermissionsDTO result = apiInstance.getPermissions(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**PermissionsDTO**](PermissionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getSettings"></a>
# **getSettings**
> SettingsDTO getSettings(viewId)

Returns view&#x27;s settings.

Returns view&#x27;s settings (ie. name).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Long viewId = 789L; // Long | view's identifier
try {
    SettingsDTO result = apiInstance.getSettings(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**SettingsDTO**](SettingsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getViewDetails"></a>
# **getViewDetails**
> ViewDetailsDTO getViewDetails(className, viewId, placeName)

Returns view&#x27;s detailed information, suitable for browser.

Returns view&#x27;s detailed information, suitable for browser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
String className = "className_example"; // String | views' class name
Long viewId = 789L; // Long | 
String placeName = "placeName_example"; // String | place name (denotes specific place in system with the table)
try {
    ViewDetailsDTO result = apiInstance.getViewDetails(className, viewId, placeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getViewDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| views&#x27; class name |
 **viewId** | **Long**|  |
 **placeName** | **String**| place name (denotes specific place in system with the table) | [optional]

### Return type

[**ViewDetailsDTO**](ViewDetailsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getViewsBrief"></a>
# **getViewsBrief**
> ViewsBriefDTO getViewsBrief(className, placeName)

Returns views&#x27; brief.

Returns views&#x27; brief.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
String className = "className_example"; // String | views' class name
String placeName = "placeName_example"; // String | place name (denotes specific place in system with the table)
try {
    ViewsBriefDTO result = apiInstance.getViewsBrief(className, placeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#getViewsBrief");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| views&#x27; class name |
 **placeName** | **String**| place name (denotes specific place in system with the table) | [optional]

### Return type

[**ViewsBriefDTO**](ViewsBriefDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="selectViewAndGetItsDetails"></a>
# **selectViewAndGetItsDetails**
> ViewDetailsDTO selectViewAndGetItsDetails(className, viewId, placeNameDenotesSpecificPlaceInSystemWithTheTable)

Selects given view as current and returns its detailed information, suitable for browser.

Selects given view as current and returns its detailed information, suitable for browser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
String className = "className_example"; // String | views' class name
Long viewId = 789L; // Long | 
String placeNameDenotesSpecificPlaceInSystemWithTheTable = "placeNameDenotesSpecificPlaceInSystemWithTheTable_example"; // String | 
try {
    ViewDetailsDTO result = apiInstance.selectViewAndGetItsDetails(className, viewId, placeNameDenotesSpecificPlaceInSystemWithTheTable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#selectViewAndGetItsDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| views&#x27; class name |
 **viewId** | **Long**|  |
 **placeNameDenotesSpecificPlaceInSystemWithTheTable** | **String**|  | [optional]

### Return type

[**ViewDetailsDTO**](ViewDetailsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="update"></a>
# **update**
> ViewDTO update(body, viewId)

Updates all view&#x27;s information.

Updates all view&#x27;s information (ie. name, columns, filters, etc).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
ViewDTO body = new ViewDTO(); // ViewDTO | Updated all view's information.
Long viewId = 789L; // Long | view's identifier
try {
    ViewDTO result = apiInstance.update(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ViewDTO**](ViewDTO.md)| Updated all view&#x27;s information. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**ViewDTO**](ViewDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateColumnSettings"></a>
# **updateColumnSettings**
> Object updateColumnSettings(body, viewId, columnName)

Updates column&#x27;s specific settings.

Updates column&#x27;s specific settings. For example when column describes money amount we can decide whether it should display currency or not.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
Object body = {
  "description" : "ref",
  "value" : "/home-api/assets/examples/browsers/views/updateColumnSettings.json#requestBody"
}; // Object | Updated column's specific settings.
Long viewId = 789L; // Long | view's identifier
String columnName = "columnName_example"; // String | column's name
try {
    Object result = apiInstance.updateColumnSettings(body, viewId, columnName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateColumnSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Updated column&#x27;s specific settings. |
 **viewId** | **Long**| view&#x27;s identifier |
 **columnName** | **String**| column&#x27;s name |

### Return type

**Object**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateColumns"></a>
# **updateColumns**
> List&lt;ColumnDTO&gt; updateColumns(body, viewId)

Updates columns in view.

Updates columns in view.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
List<ColumnDTO> body = Arrays.asList(new ColumnDTO()); // List<ColumnDTO> | Updated columns in view.
Long viewId = 789L; // Long | view's identifier
try {
    List<ColumnDTO> result = apiInstance.updateColumns(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;ColumnDTO&gt;**](ColumnDTO.md)| Updated columns in view. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**List&lt;ColumnDTO&gt;**](ColumnDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateFilter"></a>
# **updateFilter**
> FilterDTO updateFilter(body, viewId)

Updates view&#x27;s filter.

Updates view&#x27;s filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
List<FilterPropertyDTO> body = Arrays.asList(new FilterPropertyDTO()); // List<FilterPropertyDTO> | Updated view's filter.
Long viewId = 789L; // Long | view's identifier
try {
    FilterDTO result = apiInstance.updateFilter(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;FilterPropertyDTO&gt;**](FilterPropertyDTO.md)| Updated view&#x27;s filter. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**FilterDTO**](FilterDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateFilterProperty"></a>
# **updateFilterProperty**
> Object updateFilterProperty(body, viewId, filterProperty)

Updates view&#x27;s filter property.

Updates view&#x27;s filter property.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
FilterPropertyDTO body = new FilterPropertyDTO(); // FilterPropertyDTO | Updated view's filter property.
Long viewId = 789L; // Long | view's identifier
String filterProperty = "filterProperty_example"; // String | view's filter property name
try {
    Object result = apiInstance.updateFilterProperty(body, viewId, filterProperty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateFilterProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterPropertyDTO**](FilterPropertyDTO.md)| Updated view&#x27;s filter property. |
 **viewId** | **Long**| view&#x27;s identifier |
 **filterProperty** | **String**| view&#x27;s filter property name |

### Return type

**Object**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateLocalSettings"></a>
# **updateLocalSettings**
> LocalSettingsDTO updateLocalSettings(body, viewId)

Updates view&#x27;s local settings (for current user).

Updates view&#x27;s local settings (for current user).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
LocalSettingsDTO body = new LocalSettingsDTO(); // LocalSettingsDTO | Updated view's local settings (for current user).
Long viewId = 789L; // Long | view's identifier
try {
    LocalSettingsDTO result = apiInstance.updateLocalSettings(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateLocalSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocalSettingsDTO**](LocalSettingsDTO.md)| Updated view&#x27;s local settings (for current user). |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**LocalSettingsDTO**](LocalSettingsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateOrder"></a>
# **updateOrder**
> OrderDTO updateOrder(body, viewId)

Updates view&#x27;s order settings.

Updates view&#x27;s order settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
OrderDTO body = new OrderDTO(); // OrderDTO | Updated view's order settings.
Long viewId = 789L; // Long | view's identifier
try {
    OrderDTO result = apiInstance.updateOrder(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderDTO**](OrderDTO.md)| Updated view&#x27;s order settings. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**OrderDTO**](OrderDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updatePermissions"></a>
# **updatePermissions**
> PermissionsDTO updatePermissions(body, viewId)

Updates view&#x27;s permissions.

Updates view&#x27;s permissions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
PermissionsDTO body = new PermissionsDTO(); // PermissionsDTO | Updated view's permissions.
Long viewId = 789L; // Long | view's identifier
try {
    PermissionsDTO result = apiInstance.updatePermissions(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updatePermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsDTO**](PermissionsDTO.md)| Updated view&#x27;s permissions. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**PermissionsDTO**](PermissionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateSettings"></a>
# **updateSettings**
> SettingsDTO updateSettings(body, viewId)

Updates view&#x27;s settings.

Updates view&#x27;s settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BrowserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

BrowserApi apiInstance = new BrowserApi();
SettingsDTO body = new SettingsDTO(); // SettingsDTO | Updated view's settings.
Long viewId = 789L; // Long | view's identifier
try {
    SettingsDTO result = apiInstance.updateSettings(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrowserApi#updateSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingsDTO**](SettingsDTO.md)| Updated view&#x27;s settings. |
 **viewId** | **Long**| view&#x27;s identifier |

### Return type

[**SettingsDTO**](SettingsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

