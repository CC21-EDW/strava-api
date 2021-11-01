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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * RunningRaceDto
 */
@JsonPropertyOrder({
  RunningRaceDto.JSON_PROPERTY_ID,
  RunningRaceDto.JSON_PROPERTY_NAME,
  RunningRaceDto.JSON_PROPERTY_RUNNING_RACE_TYPE,
  RunningRaceDto.JSON_PROPERTY_DISTANCE,
  RunningRaceDto.JSON_PROPERTY_START_DATE_LOCAL,
  RunningRaceDto.JSON_PROPERTY_CITY,
  RunningRaceDto.JSON_PROPERTY_STATE,
  RunningRaceDto.JSON_PROPERTY_COUNTRY,
  RunningRaceDto.JSON_PROPERTY_ROUTE_IDS,
  RunningRaceDto.JSON_PROPERTY_MEASUREMENT_PREFERENCE,
  RunningRaceDto.JSON_PROPERTY_URL,
  RunningRaceDto.JSON_PROPERTY_WEBSITE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:37:53.710209+01:00[Europe/Zurich]")
public class RunningRaceDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RUNNING_RACE_TYPE = "running_race_type";
  private Integer runningRaceType;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_START_DATE_LOCAL = "start_date_local";
  private OffsetDateTime startDateLocal;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ROUTE_IDS = "route_ids";
  private List<Long> routeIds = null;

  /**
   * The unit system in which the race should be displayed.
   */
  public enum MeasurementPreferenceEnum {
    FEET("feet"),
    
    METERS("meters");

    private String value;

    MeasurementPreferenceEnum(String value) {
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
    public static MeasurementPreferenceEnum fromValue(String value) {
      for (MeasurementPreferenceEnum b : MeasurementPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MEASUREMENT_PREFERENCE = "measurement_preference";
  private MeasurementPreferenceEnum measurementPreference;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WEBSITE_URL = "website_url";
  private String websiteUrl;


  public RunningRaceDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this race.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this race.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public RunningRaceDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this race.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this race.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RunningRaceDto runningRaceType(Integer runningRaceType) {
    
    this.runningRaceType = runningRaceType;
    return this;
  }

   /**
   * The type of this race.
   * @return runningRaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of this race.")
  @JsonProperty(JSON_PROPERTY_RUNNING_RACE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRunningRaceType() {
    return runningRaceType;
  }


  public void setRunningRaceType(Integer runningRaceType) {
    this.runningRaceType = runningRaceType;
  }


  public RunningRaceDto distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The race&#39;s distance, in meters.
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The race's distance, in meters.")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public RunningRaceDto startDateLocal(OffsetDateTime startDateLocal) {
    
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the race begins started in the local timezone.
   * @return startDateLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the race begins started in the local timezone.")
  @JsonProperty(JSON_PROPERTY_START_DATE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }


  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }


  public RunningRaceDto city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The name of the city in which the race is taking place.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the city in which the race is taking place.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public RunningRaceDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The name of the state or geographical region in which the race is taking place.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the state or geographical region in which the race is taking place.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public RunningRaceDto country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The name of the country in which the race is taking place.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the country in which the race is taking place.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public RunningRaceDto routeIds(List<Long> routeIds) {
    
    this.routeIds = routeIds;
    return this;
  }

  public RunningRaceDto addRouteIdsItem(Long routeIdsItem) {
    if (this.routeIds == null) {
      this.routeIds = new ArrayList<>();
    }
    this.routeIds.add(routeIdsItem);
    return this;
  }

   /**
   * The set of routes that cover this race&#39;s course.
   * @return routeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of routes that cover this race's course.")
  @JsonProperty(JSON_PROPERTY_ROUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getRouteIds() {
    return routeIds;
  }


  public void setRouteIds(List<Long> routeIds) {
    this.routeIds = routeIds;
  }


  public RunningRaceDto measurementPreference(MeasurementPreferenceEnum measurementPreference) {
    
    this.measurementPreference = measurementPreference;
    return this;
  }

   /**
   * The unit system in which the race should be displayed.
   * @return measurementPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit system in which the race should be displayed.")
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MeasurementPreferenceEnum getMeasurementPreference() {
    return measurementPreference;
  }


  public void setMeasurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
  }


  public RunningRaceDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The vanity URL of this race on Strava.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vanity URL of this race on Strava.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public RunningRaceDto websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * The URL of this race&#39;s website.
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of this race's website.")
  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunningRaceDto runningRace = (RunningRaceDto) o;
    return Objects.equals(this.id, runningRace.id) &&
        Objects.equals(this.name, runningRace.name) &&
        Objects.equals(this.runningRaceType, runningRace.runningRaceType) &&
        Objects.equals(this.distance, runningRace.distance) &&
        Objects.equals(this.startDateLocal, runningRace.startDateLocal) &&
        Objects.equals(this.city, runningRace.city) &&
        Objects.equals(this.state, runningRace.state) &&
        Objects.equals(this.country, runningRace.country) &&
        Objects.equals(this.routeIds, runningRace.routeIds) &&
        Objects.equals(this.measurementPreference, runningRace.measurementPreference) &&
        Objects.equals(this.url, runningRace.url) &&
        Objects.equals(this.websiteUrl, runningRace.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, runningRaceType, distance, startDateLocal, city, state, country, routeIds, measurementPreference, url, websiteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunningRaceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runningRaceType: ").append(toIndentedString(runningRaceType)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    routeIds: ").append(toIndentedString(routeIds)).append("\n");
    sb.append("    measurementPreference: ").append(toIndentedString(measurementPreference)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

