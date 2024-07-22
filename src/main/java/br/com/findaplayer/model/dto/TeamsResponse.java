package br.com.findaplayer.model.dto;

import br.com.findaplayer.model.Season;
import br.com.findaplayer.model.Competition;
import br.com.findaplayer.model.Filter;
import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "filters",
        "season",
        "teams"
})
public class TeamsResponse {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("filters")
    private Filter filters;
    @JsonIgnore
    @JsonProperty("competition")
    private Competition competition;
    @JsonProperty("season")
    private Season season;
    @JsonProperty("teams")
    private List<ShortTeamsResponse> teams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("filters")
    public Filter getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filter filters) {
        this.filters = filters;
    }

    @JsonProperty("competition")
    public Competition getCompetition() {
        return competition;
    }

    @JsonProperty("competition")
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @JsonProperty("season")
    public Season getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Season season) {
        this.season = season;
    }

    @JsonProperty("teams")
    public List<ShortTeamsResponse> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<ShortTeamsResponse> teams) {
        this.teams = teams;
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
        if (!(o instanceof TeamsResponse that)) return false;
        return Objects.equals(getCount(), that.getCount()) && Objects.equals(getFilters(), that.getFilters()) && Objects.equals(getCompetition(), that.getCompetition()) && Objects.equals(getSeason(), that.getSeason()) && Objects.equals(getTeams(), that.getTeams()) && Objects.equals(getAdditionalProperties(), that.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getFilters(), getCompetition(), getSeason(), getTeams(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "TeamsResponse{" +
                "count=" + count +
                ", filters=" + filters +
                ", competition=" + competition +
                ", season=" + season +
                ", teams=" + teams +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
