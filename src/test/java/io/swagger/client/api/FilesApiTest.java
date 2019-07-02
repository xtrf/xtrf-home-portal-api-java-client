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

import io.swagger.client.ApiException;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Ignore
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Uploads a temporary file (ie. for XML import). Returns token which can be used in other API calls.
     *
     * When a file is required by an operation (ie. task creation) it must be uploaded previously to the API. Uploading a file will result in a file token, which can be used to reference this file in other API calls.  Each file must be uploaded separately.  Keep in mind that file token has limited validity (ie. 10 minutes).  Therefore files must be uploaded just before issuing API call which reference them. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        File file = null;
        String fileName = null;
        api.uploadFile(file, fileName);

        // TODO: test validations
    }
}
