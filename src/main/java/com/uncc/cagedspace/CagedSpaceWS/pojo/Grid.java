package com.uncc.cagedspace.CagedSpaceWS.pojo;

import java.util.HashMap;
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
"id",
"beaconId",
"streamURL",
"gridImageURL"
})
public class Grid {

@JsonProperty("id")
private Integer id;
@JsonProperty("beaconId")
private String beaconId;
@JsonProperty("streamURL")
private String streamURL;
@JsonProperty("gridImageURL")
private String gridImageURL;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}
/**
* 
* @return
* The gridImageURL
*/
@JsonProperty("gridImageURL")
public String getGridImageURL() {
return gridImageURL;
}

/**
* 
* @param gridImageURL
* The gridImageURL
*/
@JsonProperty("gridImageURL")
public void setGridImageURL(String gridImageURL) {
this.gridImageURL = gridImageURL;
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