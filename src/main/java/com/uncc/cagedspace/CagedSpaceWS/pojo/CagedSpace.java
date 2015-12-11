package com.uncc.cagedspace.CagedSpaceWS.pojo;

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
"eventVenue",
"grids",
"floorMap",
"orchestra"
})
public class CagedSpace {

@JsonProperty("eventName")
private String eventName;
@JsonProperty("eventVenue")
private String eventVenue;
@JsonProperty("grids")
private List<Grid> grids = new ArrayList<Grid>();
@JsonProperty("floorMap")
private String floorMap;
@JsonProperty("orchestra")
private List<Orchestra> orchestra = new ArrayList<Orchestra>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
* The eventVenue
*/
@JsonProperty("eventVenue")
public String getEventVenue() {
return eventVenue;
}

/**
* 
* @param eventVenue
* The eventVenue
*/
@JsonProperty("eventVenue")
public void setEventVenue(String eventVenue) {
this.eventVenue = eventVenue;
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

/**
* 
* @param grids
* The grids
*/
@JsonProperty("grids")
public void setGrids(List<Grid> grids) {
this.grids = grids;
}

/**
* 
* @return
* The floorMap
*/
@JsonProperty("floorMap")
public String getFloorMap() {
return floorMap;
}

/**
* 
* @param floorMap
* The floorMap
*/
@JsonProperty("floorMap")
public void setFloorMap(String floorMap) {
this.floorMap = floorMap;
}

/**
* 
* @return
* The orchestra
*/
@JsonProperty("orchestra")
public List<Orchestra> getOrchestra() {
return orchestra;
}

/**
* 
* @param orchestra
* The orchestra
*/
@JsonProperty("orchestra")
public void setOrchestra(List<Orchestra> orchestra) {
this.orchestra = orchestra;
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