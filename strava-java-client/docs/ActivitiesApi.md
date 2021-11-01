# ActivitiesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActivity**](ActivitiesApi.md#createActivity) | **POST** /activities | Create an Activity
[**getActivityById**](ActivitiesApi.md#getActivityById) | **GET** /activities/{id} | Get Activity
[**getCommentsByActivityId**](ActivitiesApi.md#getCommentsByActivityId) | **GET** /activities/{id}/comments | List Activity Comments
[**getKudoersByActivityId**](ActivitiesApi.md#getKudoersByActivityId) | **GET** /activities/{id}/kudos | List Activity Kudoers
[**getLapsByActivityId**](ActivitiesApi.md#getLapsByActivityId) | **GET** /activities/{id}/laps | List Activity Laps
[**getLoggedInAthleteActivities**](ActivitiesApi.md#getLoggedInAthleteActivities) | **GET** /athlete/activities | List Athlete Activities
[**getZonesByActivityId**](ActivitiesApi.md#getZonesByActivityId) | **GET** /activities/{id}/zones | Get Activity Zones
[**updateActivityById**](ActivitiesApi.md#updateActivityById) | **PUT** /activities/{id} | Update Activity



## createActivity

> DetailedActivityDto createActivity(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute, hideFromHome)

Create an Activity

Creates a manual activity for an athlete, requires activity:write scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String name = "name_example"; // String | The name of the activity.
        String type = "type_example"; // String | Type of activity. For example - Run, Ride etc.
        OffsetDateTime startDateLocal = new OffsetDateTime(); // OffsetDateTime | ISO 8601 formatted date time.
        Integer elapsedTime = 56; // Integer | In seconds.
        String description = "description_example"; // String | Description of the activity.
        Float distance = 3.4F; // Float | In meters.
        Integer trainer = 56; // Integer | Set to 1 to mark as a trainer activity.
        Integer commute = 56; // Integer | Set to 1 to mark as commute.
        Boolean hideFromHome = false; // Boolean | Set to true to mute activity.
        try {
            DetailedActivityDto result = apiInstance.createActivity(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute, hideFromHome);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#createActivity");
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
 **name** | **String**| The name of the activity. |
 **type** | **String**| Type of activity. For example - Run, Ride etc. |
 **startDateLocal** | **OffsetDateTime**| ISO 8601 formatted date time. |
 **elapsedTime** | **Integer**| In seconds. |
 **description** | **String**| Description of the activity. | [optional]
 **distance** | **Float**| In meters. | [optional]
 **trainer** | **Integer**| Set to 1 to mark as a trainer activity. | [optional]
 **commute** | **Integer**| Set to 1 to mark as commute. | [optional]
 **hideFromHome** | **Boolean**| Set to true to mute activity. | [optional] [default to false]

### Return type

[**DetailedActivityDto**](DetailedActivityDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |


## getActivityById

> DetailedActivityDto getActivityById(id, includeAllEfforts)

Get Activity

Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Boolean includeAllEfforts = true; // Boolean | To include all segments efforts.
        try {
            DetailedActivityDto result = apiInstance.getActivityById(id, includeAllEfforts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getActivityById");
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
 **includeAllEfforts** | **Boolean**| To include all segments efforts. | [optional]

### Return type

[**DetailedActivityDto**](DetailedActivityDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |


## getCommentsByActivityId

> List&lt;CommentDto&gt; getCommentsByActivityId(id, page, perPage)

List Activity Comments

Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<CommentDto> result = apiInstance.getCommentsByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getCommentsByActivityId");
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
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;CommentDto&gt;**](CommentDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Comments. |  -  |
| **0** | Unexpected error. |  -  |


## getKudoersByActivityId

> List&lt;SummaryAthleteDto&gt; getKudoersByActivityId(id, page, perPage)

List Activity Kudoers

Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryAthleteDto> result = apiInstance.getKudoersByActivityId(id, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getKudoersByActivityId");
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
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryAthleteDto&gt;**](SummaryAthleteDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Comments. |  -  |
| **0** | Unexpected error. |  -  |


## getLapsByActivityId

> List&lt;LapDto&gt; getLapsByActivityId(id)

List Activity Laps

Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        try {
            List<LapDto> result = apiInstance.getLapsByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLapsByActivityId");
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

### Return type

[**List&lt;LapDto&gt;**](LapDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity Laps. |  -  |
| **0** | Unexpected error. |  -  |


## getLoggedInAthleteActivities

> List&lt;SummaryActivityDto&gt; getLoggedInAthleteActivities(before, after, page, perPage)

List Athlete Activities

Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Integer before = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place before a certain time.
        Integer after = 56; // Integer | An epoch timestamp to use for filtering activities that have taken place after a certain time.
        Integer page = 56; // Integer | Page number. Defaults to 1.
        Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
        try {
            List<SummaryActivityDto> result = apiInstance.getLoggedInAthleteActivities(before, after, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getLoggedInAthleteActivities");
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
 **before** | **Integer**| An epoch timestamp to use for filtering activities that have taken place before a certain time. | [optional]
 **after** | **Integer**| An epoch timestamp to use for filtering activities that have taken place after a certain time. | [optional]
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryActivityDto&gt;**](SummaryActivityDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The authenticated athlete&#39;s activities |  -  |
| **0** | Unexpected error. |  -  |


## getZonesByActivityId

> List&lt;ActivityZoneDto&gt; getZonesByActivityId(id)

Get Activity Zones

Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        try {
            List<ActivityZoneDto> result = apiInstance.getZonesByActivityId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#getZonesByActivityId");
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

### Return type

[**List&lt;ActivityZoneDto&gt;**](ActivityZoneDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity Zones. |  -  |
| **0** | Unexpected error. |  -  |


## updateActivityById

> DetailedActivityDto updateActivityById(id, body)

Update Activity

Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.ActivitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the activity.
        UpdatableActivityDto body = new UpdatableActivityDto(); // UpdatableActivityDto | 
        try {
            DetailedActivityDto result = apiInstance.updateActivityById(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#updateActivityById");
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
 **body** | [**UpdatableActivityDto**](UpdatableActivityDto.md)|  | [optional]

### Return type

[**DetailedActivityDto**](DetailedActivityDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The activity&#39;s detailed representation. |  -  |
| **0** | Unexpected error. |  -  |

