/*
 * XTRF Home Portal API
 * XTRF Home Portal API enables you to perform operations on Projects, Quotes, Customers, Vendors etc. as a XTRF Home Portal user. <br>The documentation is generated from OpenAPI specification 3.0 available <a href=\"/home-api/openapi.json\">here</a> <br>   The API client/consumer code may be easily generated in 60+ programming languages using an open source code generator available at the time of writing this documentation at <a href='https://editor.swagger.io/'>https://editor.swagger.io/</a> Thank you for using XTRF Application Programming interface (XTRF API). By using the API you agree to the terms below. If you disagree with any of these terms, XTRF does not grant you a license to use the XTRF API. XTRF reserves the right to update and change these terms from time to time without a prior notice of API users. You can always find the most recent version of these terms here: 
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ActionStartedDTO;
import io.swagger.client.model.MacroRequestDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MacrosApi {
    private ApiClient apiClient;

    public MacrosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MacrosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for run
     * @param body Generated client invoices documents. (required)
     * @param macroId macro internal identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call runCall(MacroRequestDTO body, Long macroId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/macros/{macroId}/run"
            .replaceAll("\\{" + "macroId" + "\\}", apiClient.escapeString(macroId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.xtrf-v1+json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-AUTH-ACCESS-TOKEN" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call runValidateBeforeCall(MacroRequestDTO body, Long macroId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling run(Async)");
        }
        // verify the required parameter 'macroId' is set
        if (macroId == null) {
            throw new ApiException("Missing the required parameter 'macroId' when calling run(Async)");
        }
        
        com.squareup.okhttp.Call call = runCall(body, macroId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Executes a macro.
     * Runs a specified macro on a specified list of items (\&quot;list\&quot; variable in the macro code). The list of items can be empty if the macro doesnt use it. Additional custom parameters can be provided to the macro when necessary (\&quot;params\&quot; variable in the macro code).   &lt;BR&gt;Note: Macros that support parameters can be also run from GUI (Views in Home Portal),so they should also handle the empty parameters map (e.g. by defining default values when parameters are not provided).
     * @param body Generated client invoices documents. (required)
     * @param macroId macro internal identifier (required)
     * @return ActionStartedDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActionStartedDTO run(MacroRequestDTO body, Long macroId) throws ApiException {
        ApiResponse<ActionStartedDTO> resp = runWithHttpInfo(body, macroId);
        return resp.getData();
    }

    /**
     * Executes a macro.
     * Runs a specified macro on a specified list of items (\&quot;list\&quot; variable in the macro code). The list of items can be empty if the macro doesnt use it. Additional custom parameters can be provided to the macro when necessary (\&quot;params\&quot; variable in the macro code).   &lt;BR&gt;Note: Macros that support parameters can be also run from GUI (Views in Home Portal),so they should also handle the empty parameters map (e.g. by defining default values when parameters are not provided).
     * @param body Generated client invoices documents. (required)
     * @param macroId macro internal identifier (required)
     * @return ApiResponse&lt;ActionStartedDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActionStartedDTO> runWithHttpInfo(MacroRequestDTO body, Long macroId) throws ApiException {
        com.squareup.okhttp.Call call = runValidateBeforeCall(body, macroId, null, null);
        Type localVarReturnType = new TypeToken<ActionStartedDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Executes a macro. (asynchronously)
     * Runs a specified macro on a specified list of items (\&quot;list\&quot; variable in the macro code). The list of items can be empty if the macro doesnt use it. Additional custom parameters can be provided to the macro when necessary (\&quot;params\&quot; variable in the macro code).   &lt;BR&gt;Note: Macros that support parameters can be also run from GUI (Views in Home Portal),so they should also handle the empty parameters map (e.g. by defining default values when parameters are not provided).
     * @param body Generated client invoices documents. (required)
     * @param macroId macro internal identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call runAsync(MacroRequestDTO body, Long macroId, final ApiCallback<ActionStartedDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = runValidateBeforeCall(body, macroId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActionStartedDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
