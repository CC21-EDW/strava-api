# StreamsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivityStreams**](StreamsApi.md#getActivityStreams) | **GET** /activities/{id}/streams | Get Activity Streams
[**getRouteStreams**](StreamsApi.md#getRouteStreams) | **GET** /routes/{id}/streams | Get Route Streams
[**getSegmentEffortStreams**](StreamsApi.md#getSegmentEffortStreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
[**getSegmentStreams**](StreamsApi.md#getSegmentStreams) | **GET** /segments/{id}/streams | Get Segment Streams



## getActivityStreams

> StreamSetDto getActivityStreams(id, keys, keyByType)

Get Activity Streams

Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        List<String> keys = Arrays.asList(); // List<String> | Desired stream types.
        Boolean keyByType = true; // Boolean | Must be true.
        try {
            StreamSetDto result = apiInstance.getActivityStreams(id, keys, keyByType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#getActivityStreams");
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
 **id** | **Long**| The identifier of the activity. |
 **keys** | [**List&lt;String&gt;**](String.md)| Desired stream types. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSetDto**](StreamSetDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of requested streams. |  -  |
| **0** | Unexpected error. |  -  |


## getRouteStreams

> StreamSetDto getRouteStreams(id)

Get Route Streams

Returns the given route&#39;s streams. Requires read_all scope for private routes.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the route.
        try {
            StreamSetDto result = apiInstance.getRouteStreams(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#getRouteStreams");
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
 **id** | **Long**| The identifier of the route. |

### Return type

[**StreamSetDto**](StreamSetDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of requested streams. |  -  |
| **0** | Unexpected error. |  -  |


## getSegmentEffortStreams

> StreamSetDto getSegmentEffortStreams(id, keys, keyByType)

Get Segment Effort Streams

Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the segment effort.
        List<String> keys = Arrays.asList(); // List<String> | The types of streams to return.
        Boolean keyByType = true; // Boolean | Must be true.
        try {
            StreamSetDto result = apiInstance.getSegmentEffortStreams(id, keys, keyByType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#getSegmentEffortStreams");
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
 **id** | **Long**| The identifier of the segment effort. |
 **keys** | [**List&lt;String&gt;**](String.md)| The types of streams to return. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSetDto**](StreamSetDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of requested streams. |  -  |
| **0** | Unexpected error. |  -  |


## getSegmentStreams

> StreamSetDto getSegmentStreams(id, keys, keyByType)

Get Segment Streams

Returns the given segment&#39;s streams. Requires read_all scope for private segments.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Long id = 56L; // Long | The identifier of the segment.
        List<String> keys = Arrays.asList(); // List<String> | The types of streams to return.
        Boolean keyByType = true; // Boolean | Must be true.
        try {
            StreamSetDto result = apiInstance.getSegmentStreams(id, keys, keyByType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#getSegmentStreams");
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
 **keys** | [**List&lt;String&gt;**](String.md)| The types of streams to return. | [enum: distance, latlng, altitude]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSetDto**](StreamSetDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of requested streams. |  -  |
| **0** | Unexpected error. |  -  |

