# JobsSmartV2Api

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFiles**](JobsSmartV2Api.md#addFiles) | **PUT** /v2/jobs/{jobId}/files/delivered/add | Adds files to the project as delivered in the job.
[**assignVendor**](JobsSmartV2Api.md#assignVendor) | **PUT** /v2/jobs/{jobId}/vendor | Assigns vendor to a job in a project.
[**changeStatus**](JobsSmartV2Api.md#changeStatus) | **PUT** /v2/jobs/{jobId}/status | Changes job status if possible (400 Bad Request is returned otherwise).
[**getDeliveredFiles**](JobsSmartV2Api.md#getDeliveredFiles) | **GET** /v2/jobs/{jobId}/files/delivered | Returns list of files delivered in the job.
[**getFileById**](JobsSmartV2Api.md#getFileById) | **GET** /v2/jobs/{jobId} | Returns details for a job.
[**getSharedReferenceFiles**](JobsSmartV2Api.md#getSharedReferenceFiles) | **GET** /v2/jobs/{jobId}/files/sharedReferenceFiles | Returns list of files shared with the job as Reference Files.
[**getSharedWorkFiles**](JobsSmartV2Api.md#getSharedWorkFiles) | **GET** /v2/jobs/{jobId}/files/sharedWorkFiles | Returns list of files shared with the job as Work Files.
[**shareAsReferenceFiles**](JobsSmartV2Api.md#shareAsReferenceFiles) | **PUT** /v2/jobs/{jobId}/files/sharedReferenceFiles/share | Shares selected files as Reference Files with a job in a project.
[**shareAsWorkFiles**](JobsSmartV2Api.md#shareAsWorkFiles) | **PUT** /v2/jobs/{jobId}/files/sharedWorkFiles/share | Shares selected files as Work Files with a job in a project.
[**stopSharing**](JobsSmartV2Api.md#stopSharing) | **PUT** /v2/jobs/{jobId}/files/stopSharing | Stops sharing selected files with a job in a project.
[**updateInstructions**](JobsSmartV2Api.md#updateInstructions) | **PUT** /v2/jobs/{jobId}/instructions | Updates instructions for a job.
[**uploadFile1**](JobsSmartV2Api.md#uploadFile1) | **POST** /v2/jobs/{jobId}/files/delivered/upload | Uploads file to the project as a file delivered in the job.

<a name="addFiles"></a>
# **addFiles**
> addFiles(body, jobId)

Adds files to the project as delivered in the job.

Adds files to the project as delivered in the job. The files have to be uploaded beforehand (see \&quot;POST /jobs/{jobId}/files/upload\&quot; operation). The following properties can be specified for each file:&lt;ul&gt;&lt;li&gt;category (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;languageIds – when the file category depends on a list of languages&lt;/li&gt;&lt;li&gt;languageCombinationIds – when the file category depends on a list of language combinations&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
FileCategorizationsDto body = new FileCategorizationsDto(); // FileCategorizationsDto | Added files to the project as delivered in the job.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    apiInstance.addFiles(body, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#addFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileCategorizationsDto**](FileCategorizationsDto.md)| Added files to the project as delivered in the job. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="assignVendor"></a>
# **assignVendor**
> assignVendor(body, jobId)

Assigns vendor to a job in a project.

Assigns vendor to a job in a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
VendorPriceProfileDTO body = new VendorPriceProfileDTO(); // VendorPriceProfileDTO | Assigned vendor to a job in a project.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    apiInstance.assignVendor(body, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#assignVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorPriceProfileDTO**](VendorPriceProfileDTO.md)| Assigned vendor to a job in a project. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="changeStatus"></a>
# **changeStatus**
> changeStatus(body, jobId)

Changes job status if possible (400 Bad Request is returned otherwise).

Changes job status if possible (400 Bad Request is returned otherwise). The status has to be specified using one of the following keys:&lt;ul&gt;&lt;li&gt;OPEN – available when the job has one of the following statuses: ACCEPTED, CANCELED&lt;/li&gt;&lt;li&gt;ACCEPTED – available when the job has one of the following statuses: OPEN (Vendor and dates have to be set before calling the operation), STARTED&lt;/li&gt;&lt;li&gt;STARTED – available when the job has one of the following statuses: ACCEPTED, READY&lt;/li&gt;&lt;li&gt;READY – available when the job has one of the following statuses: STARTED&lt;/li&gt;&lt;li&gt;CANCELLED – available when the job has one of the following statuses: OPEN, ACCEPTED, STARTED, OFFERS_SENT&lt;/li&gt;&lt;li&gt;OFFERS_SENT – not available as a target status for this operation&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
JobStatusDTO body = new JobStatusDTO(); // JobStatusDTO | Changed job status.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    apiInstance.changeStatus(body, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#changeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobStatusDTO**](JobStatusDTO.md)| Changed job status. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getDeliveredFiles"></a>
# **getDeliveredFiles**
> List&lt;ProjectFileDto&gt; getDeliveredFiles(jobId)

Returns list of files delivered in the job.

Returns list of files delivered in the job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
String jobId = "jobId_example"; // String | job's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getDeliveredFiles(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#getDeliveredFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFileById"></a>
# **getFileById**
> ProjectFileDto getFileById(jobId)

Returns details for a job.

Returns details for a job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
String jobId = "jobId_example"; // String | job's internal identifier
try {
    ProjectFileDto result = apiInstance.getFileById(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#getFileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**ProjectFileDto**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getSharedReferenceFiles"></a>
# **getSharedReferenceFiles**
> List&lt;ProjectFileDto&gt; getSharedReferenceFiles(jobId)

Returns list of files shared with the job as Reference Files.

Returns list of files shared with the job as Reference Files.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
String jobId = "jobId_example"; // String | job's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getSharedReferenceFiles(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#getSharedReferenceFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getSharedWorkFiles"></a>
# **getSharedWorkFiles**
> List&lt;ProjectFileDto&gt; getSharedWorkFiles(jobId)

Returns list of files shared with the job as Work Files.

Returns list of files shared with the job as Work Files.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
String jobId = "jobId_example"; // String | job's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getSharedWorkFiles(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#getSharedWorkFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="shareAsReferenceFiles"></a>
# **shareAsReferenceFiles**
> FilesShareStatusDto shareAsReferenceFiles(body, jobId)

Shares selected files as Reference Files with a job in a project.

Shares selected files as Reference Files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were already shared with the job. If a file was shared with the job as Work File, it will now be shared as Reference File (and not as Work File).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
FilesDto body = new FilesDto(); // FilesDto | Shared selected files as Reference Files with a job in a project.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    FilesShareStatusDto result = apiInstance.shareAsReferenceFiles(body, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#shareAsReferenceFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)| Shared selected files as Reference Files with a job in a project. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**FilesShareStatusDto**](FilesShareStatusDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="shareAsWorkFiles"></a>
# **shareAsWorkFiles**
> FilesShareStatusDto shareAsWorkFiles(body, jobId)

Shares selected files as Work Files with a job in a project.

Shares selected files as Work Files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were already shared with the job. If a file was shared with the job as Reference File, it will now be shared as Work File (and not as Reference File).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
FilesDto body = new FilesDto(); // FilesDto | Shared selected files as Work Files with a job in a project.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    FilesShareStatusDto result = apiInstance.shareAsWorkFiles(body, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#shareAsWorkFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)| Shared selected files as Work Files with a job in a project. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**FilesShareStatusDto**](FilesShareStatusDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="stopSharing"></a>
# **stopSharing**
> FilesShareStatusDto stopSharing(body, jobId)

Stops sharing selected files with a job in a project.

Stops sharing selected files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were not shared with the job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
FilesDto body = new FilesDto(); // FilesDto | File sharing stopped for a project task.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    FilesShareStatusDto result = apiInstance.stopSharing(body, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#stopSharing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)| File sharing stopped for a project task. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**FilesShareStatusDto**](FilesShareStatusDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateInstructions"></a>
# **updateInstructions**
> updateInstructions(body, jobId)

Updates instructions for a job.

Updates instructions for a job. See also \&quot;PUT /projects/{projectId}/vendorInstructions\&quot; and \&quot;PUT /quotes/{quoteId}/vendorInstructions\&quot; for updating instructions for all jobs in a project or quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated instructions for a job.
String jobId = "jobId_example"; // String | job's internal identifier
try {
    apiInstance.updateInstructions(body, jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#updateInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated instructions for a job. |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="uploadFile1"></a>
# **uploadFile1**
> FileDto uploadFile1(file, fileName, jobId)

Uploads file to the project as a file delivered in the job.

Uploads file to the project as a file delivered in the job. Only one file can be uploaded at once. When the upload is finished the file has to be added by specifying its category and languages (see \&quot;PUT /jobs/{jobId}/files/add\&quot; operation).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

JobsSmartV2Api apiInstance = new JobsSmartV2Api();
File file = new File("file_example"); // File | 
String fileName = "fileName_example"; // String | 
String jobId = "jobId_example"; // String | job's internal identifier
try {
    FileDto result = apiInstance.uploadFile1(file, fileName, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsSmartV2Api#uploadFile1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **fileName** | **String**|  |
 **jobId** | **String**| job&#x27;s internal identifier |

### Return type

[**FileDto**](FileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

