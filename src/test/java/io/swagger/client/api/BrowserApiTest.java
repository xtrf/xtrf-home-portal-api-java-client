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
import io.swagger.client.model.ColumnDTO;
import io.swagger.client.model.FilterDTO;
import io.swagger.client.model.FilterPropertyDTO;
import io.swagger.client.model.LocalSettingsDTO;
import io.swagger.client.model.OrderDTO;
import io.swagger.client.model.PermissionsDTO;
import io.swagger.client.model.SettingsDTO;
import io.swagger.client.model.ViewDTO;
import io.swagger.client.model.ViewDetailsDTO;
import io.swagger.client.model.ViewWithIdDTO;
import io.swagger.client.model.ViewsBriefDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrowserApi
 */
@Ignore
public class BrowserApiTest {

    private final BrowserApi api = new BrowserApi();

    /**
     * Searches for data (ie. customer, task, etc) and returns it in a CSV form.
     *
     * Searches for data (ie. customer, task, etc) and returns it in a CSV form.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseCSVTest() throws ApiException {
        Long viewId = null;
        String separator = null;
        String additionalOrder = null;
        Object response = api.browseCSV(viewId, separator, additionalOrder);

        // TODO: test validations
    }
    /**
     * Searches for data (ie. customer, task, etc) and returns it in a tabular form.
     *
     * Searches for data (ie. customer, task, etc) and returns it in a tabular form.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseJSONTest() throws ApiException {
        Long viewId = null;
        Integer page = null;
        String additionalOrder = null;
        String useDeferredColumns = null;
        Integer maxRows = null;
        Object response = api.browseJSON(viewId, page, additionalOrder, useDeferredColumns, maxRows);

        // TODO: test validations
    }
    /**
     * Creates view for given class.
     *
     * Creates view for given class.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        ViewDTO body = null;
        String className = null;
        ViewWithIdDTO response = api.create(body, className);

        // TODO: test validations
    }
    /**
     * Removes a view.
     *
     * Removes a view. No content is returned upon success (204).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long viewId = null;
        api.delete(viewId);

        // TODO: test validations
    }
    /**
     * Deletes a single column from view.
     *
     * Deletes a single column from view.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteColumnTest() throws ApiException {
        Long viewId = null;
        String columnName = null;
        List<ColumnDTO> response = api.deleteColumn(viewId, columnName);

        // TODO: test validations
    }
    /**
     * Returns all view&#x27;s information.
     *
     * Returns all view&#x27;s information (ie. name, columns, filters, etc).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Long viewId = null;
        ViewDTO response = api.get(viewId);

        // TODO: test validations
    }
    /**
     * Returns column&#x27;s specific settings.
     *
     * Returns column&#x27;s specific settings. For example when column describes money amount we can decide whether it should display currency or not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getColumnSettingsTest() throws ApiException {
        Long viewId = null;
        String columnName = null;
        Object response = api.getColumnSettings(viewId, columnName);

        // TODO: test validations
    }
    /**
     * Returns columns defined in view.
     *
     * Returns columns defined in view.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getColumnsTest() throws ApiException {
        Long viewId = null;
        List<ColumnDTO> response = api.getColumns(viewId);

        // TODO: test validations
    }
    /**
     * Returns current view&#x27;s detailed information, suitable for browser.
     *
     * Returns current view&#x27;s detailed information, suitable for browser.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentViewDetailsTest() throws ApiException {
        String className = null;
        String placeName = null;
        ViewDetailsDTO response = api.getCurrentViewDetails(className, placeName);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s filter.
     *
     * Returns view&#x27;s filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilterTest() throws ApiException {
        Long viewId = null;
        FilterDTO response = api.getFilter(viewId);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s local settings (for current user).
     *
     * Returns view&#x27;s local settings (for current user).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocalSettingsTest() throws ApiException {
        Long viewId = null;
        LocalSettingsDTO response = api.getLocalSettings(viewId);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s order settings.
     *
     * Returns view&#x27;s order settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        Long viewId = null;
        OrderDTO response = api.getOrder(viewId);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s permissions.
     *
     * Returns view&#x27;s permissions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionsTest() throws ApiException {
        Long viewId = null;
        PermissionsDTO response = api.getPermissions(viewId);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s settings.
     *
     * Returns view&#x27;s settings (ie. name).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        Long viewId = null;
        SettingsDTO response = api.getSettings(viewId);

        // TODO: test validations
    }
    /**
     * Returns view&#x27;s detailed information, suitable for browser.
     *
     * Returns view&#x27;s detailed information, suitable for browser.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getViewDetailsTest() throws ApiException {
        String className = null;
        Long viewId = null;
        String placeName = null;
        ViewDetailsDTO response = api.getViewDetails(className, viewId, placeName);

        // TODO: test validations
    }
    /**
     * Returns views&#x27; brief.
     *
     * Returns views&#x27; brief.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getViewsBriefTest() throws ApiException {
        String className = null;
        String placeName = null;
        ViewsBriefDTO response = api.getViewsBrief(className, placeName);

        // TODO: test validations
    }
    /**
     * Selects given view as current and returns its detailed information, suitable for browser.
     *
     * Selects given view as current and returns its detailed information, suitable for browser.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void selectViewAndGetItsDetailsTest() throws ApiException {
        String className = null;
        Long viewId = null;
        String placeNameDenotesSpecificPlaceInSystemWithTheTable = null;
        ViewDetailsDTO response = api.selectViewAndGetItsDetails(className, viewId, placeNameDenotesSpecificPlaceInSystemWithTheTable);

        // TODO: test validations
    }
    /**
     * Updates all view&#x27;s information.
     *
     * Updates all view&#x27;s information (ie. name, columns, filters, etc).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        ViewDTO body = null;
        Long viewId = null;
        ViewDTO response = api.update(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates column&#x27;s specific settings.
     *
     * Updates column&#x27;s specific settings. For example when column describes money amount we can decide whether it should display currency or not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateColumnSettingsTest() throws ApiException {
        Object body = null;
        Long viewId = null;
        String columnName = null;
        Object response = api.updateColumnSettings(body, viewId, columnName);

        // TODO: test validations
    }
    /**
     * Updates columns in view.
     *
     * Updates columns in view.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateColumnsTest() throws ApiException {
        List<ColumnDTO> body = null;
        Long viewId = null;
        List<ColumnDTO> response = api.updateColumns(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s filter.
     *
     * Updates view&#x27;s filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFilterTest() throws ApiException {
        List<FilterPropertyDTO> body = null;
        Long viewId = null;
        FilterDTO response = api.updateFilter(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s filter property.
     *
     * Updates view&#x27;s filter property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFilterPropertyTest() throws ApiException {
        FilterPropertyDTO body = null;
        Long viewId = null;
        String filterProperty = null;
        Object response = api.updateFilterProperty(body, viewId, filterProperty);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s local settings (for current user).
     *
     * Updates view&#x27;s local settings (for current user).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocalSettingsTest() throws ApiException {
        LocalSettingsDTO body = null;
        Long viewId = null;
        LocalSettingsDTO response = api.updateLocalSettings(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s order settings.
     *
     * Updates view&#x27;s order settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        OrderDTO body = null;
        Long viewId = null;
        OrderDTO response = api.updateOrder(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s permissions.
     *
     * Updates view&#x27;s permissions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionsTest() throws ApiException {
        PermissionsDTO body = null;
        Long viewId = null;
        PermissionsDTO response = api.updatePermissions(body, viewId);

        // TODO: test validations
    }
    /**
     * Updates view&#x27;s settings.
     *
     * Updates view&#x27;s settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws ApiException {
        SettingsDTO body = null;
        Long viewId = null;
        SettingsDTO response = api.updateSettings(body, viewId);

        // TODO: test validations
    }
}
