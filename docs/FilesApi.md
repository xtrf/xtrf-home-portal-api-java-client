# FilesApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadFile**](FilesApi.md#uploadFile) | **POST** /files | Uploads a temporary file (ie. for XML import). Returns token which can be used in other API calls.

<a name="uploadFile"></a>
# **uploadFile**
> uploadFile(file, fileName)

Uploads a temporary file (ie. for XML import). Returns token which can be used in other API calls.

When a file is required by an operation (ie. task creation) it must be uploaded previously to the API. Uploading a file will result in a file token, which can be used to reference this file in other API calls.  Each file must be uploaded separately.  Keep in mind that file token has limited validity (ie. 10 minutes).  Therefore files must be uploaded just before issuing API call which reference them. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

FilesApi apiInstance = new FilesApi();
File file = new File("file_example"); // File | 
String fileName = "fileName_example"; // String | 
try {
    apiInstance.uploadFile(file, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **fileName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

