package ru.ersted.common.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class IndividualDto {
    private String id;
    private String passportNumber;
    private String phoneNumber;
    private String email;
    private UserDto user;

    public IndividualDto(String id, String passportNumber, String phoneNumber, String email, UserDto user) {
        this.id = id;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.user = user;
    }

    public IndividualDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndividualDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPassportNumber(), that.getPassportNumber()) && Objects.equals(getPhoneNumber(), that.getPhoneNumber()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getUser(), that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPassportNumber(), getPhoneNumber(), getEmail(), getUser());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}