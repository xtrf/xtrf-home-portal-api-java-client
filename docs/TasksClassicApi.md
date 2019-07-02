# TasksClassicApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFile**](TasksClassicApi.md#addFile) | **POST** /tasks/{taskId}/files/input | Adds files to a given task.
[**delete5**](TasksClassicApi.md#delete5) | **DELETE** /tasks/{taskId} | Removes a task.
[**getContacts1**](TasksClassicApi.md#getContacts1) | **GET** /tasks/{taskId}/contacts | Returns contacts of a given task.
[**getCustomFields7**](TasksClassicApi.md#getCustomFields7) | **GET** /tasks/{taskId}/customFields | Returns custom fields of a given task.
[**getDates3**](TasksClassicApi.md#getDates3) | **GET** /tasks/{taskId}/dates | Returns dates of a given task.
[**getInstructions1**](TasksClassicApi.md#getInstructions1) | **GET** /tasks/{taskId}/instructions | Returns instructions of a given task.
[**getProgress**](TasksClassicApi.md#getProgress) | **GET** /tasks/{taskId}/progress | Returns progress of a given task.
[**start1**](TasksClassicApi.md#start1) | **POST** /tasks/{taskId}/start | Starts a task.
[**updateClientTaskPONumber**](TasksClassicApi.md#updateClientTaskPONumber) | **PUT** /tasks/{taskId}/clientTaskPONumber | Updates Client Task PO Number of a given task.
[**updateContacts**](TasksClassicApi.md#updateContacts) | **PUT** /tasks/{taskId}/contacts | Updates contacts of a given task.
[**updateCustomFields**](TasksClassicApi.md#updateCustomFields) | **PUT** /tasks/{taskId}/customFields | Updates custom fields of a given task.
[**updateDates**](TasksClassicApi.md#updateDates) | **PUT** /tasks/{taskId}/dates | Updates dates of a given task.
[**updateInstructions**](TasksClassicApi.md#updateInstructions) | **PUT** /tasks/{taskId}/instructions | Updates instructions of a given task.
[**updateName**](TasksClassicApi.md#updateName) | **PUT** /tasks/{taskId}/name | Updates name of a given task.

<a name="addFile"></a>
# **addFile**
> addFile(body, taskId)

Adds files to a given task.

Adds files to a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
FileDTO body = new FileDTO(); // FileDTO | 
String taskId = "taskId_example"; // String | task's internal identifier
try {
    apiInstance.addFile(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#addFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileDTO**](FileDTO.md)|  |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete5"></a>
# **delete5**
> delete5(taskId, removeFilesFromDisc, removeExternalProjects, forceJobsRemoval)

Removes a task.

Removes a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
Boolean removeFilesFromDisc = true; // Boolean | remove files from disc
Boolean removeExternalProjects = true; // Boolean | remove external projects (ie. from CAT Tool)
Boolean forceJobsRemoval = true; // Boolean | force jobs removal (ie. started or ready)
try {
    apiInstance.delete5(taskId, removeFilesFromDisc, removeExternalProjects, forceJobsRemoval);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#delete5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |
 **removeFilesFromDisc** | **Boolean**| remove files from disc | [optional]
 **removeExternalProjects** | **Boolean**| remove external projects (ie. from CAT Tool) | [optional]
 **forceJobsRemoval** | **Boolean**| force jobs removal (ie. started or ready) | [optional]

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContacts1"></a>
# **getContacts1**
> ContactsDTO getContacts1(taskId)

Returns contacts of a given task.

Returns contacts of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    ContactsDTO result = apiInstance.getContacts1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#getContacts1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**ContactsDTO**](ContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields7"></a>
# **getCustomFields7**
> CustomFieldsDTO getCustomFields7(taskId)

Returns custom fields of a given task.

Returns custom fields of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields7(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#getCustomFields7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDates3"></a>
# **getDates3**
> ProjectDatesDTO getDates3(taskId)

Returns dates of a given task.

Returns dates of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    ProjectDatesDTO result = apiInstance.getDates3(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#getDates3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**ProjectDatesDTO**](ProjectDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getInstructions1"></a>
# **getInstructions1**
> InstructionsDTO getInstructions1(taskId)

Returns instructions of a given task.

Returns instructions of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    InstructionsDTO result = apiInstance.getInstructions1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#getInstructions1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**InstructionsDTO**](InstructionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getProgress"></a>
# **getProgress**
> TaskProgressDTO getProgress(taskId)

Returns progress of a given task.

Returns progress of a given task. Progress contains information about task&#x27;s status (ie. opened or ready) and current phase (ie. translation). Workflow phase is defined as the first one which contains not ready jobs (ie. opened or started). When no such job exists then workflow phase is not included.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    TaskProgressDTO result = apiInstance.getProgress(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#getProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**TaskProgressDTO**](TaskProgressDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="start1"></a>
# **start1**
> start1(taskId)

Starts a task.

Starts a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
String taskId = "taskId_example"; // String | task's internal identifier
try {
    apiInstance.start1(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#start1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateClientTaskPONumber"></a>
# **updateClientTaskPONumber**
> StringDTO updateClientTaskPONumber(body, taskId)

Updates Client Task PO Number of a given task.

Updates Client Task PO Number of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
StringDTO body = new StringDTO(); // StringDTO | Updated Client Task PO Number of a given task.
String taskId = "taskId_example"; // String | task's internal identifier
try {
    StringDTO result = apiInstance.updateClientTaskPONumber(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateClientTaskPONumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)| Updated Client Task PO Number of a given task. |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**StringDTO**](StringDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateContacts"></a>
# **updateContacts**
> ContactsDTO updateContacts(body, taskId)

Updates contacts of a given task.

Updates contacts of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
ContactsDTO body = new ContactsDTO(); // ContactsDTO | Updated contacts of given task.
String taskId = "taskId_example"; // String | task's internal identifier
try {
    ContactsDTO result = apiInstance.updateContacts(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactsDTO**](ContactsDTO.md)| Updated contacts of given task. |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**ContactsDTO**](ContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomFields"></a>
# **updateCustomFields**
> CustomFieldsDTO updateCustomFields(body, taskId)

Updates custom fields of a given task.

Updates custom fields of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields
String taskId = "taskId_example"; // String | task's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateDates"></a>
# **updateDates**
> ProjectDatesDTO updateDates(body, taskId)

Updates dates of a given task.

Updates dates of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
ProjectDatesDTO body = new ProjectDatesDTO(); // ProjectDatesDTO | Updated dates of a given task.
String taskId = "taskId_example"; // String | task's internal identifier
try {
    ProjectDatesDTO result = apiInstance.updateDates(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectDatesDTO**](ProjectDatesDTO.md)| Updated dates of a given task. |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**ProjectDatesDTO**](ProjectDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateInstructions"></a>
# **updateInstructions**
> InstructionsDTO updateInstructions(body, taskId)

Updates instructions of a given task.

Updates instructions of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
InstructionsDTO body = new InstructionsDTO(); // InstructionsDTO | Updated instructions of a given task.
String taskId = "taskId_example"; // String | task's internal identifier
try {
    InstructionsDTO result = apiInstance.updateInstructions(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstructionsDTO**](InstructionsDTO.md)| Updated instructions of a given task. |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**InstructionsDTO**](InstructionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateName"></a>
# **updateName**
> StringDTO updateName(body, taskId)

Updates name of a given task.

Updates name of a given task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

TasksClassicApi apiInstance = new TasksClassicApi();
StringDTO body = new StringDTO(); // StringDTO | 
String taskId = "taskId_example"; // String | task's internal identifier
try {
    StringDTO result = apiInstance.updateName(body, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksClassicApi#updateName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StringDTO**](StringDTO.md)|  |
 **taskId** | **String**| task&#x27;s internal identifier |

### Return type

[**StringDTO**](StringDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

