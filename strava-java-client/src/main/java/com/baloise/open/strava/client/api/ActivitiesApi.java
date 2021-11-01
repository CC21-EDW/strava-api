package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.ActivityZoneDto;
import com.baloise.open.strava.client.model.CommentDto;
import com.baloise.open.strava.client.model.DetailedActivityDto;
import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.LapDto;
import java.time.OffsetDateTime;
import com.baloise.open.strava.client.model.SummaryActivityDto;
import com.baloise.open.strava.client.model.SummaryAthleteDto;
import com.baloise.open.strava.client.model.UpdatableActivityDto;

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
@Component("com.baloise.open.strava.client.api.ActivitiesApi")
public class ActivitiesApi {
    private ApiClient apiClient;

    public ActivitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ActivitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Activity
     * Creates a manual activity for an athlete, requires activity:write scope.
     * <p><b>201</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param name The name of the activity. (required)
     * @param type Type of activity. For example - Run, Ride etc. (required)
     * @param startDateLocal ISO 8601 formatted date time. (required)
     * @param elapsedTime In seconds. (required)
     * @param description Description of the activity. (optional)
     * @param distance In meters. (optional)
     * @param trainer Set to 1 to mark as a trainer activity. (optional)
     * @param commute Set to 1 to mark as commute. (optional)
     * @param hideFromHome Set to true to mute activity. (optional, default to false)
     * @return DetailedActivityDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivityDto createActivity(String name, String type, OffsetDateTime startDateLocal, Integer elapsedTime, String description, Float distance, Integer trainer, Integer commute, Boolean hideFromHome) throws RestClientException {
        return createActivityWithHttpInfo(name, type, startDateLocal, elapsedTime, description, distance, trainer, commute, hideFromHome).getBody();
    }

    /**
     * Create an Activity
     * Creates a manual activity for an athlete, requires activity:write scope.
     * <p><b>201</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param name The name of the activity. (required)
     * @param type Type of activity. For example - Run, Ride etc. (required)
     * @param startDateLocal ISO 8601 formatted date time. (required)
     * @param elapsedTime In seconds. (required)
     * @param description Description of the activity. (optional)
     * @param distance In meters. (optional)
     * @param trainer Set to 1 to mark as a trainer activity. (optional)
     * @param commute Set to 1 to mark as commute. (optional)
     * @param hideFromHome Set to true to mute activity. (optional, default to false)
     * @return ResponseEntity&lt;DetailedActivityDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedActivityDto> createActivityWithHttpInfo(String name, String type, OffsetDateTime startDateLocal, Integer elapsedTime, String description, Float distance, Integer trainer, Integer commute, Boolean hideFromHome) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createActivity");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling createActivity");
        }
        
        // verify the required parameter 'startDateLocal' is set
        if (startDateLocal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDateLocal' when calling createActivity");
        }
        
        // verify the required parameter 'elapsedTime' is set
        if (elapsedTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'elapsedTime' when calling createActivity");
        }
        
        String path = apiClient.expandPath("/activities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        if (name != null)
            formParams.add("name", name);
        if (type != null)
            formParams.add("type", type);
        if (startDateLocal != null)
            formParams.add("start_date_local", startDateLocal);
        if (elapsedTime != null)
            formParams.add("elapsed_time", elapsedTime);
        if (description != null)
            formParams.add("description", description);
        if (distance != null)
            formParams.add("distance", distance);
        if (trainer != null)
            formParams.add("trainer", trainer);
        if (commute != null)
            formParams.add("commute", commute);
        if (hideFromHome != null)
            formParams.add("hide_from_home", hideFromHome);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivityDto> returnType = new ParameterizedTypeReference<DetailedActivityDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Activity
     * Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param includeAllEfforts To include all segments efforts. (optional)
     * @return DetailedActivityDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivityDto getActivityById(Long id, Boolean includeAllEfforts) throws RestClientException {
        return getActivityByIdWithHttpInfo(id, includeAllEfforts).getBody();
    }

    /**
     * Get Activity
     * Returns the given activity that is owned by the authenticated athlete. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param includeAllEfforts To include all segments efforts. (optional)
     * @return ResponseEntity&lt;DetailedActivityDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedActivityDto> getActivityByIdWithHttpInfo(Long id, Boolean includeAllEfforts) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getActivityById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_all_efforts", includeAllEfforts));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedActivityDto> returnType = new ParameterizedTypeReference<DetailedActivityDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Comments
     * Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;CommentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CommentDto> getCommentsByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        return getCommentsByActivityIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Activity Comments
     * Returns the comments on the given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;CommentDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CommentDto>> getCommentsByActivityIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCommentsByActivityId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}/comments", uriVariables);

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

        ParameterizedTypeReference<List<CommentDto>> returnType = new ParameterizedTypeReference<List<CommentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Kudoers
     * Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryAthleteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthleteDto> getKudoersByActivityId(Long id, Integer page, Integer perPage) throws RestClientException {
        return getKudoersByActivityIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Activity Kudoers
     * Returns the athletes who kudoed an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Comments.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryAthleteDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryAthleteDto>> getKudoersByActivityIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getKudoersByActivityId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}/kudos", uriVariables);

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

        ParameterizedTypeReference<List<SummaryAthleteDto>> returnType = new ParameterizedTypeReference<List<SummaryAthleteDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Activity Laps
     * Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Laps.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @return List&lt;LapDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LapDto> getLapsByActivityId(Long id) throws RestClientException {
        return getLapsByActivityIdWithHttpInfo(id).getBody();
    }

    /**
     * List Activity Laps
     * Returns the laps of an activity identified by an identifier. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Laps.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @return ResponseEntity&lt;List&lt;LapDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LapDto>> getLapsByActivityIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLapsByActivityId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}/laps", uriVariables);

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

        ParameterizedTypeReference<List<LapDto>> returnType = new ParameterizedTypeReference<List<LapDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Activities
     * Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.
     * <p><b>200</b> - The authenticated athlete&#39;s activities
     * <p><b>0</b> - Unexpected error.
     * @param before An epoch timestamp to use for filtering activities that have taken place before a certain time. (optional)
     * @param after An epoch timestamp to use for filtering activities that have taken place after a certain time. (optional)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryActivityDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryActivityDto> getLoggedInAthleteActivities(Integer before, Integer after, Integer page, Integer perPage) throws RestClientException {
        return getLoggedInAthleteActivitiesWithHttpInfo(before, after, page, perPage).getBody();
    }

    /**
     * List Athlete Activities
     * Returns the activities of an athlete for a specific identifier. Requires activity:read. Only Me activities will be filtered out unless requested by a token with activity:read_all.
     * <p><b>200</b> - The authenticated athlete&#39;s activities
     * <p><b>0</b> - Unexpected error.
     * @param before An epoch timestamp to use for filtering activities that have taken place before a certain time. (optional)
     * @param after An epoch timestamp to use for filtering activities that have taken place after a certain time. (optional)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryActivityDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryActivityDto>> getLoggedInAthleteActivitiesWithHttpInfo(Integer before, Integer after, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/athlete/activities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryActivityDto>> returnType = new ParameterizedTypeReference<List<SummaryActivityDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Activity Zones
     * Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Zones.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @return List&lt;ActivityZoneDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ActivityZoneDto> getZonesByActivityId(Long id) throws RestClientException {
        return getZonesByActivityIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Activity Zones
     * Summit Feature. Returns the zones of a given activity. Requires activity:read for Everyone and Followers activities. Requires activity:read_all for Only Me activities.
     * <p><b>200</b> - Activity Zones.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @return ResponseEntity&lt;List&lt;ActivityZoneDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ActivityZoneDto>> getZonesByActivityIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getZonesByActivityId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}/zones", uriVariables);

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

        ParameterizedTypeReference<List<ActivityZoneDto>> returnType = new ParameterizedTypeReference<List<ActivityZoneDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update Activity
     * Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param body  (optional)
     * @return DetailedActivityDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedActivityDto updateActivityById(Long id, UpdatableActivityDto body) throws RestClientException {
        return updateActivityByIdWithHttpInfo(id, body).getBody();
    }

    /**
     * Update Activity
     * Updates the given activity that is owned by the authenticated athlete. Requires activity:write. Also requires activity:read_all in order to update Only Me activities
     * <p><b>200</b> - The activity&#39;s detailed representation.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the activity. (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;DetailedActivityDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedActivityDto> updateActivityByIdWithHttpInfo(Long id, UpdatableActivityDto body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateActivityById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/activities/{id}", uriVariables);

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

        ParameterizedTypeReference<DetailedActivityDto> returnType = new ParameterizedTypeReference<DetailedActivityDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
