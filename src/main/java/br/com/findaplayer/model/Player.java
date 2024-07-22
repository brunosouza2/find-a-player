package br.com.findaplayer.model;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "firstName",
        "lastName",
        "name",
        "position",
        "dateOfBirth",
        "nationality",
        "shirtNumber",
        "marketValue",
        "contract"
})
public class Player {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("position")
    private String position;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("shirtNumber")
    private Integer shirtNumber;
    @JsonProperty("marketValue")
    private Integer marketValue;
    @JsonProperty("contract")
    private Contract contract;
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

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("shirtNumber")
    public Integer getShirtNumber() {
        return shirtNumber;
    }

    @JsonProperty("shirtNumber")
    public void setShirtNumber(Integer shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    @JsonProperty("marketValue")
    public Integer getMarketValue() {
        return marketValue;
    }

    @JsonProperty("marketValue")
    public void setMarketValue(Integer marketValue) {
        this.marketValue = marketValue;
    }

    @JsonProperty("contract")
    public Contract getContract() {
        return contract;
    }

    @JsonProperty("contract")
    public void setContract(Contract contract) {
        this.contract = contract;
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
        if (!(o instanceof Player player)) return false;
        return Objects.equals(getId(), player.getId()) && Objects.equals(getFirstName(), player.getFirstName()) && Objects.equals(getLastName(), player.getLastName()) && Objects.equals(getName(), player.getName()) && Objects.equals(getPosition(), player.getPosition()) && Objects.equals(getDateOfBirth(), player.getDateOfBirth()) && Objects.equals(getNationality(), player.getNationality()) && Objects.equals(getShirtNumber(), player.getShirtNumber()) && Objects.equals(getMarketValue(), player.getMarketValue()) && Objects.equals(getContract(), player.getContract()) && Objects.equals(getAdditionalProperties(), player.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getName(), getPosition(), getDateOfBirth(), getNationality(), getShirtNumber(), getMarketValue(), getContract(), getAdditionalProperties());
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                ", shirtNumber=" + shirtNumber +
                ", marketValue=" + marketValue +
                ", contract=" + contract +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

