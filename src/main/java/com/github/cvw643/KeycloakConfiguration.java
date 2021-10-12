package com.github.cvw643;

import org.keycloak.admin.client.Keycloak;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KeycloakProperties.class)
public class KeycloakConfiguration {
    private final KeycloakProperties props;

    public KeycloakConfiguration(KeycloakProperties props) {
        this.props = props;
    }

    @Bean
    Keycloak keycloak() {
        return Keycloak.getInstance(
                "http://192.168.56.106:8180/auth",
                "master",
                "admin",
                "admin",
                "admin-cli");
    }
}
