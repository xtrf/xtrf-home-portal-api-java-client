# ClientInvoicesApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ClientInvoicesApi.md#create) | **POST** /accounting/customers/invoices | Creates a new invoice.
[**createPayment**](ClientInvoicesApi.md#createPayment) | **POST** /accounting/customers/invoices/{invoiceId}/payments | Adds a new payment to the client invoice. The invoice payment status (Not Paid, Partially Paid, Fully Paid) is automatically recalculated.
[**delete**](ClientInvoicesApi.md#delete) | **DELETE** /accounting/customers/invoices/{invoiceId} | Removes a client invoice.
[**delete_0**](ClientInvoicesApi.md#delete_0) | **DELETE** /accounting/customers/payments/{paymentId} | Removes a customer payment.
[**downloadDocuments**](ClientInvoicesApi.md#downloadDocuments) | **POST** /accounting/customers/invoices/documents | Generates client invoices&#x27; documents.
[**duplicate**](ClientInvoicesApi.md#duplicate) | **POST** /accounting/customers/invoices/{invoiceId}/duplicate | Duplicate client invoice.
[**duplicateAsProForma**](ClientInvoicesApi.md#duplicateAsProForma) | **POST** /accounting/customers/invoices/{invoiceId}/duplicate/proForma | Duplicate client invoice as pro forma.
[**getAll**](ClientInvoicesApi.md#getAll) | **GET** /accounting/customers/invoices | Lists all client invoices in all statuses (including not ready and drafts) that have been updated since a specific date.
[**getAllIds**](ClientInvoicesApi.md#getAllIds) | **GET** /accounting/customers/invoices/ids | Returns client invoices&#x27; internal identifiers.
[**getById**](ClientInvoicesApi.md#getById) | **GET** /accounting/customers/invoices/{invoiceId} | Returns client invoice details.
[**getDates**](ClientInvoicesApi.md#getDates) | **GET** /accounting/customers/invoices/{invoiceId}/dates | Returns dates of a given client invoice.
[**getDocument**](ClientInvoicesApi.md#getDocument) | **GET** /accounting/customers/invoices/{invoiceId}/document | Generates client invoice document (PDF).
[**getPaymentTerms**](ClientInvoicesApi.md#getPaymentTerms) | **GET** /accounting/customers/invoices/{invoiceId}/paymentTerms | Returns payment terms of a given client invoice.
[**getPayments**](ClientInvoicesApi.md#getPayments) | **GET** /accounting/customers/invoices/{invoiceId}/payments | Returns all payments for the client invoice.
[**sendReminder**](ClientInvoicesApi.md#sendReminder) | **POST** /accounting/customers/invoices/{invoiceId}/sendReminder | Sends reminder.
[**sendReminders**](ClientInvoicesApi.md#sendReminders) | **POST** /accounting/customers/invoices/sendReminders | Sends reminders. Returns number of sent e-mails.

<a name="create"></a>
# **create**
> CustomerInvoiceCreateResultDTO create(body)

Creates a new invoice.

Creates a new invoice from tasks. Tasks are grouped by client and currency, therefore multiple invoices can be created.If any of the tasks cannot be invoiced (ie. it is already invoiced, not invoiceable, not associated with a project) then an error is reported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
CustomerInvoiceCreateDTO body = new CustomerInvoiceCreateDTO(); // CustomerInvoiceCreateDTO | Created new invoice.
try {
    CustomerInvoiceCreateResultDTO result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerInvoiceCreateDTO**](CustomerInvoiceCreateDTO.md)| Created new invoice. |

### Return type

[**CustomerInvoiceCreateResultDTO**](CustomerInvoiceCreateResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="createPayment"></a>
# **createPayment**
> createPayment(body, invoiceId)

Adds a new payment to the client invoice. The invoice payment status (Not Paid, Partially Paid, Fully Paid) is automatically recalculated.

Adds a new payment to the client invoice. The invoice payment status (Not Paid, Partially Paid, Fully Paid) is automatically recalculated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
PaymentDTO body = new PaymentDTO(); // PaymentDTO | New payment.
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    apiInstance.createPayment(body, invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentDTO**](PaymentDTO.md)| New payment. |
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(invoiceId)

Removes a client invoice.

Removes a client invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    apiInstance.delete(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete_0"></a>
# **delete_0**
> delete_0(paymentId)

Removes a customer payment.

Removes a customer payment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long paymentId = 789L; // Long | customer payment's internal identifier
try {
    apiInstance.delete_0(paymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#delete_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **Long**| customer payment&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadDocuments"></a>
# **downloadDocuments**
> UrlResultDTO downloadDocuments(body)

Generates client invoices&#x27; documents.

Generates client invoices&#x27; documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
DownloadDocumentsRequestDTO body = new DownloadDocumentsRequestDTO(); // DownloadDocumentsRequestDTO | Generated client invoices documents.
try {
    UrlResultDTO result = apiInstance.downloadDocuments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#downloadDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DownloadDocumentsRequestDTO**](DownloadDocumentsRequestDTO.md)| Generated client invoices documents. |

### Return type

[**UrlResultDTO**](UrlResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="duplicate"></a>
# **duplicate**
> CustomerInvoiceDTO duplicate(invoiceId)

Duplicate client invoice.

Duplicate client invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    CustomerInvoiceDTO result = apiInstance.duplicate(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#duplicate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**CustomerInvoiceDTO**](CustomerInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="duplicateAsProForma"></a>
# **duplicateAsProForma**
> CustomerInvoiceDTO duplicateAsProForma(invoiceId)

Duplicate client invoice as pro forma.

Duplicate client invoice as pro forma.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    CustomerInvoiceDTO result = apiInstance.duplicateAsProForma(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#duplicateAsProForma");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**CustomerInvoiceDTO**](CustomerInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAll"></a>
# **getAll**
> List&lt;CustomerInvoiceDTO&gt; getAll(updatedSince)

Lists all client invoices in all statuses (including not ready and drafts) that have been updated since a specific date.

Lists all client invoices in all statuses (including not ready and drafts) that have been updated since a specific date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long updatedSince = 789L; // Long | only client invoices modified since this timestamp
try {
    List<CustomerInvoiceDTO> result = apiInstance.getAll(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only client invoices modified since this timestamp | [optional]

### Return type

[**List&lt;CustomerInvoiceDTO&gt;**](CustomerInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getAllIds"></a>
# **getAllIds**
> List&lt;Integer&gt; getAllIds(updatedSince)

Returns client invoices&#x27; internal identifiers.

Returns client invoices&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long updatedSince = 789L; // Long | only client invoices modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getAllIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only client invoices modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById"></a>
# **getById**
> CustomerInvoiceDTO getById(invoiceId, embed)

Returns client invoice details.

Returns client invoice details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
String embed = "embed_example"; // String | list of adittional fields which should be embedded in the response (ie. tasks)
try {
    CustomerInvoiceDTO result = apiInstance.getById(invoiceId, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |
 **embed** | **String**| list of adittional fields which should be embedded in the response (ie. tasks) | [optional]

### Return type

[**CustomerInvoiceDTO**](CustomerInvoiceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDates"></a>
# **getDates**
> CustomerInvoiceDatesDTO getDates(invoiceId)

Returns dates of a given client invoice.

Returns dates of a given client invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    CustomerInvoiceDatesDTO result = apiInstance.getDates(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**CustomerInvoiceDatesDTO**](CustomerInvoiceDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDocument"></a>
# **getDocument**
> UrlResultDTO getDocument(invoiceId)

Generates client invoice document (PDF).

Generates client invoice document (PDF).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    UrlResultDTO result = apiInstance.getDocument(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**UrlResultDTO**](UrlResultDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getPaymentTerms"></a>
# **getPaymentTerms**
> PaymentTermsDTO getPaymentTerms(invoiceId)

Returns payment terms of a given client invoice.

Returns payment terms of a given client invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    PaymentTermsDTO result = apiInstance.getPaymentTerms(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getPaymentTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**PaymentTermsDTO**](PaymentTermsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getPayments"></a>
# **getPayments**
> List&lt;PaymentDTO&gt; getPayments(invoiceId)

Returns all payments for the client invoice.

Returns all payments for the client invoice.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    List<PaymentDTO> result = apiInstance.getPayments(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#getPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

[**List&lt;PaymentDTO&gt;**](PaymentDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="sendReminder"></a>
# **sendReminder**
> sendReminder(invoiceId)

Sends reminder.

Sends reminder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
Long invoiceId = 789L; // Long | client invoice's internal identifier
try {
    apiInstance.sendReminder(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#sendReminder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| client invoice&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendReminders"></a>
# **sendReminders**
> SendRemindersResponseDTO sendReminders(body)

Sends reminders. Returns number of sent e-mails.

Sends reminders. Returns number of sent e-mails.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ClientInvoicesApi apiInstance = new ClientInvoicesApi();
SendRemindersRequestDTO body = new SendRemindersRequestDTO(); // SendRemindersRequestDTO | Number of sent e-mails.
try {
    SendRemindersResponseDTO result = apiInstance.sendReminders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInvoicesApi#sendReminders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendRemindersRequestDTO**](SendRemindersRequestDTO.md)| Number of sent e-mails. |

### Return type

[**SendRemindersResponseDTO**](SendRemindersResponseDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

