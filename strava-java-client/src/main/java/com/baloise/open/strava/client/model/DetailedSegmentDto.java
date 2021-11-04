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
import com.baloise.open.strava.client.model.DetailedSegmentAllOfDto;
import com.baloise.open.strava.client.model.PolylineMapDto;
import com.baloise.open.strava.client.model.SummaryPRSegmentEffortDto;
import com.baloise.open.strava.client.model.SummarySegmentDto;
import com.baloise.open.strava.client.model.SummarySegmentEffortDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DetailedSegmentDto
 */
@JsonPropertyOrder({
  DetailedSegmentDto.JSON_PROPERTY_ID,
  DetailedSegmentDto.JSON_PROPERTY_NAME,
  DetailedSegmentDto.JSON_PROPERTY_ACTIVITY_TYPE,
  DetailedSegmentDto.JSON_PROPERTY_DISTANCE,
  DetailedSegmentDto.JSON_PROPERTY_AVERAGE_GRADE,
  DetailedSegmentDto.JSON_PROPERTY_MAXIMUM_GRADE,
  DetailedSegmentDto.JSON_PROPERTY_ELEVATION_HIGH,
  DetailedSegmentDto.JSON_PROPERTY_ELEVATION_LOW,
  DetailedSegmentDto.JSON_PROPERTY_START_LATLNG,
  DetailedSegmentDto.JSON_PROPERTY_END_LATLNG,
  DetailedSegmentDto.JSON_PROPERTY_CLIMB_CATEGORY,
  DetailedSegmentDto.JSON_PROPERTY_CITY,
  DetailedSegmentDto.JSON_PROPERTY_STATE,
  DetailedSegmentDto.JSON_PROPERTY_COUNTRY,
  DetailedSegmentDto.JSON_PROPERTY_PRIVATE,
  DetailedSegmentDto.JSON_PROPERTY_ATHLETE_PR_EFFORT,
  DetailedSegmentDto.JSON_PROPERTY_ATHLETE_SEGMENT_STATS,
  DetailedSegmentDto.JSON_PROPERTY_CREATED_AT,
  DetailedSegmentDto.JSON_PROPERTY_UPDATED_AT,
  DetailedSegmentDto.JSON_PROPERTY_TOTAL_ELEVATION_GAIN,
  DetailedSegmentDto.JSON_PROPERTY_MAP,
  DetailedSegmentDto.JSON_PROPERTY_EFFORT_COUNT,
  DetailedSegmentDto.JSON_PROPERTY_ATHLETE_COUNT,
  DetailedSegmentDto.JSON_PROPERTY_HAZARDOUS,
  DetailedSegmentDto.JSON_PROPERTY_STAR_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
public class DetailedSegmentDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets activityType
   */
  public enum ActivityTypeEnum {
    RIDE("Ride"),
    
    RUN("Run");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActivityTypeEnum fromValue(String value) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTIVITY_TYPE = "activity_type";
  private ActivityTypeEnum activityType;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_AVERAGE_GRADE = "average_grade";
  private Float averageGrade;

  public static final String JSON_PROPERTY_MAXIMUM_GRADE = "maximum_grade";
  private Float maximumGrade;

  public static final String JSON_PROPERTY_ELEVATION_HIGH = "elevation_high";
  private Float elevationHigh;

  public static final String JSON_PROPERTY_ELEVATION_LOW = "elevation_low";
  private Float elevationLow;

  public static final String JSON_PROPERTY_START_LATLNG = "start_latlng";
  private List<Float> startLatlng = null;

  public static final String JSON_PROPERTY_END_LATLNG = "end_latlng";
  private List<Float> endLatlng = null;

  public static final String JSON_PROPERTY_CLIMB_CATEGORY = "climb_category";
  private Integer climbCategory;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  private Boolean _private;

  public static final String JSON_PROPERTY_ATHLETE_PR_EFFORT = "athlete_pr_effort";
  private SummarySegmentEffortDto athletePrEffort;

  public static final String JSON_PROPERTY_ATHLETE_SEGMENT_STATS = "athlete_segment_stats";
  private SummaryPRSegmentEffortDto athleteSegmentStats;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_TOTAL_ELEVATION_GAIN = "total_elevation_gain";
  private Float totalElevationGain;

  public static final String JSON_PROPERTY_MAP = "map";
  private PolylineMapDto map;

  public static final String JSON_PROPERTY_EFFORT_COUNT = "effort_count";
  private Integer effortCount;

  public static final String JSON_PROPERTY_ATHLETE_COUNT = "athlete_count";
  private Integer athleteCount;

  public static final String JSON_PROPERTY_HAZARDOUS = "hazardous";
  private Boolean hazardous;

  public static final String JSON_PROPERTY_STAR_COUNT = "star_count";
  private Integer starCount;


  public DetailedSegmentDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this segment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this segment")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DetailedSegmentDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this segment
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this segment")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DetailedSegmentDto activityType(ActivityTypeEnum activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityTypeEnum getActivityType() {
    return activityType;
  }


  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }


  public DetailedSegmentDto distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The segment&#39;s distance, in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's distance, in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public DetailedSegmentDto averageGrade(Float averageGrade) {
    
    this.averageGrade = averageGrade;
    return this;
  }

   /**
   * The segment&#39;s average grade, in percents
   * @return averageGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's average grade, in percents")
  @JsonProperty(JSON_PROPERTY_AVERAGE_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageGrade() {
    return averageGrade;
  }


  public void setAverageGrade(Float averageGrade) {
    this.averageGrade = averageGrade;
  }


  public DetailedSegmentDto maximumGrade(Float maximumGrade) {
    
    this.maximumGrade = maximumGrade;
    return this;
  }

   /**
   * The segments&#39;s maximum grade, in percents
   * @return maximumGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's maximum grade, in percents")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaximumGrade() {
    return maximumGrade;
  }


  public void setMaximumGrade(Float maximumGrade) {
    this.maximumGrade = maximumGrade;
  }


  public DetailedSegmentDto elevationHigh(Float elevationHigh) {
    
    this.elevationHigh = elevationHigh;
    return this;
  }

   /**
   * The segments&#39;s highest elevation, in meters
   * @return elevationHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's highest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEVATION_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getElevationHigh() {
    return elevationHigh;
  }


  public void setElevationHigh(Float elevationHigh) {
    this.elevationHigh = elevationHigh;
  }


  public DetailedSegmentDto elevationLow(Float elevationLow) {
    
    this.elevationLow = elevationLow;
    return this;
  }

   /**
   * The segments&#39;s lowest elevation, in meters
   * @return elevationLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's lowest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEVATION_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getElevationLow() {
    return elevationLow;
  }


  public void setElevationLow(Float elevationLow) {
    this.elevationLow = elevationLow;
  }


  public DetailedSegmentDto startLatlng(List<Float> startLatlng) {
    
    this.startLatlng = startLatlng;
    return this;
  }

  public DetailedSegmentDto addStartLatlngItem(Float startLatlngItem) {
    if (this.startLatlng == null) {
      this.startLatlng = new ArrayList<>();
    }
    this.startLatlng.add(startLatlngItem);
    return this;
  }

   /**
   * A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.
   * @return startLatlng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")
  @JsonProperty(JSON_PROPERTY_START_LATLNG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Float> getStartLatlng() {
    return startLatlng;
  }


  public void setStartLatlng(List<Float> startLatlng) {
    this.startLatlng = startLatlng;
  }


  public DetailedSegmentDto endLatlng(List<Float> endLatlng) {
    
    this.endLatlng = endLatlng;
    return this;
  }

  public DetailedSegmentDto addEndLatlngItem(Float endLatlngItem) {
    if (this.endLatlng == null) {
      this.endLatlng = new ArrayList<>();
    }
    this.endLatlng.add(endLatlngItem);
    return this;
  }

   /**
   * A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.
   * @return endLatlng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")
  @JsonProperty(JSON_PROPERTY_END_LATLNG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Float> getEndLatlng() {
    return endLatlng;
  }


  public void setEndLatlng(List<Float> endLatlng) {
    this.endLatlng = endLatlng;
  }


  public DetailedSegmentDto climbCategory(Integer climbCategory) {
    
    this.climbCategory = climbCategory;
    return this;
  }

   /**
   * The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.
   * @return climbCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.")
  @JsonProperty(JSON_PROPERTY_CLIMB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClimbCategory() {
    return climbCategory;
  }


  public void setClimbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
  }


  public DetailedSegmentDto city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The segments&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public DetailedSegmentDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The segments&#39;s state or geographical region.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's state or geographical region.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DetailedSegmentDto country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The segment&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public DetailedSegmentDto _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Whether this segment is private.
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this segment is private.")
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  public DetailedSegmentDto athletePrEffort(SummarySegmentEffortDto athletePrEffort) {
    
    this.athletePrEffort = athletePrEffort;
    return this;
  }

   /**
   * Get athletePrEffort
   * @return athletePrEffort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE_PR_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SummarySegmentEffortDto getAthletePrEffort() {
    return athletePrEffort;
  }


  public void setAthletePrEffort(SummarySegmentEffortDto athletePrEffort) {
    this.athletePrEffort = athletePrEffort;
  }


  public DetailedSegmentDto athleteSegmentStats(SummaryPRSegmentEffortDto athleteSegmentStats) {
    
    this.athleteSegmentStats = athleteSegmentStats;
    return this;
  }

   /**
   * Get athleteSegmentStats
   * @return athleteSegmentStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE_SEGMENT_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SummaryPRSegmentEffortDto getAthleteSegmentStats() {
    return athleteSegmentStats;
  }


  public void setAthleteSegmentStats(SummaryPRSegmentEffortDto athleteSegmentStats) {
    this.athleteSegmentStats = athleteSegmentStats;
  }


  public DetailedSegmentDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which the segment was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the segment was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DetailedSegmentDto updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the segment was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the segment was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DetailedSegmentDto totalElevationGain(Float totalElevationGain) {
    
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The segment&#39;s total elevation gain.
   * @return totalElevationGain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's total elevation gain.")
  @JsonProperty(JSON_PROPERTY_TOTAL_ELEVATION_GAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTotalElevationGain() {
    return totalElevationGain;
  }


  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }


  public DetailedSegmentDto map(PolylineMapDto map) {
    
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PolylineMapDto getMap() {
    return map;
  }


  public void setMap(PolylineMapDto map) {
    this.map = map;
  }


  public DetailedSegmentDto effortCount(Integer effortCount) {
    
    this.effortCount = effortCount;
    return this;
  }

   /**
   * The total number of efforts for this segment
   * @return effortCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of efforts for this segment")
  @JsonProperty(JSON_PROPERTY_EFFORT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEffortCount() {
    return effortCount;
  }


  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }


  public DetailedSegmentDto athleteCount(Integer athleteCount) {
    
    this.athleteCount = athleteCount;
    return this;
  }

   /**
   * The number of unique athletes who have an effort for this segment
   * @return athleteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of unique athletes who have an effort for this segment")
  @JsonProperty(JSON_PROPERTY_ATHLETE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAthleteCount() {
    return athleteCount;
  }


  public void setAthleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
  }


  public DetailedSegmentDto hazardous(Boolean hazardous) {
    
    this.hazardous = hazardous;
    return this;
  }

   /**
   * Whether this segment is considered hazardous
   * @return hazardous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this segment is considered hazardous")
  @JsonProperty(JSON_PROPERTY_HAZARDOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHazardous() {
    return hazardous;
  }


  public void setHazardous(Boolean hazardous) {
    this.hazardous = hazardous;
  }


  public DetailedSegmentDto starCount(Integer starCount) {
    
    this.starCount = starCount;
    return this;
  }

   /**
   * The number of stars for this segment
   * @return starCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of stars for this segment")
  @JsonProperty(JSON_PROPERTY_STAR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStarCount() {
    return starCount;
  }


  public void setStarCount(Integer starCount) {
    this.starCount = starCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegmentDto detailedSegment = (DetailedSegmentDto) o;
    return Objects.equals(this.id, detailedSegment.id) &&
        Objects.equals(this.name, detailedSegment.name) &&
        Objects.equals(this.activityType, detailedSegment.activityType) &&
        Objects.equals(this.distance, detailedSegment.distance) &&
        Objects.equals(this.averageGrade, detailedSegment.averageGrade) &&
        Objects.equals(this.maximumGrade, detailedSegment.maximumGrade) &&
        Objects.equals(this.elevationHigh, detailedSegment.elevationHigh) &&
        Objects.equals(this.elevationLow, detailedSegment.elevationLow) &&
        Objects.equals(this.startLatlng, detailedSegment.startLatlng) &&
        Objects.equals(this.endLatlng, detailedSegment.endLatlng) &&
        Objects.equals(this.climbCategory, detailedSegment.climbCategory) &&
        Objects.equals(this.city, detailedSegment.city) &&
        Objects.equals(this.state, detailedSegment.state) &&
        Objects.equals(this.country, detailedSegment.country) &&
        Objects.equals(this._private, detailedSegment._private) &&
        Objects.equals(this.athletePrEffort, detailedSegment.athletePrEffort) &&
        Objects.equals(this.athleteSegmentStats, detailedSegment.athleteSegmentStats) &&
        Objects.equals(this.createdAt, detailedSegment.createdAt) &&
        Objects.equals(this.updatedAt, detailedSegment.updatedAt) &&
        Objects.equals(this.totalElevationGain, detailedSegment.totalElevationGain) &&
        Objects.equals(this.map, detailedSegment.map) &&
        Objects.equals(this.effortCount, detailedSegment.effortCount) &&
        Objects.equals(this.athleteCount, detailedSegment.athleteCount) &&
        Objects.equals(this.hazardous, detailedSegment.hazardous) &&
        Objects.equals(this.starCount, detailedSegment.starCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, activityType, distance, averageGrade, maximumGrade, elevationHigh, elevationLow, startLatlng, endLatlng, climbCategory, city, state, country, _private, athletePrEffort, athleteSegmentStats, createdAt, updatedAt, totalElevationGain, map, effortCount, athleteCount, hazardous, starCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    averageGrade: ").append(toIndentedString(averageGrade)).append("\n");
    sb.append("    maximumGrade: ").append(toIndentedString(maximumGrade)).append("\n");
    sb.append("    elevationHigh: ").append(toIndentedString(elevationHigh)).append("\n");
    sb.append("    elevationLow: ").append(toIndentedString(elevationLow)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    climbCategory: ").append(toIndentedString(climbCategory)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    athletePrEffort: ").append(toIndentedString(athletePrEffort)).append("\n");
    sb.append("    athleteSegmentStats: ").append(toIndentedString(athleteSegmentStats)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
    sb.append("    athleteCount: ").append(toIndentedString(athleteCount)).append("\n");
    sb.append("    hazardous: ").append(toIndentedString(hazardous)).append("\n");
    sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
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
