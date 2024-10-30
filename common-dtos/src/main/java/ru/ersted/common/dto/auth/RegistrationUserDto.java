package ru.ersted.common.dto.auth;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RegistrationUserDto {
    private String email;
    private String password;
    private String confirmPassword;

    public RegistrationUserDto(String email, String password, String confirmPassword) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public RegistrationUserDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistrationUserDto)) return false;
        RegistrationUserDto that = (RegistrationUserDto) o;
        return Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getConfirmPassword(), that.getConfirmPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getPassword(), getConfirmPassword());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
