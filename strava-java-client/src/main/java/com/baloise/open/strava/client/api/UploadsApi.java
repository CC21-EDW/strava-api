package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.FaultDto;
import java.io.File;
import com.baloise.open.strava.client.model.UploadDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:50:53.245687+01:00[Europe/Zurich]")
@Component("com.baloise.open.strava.client.api.UploadsApi")
public class UploadsApi {
    private ApiClient apiClient;

    public UploadsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Upload Activity
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * <p><b>201</b> - A representation of the created upload.
     * <p><b>0</b> - Unexpected error.
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @return UploadDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadDto createUpload(File file, String name, String description, String trainer, String commute, String dataType, String externalId) throws RestClientException {
        return createUploadWithHttpInfo(file, name, description, trainer, commute, dataType, externalId).getBody();
    }

    /**
     * Upload Activity
     * Uploads a new data file to create an activity from. Requires activity:write scope.
     * <p><b>201</b> - A representation of the created upload.
     * <p><b>0</b> - Unexpected error.
     * @param file The uploaded file. (optional)
     * @param name The desired name of the resulting activity. (optional)
     * @param description The desired description of the resulting activity. (optional)
     * @param trainer Whether the resulting activity should be marked as having been performed on a trainer. (optional)
     * @param commute Whether the resulting activity should be tagged as a commute. (optional)
     * @param dataType The format of the uploaded file. (optional)
     * @param externalId The desired external identifier of the resulting activity. (optional)
     * @return ResponseEntity&lt;UploadDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadDto> createUploadWithHttpInfo(File file, String name, String description, String trainer, String commute, String dataType, String externalId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/uploads", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (trainer != null)
            formParams.add("trainer", trainer);
        if (commute != null)
            formParams.add("commute", commute);
        if (dataType != null)
            formParams.add("data_type", dataType);
        if (externalId != null)
            formParams.add("external_id", externalId);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<UploadDto> returnType = new ParameterizedTypeReference<UploadDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Upload
     * Returns an upload for a given identifier. Requires activity:write scope.
     * <p><b>200</b> - Representation of the upload.
     * <p><b>0</b> - Unexpected error.
     * @param uploadId The identifier of the upload. (required)
     * @return UploadDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadDto getUploadById(Long uploadId) throws RestClientException {
        return getUploadByIdWithHttpInfo(uploadId).getBody();
    }

    /**
     * Get Upload
     * Returns an upload for a given identifier. Requires activity:write scope.
     * <p><b>200</b> - Representation of the upload.
     * <p><b>0</b> - Unexpected error.
     * @param uploadId The identifier of the upload. (required)
     * @return ResponseEntity&lt;UploadDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadDto> getUploadByIdWithHttpInfo(Long uploadId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling getUploadById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("uploadId", uploadId);
        String path = apiClient.expandPath("/uploads/{uploadId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<UploadDto> returnType = new ParameterizedTypeReference<UploadDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
