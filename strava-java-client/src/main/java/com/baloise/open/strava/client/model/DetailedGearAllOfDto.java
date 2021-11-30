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
 * DetailedGearAllOfDto
 */
@JsonPropertyOrder({
  DetailedGearAllOfDto.JSON_PROPERTY_BRAND_NAME,
  DetailedGearAllOfDto.JSON_PROPERTY_MODEL_NAME,
  DetailedGearAllOfDto.JSON_PROPERTY_FRAME_TYPE,
  DetailedGearAllOfDto.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("DetailedGear_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T09:50:39.653673500+01:00[Europe/Zurich]")
public class DetailedGearAllOfDto {
  public static final String JSON_PROPERTY_BRAND_NAME = "brand_name";
  private String brandName;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_FRAME_TYPE = "frame_type";
  private Integer frameType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;


  public DetailedGearAllOfDto brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * The gear&#39;s brand name.
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gear's brand name.")
  @JsonProperty(JSON_PROPERTY_BRAND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public DetailedGearAllOfDto modelName(String modelName) {
    
    this.modelName = modelName;
    return this;
  }

   /**
   * The gear&#39;s model name.
   * @return modelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gear's model name.")
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelName() {
    return modelName;
  }


  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public DetailedGearAllOfDto frameType(Integer frameType) {
    
    this.frameType = frameType;
    return this;
  }

   /**
   * The gear&#39;s frame type (bike only).
   * @return frameType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gear's frame type (bike only).")
  @JsonProperty(JSON_PROPERTY_FRAME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFrameType() {
    return frameType;
  }


  public void setFrameType(Integer frameType) {
    this.frameType = frameType;
  }


  public DetailedGearAllOfDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The gear&#39;s description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gear's description.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedGearAllOfDto detailedGearAllOf = (DetailedGearAllOfDto) o;
    return Objects.equals(this.brandName, detailedGearAllOf.brandName) &&
        Objects.equals(this.modelName, detailedGearAllOf.modelName) &&
        Objects.equals(this.frameType, detailedGearAllOf.frameType) &&
        Objects.equals(this.description, detailedGearAllOf.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, modelName, frameType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedGearAllOfDto {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    frameType: ").append(toIndentedString(frameType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

