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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SubscriptionDTO
 */


public class SubscriptionDTO {
  @SerializedName("url")
  private String url = null;

  @SerializedName("event")
  private String event = null;

  @SerializedName("filter")
  private String filter = null;

  @SerializedName("embed")
  private String embed = null;

  public SubscriptionDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url that will be invoked by XTRF on event
   * @return url
  **/
  @Schema(description = "url that will be invoked by XTRF on event")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SubscriptionDTO event(String event) {
    this.event = event;
    return this;
  }

   /**
   * event to which you want to subscribe
   * @return event
  **/
  @Schema(description = "event to which you want to subscribe")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public SubscriptionDTO filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * filter expression in the form attribute&#x3D;value
   * @return filter
  **/
  @Schema(description = "filter expression in the form 'attribute=value'")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public SubscriptionDTO embed(String embed) {
    this.embed = embed;
    return this;
  }

   /**
   * additional fields which should be embedded in the event
   * @return embed
  **/
  @Schema(description = "additional fields which should be embedded in the event")
  public String getEmbed() {
    return embed;
  }

  public void setEmbed(String embed) {
    this.embed = embed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDTO subscriptionDTO = (SubscriptionDTO) o;
    return Objects.equals(this.url, subscriptionDTO.url) &&
        Objects.equals(this.event, subscriptionDTO.event) &&
        Objects.equals(this.filter, subscriptionDTO.filter) &&
        Objects.equals(this.embed, subscriptionDTO.embed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, event, filter, embed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDTO {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
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
