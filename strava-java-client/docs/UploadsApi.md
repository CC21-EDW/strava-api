# UploadsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUpload**](UploadsApi.md#createUpload) | **POST** /uploads | Upload Activity
[**getUploadById**](UploadsApi.md#getUploadById) | **GET** /uploads/{uploadId} | Get Upload



## createUpload

> UploadDto createUpload(file, name, description, trainer, commute, dataType, externalId)

Upload Activity

Uploads a new data file to create an activity from. Requires activity:write scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.UploadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        UploadsApi apiInstance = new UploadsApi(defaultClient);
        File file = new File("/path/to/file"); // File | The uploaded file.
        String name = "name_example"; // String | The desired name of the resulting activity.
        String description = "description_example"; // String | The desired description of the resulting activity.
        String trainer = "trainer_example"; // String | Whether the resulting activity should be marked as having been performed on a trainer.
        String commute = "commute_example"; // String | Whether the resulting activity should be tagged as a commute.
        String dataType = "dataType_example"; // String | The format of the uploaded file.
        String externalId = "externalId_example"; // String | The desired external identifier of the resulting activity.
        try {
            UploadDto result = apiInstance.createUpload(file, name, description, trainer, commute, dataType, externalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadsApi#createUpload");
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
 **file** | **File**| The uploaded file. | [optional]
 **name** | **String**| The desired name of the resulting activity. | [optional]
 **description** | **String**| The desired description of the resulting activity. | [optional]
 **trainer** | **String**| Whether the resulting activity should be marked as having been performed on a trainer. | [optional]
 **commute** | **String**| Whether the resulting activity should be tagged as a commute. | [optional]
 **dataType** | **String**| The format of the uploaded file. | [optional] [enum: fit, fit.gz, tcx, tcx.gz, gpx, gpx.gz]
 **externalId** | **String**| The desired external identifier of the resulting activity. | [optional]

### Return type

[**UploadDto**](UploadDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A representation of the created upload. |  -  |
| **0** | Unexpected error. |  -  |


## getUploadById

> UploadDto getUploadById(uploadId)

Get Upload

Returns an upload for a given identifier. Requires activity:write scope.

### Example

```java
// Import classes:
import com.baloise.open.strava.client.ApiClient;
import com.baloise.open.strava.client.ApiException;
import com.baloise.open.strava.client.Configuration;
import com.baloise.open.strava.client.auth.*;
import com.baloise.open.strava.client.models.*;
import com.baloise.open.strava.client.api.UploadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://www.strava.com/api/v3");
        
        // Configure OAuth2 access token for authorization: strava_oauth
        OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

        UploadsApi apiInstance = new UploadsApi(defaultClient);
        Long uploadId = 56L; // Long | The identifier of the upload.
        try {
            UploadDto result = apiInstance.getUploadById(uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadsApi#getUploadById");
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
 **uploadId** | **Long**| The identifier of the upload. |

### Return type

[**UploadDto**](UploadDto.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Representation of the upload. |  -  |
| **0** | Unexpected error. |  -  |

