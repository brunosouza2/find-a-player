package br.com.findaplayer.model;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "area",
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
        "squad",
        "staff",
        "lastUpdated"
})
public class Team {

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
    @JsonProperty("squad")
    private List<Player> squad;
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

    @JsonProperty("squad")
    public List<Player> getSquad() {
        return squad;
    }

    @JsonProperty("squad")
    public void setSquad(List<Player> squad) {
        this.squad = squad;
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
        if (!(o instanceof Team team)) return false;
        return Objects.equals(getArea(), team.getArea()) && Objects.equals(getId(), team.getId()) && Objects.equals(getName(), team.getName()) && Objects.equals(getShortName(), team.getShortName()) && Objects.equals(getTla(), team.getTla()) && Objects.equals(getCrest(), team.getCrest()) && Objects.equals(getAddress(), team.getAddress()) && Objects.equals(getWebsite(), team.getWebsite()) && Objects.equals(getFounded(), team.getFounded()) && Objects.equals(getClubColors(), team.getClubColors()) && Objects.equals(getVenue(), team.getVenue()) && Objects.equals(getRunningCompetitions(), team.getRunningCompetitions()) && Objects.equals(getCoach(), team.getCoach()) && Objects.equals(getMarketValue(), team.getMarketValue()) && Objects.equals(getSquad(), team.getSquad()) && Objects.equals(getStaff(), team.getStaff()) && Objects.equals(getLastUpdated(), team.getLastUpdated()) && Objects.equals(getAdditionalProperties(), team.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea(), getId(), getName(), getShortName(), getTla(), getCrest(), getAddress(), getWebsite(), getFounded(), getClubColors(), getVenue(), getRunningCompetitions(), getCoach(), getMarketValue(), getSquad(), getStaff(), getLastUpdated(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "Team{" +
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
                ", squad=" + squad +
                ", staff=" + staff +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
