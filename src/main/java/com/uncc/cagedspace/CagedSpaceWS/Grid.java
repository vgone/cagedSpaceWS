package com.uncc.cagedspace.CagedSpaceWS;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "beaconId",
        "streamURL"
})
public class Grid implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("beaconId")
    private String beaconId;
    @JsonProperty("streamURL")
    private String streamURL;
    

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @Override
	public String toString() {
		return "Grid [id=" + id + ", beaconId=" + beaconId + ", streamURL="
				+ streamURL + "]";
	}

	/**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(long id) {
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



}