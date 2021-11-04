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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SplitDto
 */
@JsonPropertyOrder({
  SplitDto.JSON_PROPERTY_AVERAGE_SPEED,
  SplitDto.JSON_PROPERTY_DISTANCE,
  SplitDto.JSON_PROPERTY_ELAPSED_TIME,
  SplitDto.JSON_PROPERTY_ELEVATION_DIFFERENCE,
  SplitDto.JSON_PROPERTY_PACE_ZONE,
  SplitDto.JSON_PROPERTY_MOVING_TIME,
  SplitDto.JSON_PROPERTY_SPLIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
public class SplitDto {
  public static final String JSON_PROPERTY_AVERAGE_SPEED = "average_speed";
  private Float averageSpeed;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_ELAPSED_TIME = "elapsed_time";
  private Integer elapsedTime;

  public static final String JSON_PROPERTY_ELEVATION_DIFFERENCE = "elevation_difference";
  private Float elevationDifference;

  public static final String JSON_PROPERTY_PACE_ZONE = "pace_zone";
  private Integer paceZone;

  public static final String JSON_PROPERTY_MOVING_TIME = "moving_time";
  private Integer movingTime;

  public static final String JSON_PROPERTY_SPLIT = "split";
  private Integer split;


  public SplitDto averageSpeed(Float averageSpeed) {
    
    this.averageSpeed = averageSpeed;
    return this;
  }

   /**
   * The average speed of this split, in meters per second
   * @return averageSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average speed of this split, in meters per second")
  @JsonProperty(JSON_PROPERTY_AVERAGE_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageSpeed() {
    return averageSpeed;
  }


  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }


  public SplitDto distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The distance of this split, in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distance of this split, in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public SplitDto elapsedTime(Integer elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The elapsed time of this split, in seconds
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The elapsed time of this split, in seconds")
  @JsonProperty(JSON_PROPERTY_ELAPSED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public SplitDto elevationDifference(Float elevationDifference) {
    
    this.elevationDifference = elevationDifference;
    return this;
  }

   /**
   * The elevation difference of this split, in meters
   * @return elevationDifference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The elevation difference of this split, in meters")
  @JsonProperty(JSON_PROPERTY_ELEVATION_DIFFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getElevationDifference() {
    return elevationDifference;
  }


  public void setElevationDifference(Float elevationDifference) {
    this.elevationDifference = elevationDifference;
  }


  public SplitDto paceZone(Integer paceZone) {
    
    this.paceZone = paceZone;
    return this;
  }

   /**
   * The pacing zone of this split
   * @return paceZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pacing zone of this split")
  @JsonProperty(JSON_PROPERTY_PACE_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaceZone() {
    return paceZone;
  }


  public void setPaceZone(Integer paceZone) {
    this.paceZone = paceZone;
  }


  public SplitDto movingTime(Integer movingTime) {
    
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The moving time of this split, in seconds
   * @return movingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The moving time of this split, in seconds")
  @JsonProperty(JSON_PROPERTY_MOVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMovingTime() {
    return movingTime;
  }


  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }


  public SplitDto split(Integer split) {
    
    this.split = split;
    return this;
  }

   /**
   * N/A
   * @return split
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "N/A")
  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSplit() {
    return split;
  }


  public void setSplit(Integer split) {
    this.split = split;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitDto split = (SplitDto) o;
    return Objects.equals(this.averageSpeed, split.averageSpeed) &&
        Objects.equals(this.distance, split.distance) &&
        Objects.equals(this.elapsedTime, split.elapsedTime) &&
        Objects.equals(this.elevationDifference, split.elevationDifference) &&
        Objects.equals(this.paceZone, split.paceZone) &&
        Objects.equals(this.movingTime, split.movingTime) &&
        Objects.equals(this.split, split.split);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageSpeed, distance, elapsedTime, elevationDifference, paceZone, movingTime, split);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDto {\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    elevationDifference: ").append(toIndentedString(elevationDifference)).append("\n");
    sb.append("    paceZone: ").append(toIndentedString(paceZone)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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
