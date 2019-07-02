# MacrosApi

All URIs are relative to *https://hornet-trunk.dev.xtrf.eu/home-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**run**](MacrosApi.md#run) | **POST** /macros/{macroId}/run | Executes a macro.

<a name="run"></a>
# **run**
> ActionStartedDTO run(body, macroId)

Executes a macro.

Runs a specified macro on a specified list of items (\&quot;list\&quot; variable in the macro code). The list of items can be empty if the macro doesn&#x27;t use it. Additional custom parameters can be provided to the macro when necessary (\&quot;params\&quot; variable in the macro code).   &lt;BR&gt;Note: Macros that support parameters can be also run from GUI (Views in Home Portal),so they should also handle the empty parameters map (e.g. by defining default values when parameters are not provided).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MacrosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-AUTH-ACCESS-TOKEN
ApiKeyAuth X-AUTH-ACCESS-TOKEN = (ApiKeyAuth) defaultClient.getAuthentication("X-AUTH-ACCESS-TOKEN");
X-AUTH-ACCESS-TOKEN.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-AUTH-ACCESS-TOKEN.setApiKeyPrefix("Token");

MacrosApi apiInstance = new MacrosApi();
MacroRequestDTO body = new MacroRequestDTO(); // MacroRequestDTO | Generated client invoices documents.
Long macroId = 789L; // Long | macro internal identifier
try {
    ActionStartedDTO result = apiInstance.run(body, macroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MacrosApi#run");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MacroRequestDTO**](MacroRequestDTO.md)| Generated client invoices documents. |
 **macroId** | **Long**| macro internal identifier |

### Return type

[**ActionStartedDTO**](ActionStartedDTO.md)

### Authorization

[X-AUTH-ACCESS-TOKEN](../README.md#X-AUTH-ACCESS-TOKEN)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/vnd.xtrf-v1+json;charset=UTF-8

