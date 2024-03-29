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
import io.swagger.client.model.ContactsDTO;
import io.swagger.client.model.CustomFieldDTO;
import io.swagger.client.model.CustomFieldsDTO;
import io.swagger.client.model.FinanceDTO;
import io.swagger.client.model.InstructionsDTO;
import io.swagger.client.model.LanguageCombinationDTO;
import io.swagger.client.model.ProjectCreateDTO;
import io.swagger.client.model.ProjectDTO;
import io.swagger.client.model.ProjectDatesDTO;
import io.swagger.client.model.TaskDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsClassicApi
 */
@Ignore
public class ProjectsClassicApiTest {

    private final ProjectsClassicApi api = new ProjectsClassicApi();

    /**
     * Creates a new Classic Project.
     *
     * Creates a new Classic Project. If the specified service ID refers to Smart Project, 400 Bad Request is returned instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void create1Test() throws ApiException {
        ProjectCreateDTO body = null;
        ProjectDTO response = api.create1(body);

        // TODO: test validations
    }
    /**
     * Creates a new language combination for a given project without creating a task.
     *
     * Creates a new language combination for a given project without creating a task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLanguageCombinationTest() throws ApiException {
        LanguageCombinationDTO body = null;
        String projectId = null;
        LanguageCombinationDTO response = api.createLanguageCombination(body, projectId);

        // TODO: test validations
    }
    /**
     * Creates a new task for a given project.
     *
     * Creates a new task for a given project. Required fields are presented in the example.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskTest() throws ApiException {
        TaskDTO body = null;
        String projectId = null;
        TaskDTO response = api.createTask(body, projectId);

        // TODO: test validations
    }
    /**
     * Removes a project.
     *
     * Removes a project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delete5Test() throws ApiException {
        String projectId = null;
        api.delete5(projectId);

        // TODO: test validations
    }
    /**
     * Returns projects&#x27; internal identifiers.
     *
     * Returns projects&#x27; internal identifiers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllIds6Test() throws ApiException {
        Long updatedSince = null;
        List<Integer> response = api.getAllIds6(updatedSince);

        // TODO: test validations
    }
    /**
     * Returns project details.
     *
     * Returns project details. If the specified project ID refers to Smart Project, 400 Bad Request is returned instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getById7Test() throws ApiException {
        String projectId = null;
        String embed = null;
        ProjectDTO response = api.getById7(projectId, embed);

        // TODO: test validations
    }
    /**
     * Returns contacts of a given project.
     *
     * Returns contacts of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsTest() throws ApiException {
        String projectId = null;
        ContactsDTO response = api.getContacts(projectId);

        // TODO: test validations
    }
    /**
     * Returns custom fields of a given project.
     *
     * Returns custom fields of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomFields5Test() throws ApiException {
        String projectId = null;
        CustomFieldsDTO response = api.getCustomFields5(projectId);

        // TODO: test validations
    }
    /**
     * Returns dates of a given project.
     *
     * Returns dates of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDates1Test() throws ApiException {
        String projectId = null;
        ProjectDatesDTO response = api.getDates1(projectId);

        // TODO: test validations
    }
    /**
     * Returns finance of a given project.
     *
     * Returns finance of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinanceTest() throws ApiException {
        String projectId = null;
        FinanceDTO response = api.getFinance(projectId);

        // TODO: test validations
    }
    /**
     * Returns instructions of a given project.
     *
     * Returns instructions of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstructionsTest() throws ApiException {
        String projectId = null;
        InstructionsDTO response = api.getInstructions(projectId);

        // TODO: test validations
    }
    /**
     * Updates contacts of a given project.
     *
     * Updates contacts of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContactsTest() throws ApiException {
        ContactsDTO body = null;
        String projectId = null;
        ContactsDTO response = api.updateContacts(body, projectId);

        // TODO: test validations
    }
    /**
     * Updates custom fields of a given project.
     *
     * Updates custom fields of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldsTest() throws ApiException {
        List<CustomFieldDTO> body = null;
        String projectId = null;
        CustomFieldsDTO response = api.updateCustomFields(body, projectId);

        // TODO: test validations
    }
    /**
     * Updates dates of a given project.
     *
     * Updates dates of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDatesTest() throws ApiException {
        ProjectDatesDTO body = null;
        String projectId = null;
        ProjectDatesDTO response = api.updateDates(body, projectId);

        // TODO: test validations
    }
    /**
     * Updates instructions of a given project.
     *
     * Updates instructions of a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInstructionsTest() throws ApiException {
        InstructionsDTO body = null;
        String projectId = null;
        InstructionsDTO response = api.updateInstructions(body, projectId);

        // TODO: test validations
    }
}
