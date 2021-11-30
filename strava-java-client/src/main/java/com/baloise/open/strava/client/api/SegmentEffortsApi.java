package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.DetailedSegmentEffortDto;
import com.baloise.open.strava.client.model.FaultDto;
import java.time.OffsetDateTime;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T09:50:39.653673500+01:00[Europe/Zurich]")
@Component("com.baloise.open.strava.client.api.SegmentEffortsApi")
public class SegmentEffortsApi {
    private ApiClient apiClient;

    public SegmentEffortsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentEffortsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.
     * <p><b>200</b> - List of segment efforts.
     * <p><b>0</b> - Unexpected error.
     * @param segmentId The identifier of the segment. (required)
     * @param startDateLocal ISO 8601 formatted date time. (optional)
     * @param endDateLocal ISO 8601 formatted date time. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;DetailedSegmentEffortDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DetailedSegmentEffortDto> getEffortsBySegmentId(Integer segmentId, OffsetDateTime startDateLocal, OffsetDateTime endDateLocal, Integer perPage) throws RestClientException {
        return getEffortsBySegmentIdWithHttpInfo(segmentId, startDateLocal, endDateLocal, perPage).getBody();
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.
     * <p><b>200</b> - List of segment efforts.
     * <p><b>0</b> - Unexpected error.
     * @param segmentId The identifier of the segment. (required)
     * @param startDateLocal ISO 8601 formatted date time. (optional)
     * @param endDateLocal ISO 8601 formatted date time. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;DetailedSegmentEffortDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DetailedSegmentEffortDto>> getEffortsBySegmentIdWithHttpInfo(Integer segmentId, OffsetDateTime startDateLocal, OffsetDateTime endDateLocal, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling getEffortsBySegmentId");
        }
        
        String path = apiClient.expandPath("/segment_efforts", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "segment_id", segmentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_local", startDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_local", endDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<DetailedSegmentEffortDto>> returnType = new ParameterizedTypeReference<List<DetailedSegmentEffortDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.
     * <p><b>200</b> - Representation of a segment effort.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @return DetailedSegmentEffortDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegmentEffortDto getSegmentEffortById(Long id) throws RestClientException {
        return getSegmentEffortByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.
     * <p><b>200</b> - Representation of a segment effort.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @return ResponseEntity&lt;DetailedSegmentEffortDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegmentEffortDto> getSegmentEffortByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentEffortById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/segment_efforts/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegmentEffortDto> returnType = new ParameterizedTypeReference<DetailedSegmentEffortDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
