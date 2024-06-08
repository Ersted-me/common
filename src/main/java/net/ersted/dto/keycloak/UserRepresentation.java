package net.ersted.dto.keycloak;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Objects;
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class UserRepresentation {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private Boolean enabled;
    private List<CredentialRepresentation> credentials;

    public UserRepresentation(String username, String email, String firstName, String lastName, Boolean enabled, List<CredentialRepresentation> credentials) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.credentials = credentials;
    }

    public UserRepresentation() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRepresentation)) return false;
        UserRepresentation that = (UserRepresentation) o;
        return Objects.equals(getUsername(), that.getUsername()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getEnabled(), that.getEnabled()) && Objects.equals(getCredentials(), that.getCredentials());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getEmail(), getFirstName(), getLastName(), getEnabled(), getCredentials());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<CredentialRepresentation> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<CredentialRepresentation> credentials) {
        this.credentials = credentials;
    }
}
