package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.RouteDto;

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
@Component("com.baloise.open.strava.client.api.RoutesApi")
public class RoutesApi {
    private ApiClient apiClient;

    public RoutesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Export Route GPX
     * Returns a GPX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A GPX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRouteAsGPX(Long id) throws RestClientException {
        getRouteAsGPXWithHttpInfo(id);
    }

    /**
     * Export Route GPX
     * Returns a GPX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A GPX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRouteAsGPXWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteAsGPX");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/routes/{id}/export_gpx", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Export Route TCX
     * Returns a TCX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A TCX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRouteAsTCX(Long id) throws RestClientException {
        getRouteAsTCXWithHttpInfo(id);
    }

    /**
     * Export Route TCX
     * Returns a TCX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A TCX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRouteAsTCXWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteAsTCX");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/routes/{id}/export_tcx", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Route
     * Returns a route using its identifier. Requires read_all scope for private routes.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return RouteDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RouteDto getRouteById(Long id) throws RestClientException {
        return getRouteByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Route
     * Returns a route using its identifier. Requires read_all scope for private routes.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;RouteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RouteDto> getRouteByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/routes/{id}", uriVariables);

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

        ParameterizedTypeReference<RouteDto> returnType = new ParameterizedTypeReference<RouteDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Routes
     * Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;RouteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RouteDto> getRoutesByAthleteId(Integer page, Integer perPage) throws RestClientException {
        return getRoutesByAthleteIdWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Athlete Routes
     * Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;RouteDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RouteDto>> getRoutesByAthleteIdWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/athletes/{id}/routes", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<RouteDto>> returnType = new ParameterizedTypeReference<List<RouteDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
