

# ActivityZoneDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**score** | **Integer** |  |  [optional]
**distributionBuckets** | [**List&lt;TimedZoneRangeDto&gt;**](TimedZoneRangeDto.md) | Stores the exclusive ranges representing zones and the time spent in each. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**sensorBased** | **Boolean** |  |  [optional]
**points** | **Integer** |  |  [optional]
**customZones** | **Boolean** |  |  [optional]
**max** | **Integer** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
HEARTRATE | &quot;heartrate&quot;
POWER | &quot;power&quot;



