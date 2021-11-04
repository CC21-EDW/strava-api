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
import com.baloise.open.strava.client.model.DetailedSegmentEffortAllOfDto;
import com.baloise.open.strava.client.model.MetaActivityDto;
import com.baloise.open.strava.client.model.MetaAthleteDto;
import com.baloise.open.strava.client.model.SummarySegmentDto;
import com.baloise.open.strava.client.model.SummarySegmentEffortDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DetailedSegmentEffortDto
 */
@JsonPropertyOrder({
  DetailedSegmentEffortDto.JSON_PROPERTY_ID,
  DetailedSegmentEffortDto.JSON_PROPERTY_ACTIVITY_ID,
  DetailedSegmentEffortDto.JSON_PROPERTY_ELAPSED_TIME,
  DetailedSegmentEffortDto.JSON_PROPERTY_START_DATE,
  DetailedSegmentEffortDto.JSON_PROPERTY_START_DATE_LOCAL,
  DetailedSegmentEffortDto.JSON_PROPERTY_DISTANCE,
  DetailedSegmentEffortDto.JSON_PROPERTY_IS_KOM,
  DetailedSegmentEffortDto.JSON_PROPERTY_NAME,
  DetailedSegmentEffortDto.JSON_PROPERTY_ACTIVITY,
  DetailedSegmentEffortDto.JSON_PROPERTY_ATHLETE,
  DetailedSegmentEffortDto.JSON_PROPERTY_MOVING_TIME,
  DetailedSegmentEffortDto.JSON_PROPERTY_START_INDEX,
  DetailedSegmentEffortDto.JSON_PROPERTY_END_INDEX,
  DetailedSegmentEffortDto.JSON_PROPERTY_AVERAGE_CADENCE,
  DetailedSegmentEffortDto.JSON_PROPERTY_AVERAGE_WATTS,
  DetailedSegmentEffortDto.JSON_PROPERTY_DEVICE_WATTS,
  DetailedSegmentEffortDto.JSON_PROPERTY_AVERAGE_HEARTRATE,
  DetailedSegmentEffortDto.JSON_PROPERTY_MAX_HEARTRATE,
  DetailedSegmentEffortDto.JSON_PROPERTY_SEGMENT,
  DetailedSegmentEffortDto.JSON_PROPERTY_KOM_RANK,
  DetailedSegmentEffortDto.JSON_PROPERTY_PR_RANK,
  DetailedSegmentEffortDto.JSON_PROPERTY_HIDDEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
public class DetailedSegmentEffortDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ACTIVITY_ID = "activity_id";
  private Long activityId;

  public static final String JSON_PROPERTY_ELAPSED_TIME = "elapsed_time";
  private Integer elapsedTime;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_START_DATE_LOCAL = "start_date_local";
  private OffsetDateTime startDateLocal;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_IS_KOM = "is_kom";
  private Boolean isKom;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACTIVITY = "activity";
  private MetaActivityDto activity;

  public static final String JSON_PROPERTY_ATHLETE = "athlete";
  private MetaAthleteDto athlete;

  public static final String JSON_PROPERTY_MOVING_TIME = "moving_time";
  private Integer movingTime;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  private Integer endIndex;

  public static final String JSON_PROPERTY_AVERAGE_CADENCE = "average_cadence";
  private Float averageCadence;

  public static final String JSON_PROPERTY_AVERAGE_WATTS = "average_watts";
  private Float averageWatts;

  public static final String JSON_PROPERTY_DEVICE_WATTS = "device_watts";
  private Boolean deviceWatts;

  public static final String JSON_PROPERTY_AVERAGE_HEARTRATE = "average_heartrate";
  private Float averageHeartrate;

  public static final String JSON_PROPERTY_MAX_HEARTRATE = "max_heartrate";
  private Float maxHeartrate;

  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private SummarySegmentDto segment;

  public static final String JSON_PROPERTY_KOM_RANK = "kom_rank";
  private Integer komRank;

  public static final String JSON_PROPERTY_PR_RANK = "pr_rank";
  private Integer prRank;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;


  public DetailedSegmentEffortDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this effort
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this effort")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DetailedSegmentEffortDto activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * The unique identifier of the activity related to this effort
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the activity related to this effort")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public DetailedSegmentEffortDto elapsedTime(Integer elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The effort&#39;s elapsed time
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effort's elapsed time")
  @JsonProperty(JSON_PROPERTY_ELAPSED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public DetailedSegmentEffortDto startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The time at which the effort was started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the effort was started.")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public DetailedSegmentEffortDto startDateLocal(OffsetDateTime startDateLocal) {
    
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the effort was started in the local timezone.
   * @return startDateLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the effort was started in the local timezone.")
  @JsonProperty(JSON_PROPERTY_START_DATE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }


  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }


  public DetailedSegmentEffortDto distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The effort&#39;s distance in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effort's distance in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public DetailedSegmentEffortDto isKom(Boolean isKom) {
    
    this.isKom = isKom;
    return this;
  }

   /**
   * Whether this effort is the current best on the leaderboard
   * @return isKom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this effort is the current best on the leaderboard")
  @JsonProperty(JSON_PROPERTY_IS_KOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsKom() {
    return isKom;
  }


  public void setIsKom(Boolean isKom) {
    this.isKom = isKom;
  }


  public DetailedSegmentEffortDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the segment on which this effort was performed
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the segment on which this effort was performed")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DetailedSegmentEffortDto activity(MetaActivityDto activity) {
    
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


  public DetailedSegmentEffortDto athlete(MetaAthleteDto athlete) {
    
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


  public DetailedSegmentEffortDto movingTime(Integer movingTime) {
    
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The effort&#39;s moving time
   * @return movingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effort's moving time")
  @JsonProperty(JSON_PROPERTY_MOVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMovingTime() {
    return movingTime;
  }


  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }


  public DetailedSegmentEffortDto startIndex(Integer startIndex) {
    
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


  public DetailedSegmentEffortDto endIndex(Integer endIndex) {
    
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


  public DetailedSegmentEffortDto averageCadence(Float averageCadence) {
    
    this.averageCadence = averageCadence;
    return this;
  }

   /**
   * The effort&#39;s average cadence
   * @return averageCadence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effort's average cadence")
  @JsonProperty(JSON_PROPERTY_AVERAGE_CADENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageCadence() {
    return averageCadence;
  }


  public void setAverageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
  }


  public DetailedSegmentEffortDto averageWatts(Float averageWatts) {
    
    this.averageWatts = averageWatts;
    return this;
  }

   /**
   * The average wattage of this effort
   * @return averageWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average wattage of this effort")
  @JsonProperty(JSON_PROPERTY_AVERAGE_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageWatts() {
    return averageWatts;
  }


  public void setAverageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
  }


  public DetailedSegmentEffortDto deviceWatts(Boolean deviceWatts) {
    
    this.deviceWatts = deviceWatts;
    return this;
  }

   /**
   * For riding efforts, whether the wattage was reported by a dedicated recording device
   * @return deviceWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For riding efforts, whether the wattage was reported by a dedicated recording device")
  @JsonProperty(JSON_PROPERTY_DEVICE_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeviceWatts() {
    return deviceWatts;
  }


  public void setDeviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
  }


  public DetailedSegmentEffortDto averageHeartrate(Float averageHeartrate) {
    
    this.averageHeartrate = averageHeartrate;
    return this;
  }

   /**
   * The heart heart rate of the athlete during this effort
   * @return averageHeartrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The heart heart rate of the athlete during this effort")
  @JsonProperty(JSON_PROPERTY_AVERAGE_HEARTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageHeartrate() {
    return averageHeartrate;
  }


  public void setAverageHeartrate(Float averageHeartrate) {
    this.averageHeartrate = averageHeartrate;
  }


  public DetailedSegmentEffortDto maxHeartrate(Float maxHeartrate) {
    
    this.maxHeartrate = maxHeartrate;
    return this;
  }

   /**
   * The maximum heart rate of the athlete during this effort
   * @return maxHeartrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum heart rate of the athlete during this effort")
  @JsonProperty(JSON_PROPERTY_MAX_HEARTRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaxHeartrate() {
    return maxHeartrate;
  }


  public void setMaxHeartrate(Float maxHeartrate) {
    this.maxHeartrate = maxHeartrate;
  }


  public DetailedSegmentEffortDto segment(SummarySegmentDto segment) {
    
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SummarySegmentDto getSegment() {
    return segment;
  }


  public void setSegment(SummarySegmentDto segment) {
    this.segment = segment;
  }


  public DetailedSegmentEffortDto komRank(Integer komRank) {
    
    this.komRank = komRank;
    return this;
  }

   /**
   * The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload
   * minimum: 1
   * maximum: 10
   * @return komRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload")
  @JsonProperty(JSON_PROPERTY_KOM_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKomRank() {
    return komRank;
  }


  public void setKomRank(Integer komRank) {
    this.komRank = komRank;
  }


  public DetailedSegmentEffortDto prRank(Integer prRank) {
    
    this.prRank = prRank;
    return this;
  }

   /**
   * The rank of the effort on the athlete&#39;s leaderboard if it belongs in the top 3 at the time of upload
   * minimum: 1
   * maximum: 3
   * @return prRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rank of the effort on the athlete's leaderboard if it belongs in the top 3 at the time of upload")
  @JsonProperty(JSON_PROPERTY_PR_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrRank() {
    return prRank;
  }


  public void setPrRank(Integer prRank) {
    this.prRank = prRank;
  }


  public DetailedSegmentEffortDto hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether this effort should be hidden when viewed within an activity
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this effort should be hidden when viewed within an activity")
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegmentEffortDto detailedSegmentEffort = (DetailedSegmentEffortDto) o;
    return Objects.equals(this.id, detailedSegmentEffort.id) &&
        Objects.equals(this.activityId, detailedSegmentEffort.activityId) &&
        Objects.equals(this.elapsedTime, detailedSegmentEffort.elapsedTime) &&
        Objects.equals(this.startDate, detailedSegmentEffort.startDate) &&
        Objects.equals(this.startDateLocal, detailedSegmentEffort.startDateLocal) &&
        Objects.equals(this.distance, detailedSegmentEffort.distance) &&
        Objects.equals(this.isKom, detailedSegmentEffort.isKom) &&
        Objects.equals(this.name, detailedSegmentEffort.name) &&
        Objects.equals(this.activity, detailedSegmentEffort.activity) &&
        Objects.equals(this.athlete, detailedSegmentEffort.athlete) &&
        Objects.equals(this.movingTime, detailedSegmentEffort.movingTime) &&
        Objects.equals(this.startIndex, detailedSegmentEffort.startIndex) &&
        Objects.equals(this.endIndex, detailedSegmentEffort.endIndex) &&
        Objects.equals(this.averageCadence, detailedSegmentEffort.averageCadence) &&
        Objects.equals(this.averageWatts, detailedSegmentEffort.averageWatts) &&
        Objects.equals(this.deviceWatts, detailedSegmentEffort.deviceWatts) &&
        Objects.equals(this.averageHeartrate, detailedSegmentEffort.averageHeartrate) &&
        Objects.equals(this.maxHeartrate, detailedSegmentEffort.maxHeartrate) &&
        Objects.equals(this.segment, detailedSegmentEffort.segment) &&
        Objects.equals(this.komRank, detailedSegmentEffort.komRank) &&
        Objects.equals(this.prRank, detailedSegmentEffort.prRank) &&
        Objects.equals(this.hidden, detailedSegmentEffort.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, elapsedTime, startDate, startDateLocal, distance, isKom, name, activity, athlete, movingTime, startIndex, endIndex, averageCadence, averageWatts, deviceWatts, averageHeartrate, maxHeartrate, segment, komRank, prRank, hidden);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentEffortDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    isKom: ").append(toIndentedString(isKom)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    averageCadence: ").append(toIndentedString(averageCadence)).append("\n");
    sb.append("    averageWatts: ").append(toIndentedString(averageWatts)).append("\n");
    sb.append("    deviceWatts: ").append(toIndentedString(deviceWatts)).append("\n");
    sb.append("    averageHeartrate: ").append(toIndentedString(averageHeartrate)).append("\n");
    sb.append("    maxHeartrate: ").append(toIndentedString(maxHeartrate)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    komRank: ").append(toIndentedString(komRank)).append("\n");
    sb.append("    prRank: ").append(toIndentedString(prRank)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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
