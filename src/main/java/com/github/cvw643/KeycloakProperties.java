package com.github.cvw643;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("keycloak")
public class KeycloakProperties {
    private String serverUrl;
    private String realm;
    private String clientId;
    private String clientSecret;
}
