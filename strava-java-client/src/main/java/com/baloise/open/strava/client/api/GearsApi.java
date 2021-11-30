package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.ApiClient;

import com.baloise.open.strava.client.model.DetailedGearDto;
import com.baloise.open.strava.client.model.FaultDto;

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
@Component("com.baloise.open.strava.client.api.GearsApi")
public class GearsApi {
    private ApiClient apiClient;

    public GearsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GearsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Equipment
     * Returns an equipment using its identifier.
     * <p><b>200</b> - A representation of the gear.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the gear. (required)
     * @return DetailedGearDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedGearDto getGearById(String id) throws RestClientException {
        return getGearByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Equipment
     * Returns an equipment using its identifier.
     * <p><b>200</b> - A representation of the gear.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the gear. (required)
     * @return ResponseEntity&lt;DetailedGearDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedGearDto> getGearByIdWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getGearById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/gear/{id}", uriVariables);

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

        ParameterizedTypeReference<DetailedGearDto> returnType = new ParameterizedTypeReference<DetailedGearDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
