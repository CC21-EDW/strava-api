# AthletesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoggedInAthlete**](AthletesApi.md#getLoggedInAthlete) | **GET** /athlete | Get Authenticated Athlete
[**getLoggedInAthleteZones**](AthletesApi.md#getLoggedInAthleteZones) | **GET** /athlete/zones | Get Zones
[**getStats**](AthletesApi.md#getStats) | **GET** /athletes/{id}/stats | Get Athlete Stats
[**updateLoggedInAthlete**](AthletesApi.md#updateLoggedInAthlete) | **PUT** /athlete | Update Athlete



## getLoggedInAthlete

> DetailedAthleteDto getLoggedInAthlete()

Get Authenticated Athlete

Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.AthletesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        AthletesApi apiInstance = new AthletesApi(defaultClient);
        try {
            DetailedAthleteDto result = apiInstance.getLoggedInAthlete();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AthletesApi#getLoggedInAthlete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**DetailedAthleteDto**](DetailedAthleteDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile information for the authenticated athlete. |  -  |
| **0** | Unexpected error. |  -  |


## getLoggedInAthleteZones

> ZonesDto getLoggedInAthleteZones()

Get Zones

Returns the the authenticated athlete&#39;s heart rate and power zones. Requires profile:read_all.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.AthletesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        AthletesApi apiInstance = new AthletesApi(defaultClient);
        try {
            ZonesDto result = apiInstance.getLoggedInAthleteZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AthletesApi#getLoggedInAthleteZones");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ZonesDto**](ZonesDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Heart rate and power zones. |  -  |
| **0** | Unexpected error. |  -  |


## getStats

> ActivityStatsDto getStats(id)

Get Athlete Stats

Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.AthletesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        AthletesApi apiInstance = new AthletesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the athlete. Must match the authenticated athlete.
        try {
            ActivityStatsDto result = apiInstance.getStats(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AthletesApi#getStats");
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
 **id** | **Long**| The identifier of the athlete. Must match the authenticated athlete. |

### Return type

[**ActivityStatsDto**](ActivityStatsDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity stats of the athlete. |  -  |
| **0** | Unexpected error. |  -  |


## updateLoggedInAthlete

> DetailedAthleteDto updateLoggedInAthlete(weight)

Update Athlete

Update the currently authenticated athlete. Requires profile:write scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.AthletesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        AthletesApi apiInstance = new AthletesApi(defaultClient);
        Float weight = 3.4F; // Float | The weight of the athlete in kilograms.
        try {
            DetailedAthleteDto result = apiInstance.updateLoggedInAthlete(weight);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AthletesApi#updateLoggedInAthlete");
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
 **weight** | **Float**| The weight of the athlete in kilograms. |

### Return type

[**DetailedAthleteDto**](DetailedAthleteDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile information for the authenticated athlete. |  -  |
| **0** | Unexpected error. |  -  |

