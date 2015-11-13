package com.uncc.cagedspace.CagedSpaceWS;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "beaconId",
        "streamURL"
})
public class Grid {

    @JsonProperty("id")
    private String id;
    @JsonProperty("beaconId")
    private String beaconId;
    @JsonProperty("streamURL")
    private String streamURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The beaconId
     */
    @JsonProperty("beaconId")
    public String getBeaconId() {
        return beaconId;
    }

    /**
     *
     * @param beaconId
     * The beaconId
     */
    @JsonProperty("beaconId")
    public void setBeaconId(String beaconId) {
        this.beaconId = beaconId;
    }

    /**
     *
     * @return
     * The streamURL
     */
    @JsonProperty("streamURL")
    public String getStreamURL() {
        return streamURL;
    }

    /**
     *
     * @param streamURL
     * The streamURL
     */
    @JsonProperty("streamURL")
    public void setStreamURL(String streamURL) {
        this.streamURL = streamURL;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}