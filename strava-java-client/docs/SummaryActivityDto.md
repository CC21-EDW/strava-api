

# SummaryActivityDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique identifier of the activity |  [optional]
**externalId** | **String** | The identifier provided at upload time |  [optional]
**uploadId** | **Long** | The identifier of the upload that resulted in this activity |  [optional]
**athlete** | [**MetaAthleteDto**](MetaAthleteDto.md) |  |  [optional]
**name** | **String** | The name of the activity |  [optional]
**distance** | **Float** | The activity&#39;s distance, in meters |  [optional]
**movingTime** | **Integer** | The activity&#39;s moving time, in seconds |  [optional]
**elapsedTime** | **Integer** | The activity&#39;s elapsed time, in seconds |  [optional]
**totalElevationGain** | **Float** | The activity&#39;s total elevation gain. |  [optional]
**elevHigh** | **Float** | The activity&#39;s highest elevation, in meters |  [optional]
**elevLow** | **Float** | The activity&#39;s lowest elevation, in meters |  [optional]
**type** | [**ActivityTypeDto**](ActivityTypeDto.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the activity was started. |  [optional]
**startDateLocal** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the activity was started in the local timezone. |  [optional]
**timezone** | **String** | The timezone of the activity |  [optional]
**startLatlng** | **List&lt;Float&gt;** | A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers. |  [optional]
**endLatlng** | **List&lt;Float&gt;** | A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers. |  [optional]
**achievementCount** | **Integer** | The number of achievements gained during this activity |  [optional]
**kudosCount** | **Integer** | The number of kudos given for this activity |  [optional]
**commentCount** | **Integer** | The number of comments for this activity |  [optional]
**athleteCount** | **Integer** | The number of athletes for taking part in a group activity |  [optional]
**photoCount** | **Integer** | The number of Instagram photos for this activity |  [optional]
**totalPhotoCount** | **Integer** | The number of Instagram and Strava photos for this activity |  [optional]
**map** | [**PolylineMapDto**](PolylineMapDto.md) |  |  [optional]
**trainer** | **Boolean** | Whether this activity was recorded on a training machine |  [optional]
**commute** | **Boolean** | Whether this activity is a commute |  [optional]
**manual** | **Boolean** | Whether this activity was created manually |  [optional]
**_private** | **Boolean** | Whether this activity is private |  [optional]
**flagged** | **Boolean** | Whether this activity is flagged |  [optional]
**workoutType** | **Integer** | The activity&#39;s workout type |  [optional]
**uploadIdStr** | **String** | The unique identifier of the upload in string format |  [optional]
**averageSpeed** | **Float** | The activity&#39;s average speed, in meters per second |  [optional]
**maxSpeed** | **Float** | The activity&#39;s max speed, in meters per second |  [optional]
**hasKudoed** | **Boolean** | Whether the logged-in athlete has kudoed this activity |  [optional]
**hideFromHome** | **Boolean** | Whether the activity is muted |  [optional]
**gearId** | **String** | The id of the gear for the activity |  [optional]
**kilojoules** | **Float** | The total work done in kilojoules during this activity. Rides only |  [optional]
**averageWatts** | **Float** | Average power output in watts during this activity. Rides only |  [optional]
**deviceWatts** | **Boolean** | Whether the watts are from a power meter, false if estimated |  [optional]
**maxWatts** | **Integer** | Rides with power meter data only |  [optional]
**weightedAverageWatts** | **Integer** | Similar to Normalized Power. Rides with power meter data only |  [optional]


