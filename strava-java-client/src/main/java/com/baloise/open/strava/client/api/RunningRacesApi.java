package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.RunningRaceDto;

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
@Component("com.baloise.open.strava.client.api.RunningRacesApi")
public class RunningRacesApi {
    private ApiClient apiClient;

    public RunningRacesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RunningRacesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Running Race
     * Returns a running race for a given identifier.
     * <p><b>200</b> - Representation of a running race.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the running race. (required)
     * @return RunningRaceDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunningRaceDto getRunningRaceById(Long id) throws RestClientException {
        return getRunningRaceByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Running Race
     * Returns a running race for a given identifier.
     * <p><b>200</b> - Representation of a running race.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the running race. (required)
     * @return ResponseEntity&lt;RunningRaceDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunningRaceDto> getRunningRaceByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRunningRaceById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/running_races/{id}", uriVariables);

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

        ParameterizedTypeReference<RunningRaceDto> returnType = new ParameterizedTypeReference<RunningRaceDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Running Races
     * Returns a list running races based on a set of search criteria.
     * <p><b>200</b> - Representation of a list of running race.
     * <p><b>0</b> - Unexpected error.
     * @param year Filters the list by a given year. (optional)
     * @return List&lt;RunningRaceDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RunningRaceDto> getRunningRaces(Integer year) throws RestClientException {
        return getRunningRacesWithHttpInfo(year).getBody();
    }

    /**
     * List Running Races
     * Returns a list running races based on a set of search criteria.
     * <p><b>200</b> - Representation of a list of running race.
     * <p><b>0</b> - Unexpected error.
     * @param year Filters the list by a given year. (optional)
     * @return ResponseEntity&lt;List&lt;RunningRaceDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RunningRaceDto>> getRunningRacesWithHttpInfo(Integer year) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/running_races", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<RunningRaceDto>> returnType = new ParameterizedTypeReference<List<RunningRaceDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
