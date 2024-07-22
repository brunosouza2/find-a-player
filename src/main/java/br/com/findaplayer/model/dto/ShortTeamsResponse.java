package br.com.findaplayer.model.dto;

import br.com.findaplayer.model.Area;
import br.com.findaplayer.model.Coach;
import br.com.findaplayer.model.RunningCompetition;
import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "shortName",
        "tla",
        "crest",
        "address",
        "website",
        "founded",
        "clubColors",
        "venue",
        "runningCompetitions",
        "coach",
        "marketValue",
        "staff",
        "lastUpdated"
})
public class ShortTeamsResponse {

    @JsonIgnore
    @JsonProperty("area")
    private Area area;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("crest")
    private String crest;
    @JsonProperty("address")
    private String address;
    @JsonProperty("website")
    private String website;
    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("clubColors")
    private String clubColors;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("runningCompetitions")
    private List<RunningCompetition> runningCompetitions;
    @JsonProperty("coach")
    private Coach coach;
    @JsonProperty("marketValue")
    private Integer marketValue;
    @JsonProperty("staff")
    private List<String> staff;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
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

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    @JsonProperty("crest")
    public String getCrest() {
        return crest;
    }

    @JsonProperty("crest")
    public void setCrest(String crest) {
        this.crest = crest;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    @JsonProperty("clubColors")
    public String getClubColors() {
        return clubColors;
    }

    @JsonProperty("clubColors")
    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("runningCompetitions")
    public List<RunningCompetition> getRunningCompetitions() {
        return runningCompetitions;
    }

    @JsonProperty("runningCompetitions")
    public void setRunningCompetitions(List<RunningCompetition> runningCompetitions) {
        this.runningCompetitions = runningCompetitions;
    }

    @JsonProperty("coach")
    public Coach getCoach() {
        return coach;
    }

    @JsonProperty("coach")
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @JsonProperty("marketValue")
    public Integer getMarketValue() {
        return marketValue;
    }

    @JsonProperty("marketValue")
    public void setMarketValue(Integer marketValue) {
        this.marketValue = marketValue;
    }

    @JsonProperty("staff")
    public List<String> getStaff() {
        return staff;
    }

    @JsonProperty("staff")
    public void setStaff(List<String> staff) {
        this.staff = staff;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

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
        if (!(o instanceof ShortTeamsResponse that)) return false;
        return Objects.equals(getArea(), that.getArea()) && Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getShortName(), that.getShortName()) && Objects.equals(getTla(), that.getTla()) && Objects.equals(getCrest(), that.getCrest()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getWebsite(), that.getWebsite()) && Objects.equals(getFounded(), that.getFounded()) && Objects.equals(getClubColors(), that.getClubColors()) && Objects.equals(getVenue(), that.getVenue()) && Objects.equals(getRunningCompetitions(), that.getRunningCompetitions()) && Objects.equals(getCoach(), that.getCoach()) && Objects.equals(getMarketValue(), that.getMarketValue()) && Objects.equals(getStaff(), that.getStaff()) && Objects.equals(getLastUpdated(), that.getLastUpdated()) && Objects.equals(getAdditionalProperties(), that.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea(), getId(), getName(), getShortName(), getTla(), getCrest(), getAddress(), getWebsite(), getFounded(), getClubColors(), getVenue(), getRunningCompetitions(), getCoach(), getMarketValue(), getStaff(), getLastUpdated(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "ShortTeamsResponse{" +
                "area=" + area +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", tla='" + tla + '\'' +
                ", crest='" + crest + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", founded=" + founded +
                ", clubColors='" + clubColors + '\'' +
                ", venue='" + venue + '\'' +
                ", runningCompetitions=" + runningCompetitions +
                ", coach=" + coach +
                ", marketValue=" + marketValue +
                ", staff=" + staff +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
