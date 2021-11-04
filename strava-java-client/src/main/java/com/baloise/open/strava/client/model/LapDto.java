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
import com.baloise.open.strava.client.model.MetaActivityDto;
import com.baloise.open.strava.client.model.MetaAthleteDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * LapDto
 */
@JsonPropertyOrder({
  LapDto.JSON_PROPERTY_ID,
  LapDto.JSON_PROPERTY_ACTIVITY,
  LapDto.JSON_PROPERTY_ATHLETE,
  LapDto.JSON_PROPERTY_AVERAGE_CADENCE,
  LapDto.JSON_PROPERTY_AVERAGE_SPEED,
  LapDto.JSON_PROPERTY_DISTANCE,
  LapDto.JSON_PROPERTY_ELAPSED_TIME,
  LapDto.JSON_PROPERTY_START_INDEX,
  LapDto.JSON_PROPERTY_END_INDEX,
  LapDto.JSON_PROPERTY_LAP_INDEX,
  LapDto.JSON_PROPERTY_MAX_SPEED,
  LapDto.JSON_PROPERTY_MOVING_TIME,
  LapDto.JSON_PROPERTY_NAME,
  LapDto.JSON_PROPERTY_PACE_ZONE,
  LapDto.JSON_PROPERTY_SPLIT,
  LapDto.JSON_PROPERTY_START_DATE,
  LapDto.JSON_PROPERTY_START_DATE_LOCAL,
  LapDto.JSON_PROPERTY_TOTAL_ELEVATION_GAIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
public class LapDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ACTIVITY = "activity";
  private MetaActivityDto activity;

  public static final String JSON_PROPERTY_ATHLETE = "athlete";
  private MetaAthleteDto athlete;

  public static final String JSON_PROPERTY_AVERAGE_CADENCE = "average_cadence";
  private Float averageCadence;

  public static final String JSON_PROPERTY_AVERAGE_SPEED = "average_speed";
  private Float averageSpeed;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_ELAPSED_TIME = "elapsed_time";
  private Integer elapsedTime;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  private Integer endIndex;

  public static final String JSON_PROPERTY_LAP_INDEX = "lap_index";
  private Integer lapIndex;

  public static final String JSON_PROPERTY_MAX_SPEED = "max_speed";
  private Float maxSpeed;

  public static final String JSON_PROPERTY_MOVING_TIME = "moving_time";
  private Integer movingTime;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PACE_ZONE = "pace_zone";
  private Integer paceZone;

  public static final String JSON_PROPERTY_SPLIT = "split";
  private Integer split;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_START_DATE_LOCAL = "start_date_local";
  private OffsetDateTime startDateLocal;

  public static final String JSON_PROPERTY_TOTAL_ELEVATION_GAIN = "total_elevation_gain";
  private Float totalElevationGain;


  public LapDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this lap
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this lap")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public LapDto activity(MetaActivityDto activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetaActivityDto getActivity() {
    return activity;
  }


  public void setActivity(MetaActivityDto activity) {
    this.activity = activity;
  }


  public LapDto athlete(MetaAthleteDto athlete) {
    
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetaAthleteDto getAthlete() {
    return athlete;
  }


  public void setAthlete(MetaAthleteDto athlete) {
    this.athlete = athlete;
  }


  public LapDto averageCadence(Float averageCadence) {
    
    this.averageCadence = averageCadence;
    return this;
  }

   /**
   * The lap&#39;s average cadence
   * @return averageCadence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lap's average cadence")
  @JsonProperty(JSON_PROPERTY_AVERAGE_CADENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageCadence() {
    return averageCadence;
  }


  public void setAverageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
  }


  public LapDto averageSpeed(Float averageSpeed) {
    
    this.averageSpeed = averageSpeed;
    return this;
  }

   /**
   * The lap&#39;s average speed
   * @return averageSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lap's average speed")
  @JsonProperty(JSON_PROPERTY_AVERAGE_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageSpeed() {
    return averageSpeed;
  }


  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }


  public LapDto distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The lap&#39;s distance, in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lap's distance, in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public LapDto elapsedTime(Integer elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The lap&#39;s elapsed time, in seconds
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lap's elapsed time, in seconds")
  @JsonProperty(JSON_PROPERTY_ELAPSED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public LapDto startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index of this effort in its activity&#39;s stream
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start index of this effort in its activity's stream")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public LapDto endIndex(Integer endIndex) {
    
    this.endIndex = endIndex;
    return this;
  }

   /**
   * The end index of this effort in its activity&#39;s stream
   * @return endIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end index of this effort in its activity's stream")
  @JsonProperty(JSON_PROPERTY_END_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndIndex() {
    return endIndex;
  }


  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }


  public LapDto lapIndex(Integer lapIndex) {
    
    this.lapIndex = lapIndex;
    return this;
  }

   /**
   * The index of this lap in the activity it belongs to
   * @return lapIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of this lap in the activity it belongs to")
  @JsonProperty(JSON_PROPERTY_LAP_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLapIndex() {
    return lapIndex;
  }


  public void setLapIndex(Integer lapIndex) {
    this.lapIndex = lapIndex;
  }


  public LapDto maxSpeed(Float maxSpeed) {
    
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * The maximum speed of this lat, in meters per second
   * @return maxSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum speed of this lat, in meters per second")
  @JsonProperty(JSON_PROPERTY_MAX_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaxSpeed() {
    return maxSpeed;
  }


  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }


  public LapDto movingTime(Integer movingTime) {
    
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The lap&#39;s moving time, in seconds
   * @return movingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lap's moving time, in seconds")
  @JsonProperty(JSON_PROPERTY_MOVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMovingTime() {
    return movingTime;
  }


  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }


  public LapDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the lap
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the lap")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LapDto paceZone(Integer paceZone) {
    
    this.paceZone = paceZone;
    return this;
  }

   /**
   * The athlete&#39;s pace zone during this lap
   * @return paceZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's pace zone during this lap")
  @JsonProperty(JSON_PROPERTY_PACE_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaceZone() {
    return paceZone;
  }


  public void setPaceZone(Integer paceZone) {
    this.paceZone = paceZone;
  }


  public LapDto split(Integer split) {
    
    this.split = split;
    return this;
  }

   /**
   * Get split
   * @return split
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSplit() {
    return split;
  }


  public void setSplit(Integer split) {
    this.split = split;
  }


  public LapDto startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The time at which the lap was started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the lap was started.")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public LapDto startDateLocal(OffsetDateTime startDateLocal) {
    
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the lap was started in the local timezone.
   * @return startDateLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the lap was started in the local timezone.")
  @JsonProperty(JSON_PROPERTY_START_DATE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }


  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }


  public LapDto totalElevationGain(Float totalElevationGain) {
    
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The elevation gain of this lap, in meters
   * @return totalElevationGain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The elevation gain of this lap, in meters")
  @JsonProperty(JSON_PROPERTY_TOTAL_ELEVATION_GAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTotalElevationGain() {
    return totalElevationGain;
  }


  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LapDto lap = (LapDto) o;
    return Objects.equals(this.id, lap.id) &&
        Objects.equals(this.activity, lap.activity) &&
        Objects.equals(this.athlete, lap.athlete) &&
        Objects.equals(this.averageCadence, lap.averageCadence) &&
        Objects.equals(this.averageSpeed, lap.averageSpeed) &&
        Objects.equals(this.distance, lap.distance) &&
        Objects.equals(this.elapsedTime, lap.elapsedTime) &&
        Objects.equals(this.startIndex, lap.startIndex) &&
        Objects.equals(this.endIndex, lap.endIndex) &&
        Objects.equals(this.lapIndex, lap.lapIndex) &&
        Objects.equals(this.maxSpeed, lap.maxSpeed) &&
        Objects.equals(this.movingTime, lap.movingTime) &&
        Objects.equals(this.name, lap.name) &&
        Objects.equals(this.paceZone, lap.paceZone) &&
        Objects.equals(this.split, lap.split) &&
        Objects.equals(this.startDate, lap.startDate) &&
        Objects.equals(this.startDateLocal, lap.startDateLocal) &&
        Objects.equals(this.totalElevationGain, lap.totalElevationGain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activity, athlete, averageCadence, averageSpeed, distance, elapsedTime, startIndex, endIndex, lapIndex, maxSpeed, movingTime, name, paceZone, split, startDate, startDateLocal, totalElevationGain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LapDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    averageCadence: ").append(toIndentedString(averageCadence)).append("\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    lapIndex: ").append(toIndentedString(lapIndex)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paceZone: ").append(toIndentedString(paceZone)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
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
