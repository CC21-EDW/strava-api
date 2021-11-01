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
import com.baloise.open.strava.client.model.DetailedAthleteAllOfDto;
import com.baloise.open.strava.client.model.SummaryAthleteDto;
import com.baloise.open.strava.client.model.SummaryClubDto;
import com.baloise.open.strava.client.model.SummaryGearDto;
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
 * DetailedAthleteDto
 */
@JsonPropertyOrder({
  DetailedAthleteDto.JSON_PROPERTY_ID,
  DetailedAthleteDto.JSON_PROPERTY_RESOURCE_STATE,
  DetailedAthleteDto.JSON_PROPERTY_FIRSTNAME,
  DetailedAthleteDto.JSON_PROPERTY_LASTNAME,
  DetailedAthleteDto.JSON_PROPERTY_PROFILE_MEDIUM,
  DetailedAthleteDto.JSON_PROPERTY_PROFILE,
  DetailedAthleteDto.JSON_PROPERTY_CITY,
  DetailedAthleteDto.JSON_PROPERTY_STATE,
  DetailedAthleteDto.JSON_PROPERTY_COUNTRY,
  DetailedAthleteDto.JSON_PROPERTY_SEX,
  DetailedAthleteDto.JSON_PROPERTY_PREMIUM,
  DetailedAthleteDto.JSON_PROPERTY_SUMMIT,
  DetailedAthleteDto.JSON_PROPERTY_CREATED_AT,
  DetailedAthleteDto.JSON_PROPERTY_UPDATED_AT,
  DetailedAthleteDto.JSON_PROPERTY_FOLLOWER_COUNT,
  DetailedAthleteDto.JSON_PROPERTY_FRIEND_COUNT,
  DetailedAthleteDto.JSON_PROPERTY_MEASUREMENT_PREFERENCE,
  DetailedAthleteDto.JSON_PROPERTY_FTP,
  DetailedAthleteDto.JSON_PROPERTY_WEIGHT,
  DetailedAthleteDto.JSON_PROPERTY_CLUBS,
  DetailedAthleteDto.JSON_PROPERTY_BIKES,
  DetailedAthleteDto.JSON_PROPERTY_SHOES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:37:53.710209+01:00[Europe/Zurich]")
public class DetailedAthleteDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

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

  public static final String JSON_PROPERTY_FOLLOWER_COUNT = "follower_count";
  private Integer followerCount;

  public static final String JSON_PROPERTY_FRIEND_COUNT = "friend_count";
  private Integer friendCount;

  /**
   * The athlete&#39;s preferred unit system.
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

  public static final String JSON_PROPERTY_FTP = "ftp";
  private Integer ftp;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Float weight;

  public static final String JSON_PROPERTY_CLUBS = "clubs";
  private List<SummaryClubDto> clubs = null;

  public static final String JSON_PROPERTY_BIKES = "bikes";
  private List<SummaryGearDto> bikes = null;

  public static final String JSON_PROPERTY_SHOES = "shoes";
  private List<SummaryGearDto> shoes = null;


  public DetailedAthleteDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the athlete
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the athlete")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DetailedAthleteDto resourceState(Integer resourceState) {
    
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


  public DetailedAthleteDto firstname(String firstname) {
    
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


  public DetailedAthleteDto lastname(String lastname) {
    
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


  public DetailedAthleteDto profileMedium(String profileMedium) {
    
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


  public DetailedAthleteDto profile(String profile) {
    
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


  public DetailedAthleteDto city(String city) {
    
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


  public DetailedAthleteDto state(String state) {
    
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


  public DetailedAthleteDto country(String country) {
    
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


  public DetailedAthleteDto sex(SexEnum sex) {
    
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


  public DetailedAthleteDto premium(Boolean premium) {
    
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


  public DetailedAthleteDto summit(Boolean summit) {
    
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


  public DetailedAthleteDto createdAt(OffsetDateTime createdAt) {
    
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


  public DetailedAthleteDto updatedAt(OffsetDateTime updatedAt) {
    
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


  public DetailedAthleteDto followerCount(Integer followerCount) {
    
    this.followerCount = followerCount;
    return this;
  }

   /**
   * The athlete&#39;s follower count.
   * @return followerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's follower count.")
  @JsonProperty(JSON_PROPERTY_FOLLOWER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFollowerCount() {
    return followerCount;
  }


  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }


  public DetailedAthleteDto friendCount(Integer friendCount) {
    
    this.friendCount = friendCount;
    return this;
  }

   /**
   * The athlete&#39;s friend count.
   * @return friendCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's friend count.")
  @JsonProperty(JSON_PROPERTY_FRIEND_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFriendCount() {
    return friendCount;
  }


  public void setFriendCount(Integer friendCount) {
    this.friendCount = friendCount;
  }


  public DetailedAthleteDto measurementPreference(MeasurementPreferenceEnum measurementPreference) {
    
    this.measurementPreference = measurementPreference;
    return this;
  }

   /**
   * The athlete&#39;s preferred unit system.
   * @return measurementPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's preferred unit system.")
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MeasurementPreferenceEnum getMeasurementPreference() {
    return measurementPreference;
  }


  public void setMeasurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
  }


  public DetailedAthleteDto ftp(Integer ftp) {
    
    this.ftp = ftp;
    return this;
  }

   /**
   * The athlete&#39;s FTP (Functional Threshold Power).
   * @return ftp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's FTP (Functional Threshold Power).")
  @JsonProperty(JSON_PROPERTY_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtp() {
    return ftp;
  }


  public void setFtp(Integer ftp) {
    this.ftp = ftp;
  }


  public DetailedAthleteDto weight(Float weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * The athlete&#39;s weight.
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's weight.")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getWeight() {
    return weight;
  }


  public void setWeight(Float weight) {
    this.weight = weight;
  }


  public DetailedAthleteDto clubs(List<SummaryClubDto> clubs) {
    
    this.clubs = clubs;
    return this;
  }

  public DetailedAthleteDto addClubsItem(SummaryClubDto clubsItem) {
    if (this.clubs == null) {
      this.clubs = new ArrayList<>();
    }
    this.clubs.add(clubsItem);
    return this;
  }

   /**
   * The athlete&#39;s clubs.
   * @return clubs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's clubs.")
  @JsonProperty(JSON_PROPERTY_CLUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SummaryClubDto> getClubs() {
    return clubs;
  }


  public void setClubs(List<SummaryClubDto> clubs) {
    this.clubs = clubs;
  }


  public DetailedAthleteDto bikes(List<SummaryGearDto> bikes) {
    
    this.bikes = bikes;
    return this;
  }

  public DetailedAthleteDto addBikesItem(SummaryGearDto bikesItem) {
    if (this.bikes == null) {
      this.bikes = new ArrayList<>();
    }
    this.bikes.add(bikesItem);
    return this;
  }

   /**
   * The athlete&#39;s bikes.
   * @return bikes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's bikes.")
  @JsonProperty(JSON_PROPERTY_BIKES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SummaryGearDto> getBikes() {
    return bikes;
  }


  public void setBikes(List<SummaryGearDto> bikes) {
    this.bikes = bikes;
  }


  public DetailedAthleteDto shoes(List<SummaryGearDto> shoes) {
    
    this.shoes = shoes;
    return this;
  }

  public DetailedAthleteDto addShoesItem(SummaryGearDto shoesItem) {
    if (this.shoes == null) {
      this.shoes = new ArrayList<>();
    }
    this.shoes.add(shoesItem);
    return this;
  }

   /**
   * The athlete&#39;s shoes.
   * @return shoes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The athlete's shoes.")
  @JsonProperty(JSON_PROPERTY_SHOES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SummaryGearDto> getShoes() {
    return shoes;
  }


  public void setShoes(List<SummaryGearDto> shoes) {
    this.shoes = shoes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedAthleteDto detailedAthlete = (DetailedAthleteDto) o;
    return Objects.equals(this.id, detailedAthlete.id) &&
        Objects.equals(this.resourceState, detailedAthlete.resourceState) &&
        Objects.equals(this.firstname, detailedAthlete.firstname) &&
        Objects.equals(this.lastname, detailedAthlete.lastname) &&
        Objects.equals(this.profileMedium, detailedAthlete.profileMedium) &&
        Objects.equals(this.profile, detailedAthlete.profile) &&
        Objects.equals(this.city, detailedAthlete.city) &&
        Objects.equals(this.state, detailedAthlete.state) &&
        Objects.equals(this.country, detailedAthlete.country) &&
        Objects.equals(this.sex, detailedAthlete.sex) &&
        Objects.equals(this.premium, detailedAthlete.premium) &&
        Objects.equals(this.summit, detailedAthlete.summit) &&
        Objects.equals(this.createdAt, detailedAthlete.createdAt) &&
        Objects.equals(this.updatedAt, detailedAthlete.updatedAt) &&
        Objects.equals(this.followerCount, detailedAthlete.followerCount) &&
        Objects.equals(this.friendCount, detailedAthlete.friendCount) &&
        Objects.equals(this.measurementPreference, detailedAthlete.measurementPreference) &&
        Objects.equals(this.ftp, detailedAthlete.ftp) &&
        Objects.equals(this.weight, detailedAthlete.weight) &&
        Objects.equals(this.clubs, detailedAthlete.clubs) &&
        Objects.equals(this.bikes, detailedAthlete.bikes) &&
        Objects.equals(this.shoes, detailedAthlete.shoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, firstname, lastname, profileMedium, profile, city, state, country, sex, premium, summit, createdAt, updatedAt, followerCount, friendCount, measurementPreference, ftp, weight, clubs, bikes, shoes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedAthleteDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    friendCount: ").append(toIndentedString(friendCount)).append("\n");
    sb.append("    measurementPreference: ").append(toIndentedString(measurementPreference)).append("\n");
    sb.append("    ftp: ").append(toIndentedString(ftp)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    clubs: ").append(toIndentedString(clubs)).append("\n");
    sb.append("    bikes: ").append(toIndentedString(bikes)).append("\n");
    sb.append("    shoes: ").append(toIndentedString(shoes)).append("\n");
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

