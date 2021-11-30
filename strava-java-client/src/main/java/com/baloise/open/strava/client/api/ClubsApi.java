package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.DetailedClubDto;
import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.SummaryActivityDto;
import com.baloise.open.strava.client.model.SummaryAthleteDto;
import com.baloise.open.strava.client.model.SummaryClubDto;

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
@Component("com.baloise.open.strava.client.api.ClubsApi")
public class ClubsApi {
    private ApiClient apiClient;

    public ClubsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClubsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Club Activities
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     * <p><b>200</b> - A list of activities.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryActivityDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryActivityDto> getClubActivitiesById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubActivitiesByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Activities
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     * <p><b>200</b> - A list of activities.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryActivityDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryActivityDto>> getClubActivitiesByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubActivitiesById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/clubs/{id}/activities", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryActivityDto>> returnType = new ParameterizedTypeReference<List<SummaryActivityDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * List Club Administrators
     * Returns a list of the administrators of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryAthleteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthleteDto> getClubAdminsById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubAdminsByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Administrators
     * Returns a list of the administrators of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryAthleteDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryAthleteDto>> getClubAdminsByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubAdminsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/clubs/{id}/admins", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryAthleteDto>> returnType = new ParameterizedTypeReference<List<SummaryAthleteDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Club
     * Returns a given club using its identifier.
     * <p><b>200</b> - The detailed representation of a club.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @return DetailedClubDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedClubDto getClubById(Long id) throws RestClientException {
        return getClubByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Club
     * Returns a given club using its identifier.
     * <p><b>200</b> - The detailed representation of a club.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @return ResponseEntity&lt;DetailedClubDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedClubDto> getClubByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/clubs/{id}", uriVariables);

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

        ParameterizedTypeReference<DetailedClubDto> returnType = new ParameterizedTypeReference<DetailedClubDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * List Club Members
     * Returns a list of the athletes who are members of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryAthleteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthleteDto> getClubMembersById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubMembersByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Members
     * Returns a list of the athletes who are members of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryAthleteDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryAthleteDto>> getClubMembersByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubMembersById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/clubs/{id}/members", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryAthleteDto>> returnType = new ParameterizedTypeReference<List<SummaryAthleteDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Clubs
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     * <p><b>200</b> - A list of summary club representations.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryClubDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryClubDto> getLoggedInAthleteClubs(Integer page, Integer perPage) throws RestClientException {
        return getLoggedInAthleteClubsWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Athlete Clubs
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     * <p><b>200</b> - A list of summary club representations.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryClubDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryClubDto>> getLoggedInAthleteClubsWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/athlete/clubs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummaryClubDto>> returnType = new ParameterizedTypeReference<List<SummaryClubDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
