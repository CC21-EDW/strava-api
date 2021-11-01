# RunningRacesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRunningRaceById**](RunningRacesApi.md#getRunningRaceById) | **GET** /running_races/{id} | Get Running Race
[**getRunningRaces**](RunningRacesApi.md#getRunningRaces) | **GET** /running_races | List Running Races



## getRunningRaceById

> RunningRaceDto getRunningRaceById(id)

Get Running Race

Returns a running race for a given identifier.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.RunningRacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RunningRacesApi apiInstance = new RunningRacesApi(defaultClient);
        Long id = 56L; // Long | The identifier of the running race.
        try {
            RunningRaceDto result = apiInstance.getRunningRaceById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunningRacesApi#getRunningRaceById");
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
 **id** | **Long**| The identifier of the running race. |

### Return type

[**RunningRaceDto**](RunningRaceDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of a running race. |  -  |
| **0** | Unexpected error. |  -  |


## getRunningRaces

> List&lt;RunningRaceDto&gt; getRunningRaces(year)

List Running Races

Returns a list running races based on a set of search criteria.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.RunningRacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        RunningRacesApi apiInstance = new RunningRacesApi(defaultClient);
        Integer year = 56; // Integer | Filters the list by a given year.
        try {
            List<RunningRaceDto> result = apiInstance.getRunningRaces(year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunningRacesApi#getRunningRaces");
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
 **year** | **Integer**| Filters the list by a given year. | [optional]

### Return type

[**List&lt;RunningRaceDto&gt;**](RunningRaceDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of a list of running race. |  -  |
| **0** | Unexpected error. |  -  |

