package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.ActivityStatsDto;
import com.baloise.open.strava.client.model.DetailedAthleteDto;
import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.ZonesDto;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T10:08:10.913426500+01:00[Europe/Zurich]")
@Component("com.baloise.open.strava.client.api.AthletesApi")
public class AthletesApi {
    private ApiClient apiClient;

    public AthletesApi() {
        this(new ApiClient());
    }

    @Autowired
    public AthletesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Authenticated Athlete
     * Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @return DetailedAthleteDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedAthleteDto getLoggedInAthlete() throws RestClientException {
        return getLoggedInAthleteWithHttpInfo().getBody();
    }

    /**
     * Get Authenticated Athlete
     * Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @return ResponseEntity&lt;DetailedAthleteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedAthleteDto> getLoggedInAthleteWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/athlete", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DetailedAthleteDto> returnType = new ParameterizedTypeReference<DetailedAthleteDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Zones
     * Returns the the authenticated athlete&#39;s heart rate and power zones. Requires profile:read_all.
     * <p><b>200</b> - Heart rate and power zones.
     * <p><b>0</b> - Unexpected error.
     * @return ZonesDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ZonesDto getLoggedInAthleteZones() throws RestClientException {
        return getLoggedInAthleteZonesWithHttpInfo().getBody();
    }

    /**
     * Get Zones
     * Returns the the authenticated athlete&#39;s heart rate and power zones. Requires profile:read_all.
     * <p><b>200</b> - Heart rate and power zones.
     * <p><b>0</b> - Unexpected error.
     * @return ResponseEntity&lt;ZonesDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ZonesDto> getLoggedInAthleteZonesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/athlete/zones", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ZonesDto> returnType = new ParameterizedTypeReference<ZonesDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Athlete Stats
     * Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.
     * <p><b>200</b> - Activity stats of the athlete.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the athlete. Must match the authenticated athlete. (required)
     * @return ActivityStatsDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ActivityStatsDto getStats(Long id) throws RestClientException {
        return getStatsWithHttpInfo(id).getBody();
    }

    /**
     * Get Athlete Stats
     * Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.
     * <p><b>200</b> - Activity stats of the athlete.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the athlete. Must match the authenticated athlete. (required)
     * @return ResponseEntity&lt;ActivityStatsDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActivityStatsDto> getStatsWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStats");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/athletes/{id}/stats", uriVariables);

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

        ParameterizedTypeReference<ActivityStatsDto> returnType = new ParameterizedTypeReference<ActivityStatsDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Athlete
     * Update the currently authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @param weight The weight of the athlete in kilograms. (required)
     * @return DetailedAthleteDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedAthleteDto updateLoggedInAthlete(Float weight) throws RestClientException {
        return updateLoggedInAthleteWithHttpInfo(weight).getBody();
    }

    /**
     * Update Athlete
     * Update the currently authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Profile information for the authenticated athlete.
     * <p><b>0</b> - Unexpected error.
     * @param weight The weight of the athlete in kilograms. (required)
     * @return ResponseEntity&lt;DetailedAthleteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedAthleteDto> updateLoggedInAthleteWithHttpInfo(Float weight) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'weight' is set
        if (weight == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'weight' when calling updateLoggedInAthlete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("weight", weight);
        String path = apiClient.expandPath("/athlete", uriVariables);

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

        ParameterizedTypeReference<DetailedAthleteDto> returnType = new ParameterizedTypeReference<DetailedAthleteDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
