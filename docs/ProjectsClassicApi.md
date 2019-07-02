# ProjectsClassicApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create1**](ProjectsClassicApi.md#create1) | **POST** /projects | Creates a new Classic Project.
[**createLanguageCombination**](ProjectsClassicApi.md#createLanguageCombination) | **POST** /projects/{projectId}/languageCombinations | Creates a new language combination for a given project without creating a task.
[**createTask**](ProjectsClassicApi.md#createTask) | **POST** /projects/{projectId}/tasks | Creates a new task for a given project.
[**delete5**](ProjectsClassicApi.md#delete5) | **DELETE** /projects/{projectId} | Removes a project.
[**getAllIds6**](ProjectsClassicApi.md#getAllIds6) | **GET** /projects/ids | Returns projects&#x27; internal identifiers.
[**getById7**](ProjectsClassicApi.md#getById7) | **GET** /projects/{projectId} | Returns project details.
[**getContacts**](ProjectsClassicApi.md#getContacts) | **GET** /projects/{projectId}/contacts | Returns contacts of a given project.
[**getCustomFields5**](ProjectsClassicApi.md#getCustomFields5) | **GET** /projects/{projectId}/customFields | Returns custom fields of a given project.
[**getDates1**](ProjectsClassicApi.md#getDates1) | **GET** /projects/{projectId}/dates | Returns dates of a given project.
[**getFinance**](ProjectsClassicApi.md#getFinance) | **GET** /projects/{projectId}/finance | Returns finance of a given project.
[**getInstructions**](ProjectsClassicApi.md#getInstructions) | **GET** /projects/{projectId}/instructions | Returns instructions of a given project.
[**updateContacts**](ProjectsClassicApi.md#updateContacts) | **PUT** /projects/{projectId}/contacts | Updates contacts of a given project.
[**updateCustomFields**](ProjectsClassicApi.md#updateCustomFields) | **PUT** /projects/{projectId}/customFields | Updates custom fields of a given project.
[**updateDates**](ProjectsClassicApi.md#updateDates) | **PUT** /projects/{projectId}/dates | Updates dates of a given project.
[**updateInstructions**](ProjectsClassicApi.md#updateInstructions) | **PUT** /projects/{projectId}/instructions | Updates instructions of a given project.

<a name="create1"></a>
# **create1**
> ProjectDTO create1(body)

Creates a new Classic Project.

Creates a new Classic Project. If the specified service ID refers to Smart Project, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
ProjectCreateDTO body = new ProjectCreateDTO(); // ProjectCreateDTO | Created a new Classic Project.
try {
    ProjectDTO result = apiInstance.create1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectCreateDTO**](ProjectCreateDTO.md)| Created a new Classic Project. |

### Return type

[**ProjectDTO**](ProjectDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="createLanguageCombination"></a>
# **createLanguageCombination**
> LanguageCombinationDTO createLanguageCombination(body, projectId)

Creates a new language combination for a given project without creating a task.

Creates a new language combination for a given project without creating a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
LanguageCombinationDTO body = new LanguageCombinationDTO(); // LanguageCombinationDTO | Created language combination for a given project without creating a task.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    LanguageCombinationDTO result = apiInstance.createLanguageCombination(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#createLanguageCombination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LanguageCombinationDTO**](LanguageCombinationDTO.md)| Created language combination for a given project without creating a task. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**LanguageCombinationDTO**](LanguageCombinationDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="createTask"></a>
# **createTask**
> TaskDTO createTask(body, projectId)

Creates a new task for a given project.

Creates a new task for a given project. Required fields are presented in the example.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
TaskDTO body = new TaskDTO(); // TaskDTO | Created new task for a given project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    TaskDTO result = apiInstance.createTask(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskDTO**](TaskDTO.md)| Created new task for a given project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**TaskDTO**](TaskDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="delete5"></a>
# **delete5**
> delete5(projectId)

Removes a project.

Removes a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    apiInstance.delete5(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#delete5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllIds6"></a>
# **getAllIds6**
> List&lt;Integer&gt; getAllIds6(updatedSince)

Returns projects&#x27; internal identifiers.

Returns projects&#x27; internal identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
Long updatedSince = 789L; // Long | only projects modified since this timestamp
try {
    List<Integer> result = apiInstance.getAllIds6(updatedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getAllIds6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedSince** | **Long**| only projects modified since this timestamp | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getById7"></a>
# **getById7**
> ProjectDTO getById7(projectId, embed)

Returns project details.

Returns project details. If the specified project ID refers to Smart Project, 400 Bad Request is returned instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
String embed = "embed_example"; // String | list of adittional fields which should be embedded in the response (ie. tasks)
try {
    ProjectDTO result = apiInstance.getById7(projectId, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getById7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |
 **embed** | **String**| list of adittional fields which should be embedded in the response (ie. tasks) | [optional]

### Return type

[**ProjectDTO**](ProjectDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getContacts"></a>
# **getContacts**
> ContactsDTO getContacts(projectId)

Returns contacts of a given project.

Returns contacts of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ContactsDTO result = apiInstance.getContacts(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ContactsDTO**](ContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getCustomFields5"></a>
# **getCustomFields5**
> CustomFieldsDTO getCustomFields5(projectId)

Returns custom fields of a given project.

Returns custom fields of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    CustomFieldsDTO result = apiInstance.getCustomFields5(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getCustomFields5");
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
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getDates1"></a>
# **getDates1**
> ProjectDatesDTO getDates1(projectId)

Returns dates of a given project.

Returns dates of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ProjectDatesDTO result = apiInstance.getDates1(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getDates1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ProjectDatesDTO**](ProjectDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getFinance"></a>
# **getFinance**
> FinanceDTO getFinance(projectId)

Returns finance of a given project.

Returns finance of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    FinanceDTO result = apiInstance.getFinance(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getFinance");
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
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="getInstructions"></a>
# **getInstructions**
> InstructionsDTO getInstructions(projectId)

Returns instructions of a given project.

Returns instructions of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
String projectId = "projectId_example"; // String | project's internal identifier
try {
    InstructionsDTO result = apiInstance.getInstructions(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#getInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**InstructionsDTO**](InstructionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateContacts"></a>
# **updateContacts**
> ContactsDTO updateContacts(body, projectId)

Updates contacts of a given project.

Updates contacts of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
ContactsDTO body = new ContactsDTO(); // ContactsDTO | Updated contacts of a given project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ContactsDTO result = apiInstance.updateContacts(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#updateContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactsDTO**](ContactsDTO.md)| Updated contacts of a given project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ContactsDTO**](ContactsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateCustomFields"></a>
# **updateCustomFields**
> CustomFieldsDTO updateCustomFields(body, projectId)

Updates custom fields of a given project.

Updates custom fields of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
List<CustomFieldDTO> body = Arrays.asList(new CustomFieldDTO()); // List<CustomFieldDTO> | Updated custom fields of a given project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    CustomFieldsDTO result = apiInstance.updateCustomFields(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#updateCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CustomFieldDTO&gt;**](CustomFieldDTO.md)| Updated custom fields of a given project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**CustomFieldsDTO**](CustomFieldsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateDates"></a>
# **updateDates**
> ProjectDatesDTO updateDates(body, projectId)

Updates dates of a given project.

Updates dates of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
ProjectDatesDTO body = new ProjectDatesDTO(); // ProjectDatesDTO | Updated dates of a given project..
String projectId = "projectId_example"; // String | project's internal identifier
try {
    ProjectDatesDTO result = apiInstance.updateDates(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#updateDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectDatesDTO**](ProjectDatesDTO.md)| Updated dates of a given project.. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**ProjectDatesDTO**](ProjectDatesDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

<a name="updateInstructions"></a>
# **updateInstructions**
> InstructionsDTO updateInstructions(body, projectId)

Updates instructions of a given project.

Updates instructions of a given project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectsClassicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

ProjectsClassicApi apiInstance = new ProjectsClassicApi();
InstructionsDTO body = new InstructionsDTO(); // InstructionsDTO | Updated instructions of a given project.
String projectId = "projectId_example"; // String | project's internal identifier
try {
    InstructionsDTO result = apiInstance.updateInstructions(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsClassicApi#updateInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstructionsDTO**](InstructionsDTO.md)| Updated instructions of a given project. |
 **projectId** | **String**| project&#x27;s internal identifier |

### Return type

[**InstructionsDTO**](InstructionsDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

