package br.com.findaplayer.model.dto;

import br.com.findaplayer.model.Season;
import br.com.findaplayer.model.Area;
import br.com.findaplayer.model.CurrentSeason;
import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "area",
        "id",
        "name",
        "code",
        "type",
        "emblem",
        "currentSeason",
        "seasons"
})
public class SingleCompetitionResponse {

    @JsonProperty("area")
    private Area area;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("emblem")
    private String emblem;
    @JsonProperty("currentSeason")
    private CurrentSeason currentSeason;
    @JsonProperty("seasons")
    private List<Season> seasons;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
    public String getEmblem() {
        return emblem;
    }

    @JsonProperty("emblem")
    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }

    @JsonProperty("currentSeason")
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    @JsonProperty("currentSeason")
    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    @JsonProperty("seasons")
    public List<Season> getSeasons() {
        return seasons;
    }

    @JsonProperty("seasons")
    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleCompetitionResponse that)) return false;
        return Objects.equals(getArea(), that.getArea()) && Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCode(), that.getCode()) && Objects.equals(getType(), that.getType()) && Objects.equals(getEmblem(), that.getEmblem()) && Objects.equals(getCurrentSeason(), that.getCurrentSeason()) && Objects.equals(getSeasons(), that.getSeasons()) && Objects.equals(getAdditionalProperties(), that.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea(), getId(), getName(), getCode(), getType(), getEmblem(), getCurrentSeason(), getSeasons(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "SingleCompetitionResponse{" +
                "area=" + area +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", emblem='" + emblem + '\'' +
                ", currentSeason=" + currentSeason +
                ", seasons=" + seasons +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
