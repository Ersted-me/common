package net.ersted.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CountryDto {
    private String id;
    private String name;
    private String alpha2;
    private String alpha3;

    public CountryDto(String name, String alpha2, String alpha3) {
        this.name = name;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
    }

    public CountryDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getAlpha2(), that.getAlpha2()) && Objects.equals(getAlpha3(), that.getAlpha3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAlpha2(), getAlpha3());
    }
}