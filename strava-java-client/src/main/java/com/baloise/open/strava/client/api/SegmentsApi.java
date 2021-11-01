package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.DetailedSegmentDto;
import com.baloise.open.strava.client.model.ExplorerResponseDto;
import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.SummarySegmentDto;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:37:53.710209+01:00[Europe/Zurich]")
@Component("com.baloise.open.strava.client.api.SegmentsApi")
public class SegmentsApi {
    private ApiClient apiClient;

    public SegmentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Explore segments
     * Returns the top 10 segments matching a specified query.
     * <p><b>200</b> - List of matching segments.
     * <p><b>0</b> - Unexpected error.
     * @param bounds The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] (required)
     * @param activityType Desired activity type. (optional)
     * @param minCat The minimum climbing category. (optional)
     * @param maxCat The maximum climbing category. (optional)
     * @return ExplorerResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExplorerResponseDto exploreSegments(List<Float> bounds, String activityType, Integer minCat, Integer maxCat) throws RestClientException {
        return exploreSegmentsWithHttpInfo(bounds, activityType, minCat, maxCat).getBody();
    }

    /**
     * Explore segments
     * Returns the top 10 segments matching a specified query.
     * <p><b>200</b> - List of matching segments.
     * <p><b>0</b> - Unexpected error.
     * @param bounds The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] (required)
     * @param activityType Desired activity type. (optional)
     * @param minCat The minimum climbing category. (optional)
     * @param maxCat The maximum climbing category. (optional)
     * @return ResponseEntity&lt;ExplorerResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExplorerResponseDto> exploreSegmentsWithHttpInfo(List<Float> bounds, String activityType, Integer minCat, Integer maxCat) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bounds' is set
        if (bounds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bounds' when calling exploreSegments");
        }
        
        String path = apiClient.expandPath("/segments/explore", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "bounds", bounds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activity_type", activityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "min_cat", minCat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max_cat", maxCat));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<ExplorerResponseDto> returnType = new ParameterizedTypeReference<ExplorerResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Starred Segments
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - List of the authenticated athlete&#39;s starred segments.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummarySegmentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummarySegmentDto> getLoggedInAthleteStarredSegments(Integer page, Integer perPage) throws RestClientException {
        return getLoggedInAthleteStarredSegmentsWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Starred Segments
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - List of the authenticated athlete&#39;s starred segments.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummarySegmentDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummarySegmentDto>> getLoggedInAthleteStarredSegmentsWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/segments/starred", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummarySegmentDto>> returnType = new ParameterizedTypeReference<List<SummarySegmentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Segment
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @return DetailedSegmentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegmentDto getSegmentById(Long id) throws RestClientException {
        return getSegmentByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Segment
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @return ResponseEntity&lt;DetailedSegmentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegmentDto> getSegmentByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/segments/{id}", uriVariables);

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

        ParameterizedTypeReference<DetailedSegmentDto> returnType = new ParameterizedTypeReference<DetailedSegmentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Star Segment
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment to star. (required)
     * @param starred If true, star the segment; if false, unstar the segment. (required)
     * @return DetailedSegmentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegmentDto starSegment(Long id, Boolean starred) throws RestClientException {
        return starSegmentWithHttpInfo(id, starred).getBody();
    }

    /**
     * Star Segment
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment to star. (required)
     * @param starred If true, star the segment; if false, unstar the segment. (required)
     * @return ResponseEntity&lt;DetailedSegmentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegmentDto> starSegmentWithHttpInfo(Long id, Boolean starred) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling starSegment");
        }
        
        // verify the required parameter 'starred' is set
        if (starred == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'starred' when calling starSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/segments/{id}/starred", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        if (starred != null)
            formParams.add("starred", starred);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegmentDto> returnType = new ParameterizedTypeReference<DetailedSegmentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
