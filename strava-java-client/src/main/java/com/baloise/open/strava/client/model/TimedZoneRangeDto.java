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
import com.baloise.open.strava.client.model.TimedZoneRangeAllOfDto;
import com.baloise.open.strava.client.model.ZoneRangeDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A union type representing the time spent in a given zone.
 */
@ApiModel(description = "A union type representing the time spent in a given zone.")
@JsonPropertyOrder({
  TimedZoneRangeDto.JSON_PROPERTY_MIN,
  TimedZoneRangeDto.JSON_PROPERTY_MAX,
  TimedZoneRangeDto.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
public class TimedZoneRangeDto {
  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Integer max;

  public static final String JSON_PROPERTY_TIME = "time";
  private Integer time;


  public TimedZoneRangeDto min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * The minimum value in the range.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum value in the range.")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public TimedZoneRangeDto max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * The maximum value in the range.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum value in the range.")
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public TimedZoneRangeDto time(Integer time) {
    
    this.time = time;
    return this;
  }

   /**
   * The number of seconds spent in this zone
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of seconds spent in this zone")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimedZoneRangeDto timedZoneRange = (TimedZoneRangeDto) o;
    return Objects.equals(this.min, timedZoneRange.min) &&
        Objects.equals(this.max, timedZoneRange.max) &&
        Objects.equals(this.time, timedZoneRange.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimedZoneRangeDto {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

