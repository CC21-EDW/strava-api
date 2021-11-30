

# DetailedActivityAllOfDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the activity |  [optional]
**photos** | [**PhotosSummaryDto**](PhotosSummaryDto.md) |  |  [optional]
**gear** | [**SummaryGearDto**](SummaryGearDto.md) |  |  [optional]
**calories** | **Float** | The number of kilocalories consumed during this activity |  [optional]
**segmentEfforts** | [**List&lt;DetailedSegmentEffortDto&gt;**](DetailedSegmentEffortDto.md) |  |  [optional]
**deviceName** | **String** | The name of the device used to record the activity |  [optional]
**embedToken** | **String** | The token used to embed a Strava activity |  [optional]
**splitsMetric** | [**List&lt;SplitDto&gt;**](SplitDto.md) | The splits of this activity in metric units (for runs) |  [optional]
**splitsStandard** | [**List&lt;SplitDto&gt;**](SplitDto.md) | The splits of this activity in imperial units (for runs) |  [optional]
**laps** | [**List&lt;LapDto&gt;**](LapDto.md) |  |  [optional]
**bestEfforts** | [**List&lt;DetailedSegmentEffortDto&gt;**](DetailedSegmentEffortDto.md) |  |  [optional]



