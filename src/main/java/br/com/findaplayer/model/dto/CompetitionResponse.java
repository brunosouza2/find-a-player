package br.com.findaplayer.model.dto;

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
        "competitions"
})
public class CompetitionResponse {

    @JsonProperty("count")
    private Integer count;
    @JsonIgnore
    private Filter filters;
    @JsonProperty("competitions")
    private List<Competition> competitions;
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

    @JsonProperty("competitions")
    public List<Competition> getCompetitions() {
        return competitions;
    }

    @JsonProperty("competitions")
    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
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
        if (!(o instanceof CompetitionResponse that)) return false;
        return Objects.equals(getCount(), that.getCount()) && Objects.equals(getFilters(), that.getFilters()) && Objects.equals(getCompetitions(), that.getCompetitions()) && Objects.equals(getAdditionalProperties(), that.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getFilters(), getCompetitions(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "CompetitionResponse{" +
                "count=" + count +
                ", filters=" + filters +
                ", competitions=" + competitions +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
