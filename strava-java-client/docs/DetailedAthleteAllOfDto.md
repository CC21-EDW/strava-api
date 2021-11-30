

# DetailedAthleteAllOfDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**followerCount** | **Integer** | The athlete&#39;s follower count. |  [optional]
**friendCount** | **Integer** | The athlete&#39;s friend count. |  [optional]
**measurementPreference** | [**MeasurementPreferenceEnum**](#MeasurementPreferenceEnum) | The athlete&#39;s preferred unit system. |  [optional]
**ftp** | **Integer** | The athlete&#39;s FTP (Functional Threshold Power). |  [optional]
**weight** | **Float** | The athlete&#39;s weight. |  [optional]
**clubs** | [**List&lt;SummaryClubDto&gt;**](SummaryClubDto.md) | The athlete&#39;s clubs. |  [optional]
**bikes** | [**List&lt;SummaryGearDto&gt;**](SummaryGearDto.md) | The athlete&#39;s bikes. |  [optional]
**shoes** | [**List&lt;SummaryGearDto&gt;**](SummaryGearDto.md) | The athlete&#39;s shoes. |  [optional]



## Enum: MeasurementPreferenceEnum

Name | Value
---- | -----
FEET | &quot;feet&quot;
METERS | &quot;meters&quot;



