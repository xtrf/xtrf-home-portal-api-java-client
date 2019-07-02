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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Event;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EventsQueue
 */


public class EventsQueue {
  @SerializedName("readyToBeDispatched")
  private Boolean readyToBeDispatched = null;

  @SerializedName("all")
  private List<Event> all = null;

  @SerializedName("empty")
  private Boolean empty = null;

  public EventsQueue readyToBeDispatched(Boolean readyToBeDispatched) {
    this.readyToBeDispatched = readyToBeDispatched;
    return this;
  }

   /**
   * Get readyToBeDispatched
   * @return readyToBeDispatched
  **/
  @Schema(description = "")
  public Boolean isReadyToBeDispatched() {
    return readyToBeDispatched;
  }

  public void setReadyToBeDispatched(Boolean readyToBeDispatched) {
    this.readyToBeDispatched = readyToBeDispatched;
  }

  public EventsQueue all(List<Event> all) {
    this.all = all;
    return this;
  }

  public EventsQueue addAllItem(Event allItem) {
    if (this.all == null) {
      this.all = new ArrayList<Event>();
    }
    this.all.add(allItem);
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @Schema(description = "")
  public List<Event> getAll() {
    return all;
  }

  public void setAll(List<Event> all) {
    this.all = all;
  }

  public EventsQueue empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @Schema(description = "")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsQueue eventsQueue = (EventsQueue) o;
    return Objects.equals(this.readyToBeDispatched, eventsQueue.readyToBeDispatched) &&
        Objects.equals(this.all, eventsQueue.all) &&
        Objects.equals(this.empty, eventsQueue.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readyToBeDispatched, all, empty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsQueue {\n");
    
    sb.append("    readyToBeDispatched: ").append(toIndentedString(readyToBeDispatched)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
