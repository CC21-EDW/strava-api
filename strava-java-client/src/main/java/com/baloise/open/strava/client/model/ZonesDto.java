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
import com.baloise.open.strava.client.model.HeartRateZoneRangesDto;
import com.baloise.open.strava.client.model.PowerZoneRangesDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ZonesDto
 */
@JsonPropertyOrder({
  ZonesDto.JSON_PROPERTY_HEART_RATE,
  ZonesDto.JSON_PROPERTY_POWER
})
@JsonTypeName("Zones")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T10:08:10.913426500+01:00[Europe/Zurich]")
public class ZonesDto {
  public static final String JSON_PROPERTY_HEART_RATE = "heart_rate";
  private HeartRateZoneRangesDto heartRate;

  public static final String JSON_PROPERTY_POWER = "power";
  private PowerZoneRangesDto power;


  public ZonesDto heartRate(HeartRateZoneRangesDto heartRate) {
    
    this.heartRate = heartRate;
    return this;
  }

   /**
   * Get heartRate
   * @return heartRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEART_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HeartRateZoneRangesDto getHeartRate() {
    return heartRate;
  }


  public void setHeartRate(HeartRateZoneRangesDto heartRate) {
    this.heartRate = heartRate;
  }


  public ZonesDto power(PowerZoneRangesDto power) {
    
    this.power = power;
    return this;
  }

   /**
   * Get power
   * @return power
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PowerZoneRangesDto getPower() {
    return power;
  }


  public void setPower(PowerZoneRangesDto power) {
    this.power = power;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesDto zones = (ZonesDto) o;
    return Objects.equals(this.heartRate, zones.heartRate) &&
        Objects.equals(this.power, zones.power);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartRate, power);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesDto {\n");
    sb.append("    heartRate: ").append(toIndentedString(heartRate)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
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

