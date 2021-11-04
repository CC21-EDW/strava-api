/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baloise.open.strava.client.api;

import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.StreamSetDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamsApi
 */
@Ignore
public class StreamsApiTest {

    private final StreamsApi api = new StreamsApi();

    
    /**
     * Get Activity Streams
     *
     * Returns the given activity&#39;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSetDto response = api.getActivityStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
    /**
     * Get Route Streams
     *
     * Returns the given route&#39;s streams. Requires read_all scope for private routes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteStreamsTest() {
        Long id = null;
        StreamSetDto response = api.getRouteStreams(id);

        // TODO: test validations
    }
    
    /**
     * Get Segment Effort Streams
     *
     * Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentEffortStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSetDto response = api.getSegmentEffortStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
    /**
     * Get Segment Streams
     *
     * Returns the given segment&#39;s streams. Requires read_all scope for private segments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentStreamsTest() {
        Long id = null;
        List<String> keys = null;
        Boolean keyByType = null;
        StreamSetDto response = api.getSegmentStreams(id, keys, keyByType);

        // TODO: test validations
    }
    
}