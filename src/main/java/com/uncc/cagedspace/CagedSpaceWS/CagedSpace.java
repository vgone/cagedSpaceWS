package com.uncc.cagedspace.CagedSpaceWS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "eventName",
        "leadPerformer",
        "grids"
})
public class CagedSpace implements Serializable {

    @JsonProperty("eventName")
    private String eventName;
    @JsonProperty("leadPerformer")
    private String leadPerformer;
    @JsonProperty("grids")
    private List<Grid> grids = new ArrayList<Grid>();
  

    /**
     *
     * @return
     * The eventName
     */
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    /**
     *
     * @param eventName
     * The eventName
     */
    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     *
     * @return
     * The leadPerformer
     */
    @JsonProperty("leadPerformer")
    public String getLeadPerformer() {
        return leadPerformer;
    }

    /**
     *
     * @param leadPerformer
     * The leadPerformer
     */
    @JsonProperty("leadPerformer")
    public void setLeadPerformer(String leadPerformer) {
        this.leadPerformer = leadPerformer;
    }

    /**
     *
     * @return
     * The grids
     */
    @JsonProperty("grids")
    public List<Grid> getGrids() {
        return grids;
    }

    @Override
	public String toString() {
		return "CagedSpace [eventName=" + eventName + ", leadPerformer="
				+ leadPerformer + ", grids=" + grids + "]";
	}

	/**
     *
     * @param grids
     * The grids
     */
    @JsonProperty("grids")
    public void setGrids(List<Grid> grids) {
        this.grids = grids;
    }



}

