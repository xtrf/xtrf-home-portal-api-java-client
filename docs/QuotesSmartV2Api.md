# QuotesSmartV2Api

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFiles2**](QuotesSmartV2Api.md#addFiles2) | **PUT** /v2/quotes/{quoteId}/files/add | Adds files to the quote as added by PM.
[**archive1**](QuotesSmartV2Api.md#archive1) | **POST** /v2/quotes/files/archive | Prepares a ZIP archive that contains the specified files.
[**changeStatus2**](QuotesSmartV2Api.md#changeStatus2) | **PUT** /v2/quotes/{quoteId}/status | Changes quote status if possible (400 Bad Request is returned otherwise).
[**create3**](QuotesSmartV2Api.md#create3) | **POST** /v2/quotes | Creates a new Smart Quote.
[**createPayable1**](QuotesSmartV2Api.md#createPayable1) | **POST** /v2/quotes/{quoteId}/finance/payables | Adds a payable to a quote.
[**createReceivable1**](QuotesSmartV2Api.md#createReceivable1) | **POST** /v2/quotes/{quoteId}/finance/receivables | Adds a receivable to a quote.
[**deletePayable**](QuotesSmartV2Api.md#deletePayable) | **DELETE** /v2/quotes/{quoteId}/finance/payables/{payableId} | Deletes a payable.
[**deleteReceivable**](QuotesSmartV2Api.md#deleteReceivable) | **DELETE** /v2/quotes/{quoteId}/finance/receivables/{receivableId} | Deletes a receivable.
[**getById10**](QuotesSmartV2Api.md#getById10) | **GET** /v2/quotes/{quoteId} | Returns quote details.
[**getContacts3**](QuotesSmartV2Api.md#getContacts3) | **GET** /v2/quotes/{quoteId}/clientContacts | Returns Client Contacts information for a quote.
[**getCustomFields9**](QuotesSmartV2Api.md#getCustomFields9) | **GET** /v2/quotes/{quoteId}/customFields | Returns a list of custom field keys and values for a project.
[**getFileById2**](QuotesSmartV2Api.md#getFileById2) | **GET** /v2/quotes/files/{fileId} | Returns details of a file.
[**getFileContentById1**](QuotesSmartV2Api.md#getFileContentById1) | **GET** /v2/quotes/files/{fileId}/download/{fileName} | Downloads a file content.
[**getFiles1**](QuotesSmartV2Api.md#getFiles1) | **GET** /v2/quotes/{quoteId}/files | Returns list of files in a quote.
[**getFinance3**](QuotesSmartV2Api.md#getFinance3) | **GET** /v2/quotes/{quoteId}/finance | Returns finance information for a quote.
[**getJobs1**](QuotesSmartV2Api.md#getJobs1) | **GET** /v2/quotes/{quoteId}/jobs | Returns list of jobs in a quote.
[**updateBusinessDays**](QuotesSmartV2Api.md#updateBusinessDays) | **PUT** /v2/quotes/{quoteId}/businessDays | Updates Business Days for a quote.
[**updateClientNotes1**](QuotesSmartV2Api.md#updateClientNotes1) | **PUT** /v2/quotes/{quoteId}/clientNotes | Updates Client Notes for a quote.
[**updateClientReferenceNumber1**](QuotesSmartV2Api.md#updateClientReferenceNumber1) | **PUT** /v2/quotes/{quoteId}/clientReferenceNumber | Updates Client Reference Number for a quote.
[**updateContacts**](QuotesSmartV2Api.md#updateContacts) | **PUT** /v2/quotes/{quoteId}/clientContacts | Updates Client Contacts for a quote.
[**updateCustomField1**](QuotesSmartV2Api.md#updateCustomField1) | **PUT** /v2/quotes/{quoteId}/customFields/{key} | Updates a custom field with a specified key in a quote.
[**updateExpectedDeliveryDate**](QuotesSmartV2Api.md#updateExpectedDeliveryDate) | **PUT** /v2/quotes/{quoteId}/expectedDeliveryDate | Updates Expected Delivery Date for a quote.
[**updateInternalNotes1**](QuotesSmartV2Api.md#updateInternalNotes1) | **PUT** /v2/quotes/{quoteId}/internalNotes | Updates Internal Notes for a quote.
[**updatePayable1**](QuotesSmartV2Api.md#updatePayable1) | **PUT** /v2/quotes/{quoteId}/finance/payables/{payableId} | Updates a payable.
[**updateQuoteExpiry**](QuotesSmartV2Api.md#updateQuoteExpiry) | **PUT** /v2/quotes/{quoteId}/quoteExpiry | Updates Quote Expiry Date for a quote.
[**updateReceivable1**](QuotesSmartV2Api.md#updateReceivable1) | **PUT** /v2/quotes/{quoteId}/finance/receivables/{receivableId} | Updates a receivable.
[**updateSourceLanguage1**](QuotesSmartV2Api.md#updateSourceLanguage1) | **PUT** /v2/quotes/{quoteId}/sourceLanguage | Updates source language for a quote.
[**updateSpecialization1**](QuotesSmartV2Api.md#updateSpecialization1) | **PUT** /v2/quotes/{quoteId}/specialization | Updates specialization for a quote.
[**updateTargetLanguages1**](QuotesSmartV2Api.md#updateTargetLanguages1) | **PUT** /v2/quotes/{quoteId}/targetLanguages | Updates target languages for a quote.
[**updateVendorInstructions1**](QuotesSmartV2Api.md#updateVendorInstructions1) | **PUT** /v2/quotes/{quoteId}/vendorInstructions | Updates instructions for all vendors performing the jobs in a quote.
[**updateVolume1**](QuotesSmartV2Api.md#updateVolume1) | **PUT** /v2/quotes/{quoteId}/volume | Updates volume for a quote.
[**uploadFile3**](QuotesSmartV2Api.md#uploadFile3) | **POST** /v2/quotes/{quoteId}/files/upload | Uploads file to the quote as a file uploaded by PM.

<a name="addFiles2"></a>
# **addFiles2**
> addFiles2(body, quoteId)

Adds files to the quote as added by PM.

Adds files to the quote as added by PM. The files have to be uploaded beforehand (see \&quot;POST v2/quotes/{quoteId}/files/upload\&quot; operation). The following properties can be specified for each file:&lt;ul&gt;&lt;li&gt;category (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;languageIds – when the file category depends on a list of languages&lt;/li&gt;&lt;li&gt;languageCombinationIds – when the file category depends on a list of language combinations&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
TimeDTO body = new TimeDTO(); // TimeDTO | Added files to the quote as added by PM.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.addFiles2(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#addFiles2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeDTO**](TimeDTO.md)| Added files to the quote as added by PM. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="archive1"></a>
# **archive1**
> FilesArchiveDto archive1(body)

Prepares a ZIP archive that contains the specified files.

Prepares a ZIP archive that contains the specified files.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
FilesDto body = new FilesDto(); // FilesDto | Prepared ZIP archive that contains the specified files.
try {
    FilesArchiveDto result = apiInstance.archive1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#archive1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)| Prepared ZIP archive that contains the specified files. |

### Return type

[**FilesArchiveDto**](FilesArchiveDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="changeStatus2"></a>
# **changeStatus2**
> changeStatus2(body, quoteId)

Changes quote status if possible (400 Bad Request is returned otherwise).

Changes quote status if possible (400 Bad Request is returned otherwise). The status has to be specified using one of the following keys: &lt;ul&gt;&lt;li&gt;PENDING – available when the job has one of the following statuses: REQUESTED, REJECTED&lt;/li&gt;&lt;li&gt;SENT – available when the job has one of the following statuses: PENDING&lt;/li&gt;&lt;li&gt;APPROVED – available when the job has one of the following statuses: REQUESTED, PENDING, SENT, APPROVED_BY_CLIENT&lt;/li&gt;&lt;li&gt;REJECTED – available when the job has one of the following statuses: REQUESTED, PENDING, SENT&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
ProjectStatusDTO body = new ProjectStatusDTO(); // ProjectStatusDTO | Changed Quote status.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.changeStatus2(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#changeStatus2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectStatusDTO**](ProjectStatusDTO.md)| Changed Quote status. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="create3"></a>
# **create3**
> QuoteDTO create3(body)

Creates a new Smart Quote.

Creates a new Smart Quote. If the specified service ID refers to Classic Quote, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
QuoteCreateDTO body = new QuoteCreateDTO(); // QuoteCreateDTO | Project to create
try {
    QuoteDTO result = apiInstance.create3(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#create3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuoteCreateDTO**](QuoteCreateDTO.md)| Project to create | [optional]

### Return type

[**QuoteDTO**](QuoteDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPayable1"></a>
# **createPayable1**
> PayableDTO createPayable1(body, quote'sInternalIdentifier)

Adds a payable to a quote.

Adds a payable to a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
PayableCreateDTO body = new PayableCreateDTO(); // PayableCreateDTO | 
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
try {
    PayableDTO result = apiInstance.createPayable1(body, quote'sInternalIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#createPayable1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayableCreateDTO**](PayableCreateDTO.md)|  |
 **quote&#x27;sInternalIdentifier** | **String**|  |

### Return type

[**PayableDTO**](PayableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReceivable1"></a>
# **createReceivable1**
> ReceivableDTO createReceivable1(body, quote'sInternalIdentifier)

Adds a receivable to a quote.

Adds a receivable to a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
ReceivableCreateDTO body = new ReceivableCreateDTO(); // ReceivableCreateDTO | 
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
try {
    ReceivableDTO result = apiInstance.createReceivable1(body, quote'sInternalIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#createReceivable1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivableCreateDTO**](ReceivableCreateDTO.md)|  |
 **quote&#x27;sInternalIdentifier** | **String**|  |

### Return type

[**ReceivableDTO**](ReceivableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePayable"></a>
# **deletePayable**
> deletePayable(quote'sInternalIdentifier, payable'sInternalIdentifier)

Deletes a payable.

Deletes a payable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
Long payable'sInternalIdentifier = 789L; // Long | 
try {
    apiInstance.deletePayable(quote'sInternalIdentifier, payable'sInternalIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#deletePayable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote&#x27;sInternalIdentifier** | **String**|  |
 **payable&#x27;sInternalIdentifier** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteReceivable"></a>
# **deleteReceivable**
> deleteReceivable(quote'sInternalIdentifier, receivable'sInternalIdentifier)

Deletes a receivable.

Deletes a receivable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
Long receivable'sInternalIdentifier = 789L; // Long | 
try {
    apiInstance.deleteReceivable(quote'sInternalIdentifier, receivable'sInternalIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#deleteReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote&#x27;sInternalIdentifier** | **String**|  |
 **receivable&#x27;sInternalIdentifier** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getById10"></a>
# **getById10**
> QuoteDTO getById10(quoteId)

Returns quote details.

Returns quote details. If the specified quote ID refers to Classic Quote, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    QuoteDTO result = apiInstance.getById10(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getById10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**QuoteDTO**](QuoteDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getContacts3"></a>
# **getContacts3**
> SmartContactsDTO getContacts3(quoteId)

Returns Client Contacts information for a quote.

Returns Client Contacts information for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    SmartContactsDTO result = apiInstance.getContacts3(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getContacts3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**SmartContactsDTO**](SmartContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getCustomFields9"></a>
# **getCustomFields9**
> CustomFieldsDTO getCustomFields9(quoteId)

Returns a list of custom field keys and values for a project.

Returns a list of custom field keys and values for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields9(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getCustomFields9");
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
 - **Accept**: application/json;charset=UTF-8

<a name="getFileById2"></a>
# **getFileById2**
> ProjectFileDto getFileById2(fileId)

Returns details of a file.

Returns details of a file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String fileId = "fileId_example"; // String | file's internal identifier
try {
    ProjectFileDto result = apiInstance.getFileById2(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getFileById2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| file&#x27;s internal identifier |

### Return type

[**ProjectFileDto**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFileContentById1"></a>
# **getFileContentById1**
> getFileContentById1(fileId, fileName)

Downloads a file content.

Downloads a file content.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String fileId = "fileId_example"; // String | file's internal identifier
String fileName = "fileName_example"; // String | file's name
try {
    apiInstance.getFileContentById1(fileId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getFileContentById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| file&#x27;s internal identifier |
 **fileName** | **String**| file&#x27;s name |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: multipart/form-data

<a name="getFiles1"></a>
# **getFiles1**
> List&lt;ProjectFileDto&gt; getFiles1(quoteId)

Returns list of files in a quote.

Returns list of files in a quote. Only files added to the quote (i.e. files that have assigned category and languages) are listed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getFiles1(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getFiles1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFinance3"></a>
# **getFinance3**
> FinanceDTO getFinance3(quoteId)

Returns finance information for a quote.

Returns finance information for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    FinanceDTO result = apiInstance.getFinance3(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getFinance3");
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
 - **Accept**: application/json;charset=UTF-8

<a name="getJobs1"></a>
# **getJobs1**
> List&lt;JobDto&gt; getJobs1(quoteId)

Returns list of jobs in a quote.

Returns list of jobs in a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    List<JobDto> result = apiInstance.getJobs1(quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#getJobs1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**List&lt;JobDto&gt;**](JobDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="updateBusinessDays"></a>
# **updateBusinessDays**
> updateBusinessDays(body, quoteId)

Updates Business Days for a quote.

Updates Business Days for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
Integer body = {
  "description" : "ref",
  "value" : "/home-api/assets/examples/v2/quotes/updateBusinessDays.json#requestBody"
}; // Integer | Updated Business Days for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateBusinessDays(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateBusinessDays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integer**](Integer.md)| Updated Business Days for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateClientNotes1"></a>
# **updateClientNotes1**
> updateClientNotes1(body, quoteId)

Updates Client Notes for a quote.

Updates Client Notes for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Client Notes for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateClientNotes1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateClientNotes1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Client Notes for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateClientReferenceNumber1"></a>
# **updateClientReferenceNumber1**
> updateClientReferenceNumber1(body, quoteId)

Updates Client Reference Number for a quote.

Updates Client Reference Number for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Client Reference Number for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateClientReferenceNumber1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateClientReferenceNumber1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Client Reference Number for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateContacts"></a>
# **updateContacts**
> SmartContactsDTO updateContacts(body, quoteId)

Updates Client Contacts for a quote.

Updates Client Contacts for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
SmartContactsDTO body = new SmartContactsDTO(); // SmartContactsDTO | Updated Client Contacts for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    SmartContactsDTO result = apiInstance.updateContacts(body, quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartContactsDTO**](SmartContactsDTO.md)| Updated Client Contacts for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**SmartContactsDTO**](SmartContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateCustomField1"></a>
# **updateCustomField1**
> updateCustomField1(body, quoteId, key)

Updates a custom field with a specified key in a quote.

Updates a custom field with a specified key in a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
SmartCustomFieldDTO body = new SmartCustomFieldDTO(); // SmartCustomFieldDTO | Updated custom field with a specified key in a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
String key = "key_example"; // String | custom field's key
try {
    apiInstance.updateCustomField1(body, quoteId, key);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateCustomField1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartCustomFieldDTO**](SmartCustomFieldDTO.md)| Updated custom field with a specified key in a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |
 **key** | **String**| custom field&#x27;s key |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateExpectedDeliveryDate"></a>
# **updateExpectedDeliveryDate**
> updateExpectedDeliveryDate(body, quoteId)

Updates Expected Delivery Date for a quote.

Updates Expected Delivery Date for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
TimeDTO body = new TimeDTO(); // TimeDTO | Updated Expected Delivery Date for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateExpectedDeliveryDate(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateExpectedDeliveryDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeDTO**](TimeDTO.md)| Updated Expected Delivery Date for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateInternalNotes1"></a>
# **updateInternalNotes1**
> updateInternalNotes1(body, quoteId)

Updates Internal Notes for a quote.

Updates Internal Notes for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Internal Notes for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateInternalNotes1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateInternalNotes1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Internal Notes for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updatePayable1"></a>
# **updatePayable1**
> PayableDTO updatePayable1(body, quote'sInternalIdentifier, payable'sInternalIdentifier)

Updates a payable.

Updates a payable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
PayableDTO body = new PayableDTO(); // PayableDTO | 
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
Long payable'sInternalIdentifier = 789L; // Long | 
try {
    PayableDTO result = apiInstance.updatePayable1(body, quote'sInternalIdentifier, payable'sInternalIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updatePayable1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayableDTO**](PayableDTO.md)|  |
 **quote&#x27;sInternalIdentifier** | **String**|  |
 **payable&#x27;sInternalIdentifier** | **Long**|  |

### Return type

[**PayableDTO**](PayableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuoteExpiry"></a>
# **updateQuoteExpiry**
> updateQuoteExpiry(body, quoteId)

Updates Quote Expiry Date for a quote.

Updates Quote Expiry Date for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
TimeDTO body = new TimeDTO(); // TimeDTO | Updated Quote Expiry Date for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateQuoteExpiry(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateQuoteExpiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeDTO**](TimeDTO.md)| Updated Quote Expiry Date for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateReceivable1"></a>
# **updateReceivable1**
> ReceivableDTO updateReceivable1(body, quote'sInternalIdentifier, receivable'sInternalIdentifier)

Updates a receivable.

Updates a receivable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
ReceivableDTO body = new ReceivableDTO(); // ReceivableDTO | 
String quote'sInternalIdentifier = "quote'sInternalIdentifier_example"; // String | 
Long receivable'sInternalIdentifier = 789L; // Long | 
try {
    ReceivableDTO result = apiInstance.updateReceivable1(body, quote'sInternalIdentifier, receivable'sInternalIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateReceivable1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivableDTO**](ReceivableDTO.md)|  |
 **quote&#x27;sInternalIdentifier** | **String**|  |
 **receivable&#x27;sInternalIdentifier** | **Long**|  |

### Return type

[**ReceivableDTO**](ReceivableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSourceLanguage1"></a>
# **updateSourceLanguage1**
> updateSourceLanguage1(body, quoteId)

Updates source language for a quote.

Updates source language for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
SourceLanguageDTO body = new SourceLanguageDTO(); // SourceLanguageDTO | Updated source language for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateSourceLanguage1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateSourceLanguage1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SourceLanguageDTO**](SourceLanguageDTO.md)| Updated source language for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateSpecialization1"></a>
# **updateSpecialization1**
> updateSpecialization1(body, quoteId)

Updates specialization for a quote.

Updates specialization for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
SpecializationDTO body = new SpecializationDTO(); // SpecializationDTO | Updated specialization for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateSpecialization1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateSpecialization1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpecializationDTO**](SpecializationDTO.md)| Updated specialization for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateTargetLanguages1"></a>
# **updateTargetLanguages1**
> updateTargetLanguages1(body, quoteId)

Updates target languages for a quote.

Updates target languages for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
TargetLanguagesDTO body = new TargetLanguagesDTO(); // TargetLanguagesDTO | Updated target languages for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateTargetLanguages1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateTargetLanguages1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TargetLanguagesDTO**](TargetLanguagesDTO.md)| Updated target languages for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateVendorInstructions1"></a>
# **updateVendorInstructions1**
> updateVendorInstructions1(body, quoteId)

Updates instructions for all vendors performing the jobs in a quote.

Updates instructions for all vendors performing the jobs in a quote. See also \&quot;PUT /jobs/{jobId}/instructions\&quot; for updating instructions for a specific job in a project or quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated instructions for all vendors performing the jobs in a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateVendorInstructions1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateVendorInstructions1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated instructions for all vendors performing the jobs in a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateVolume1"></a>
# **updateVolume1**
> updateVolume1(body, quoteId)

Updates volume for a quote.

Updates volume for a quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
BigDecimalDTO body = new BigDecimalDTO(); // BigDecimalDTO | Updated volume for a quote.
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    apiInstance.updateVolume1(body, quoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#updateVolume1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BigDecimalDTO**](BigDecimalDTO.md)| Updated volume for a quote. |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="uploadFile3"></a>
# **uploadFile3**
> FileDto uploadFile3(file, fileName, quoteId)

Uploads file to the quote as a file uploaded by PM.

Uploads file to the quote as a file uploaded by PM. Only one file can be uploaded at once. When the upload is finished the file has to be added by specifying its category and languages (see \&quot;PUT /v2/quotes/{quoteId}/files/add\&quot; operation).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

QuotesSmartV2Api apiInstance = new QuotesSmartV2Api();
File file = new File("file_example"); // File | 
String fileName = "fileName_example"; // String | 
String quoteId = "quoteId_example"; // String | quote's internal identifier
try {
    FileDto result = apiInstance.uploadFile3(file, fileName, quoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesSmartV2Api#uploadFile3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **fileName** | **String**|  |
 **quoteId** | **String**| quote&#x27;s internal identifier |

### Return type

[**FileDto**](FileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

