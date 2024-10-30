package ru.ersted.common.dto.auth;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class JwtDto {
    private String accessToken;
    private Integer expiresIn;
    private String refreshToken;
    private String tokenType;

    public JwtDto(String accessToken, Integer expiresIn, String refreshToken, String tokenType) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.tokenType = tokenType;
    }

    public JwtDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JwtDto jwtDto)) return false;
        return Objects.equals(getAccessToken(), jwtDto.getAccessToken()) && Objects.equals(getExpiresIn(), jwtDto.getExpiresIn()) && Objects.equals(getRefreshToken(), jwtDto.getRefreshToken()) && Objects.equals(getTokenType(), jwtDto.getTokenType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccessToken(), getExpiresIn(), getRefreshToken(), getTokenType());
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
