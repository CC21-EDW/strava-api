package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.StreamSetDto;

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
@Component("com.baloise.open.strava.client.api.StreamsApi")
public class StreamsApi {
    private ApiClient apiClient;

    public StreamsApi() {
        this(new ApiClient());
    }

    @Autowired
    public StreamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Activity Streams
     * Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param keys Desired stream types. (required)
     * @param keyByType Must be true. (required)
     * @return StreamSetDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StreamSetDto getActivityStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        return getActivityStreamsWithHttpInfo(id, keys, keyByType).getBody();
    }

    /**
     * Get Activity Streams
     * Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param keys Desired stream types. (required)
     * @param keyByType Must be true. (required)
     * @return ResponseEntity&lt;StreamSetDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StreamSetDto> getActivityStreamsWithHttpInfo(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getActivityStreams");
        }
        
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getActivityStreams");
        }
        
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getActivityStreams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}/streams", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDto> returnType = new ParameterizedTypeReference<StreamSetDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Route Streams
     * Returns the given route&#39;s streams. Requires read_all scope for private routes.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return StreamSetDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StreamSetDto getRouteStreams(Long id) throws RestClientException {
        return getRouteStreamsWithHttpInfo(id).getBody();
    }

    /**
     * Get Route Streams
     * Returns the given route&#39;s streams. Requires read_all scope for private routes.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;StreamSetDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StreamSetDto> getRouteStreamsWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteStreams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/routes/{id}/streams", uriVariables);

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

        ParameterizedTypeReference<StreamSetDto> returnType = new ParameterizedTypeReference<StreamSetDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Segment Effort Streams
     * Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @param keys The types of streams to return. (required)
     * @param keyByType Must be true. (required)
     * @return StreamSetDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StreamSetDto getSegmentEffortStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        return getSegmentEffortStreamsWithHttpInfo(id, keys, keyByType).getBody();
    }

    /**
     * Get Segment Effort Streams
     * Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @param keys The types of streams to return. (required)
     * @param keyByType Must be true. (required)
     * @return ResponseEntity&lt;StreamSetDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StreamSetDto> getSegmentEffortStreamsWithHttpInfo(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentEffortStreams");
        }
        
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getSegmentEffortStreams");
        }
        
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getSegmentEffortStreams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/segment_efforts/{id}/streams", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDto> returnType = new ParameterizedTypeReference<StreamSetDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Segment Streams
     * Returns the given segment&#39;s streams. Requires read_all scope for private segments.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @param keys The types of streams to return. (required)
     * @param keyByType Must be true. (required)
     * @return StreamSetDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StreamSetDto getSegmentStreams(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        return getSegmentStreamsWithHttpInfo(id, keys, keyByType).getBody();
    }

    /**
     * Get Segment Streams
     * Returns the given segment&#39;s streams. Requires read_all scope for private segments.
     * <p><b>200</b> - The set of requested streams.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @param keys The types of streams to return. (required)
     * @param keyByType Must be true. (required)
     * @return ResponseEntity&lt;StreamSetDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StreamSetDto> getSegmentStreamsWithHttpInfo(Long id, List<String> keys, Boolean keyByType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentStreams");
        }
        
        // verify the required parameter 'keys' is set
        if (keys == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keys' when calling getSegmentStreams");
        }
        
        // verify the required parameter 'keyByType' is set
        if (keyByType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyByType' when calling getSegmentStreams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/segments/{id}/streams", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key_by_type", keyByType));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<StreamSetDto> returnType = new ParameterizedTypeReference<StreamSetDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
