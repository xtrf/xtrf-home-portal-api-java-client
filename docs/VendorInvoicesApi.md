# VendorInvoicesApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create1**](VendorInvoicesApi.md#create1) | **POST** /accounting/providers/invoices | Creates a new invoice.
[**createPayment**](VendorInvoicesApi.md#createPayment) | **POST** /accounting/providers/invoices/{invoiceId}/payments | Creates a new payment on the vendor account and assigns the payment to the invoice.
[**delete2**](VendorInvoicesApi.md#delete2) | **DELETE** /accounting/providers/invoices/{invoiceId} | Removes a provider invoice.
[**delete2_0**](VendorInvoicesApi.md#delete2_0) | **DELETE** /accounting/providers/payments/{paymentId} | Removes a provider payment.
[**getAll2**](VendorInvoicesApi.md#getAll2) | **GET** /accounting/providers/invoices | Lists all vendor invoices in all statuses (including not ready and drafts) that have been updated since a specific date.
[**getAllIds3**](VendorInvoicesApi.md#getAllIds3) | **GET** /accounting/providers/invoices/ids | Returns vendor invoices&#x27; internal identifiers.
[**getById3**](VendorInvoicesApi.md#getById3) | **GET** /accounting/providers/invoices/{invoiceId} | Returns provider invoice details.
[**getDocument1**](VendorInvoicesApi.md#getDocument1) | **GET** /accounting/providers/invoices/{invoiceId}/document | Generates provider invoice document (PDF).
[**getPayments1**](VendorInvoicesApi.md#getPayments1) | **GET** /accounting/providers/invoices/{invoiceId}/payments | Returns all payments for the vendor invoice.
[**send**](VendorInvoicesApi.md#send) | **POST** /accounting/providers/invoices/{invoiceId}/send | Sends a provider invoice.
[**setStatus**](VendorInvoicesApi.md#setStatus) | **POST** /accounting/providers/invoices/{invoiceId}/status | Changes invoice status to given status.

<a name="create1"></a>
# **create1**
> ProviderInvoiceCreateResultDTO create1(body)

Creates a new invoice.

Creates a new invoice from jobs. Jobs are grouped by provider and currency, therefore multiple invoices can be created.If any of the jobs cannot be invoiced (ie. it is already invoiced) then an error is reported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
ProviderInvoiceCreateDTO body = new ProviderInvoiceCreateDTO(); // ProviderInvoiceCreateDTO | Created new invoice.
try {
    ProviderInvoiceCreateResultDTO result = apiInstance.create1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderInvoiceCreateDTO**](ProviderInvoiceCreateDTO.md)| Created new invoice. |

### Return type

[**ProviderInvoiceCreateResultDTO**](ProviderInvoiceCreateResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="createPayment"></a>
# **createPayment**
> createPayment(body, invoiceId)

Creates a new payment on the vendor account and assigns the payment to the invoice.

Creates a new payment on the vendor account and assigns the payment to the invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
PaymentDTO body = new PaymentDTO(); // PaymentDTO | New payment.
Long invoiceId = 789L; // Long | vendor invoice's internal identifier
try {
    apiInstance.createPayment(body, invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentDTO**](PaymentDTO.md)| New payment. |
 **invoiceId** | **Long**| vendor invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: Not defined

<a name="delete2"></a>
# **delete2**
> delete2(invoiceId)

Removes a provider invoice.

Removes a provider invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long invoiceId = 789L; // Long | provider invoice's internal identifier
try {
    apiInstance.delete2(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#delete2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| provider invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete2_0"></a>
# **delete2_0**
> delete2_0(paymentId)

Removes a provider payment.

Removes a provider payment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long paymentId = 789L; // Long | provider payment's internal identifier
try {
    apiInstance.delete2_0(paymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#delete2_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **Long**| provider payment&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll2"></a>
# **getAll2**
> List&lt;ProviderInvoiceDTO&gt; getAll2(updatedSince)

Lists all vendor invoices in all statuses (including not ready and drafts) that have been updated since a specific date.

Lists all vendor invoices in all statuses (including not ready and drafts) that have been updated since a specific date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long updatedSince = 789L; // Long | only vendor invoices modified since this timestamp
try {
    List<ProviderInvoiceDTO> result = apiInstance.getAll2(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#getAll2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only vendor invoices modified since this timestamp | [optional]

### Return type

[**List&lt;ProviderInvoiceDTO&gt;**](ProviderInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllIds3"></a>
# **getAllIds3**
> List&lt;Integer&gt; getAllIds3(updatedSince)

Returns vendor invoices&#x27; internal identifiers.

Returns vendor invoices&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long updatedSince = 789L; // Long | only vendor invoices modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds3(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#getAllIds3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only vendor invoices modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById3"></a>
# **getById3**
> ProviderInvoiceDTO getById3(invoiceId)

Returns provider invoice details.

Returns provider invoice details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long invoiceId = 789L; // Long | provider invoice's internal identifier
try {
    ProviderInvoiceDTO result = apiInstance.getById3(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#getById3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| provider invoice&#x27;s internal identifier |

### Return type

[**ProviderInvoiceDTO**](ProviderInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDocument1"></a>
# **getDocument1**
> UrlResultDTO getDocument1(invoiceId)

Generates provider invoice document (PDF).

Generates provider invoice document (PDF).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long invoiceId = 789L; // Long | provider invoice's internal identifier
try {
    UrlResultDTO result = apiInstance.getDocument1(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#getDocument1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| provider invoice&#x27;s internal identifier |

### Return type

[**UrlResultDTO**](UrlResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getPayments1"></a>
# **getPayments1**
> List&lt;PaymentDTO&gt; getPayments1(invoiceId)

Returns all payments for the vendor invoice.

Returns all payments for the vendor invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long invoiceId = 789L; // Long | vendor invoice's internal identifier
try {
    List<PaymentDTO> result = apiInstance.getPayments1(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#getPayments1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| vendor invoice&#x27;s internal identifier |

### Return type

[**List&lt;PaymentDTO&gt;**](PaymentDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="send"></a>
# **send**
> send(invoiceId)

Sends a provider invoice.

Sends a provider invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
Long invoiceId = 789L; // Long | provider invoice's internal identifier
try {
    apiInstance.send(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#send");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| provider invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setStatus"></a>
# **setStatus**
> setStatus(body, invoiceId)

Changes invoice status to given status.

Changes invoice status to given status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VendorInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

VendorInvoicesApi apiInstance = new VendorInvoicesApi();
ProviderInvoiceCreateResultDTO body = new ProviderInvoiceCreateResultDTO(); // ProviderInvoiceCreateResultDTO | Changed invoice status to given status.
Long invoiceId = 789L; // Long | provider invoice's internal identifier
try {
    apiInstance.setStatus(body, invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoicesApi#setStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProviderInvoiceCreateResultDTO**](ProviderInvoiceCreateResultDTO.md)| Changed invoice status to given status. |
 **invoiceId** | **Long**| provider invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

