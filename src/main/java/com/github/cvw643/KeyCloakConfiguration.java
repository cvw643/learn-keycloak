package com.github.cvw643;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KeycloakProperties.class)
public class KeyCloakConfiguration {
    private final KeycloakProperties props;

    public KeyCloakConfiguration(KeycloakProperties props) {
        this.props = props;
    }

    @Bean
    Keycloak keycloak() {
        return Keycloak.getInstance(
                "http://localhost:8080/auth",
                "master",
                "admin",
                "password",
                "admin-cli");
    }
}
