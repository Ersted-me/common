package net.ersted.dto.keycloak;


import java.util.Objects;

public class CredentialRepresentation {
    private String type;
    private String value;
    private Boolean temporary;

    public CredentialRepresentation(String type, String value, Boolean temporary) {
        this.type = type;
        this.value = value;
        this.temporary = temporary;
    }

    public CredentialRepresentation() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CredentialRepresentation)) return false;
        CredentialRepresentation that = (CredentialRepresentation) o;
        return Objects.equals(getType(), that.getType()) && Objects.equals(getValue(), that.getValue()) && Objects.equals(getTemporary(), that.getTemporary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getValue(), getTemporary());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getTemporary() {
        return temporary;
    }

    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }
}
