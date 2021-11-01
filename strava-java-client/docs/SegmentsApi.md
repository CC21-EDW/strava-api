# SegmentsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exploreSegments**](SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
[**getLoggedInAthleteStarredSegments**](SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
[**getSegmentById**](SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
[**starSegment**](SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment



## exploreSegments

> ExplorerResponseDto exploreSegments(bounds, activityType, minCat, maxCat)

Explore segments

Returns the top 10 segments matching a specified query.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.SegmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentsApi apiInstance = new SegmentsApi(defaultClient);
        List<Float> bounds = Arrays.asList(); // List<Float> | The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude]
        String activityType = "activityType_example"; // String | Desired activity type.
        Integer minCat = 56; // Integer | The minimum climbing category.
        Integer maxCat = 56; // Integer | The maximum climbing category.
        try {
            ExplorerResponseDto result = apiInstance.exploreSegments(bounds, activityType, minCat, maxCat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentsApi#exploreSegments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bounds** | [**List&lt;Float&gt;**](Float.md)| The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] |
 **activityType** | **String**| Desired activity type. | [optional] [enum: running, riding]
 **minCat** | **Integer**| The minimum climbing category. | [optional]
 **maxCat** | **Integer**| The maximum climbing category. | [optional]

### Return type

[**ExplorerResponseDto**](ExplorerResponseDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of matching segments. |  -  |
| **0** | Unexpected error. |  -  |


## getLoggedInAthleteStarredSegments

> List&lt;SummarySegmentDto&gt; getLoggedInAthleteStarredSegments(page, perPage)

List Starred Segments

List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.SegmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentsApi apiInstance = new SegmentsApi(defaultClient);
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummarySegmentDto> result = apiInstance.getLoggedInAthleteStarredSegments(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentsApi#getLoggedInAthleteStarredSegments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummarySegmentDto&gt;**](SummarySegmentDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of the authenticated athlete&#39;s starred segments. |  -  |
| **0** | Unexpected error. |  -  |


## getSegmentById

> DetailedSegmentDto getSegmentById(id)

Get Segment

Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.SegmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentsApi apiInstance = new SegmentsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the segment.
        try {
            DetailedSegmentDto result = apiInstance.getSegmentById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentsApi#getSegmentById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment. |

### Return type

[**DetailedSegmentDto**](DetailedSegmentDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of a segment. |  -  |
| **0** | Unexpected error. |  -  |


## starSegment

> DetailedSegmentDto starSegment(id, starred)

Star Segment

Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.SegmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        SegmentsApi apiInstance = new SegmentsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the segment to star.
        Boolean starred = false; // Boolean | If true, star the segment; if false, unstar the segment.
        try {
            DetailedSegmentDto result = apiInstance.starSegment(id, starred);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentsApi#starSegment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment to star. |
 **starred** | **Boolean**| If true, star the segment; if false, unstar the segment. | [default to false]

### Return type

[**DetailedSegmentDto**](DetailedSegmentDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of a segment. |  -  |
| **0** | Unexpected error. |  -  |

