package br.com.makro.institutional.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OAuthToken {
    @JsonProperty("access_token") private String accessToken;
    @JsonProperty("refresh_token") private String refreshToken;
    @JsonProperty("token_type") private String tokenType;
    @JsonProperty("expires_in") private Integer expiresIn;
    private String scope;
    private String hybrisId;
}