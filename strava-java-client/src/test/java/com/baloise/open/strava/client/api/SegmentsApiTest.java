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

import com.baloise.open.strava.client.model.DetailedSegmentDto;
import com.baloise.open.strava.client.model.ExplorerResponseDto;
import com.baloise.open.strava.client.model.FaultDto;
import com.baloise.open.strava.client.model.SummarySegmentDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentsApi
 */
@Ignore
public class SegmentsApiTest {

    private final SegmentsApi api = new SegmentsApi();

    
    /**
     * Explore segments
     *
     * Returns the top 10 segments matching a specified query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exploreSegmentsTest() {
        List<Float> bounds = null;
        String activityType = null;
        Integer minCat = null;
        Integer maxCat = null;
        ExplorerResponseDto response = api.exploreSegments(bounds, activityType, minCat, maxCat);

        // TODO: test validations
    }
    
    /**
     * List Starred Segments
     *
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoggedInAthleteStarredSegmentsTest() {
        Integer page = null;
        Integer perPage = null;
        List<SummarySegmentDto> response = api.getLoggedInAthleteStarredSegments(page, perPage);

        // TODO: test validations
    }
    
    /**
     * Get Segment
     *
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentByIdTest() {
        Long id = null;
        DetailedSegmentDto response = api.getSegmentById(id);

        // TODO: test validations
    }
    
    /**
     * Star Segment
     *
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void starSegmentTest() {
        Long id = null;
        Boolean starred = null;
        DetailedSegmentDto response = api.starSegment(id, starred);

        // TODO: test validations
    }
    
}