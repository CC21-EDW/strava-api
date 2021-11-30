/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baloise.open.strava.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PolylineMapDto
 */
@JsonPropertyOrder({
  PolylineMapDto.JSON_PROPERTY_ID,
  PolylineMapDto.JSON_PROPERTY_POLYLINE,
  PolylineMapDto.JSON_PROPERTY_SUMMARY_POLYLINE
})
@JsonTypeName("PolylineMap")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T09:50:39.653673500+01:00[Europe/Zurich]")
public class PolylineMapDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public static final String JSON_PROPERTY_SUMMARY_POLYLINE = "summary_polyline";
  private String summaryPolyline;


  public PolylineMapDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the map
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the map")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PolylineMapDto polyline(String polyline) {
    
    this.polyline = polyline;
    return this;
  }

   /**
   * The polyline of the map, only returned on detailed representation of an object
   * @return polyline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The polyline of the map, only returned on detailed representation of an object")
  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolyline() {
    return polyline;
  }


  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }


  public PolylineMapDto summaryPolyline(String summaryPolyline) {
    
    this.summaryPolyline = summaryPolyline;
    return this;
  }

   /**
   * The summary polyline of the map
   * @return summaryPolyline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The summary polyline of the map")
  @JsonProperty(JSON_PROPERTY_SUMMARY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSummaryPolyline() {
    return summaryPolyline;
  }


  public void setSummaryPolyline(String summaryPolyline) {
    this.summaryPolyline = summaryPolyline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolylineMapDto polylineMap = (PolylineMapDto) o;
    return Objects.equals(this.id, polylineMap.id) &&
        Objects.equals(this.polyline, polylineMap.polyline) &&
        Objects.equals(this.summaryPolyline, polylineMap.summaryPolyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, polyline, summaryPolyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolylineMapDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    summaryPolyline: ").append(toIndentedString(summaryPolyline)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

