package br.com.makro.institutional.auth;

import br.com.makro.institutional.domain.OAuthToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class HybrisOauthToken {


    @Autowired
    private RestTemplate restTemplate;

    @Value("${hybris.client.credentials.id}")
    private String clientId;
    @Value("${hybris.client.secret}")
    private String clientSecret;
    @Value("${hybris.client.credential.name}")
    private String clientName;
    @Value("${hybris.client.credential.url}")
    private String urlServer;


    public OAuthToken getToken() {

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        final MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("client_id", clientId);
        map.add("client_secret", clientSecret);
        map.add("grant_type", clientName);
        map.add("refresh_token", "hybrisRefreshToken");

        final ResponseEntity<OAuthToken> response = this.restTemplate.postForEntity(urlServer,
                new HttpEntity<MultiValueMap<String, String>>(map, headers), OAuthToken.class);

        return response.getBody();

    }
}