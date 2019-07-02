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
import io.swagger.client.model.FileCategorizationsDto;
import io.swagger.client.model.FileDto;
import io.swagger.client.model.FilesDto;
import io.swagger.client.model.FilesShareStatusDto;
import io.swagger.client.model.JobStatusDTO;
import io.swagger.client.model.ProjectFileDto;
import io.swagger.client.model.StringDTO;
import io.swagger.client.model.VendorPriceProfileDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsSmartV2Api
 */
@Ignore
public class JobsSmartV2ApiTest {

    private final JobsSmartV2Api api = new JobsSmartV2Api();

    /**
     * Adds files to the project as delivered in the job.
     *
     * Adds files to the project as delivered in the job. The files have to be uploaded beforehand (see \&quot;POST /jobs/{jobId}/files/upload\&quot; operation). The following properties can be specified for each file:&lt;ul&gt;&lt;li&gt;category (required, 400 Bad Request is returned otherwise)&lt;/li&gt;&lt;li&gt;languageIds – when the file category depends on a list of languages&lt;/li&gt;&lt;li&gt;languageCombinationIds – when the file category depends on a list of language combinations&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFilesTest() throws ApiException {
        FileCategorizationsDto body = null;
        String jobId = null;
        api.addFiles(body, jobId);

        // TODO: test validations
    }
    /**
     * Assigns vendor to a job in a project.
     *
     * Assigns vendor to a job in a project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignVendorTest() throws ApiException {
        VendorPriceProfileDTO body = null;
        String jobId = null;
        api.assignVendor(body, jobId);

        // TODO: test validations
    }
    /**
     * Changes job status if possible (400 Bad Request is returned otherwise).
     *
     * Changes job status if possible (400 Bad Request is returned otherwise). The status has to be specified using one of the following keys:&lt;ul&gt;&lt;li&gt;OPEN – available when the job has one of the following statuses: ACCEPTED, CANCELED&lt;/li&gt;&lt;li&gt;ACCEPTED – available when the job has one of the following statuses: OPEN (Vendor and dates have to be set before calling the operation), STARTED&lt;/li&gt;&lt;li&gt;STARTED – available when the job has one of the following statuses: ACCEPTED, READY&lt;/li&gt;&lt;li&gt;READY – available when the job has one of the following statuses: STARTED&lt;/li&gt;&lt;li&gt;CANCELLED – available when the job has one of the following statuses: OPEN, ACCEPTED, STARTED, OFFERS_SENT&lt;/li&gt;&lt;li&gt;OFFERS_SENT – not available as a target status for this operation&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeStatusTest() throws ApiException {
        JobStatusDTO body = null;
        String jobId = null;
        api.changeStatus(body, jobId);

        // TODO: test validations
    }
    /**
     * Returns list of files delivered in the job.
     *
     * Returns list of files delivered in the job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeliveredFilesTest() throws ApiException {
        String jobId = null;
        List<ProjectFileDto> response = api.getDeliveredFiles(jobId);

        // TODO: test validations
    }
    /**
     * Returns details for a job.
     *
     * Returns details for a job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileByIdTest() throws ApiException {
        String jobId = null;
        ProjectFileDto response = api.getFileById(jobId);

        // TODO: test validations
    }
    /**
     * Returns list of files shared with the job as Reference Files.
     *
     * Returns list of files shared with the job as Reference Files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedReferenceFilesTest() throws ApiException {
        String jobId = null;
        List<ProjectFileDto> response = api.getSharedReferenceFiles(jobId);

        // TODO: test validations
    }
    /**
     * Returns list of files shared with the job as Work Files.
     *
     * Returns list of files shared with the job as Work Files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedWorkFilesTest() throws ApiException {
        String jobId = null;
        List<ProjectFileDto> response = api.getSharedWorkFiles(jobId);

        // TODO: test validations
    }
    /**
     * Shares selected files as Reference Files with a job in a project.
     *
     * Shares selected files as Reference Files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were already shared with the job. If a file was shared with the job as Work File, it will now be shared as Reference File (and not as Work File).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shareAsReferenceFilesTest() throws ApiException {
        FilesDto body = null;
        String jobId = null;
        FilesShareStatusDto response = api.shareAsReferenceFiles(body, jobId);

        // TODO: test validations
    }
    /**
     * Shares selected files as Work Files with a job in a project.
     *
     * Shares selected files as Work Files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were already shared with the job. If a file was shared with the job as Reference File, it will now be shared as Work File (and not as Reference File).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shareAsWorkFilesTest() throws ApiException {
        FilesDto body = null;
        String jobId = null;
        FilesShareStatusDto response = api.shareAsWorkFiles(body, jobId);

        // TODO: test validations
    }
    /**
     * Stops sharing selected files with a job in a project.
     *
     * Stops sharing selected files with a job in a project. The files and the job have to be part of the same project. The operation is finished successfully even if some of the selected files were not shared with the job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopSharingTest() throws ApiException {
        FilesDto body = null;
        String jobId = null;
        FilesShareStatusDto response = api.stopSharing(body, jobId);

        // TODO: test validations
    }
    /**
     * Updates instructions for a job.
     *
     * Updates instructions for a job. See also \&quot;PUT /projects/{projectId}/vendorInstructions\&quot; and \&quot;PUT /quotes/{quoteId}/vendorInstructions\&quot; for updating instructions for all jobs in a project or quote.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInstructionsTest() throws ApiException {
        StringDTO body = null;
        String jobId = null;
        api.updateInstructions(body, jobId);

        // TODO: test validations
    }
    /**
     * Uploads file to the project as a file delivered in the job.
     *
     * Uploads file to the project as a file delivered in the job. Only one file can be uploaded at once. When the upload is finished the file has to be added by specifying its category and languages (see \&quot;PUT /jobs/{jobId}/files/add\&quot; operation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFile1Test() throws ApiException {
        File file = null;
        String fileName = null;
        String jobId = null;
        FileDto response = api.uploadFile1(file, fileName, jobId);

        // TODO: test validations
    }
}
