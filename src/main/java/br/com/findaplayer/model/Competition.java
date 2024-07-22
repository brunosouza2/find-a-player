package br.com.findaplayer.model;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "area",
        "name",
        "code",
        "type",
        "emblem",
        "plan",
        "currentSeason",
        "numberOfAvailableSeasons",
        "lastUpdated"
})
public class Competition {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("emblem")
    private Object emblem;
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("currentSeason")
    private CurrentSeason currentSeason;
    @JsonProperty("numberOfAvailableSeasons")
    private Integer numberOfAvailableSeasons;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("emblem")
    public Object getEmblem() {
        return emblem;
    }

    @JsonProperty("emblem")
    public void setEmblem(Object emblem) {
        this.emblem = emblem;
    }

    @JsonProperty("plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("currentSeason")
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    @JsonProperty("currentSeason")
    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    @JsonProperty("numberOfAvailableSeasons")
    public Integer getNumberOfAvailableSeasons() {
        return numberOfAvailableSeasons;
    }

    @JsonProperty("numberOfAvailableSeasons")
    public void setNumberOfAvailableSeasons(Integer numberOfAvailableSeasons) {
        this.numberOfAvailableSeasons = numberOfAvailableSeasons;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Competition{" +
                "id=" + id +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", emblem=" + emblem +
                ", plan='" + plan + '\'' +
                ", currentSeason=" + currentSeason +
                ", numberOfAvailableSeasons=" + numberOfAvailableSeasons +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Competition that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getArea(), that.getArea()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCode(), that.getCode()) && Objects.equals(getType(), that.getType()) && Objects.equals(getEmblem(), that.getEmblem()) && Objects.equals(getPlan(), that.getPlan()) && Objects.equals(getCurrentSeason(), that.getCurrentSeason()) && Objects.equals(getNumberOfAvailableSeasons(), that.getNumberOfAvailableSeasons()) && Objects.equals(getLastUpdated(), that.getLastUpdated()) && Objects.equals(getAdditionalProperties(), that.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getArea(), getName(), getCode(), getType(), getEmblem(), getPlan(), getCurrentSeason(), getNumberOfAvailableSeasons(), getLastUpdated(), getAdditionalProperties());
    }
}

