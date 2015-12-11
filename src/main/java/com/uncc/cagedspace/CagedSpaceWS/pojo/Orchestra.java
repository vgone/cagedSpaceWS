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
"playerName",
"playerCaption",
"playerPhoto"
})
public class Orchestra {

@JsonProperty("playerName")
private String playerName;
@JsonProperty("playerCaption")
private String playerCaption;
@JsonProperty("playerPhoto")
private String playerPhoto;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The playerName
*/
@JsonProperty("playerName")
public String getPlayerName() {
return playerName;
}

/**
* 
* @param playerName
* The playerName
*/
@JsonProperty("playerName")
public void setPlayerName(String playerName) {
this.playerName = playerName;
}

/**
* 
* @return
* The playerCaption
*/
@JsonProperty("playerCaption")
public String getPlayerCaption() {
return playerCaption;
}

/**
* 
* @param playerCaption
* The playerCaption
*/
@JsonProperty("playerCaption")
public void setPlayerCaption(String playerCaption) {
this.playerCaption = playerCaption;
}

/**
* 
* @return
* The playerPhoto
*/
@JsonProperty("playerPhoto")
public String getPlayerPhoto() {
return playerPhoto;
}

/**
* 
* @param playerPhoto
* The playerPhoto
*/
@JsonProperty("playerPhoto")
public void setPlayerPhoto(String playerPhoto) {
this.playerPhoto = playerPhoto;
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