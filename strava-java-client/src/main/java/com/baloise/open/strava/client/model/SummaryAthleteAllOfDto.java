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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SummaryAthleteAllOfDto
 */
@JsonPropertyOrder({
  SummaryAthleteAllOfDto.JSON_PROPERTY_RESOURCE_STATE,
  SummaryAthleteAllOfDto.JSON_PROPERTY_FIRSTNAME,
  SummaryAthleteAllOfDto.JSON_PROPERTY_LASTNAME,
  SummaryAthleteAllOfDto.JSON_PROPERTY_PROFILE_MEDIUM,
  SummaryAthleteAllOfDto.JSON_PROPERTY_PROFILE,
  SummaryAthleteAllOfDto.JSON_PROPERTY_CITY,
  SummaryAthleteAllOfDto.JSON_PROPERTY_STATE,
  SummaryAthleteAllOfDto.JSON_PROPERTY_COUNTRY,
  SummaryAthleteAllOfDto.JSON_PROPERTY_SEX,
  SummaryAthleteAllOfDto.JSON_PROPERTY_PREMIUM,
  SummaryAthleteAllOfDto.JSON_PROPERTY_SUMMIT,
  SummaryAthleteAllOfDto.JSON_PROPERTY_CREATED_AT,
  SummaryAthleteAllOfDto.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("SummaryAthlete_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T10:08:10.913426500+01:00[Europe/Zurich]")
public class SummaryAthleteAllOfDto {
  public static final String JSON_PROPERTY_RESOURCE_STATE = "resource_state";
  private Integer resourceState;

  public static final String JSON_PROPERTY_FIRSTNAME = "firstname";
  private String firstname;

  public static final String JSON_PROPERTY_LASTNAME = "lastname";
  private String lastname;

  public static final String JSON_PROPERTY_PROFILE_MEDIUM = "profile_medium";
  private String profileMedium;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  /**
   * The athlete&#39;s sex.
   */
  public enum SexEnum {
    M("M"),
    
    F("F");

    private String value;

    SexEnum(String value) {
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
    public static SexEnum fromValue(String value) {
      for (SexEnum b : SexEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEX = "sex";
  private SexEnum sex;

  public static final String JSON_PROPERTY_PREMIUM = "premium";
  private Boolean premium;

  public static final String JSON_PROPERTY_SUMMIT = "summit";
  private Boolean summit;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;


  public SummaryAthleteAllOfDto resourceState(Integer resourceState) {
    
    this.resourceState = resourceState;
    return this;
  }

   /**
   * Resource state, indicates level of detail. Possible values: 1 -&gt; \&quot;meta\&quot;, 2 -&gt; \&quot;summary\&quot;, 3 -&gt; \&quot;detail\&quot;
   * @return resourceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"")
  @JsonProperty(JSON_PROPERTY_RESOURCE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResourceState() {
    return resourceState;
  }


  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }


  public SummaryAthleteAllOfDto firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * The athlete&#39;s first name.
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's first name.")
  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public SummaryAthleteAllOfDto lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * The athlete&#39;s last name.
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's last name.")
  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public SummaryAthleteAllOfDto profileMedium(String profileMedium) {
    
    this.profileMedium = profileMedium;
    return this;
  }

   /**
   * URL to a 62x62 pixel profile picture.
   * @return profileMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a 62x62 pixel profile picture.")
  @JsonProperty(JSON_PROPERTY_PROFILE_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileMedium() {
    return profileMedium;
  }


  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }


  public SummaryAthleteAllOfDto profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * URL to a 124x124 pixel profile picture.
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a 124x124 pixel profile picture.")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public SummaryAthleteAllOfDto city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The athlete&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public SummaryAthleteAllOfDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The athlete&#39;s state or geographical region.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's state or geographical region.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public SummaryAthleteAllOfDto country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The athlete&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public SummaryAthleteAllOfDto sex(SexEnum sex) {
    
    this.sex = sex;
    return this;
  }

   /**
   * The athlete&#39;s sex.
   * @return sex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's sex.")
  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SexEnum getSex() {
    return sex;
  }


  public void setSex(SexEnum sex) {
    this.sex = sex;
  }


  public SummaryAthleteAllOfDto premium(Boolean premium) {
    
    this.premium = premium;
    return this;
  }

   /**
   * Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription.
   * @return premium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription.")
  @JsonProperty(JSON_PROPERTY_PREMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPremium() {
    return premium;
  }


  public void setPremium(Boolean premium) {
    this.premium = premium;
  }


  public SummaryAthleteAllOfDto summit(Boolean summit) {
    
    this.summit = summit;
    return this;
  }

   /**
   * Whether the athlete has any Summit subscription.
   * @return summit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the athlete has any Summit subscription.")
  @JsonProperty(JSON_PROPERTY_SUMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSummit() {
    return summit;
  }


  public void setSummit(Boolean summit) {
    this.summit = summit;
  }


  public SummaryAthleteAllOfDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which the athlete was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the athlete was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SummaryAthleteAllOfDto updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the athlete was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the athlete was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryAthleteAllOfDto summaryAthleteAllOf = (SummaryAthleteAllOfDto) o;
    return Objects.equals(this.resourceState, summaryAthleteAllOf.resourceState) &&
        Objects.equals(this.firstname, summaryAthleteAllOf.firstname) &&
        Objects.equals(this.lastname, summaryAthleteAllOf.lastname) &&
        Objects.equals(this.profileMedium, summaryAthleteAllOf.profileMedium) &&
        Objects.equals(this.profile, summaryAthleteAllOf.profile) &&
        Objects.equals(this.city, summaryAthleteAllOf.city) &&
        Objects.equals(this.state, summaryAthleteAllOf.state) &&
        Objects.equals(this.country, summaryAthleteAllOf.country) &&
        Objects.equals(this.sex, summaryAthleteAllOf.sex) &&
        Objects.equals(this.premium, summaryAthleteAllOf.premium) &&
        Objects.equals(this.summit, summaryAthleteAllOf.summit) &&
        Objects.equals(this.createdAt, summaryAthleteAllOf.createdAt) &&
        Objects.equals(this.updatedAt, summaryAthleteAllOf.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceState, firstname, lastname, profileMedium, profile, city, state, country, sex, premium, summit, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryAthleteAllOfDto {\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    profileMedium: ").append(toIndentedString(profileMedium)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    summit: ").append(toIndentedString(summit)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

