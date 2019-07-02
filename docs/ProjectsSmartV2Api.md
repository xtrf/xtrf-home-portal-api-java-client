# ProjectsSmartV2Api

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFileLinks**](ProjectsSmartV2Api.md#addFileLinks) | **POST** /v2/projects/{projectId}/files/addLink | Adds file links to the project as added by PM.
[**addFiles1**](ProjectsSmartV2Api.md#addFiles1) | **PUT** /v2/projects/{projectId}/files/add | Adds files to the project as added by PM.
[**archive**](ProjectsSmartV2Api.md#archive) | **POST** /v2/projects/files/archive | Prepares a ZIP archive that contains the specified files.
[**changeStatus1**](ProjectsSmartV2Api.md#changeStatus1) | **PUT** /v2/projects/{projectId}/status | Changes project status if possible (400 Bad Request is returned otherwise).
[**create2**](ProjectsSmartV2Api.md#create2) | **POST** /v2/projects | Creates a new Smart Project.
[**createPayable**](ProjectsSmartV2Api.md#createPayable) | **POST** /v2/projects/{projectId}/finance/payables | Adds a payable to a project.
[**createReceivable**](ProjectsSmartV2Api.md#createReceivable) | **POST** /v2/projects/{projectId}/finance/receivables | Adds a receivable to a project.
[**deletePayable**](ProjectsSmartV2Api.md#deletePayable) | **DELETE** /v2/projects/{projectId}/finance/payables/{payableId} | Deletes a payable.
[**deleteReceivable**](ProjectsSmartV2Api.md#deleteReceivable) | **DELETE** /v2/projects/{projectId}/finance/receivables/{receivableId} | Deletes a receivable.
[**getById9**](ProjectsSmartV2Api.md#getById9) | **GET** /v2/projects/{projectId} | Returns project details.
[**getCATToolProjectInfo**](ProjectsSmartV2Api.md#getCATToolProjectInfo) | **GET** /v2/projects/{projectId}/catToolProject | Returns if cat tool project is created or queued.
[**getContacts2**](ProjectsSmartV2Api.md#getContacts2) | **GET** /v2/projects/{projectId}/clientContacts | Returns Client Contacts information for a project.
[**getCustomFields8**](ProjectsSmartV2Api.md#getCustomFields8) | **GET** /v2/projects/{projectId}/customFields | Returns a list of custom field keys and values for a project.
[**getDeliverableFiles**](ProjectsSmartV2Api.md#getDeliverableFiles) | **GET** /v2/projects/{projectId}/files/deliverable | Returns list of files in a project, that are ready to be delivered to client.
[**getFileById1**](ProjectsSmartV2Api.md#getFileById1) | **GET** /v2/projects/files/{fileId} | Returns details of a file.
[**getFileContentById**](ProjectsSmartV2Api.md#getFileContentById) | **GET** /v2/projects/files/{fileId}/download/{fileName} | Downloads a file content.
[**getFiles**](ProjectsSmartV2Api.md#getFiles) | **GET** /v2/projects/{projectId}/files | Returns list of files in a project.
[**getFinance2**](ProjectsSmartV2Api.md#getFinance2) | **GET** /v2/projects/{projectId}/finance | Returns finance information for a project.
[**getJobs**](ProjectsSmartV2Api.md#getJobs) | **GET** /v2/projects/{projectId}/jobs | Returns list of jobs in a project.
[**updateClientDeadline**](ProjectsSmartV2Api.md#updateClientDeadline) | **PUT** /v2/projects/{projectId}/clientDeadline | Updates Client Deadline for a project.
[**updateClientNotes**](ProjectsSmartV2Api.md#updateClientNotes) | **PUT** /v2/projects/{projectId}/clientNotes | Updates Client Notes for a project.
[**updateClientReferenceNumber**](ProjectsSmartV2Api.md#updateClientReferenceNumber) | **PUT** /v2/projects/{projectId}/clientReferenceNumber | Updates Client Reference Number for a project.
[**updateContacts**](ProjectsSmartV2Api.md#updateContacts) | **PUT** /v2/projects/{projectId}/clientContacts | Updates Client Contacts for a project.
[**updateCustomField**](ProjectsSmartV2Api.md#updateCustomField) | **PUT** /v2/projects/{projectId}/customFields/{key} | Updates a custom field with a specified key in a project
[**updateInternalNotes**](ProjectsSmartV2Api.md#updateInternalNotes) | **PUT** /v2/projects/{projectId}/internalNotes | Updates Internal Notes for a project.
[**updateOrderedOn**](ProjectsSmartV2Api.md#updateOrderedOn) | **PUT** /v2/projects/{projectId}/orderDate | Updates Order Date for a project.
[**updatePayable**](ProjectsSmartV2Api.md#updatePayable) | **PUT** /v2/projects/{projectId}/finance/payables/{payableId} | Updates a payable.
[**updateReceivable**](ProjectsSmartV2Api.md#updateReceivable) | **PUT** /v2/projects/{projectId}/finance/receivables/{receivableId} | Updates a receivable.
[**updateSourceLanguage**](ProjectsSmartV2Api.md#updateSourceLanguage) | **PUT** /v2/projects/{projectId}/sourceLanguage | Updates source language for a project.
[**updateSpecialization**](ProjectsSmartV2Api.md#updateSpecialization) | **PUT** /v2/projects/{projectId}/specialization | Updates specialization for a project.
[**updateTargetLanguages**](ProjectsSmartV2Api.md#updateTargetLanguages) | **PUT** /v2/projects/{projectId}/targetLanguages | Updates target languages for a project.
[**updateVendorInstructions**](ProjectsSmartV2Api.md#updateVendorInstructions) | **PUT** /v2/projects/{projectId}/vendorInstructions | Updates instructions for all vendors performing the jobs in a project.
[**updateVolume**](ProjectsSmartV2Api.md#updateVolume) | **PUT** /v2/projects/{projectId}/volume | Updates volume for a project.
[**uploadFile2**](ProjectsSmartV2Api.md#uploadFile2) | **POST** /v2/projects/{projectId}/files/upload | Uploads file to the project as a file uploaded by PM.

<a name="addFileLinks"></a>
# **addFileLinks**
> FilesDto addFileLinks(body, projectId)

Adds file links to the project as added by PM.

Adds file links to the project as added by PM. The following properties can be specified for each file link:&lt;ul&gt;&lt;li&gt;url (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;category (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;languageIds – when the file category depends on a list of languages&lt;/li&gt;&lt;li&gt;languageCombinationIds – when the file category depends on a list of language combinations&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
FileLinkCategorizationsDto body = new FileLinkCategorizationsDto(); // FileLinkCategorizationsDto | Added file links to the project as added by PM.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    FilesDto result = apiInstance.addFileLinks(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#addFileLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileLinkCategorizationsDto**](FileLinkCategorizationsDto.md)| Added file links to the project as added by PM. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**FilesDto**](FilesDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addFiles1"></a>
# **addFiles1**
> addFiles1(body, projectId)

Adds files to the project as added by PM.

Adds files to the project as added by PM. The files have to be uploaded beforehand (see \&quot;POST /v2/projects/{projectId}/files/upload\&quot; operation). The following properties can be specified for each file:&lt;ul&gt;&lt;li&gt;category (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;languageIds – when the file category depends on a list of languages&lt;/li&gt;&lt;li&gt;languageCombinationIds – when the file category depends on a list of language combinations&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
FileCategorizationsDto body = new FileCategorizationsDto(); // FileCategorizationsDto | Added files to the project as added by PM.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.addFiles1(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#addFiles1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileCategorizationsDto**](FileCategorizationsDto.md)| Added files to the project as added by PM. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="archive"></a>
# **archive**
> FilesArchiveDto archive(body)

Prepares a ZIP archive that contains the specified files.

Prepares a ZIP archive that contains the specified files.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
FilesDto body = new FilesDto(); // FilesDto | Prepared ZIP archive that contains the specified files.
try {
    FilesArchiveDto result = apiInstance.archive(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#archive");
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

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeStatus1"></a>
# **changeStatus1**
> changeStatus1(body, projectId)

Changes project status if possible (400 Bad Request is returned otherwise).

Changes project status if possible (400 Bad Request is returned otherwise). The status has to be specified using one of the following keys: &lt;ul&gt;&lt;li&gt;CANCELLED – available when the job has one of the following statuses: OPEN, STARTED&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
ProjectStatusDTO body = new ProjectStatusDTO(); // ProjectStatusDTO | Changed project status.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.changeStatus1(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#changeStatus1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectStatusDTO**](ProjectStatusDTO.md)| Changed project status. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="create2"></a>
# **create2**
> ProjectDTO create2(body)

Creates a new Smart Project.

Creates a new Smart Project. If the specified service ID refers to Classic Project, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
ProjectCreateDTO body = new ProjectCreateDTO(); // ProjectCreateDTO | 
try {
    ProjectDTO result = apiInstance.create2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#create2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectCreateDTO**](ProjectCreateDTO.md)|  | [optional]

### Return type

[**ProjectDTO**](ProjectDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPayable"></a>
# **createPayable**
> PayableDTO createPayable(body, projectId)

Adds a payable to a project.

Adds a payable to a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
PayableCreateDTO body = new PayableCreateDTO(); // PayableCreateDTO | 
String projectId = "projectId_example"; // String | project's internal identifier
try {
    PayableDTO result = apiInstance.createPayable(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#createPayable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayableCreateDTO**](PayableCreateDTO.md)|  |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**PayableDTO**](PayableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createReceivable"></a>
# **createReceivable**
> ReceivableDTO createReceivable(body, projectId)

Adds a receivable to a project.

Adds a receivable to a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
ReceivableCreateDTO body = new ReceivableCreateDTO(); // ReceivableCreateDTO | 
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ReceivableDTO result = apiInstance.createReceivable(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#createReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivableCreateDTO**](ReceivableCreateDTO.md)|  |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ReceivableDTO**](ReceivableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deletePayable"></a>
# **deletePayable**
> deletePayable(projectId, payableId)

Deletes a payable.

Deletes a payable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
Long payableId = 789L; // Long | payable's internal identifier
try {
    apiInstance.deletePayable(projectId, payableId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#deletePayable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |
 **payableId** | **Long**| payable&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteReceivable"></a>
# **deleteReceivable**
> deleteReceivable(projectId, receivableId)

Deletes a receivable.

Deletes a receivable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
Long receivableId = 789L; // Long | receivable's internal identifier
try {
    apiInstance.deleteReceivable(projectId, receivableId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#deleteReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |
 **receivableId** | **Long**| receivable&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getById9"></a>
# **getById9**
> ProjectDTO getById9(projectId)

Returns project details.

Returns project details. If the specified project ID refers to Classic Project, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ProjectDTO result = apiInstance.getById9(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getById9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ProjectDTO**](ProjectDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getCATToolProjectInfo"></a>
# **getCATToolProjectInfo**
> CATToolProjectDTO getCATToolProjectInfo(projectId)

Returns if cat tool project is created or queued.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | 
try {
    CATToolProjectDTO result = apiInstance.getCATToolProjectInfo(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getCATToolProjectInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |

### Return type

[**CATToolProjectDTO**](CATToolProjectDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getContacts2"></a>
# **getContacts2**
> SmartContactsDTO getContacts2(projectId)

Returns Client Contacts information for a project.

Returns Client Contacts information for a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    SmartContactsDTO result = apiInstance.getContacts2(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getContacts2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**SmartContactsDTO**](SmartContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getCustomFields8"></a>
# **getCustomFields8**
> CustomFieldsDTO getCustomFields8(projectId)

Returns a list of custom field keys and values for a project.

Returns a list of custom field keys and values for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields8(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getCustomFields8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getDeliverableFiles"></a>
# **getDeliverableFiles**
> List&lt;ProjectFileDto&gt; getDeliverableFiles(projectId)

Returns list of files in a project, that are ready to be delivered to client.

Returns list of files in a project, that are ready to be delivered to client. A file is considered deliverable to client when all of the following criteria are met:&lt;ul&gt;&lt;li&gt;the file was added to a job in the last step in the process&lt;/li&gt;&lt;li&gt;the file is marked as verified (if it was added in a verification step and the file is verifiable, according to its category)&lt;/li&gt;&lt;li&gt;the job is finished (has Ready status)&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getDeliverableFiles(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getDeliverableFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFileById1"></a>
# **getFileById1**
> ProjectFileDto getFileById1(fileId)

Returns details of a file.

Returns details of a file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String fileId = "fileId_example"; // String | file's internal identifier
try {
    ProjectFileDto result = apiInstance.getFileById1(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getFileById1");
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

<a name="getFileContentById"></a>
# **getFileContentById**
> getFileContentById(fileId, fileName)

Downloads a file content.

Downloads a file content.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String fileId = "fileId_example"; // String | file's internal identifier
String fileName = "fileName_example"; // String | file's name
try {
    apiInstance.getFileContentById(fileId, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getFileContentById");
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

<a name="getFiles"></a>
# **getFiles**
> List&lt;ProjectFileDto&gt; getFiles(projectId)

Returns list of files in a project.

Returns list of files in a project. Only files added to the project (i.e. files that have assigned category and languages) are listed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    List<ProjectFileDto> result = apiInstance.getFiles(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**List&lt;ProjectFileDto&gt;**](ProjectFileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getFinance2"></a>
# **getFinance2**
> FinanceDTO getFinance2(projectId)

Returns finance information for a project.

Returns finance information for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    FinanceDTO result = apiInstance.getFinance2(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getFinance2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**FinanceDTO**](FinanceDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getJobs"></a>
# **getJobs**
> List&lt;JobDto&gt; getJobs(projectId)

Returns list of jobs in a project.

Returns list of jobs in a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    List<JobDto> result = apiInstance.getJobs(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#getJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**List&lt;JobDto&gt;**](JobDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="updateClientDeadline"></a>
# **updateClientDeadline**
> updateClientDeadline(body, projectId)

Updates Client Deadline for a project.

Updates Client Deadline for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
TimeDTO body = new TimeDTO(); // TimeDTO | Updated Client Deadline for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateClientDeadline(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateClientDeadline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeDTO**](TimeDTO.md)| Updated Client Deadline for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateClientNotes"></a>
# **updateClientNotes**
> updateClientNotes(body, projectId)

Updates Client Notes for a project.

Updates Client Notes for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Client Notes for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateClientNotes(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateClientNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Client Notes for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateClientReferenceNumber"></a>
# **updateClientReferenceNumber**
> updateClientReferenceNumber(body, projectId)

Updates Client Reference Number for a project.

Updates Client Reference Number for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Client Reference Number for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateClientReferenceNumber(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateClientReferenceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Client Reference Number for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateContacts"></a>
# **updateContacts**
> SmartContactsDTO updateContacts(body, projectId)

Updates Client Contacts for a project.

Updates Client Contacts for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
SmartContactsDTO body = new SmartContactsDTO(); // SmartContactsDTO | Updated Client Contacts for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    SmartContactsDTO result = apiInstance.updateContacts(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartContactsDTO**](SmartContactsDTO.md)| Updated Client Contacts for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**SmartContactsDTO**](SmartContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateCustomField"></a>
# **updateCustomField**
> updateCustomField(body, projectId, key)

Updates a custom field with a specified key in a project

Updates a custom field with a specified key in a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
SmartCustomFieldDTO body = new SmartCustomFieldDTO(); // SmartCustomFieldDTO | Updated custom field with a specified key in a project.
String projectId = "projectId_example"; // String | project's internal identifier
String key = "key_example"; // String | custom field's key
try {
    apiInstance.updateCustomField(body, projectId, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartCustomFieldDTO**](SmartCustomFieldDTO.md)| Updated custom field with a specified key in a project. |
 **projectId** | **String**| project&#x27;s internal identifier |
 **key** | **String**| custom field&#x27;s key |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateInternalNotes"></a>
# **updateInternalNotes**
> updateInternalNotes(body, projectId)

Updates Internal Notes for a project.

Updates Internal Notes for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated Internal Notes for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateInternalNotes(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateInternalNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Internal Notes for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateOrderedOn"></a>
# **updateOrderedOn**
> updateOrderedOn(body, projectId)

Updates Order Date for a project.

Updates Order Date for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
TimeDTO body = new TimeDTO(); // TimeDTO | Updated Order Date for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateOrderedOn(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateOrderedOn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimeDTO**](TimeDTO.md)| Updated Order Date for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updatePayable"></a>
# **updatePayable**
> PayableDTO updatePayable(body, projectId, payableId)

Updates a payable.

Updates a payable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
PayableDTO body = new PayableDTO(); // PayableDTO | 
String projectId = "projectId_example"; // String | project's internal identifier
Long payableId = 789L; // Long | payable's internal identifier
try {
    PayableDTO result = apiInstance.updatePayable(body, projectId, payableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updatePayable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayableDTO**](PayableDTO.md)|  |
 **projectId** | **String**| project&#x27;s internal identifier |
 **payableId** | **Long**| payable&#x27;s internal identifier |

### Return type

[**PayableDTO**](PayableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateReceivable"></a>
# **updateReceivable**
> ReceivableDTO updateReceivable(body, projectId, receivableId)

Updates a receivable.

Updates a receivable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
ReceivableDTO body = new ReceivableDTO(); // ReceivableDTO | 
String projectId = "projectId_example"; // String | project's internal identifier
Long receivableId = 789L; // Long | receivable's internal identifier
try {
    ReceivableDTO result = apiInstance.updateReceivable(body, projectId, receivableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceivableDTO**](ReceivableDTO.md)|  |
 **projectId** | **String**| project&#x27;s internal identifier |
 **receivableId** | **Long**| receivable&#x27;s internal identifier |

### Return type

[**ReceivableDTO**](ReceivableDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateSourceLanguage"></a>
# **updateSourceLanguage**
> updateSourceLanguage(body, projectId)

Updates source language for a project.

Updates source language for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
SourceLanguageDTO body = new SourceLanguageDTO(); // SourceLanguageDTO | Updated source language for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateSourceLanguage(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateSourceLanguage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SourceLanguageDTO**](SourceLanguageDTO.md)| Updated source language for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateSpecialization"></a>
# **updateSpecialization**
> updateSpecialization(body, projectId)

Updates specialization for a project.

Updates specialization for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
SpecializationDTO body = new SpecializationDTO(); // SpecializationDTO | Updated specialization for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateSpecialization(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateSpecialization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpecializationDTO**](SpecializationDTO.md)| Updated specialization for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateTargetLanguages"></a>
# **updateTargetLanguages**
> updateTargetLanguages(body, projectId)

Updates target languages for a project.

Updates target languages for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
TargetLanguagesDTO body = new TargetLanguagesDTO(); // TargetLanguagesDTO | Updated target languages for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateTargetLanguages(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateTargetLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TargetLanguagesDTO**](TargetLanguagesDTO.md)| Updated target languages for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateVendorInstructions"></a>
# **updateVendorInstructions**
> updateVendorInstructions(body, projectId)

Updates instructions for all vendors performing the jobs in a project.

Updates instructions for all vendors performing the jobs in a project. See also \&quot;PUT /jobs/{jobId}/instructions\&quot; for updating instructions for a specific job in a project or quote.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
StringDTO body = new StringDTO(); // StringDTO | Updated instructions for all vendors performing the jobs in a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateVendorInstructions(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateVendorInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated instructions for all vendors performing the jobs in a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateVolume"></a>
# **updateVolume**
> updateVolume(body, projectId)

Updates volume for a project.

Updates volume for a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
BigDecimalDTO body = new BigDecimalDTO(); // BigDecimalDTO | Updated volume for a project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.updateVolume(body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#updateVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BigDecimalDTO**](BigDecimalDTO.md)| Updated volume for a project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="uploadFile2"></a>
# **uploadFile2**
> FileDto uploadFile2(file, fileName, projectId)

Uploads file to the project as a file uploaded by PM.

Uploads file to the project as a file uploaded by PM. Only one file can be uploaded at once. When the upload is finished the file has to be added by specifying its category and languages (see \&quot;PUT /v2/projects/{projectId}/files/add\&quot; operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsSmartV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsSmartV2Api apiInstance = new ProjectsSmartV2Api();
File file = new File("file_example"); // File | 
String fileName = "fileName_example"; // String | 
String projectId = "projectId_example"; // String | project's internal identifier
try {
    FileDto result = apiInstance.uploadFile2(file, fileName, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsSmartV2Api#uploadFile2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **fileName** | **String**|  |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**FileDto**](FileDto.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

