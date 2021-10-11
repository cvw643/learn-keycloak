package com.github.cvw643.controller;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.RealmRepresentation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/keycloak")
@RestController
public class KeycloakController {
    private final Keycloak keycloak;

    public KeycloakController(Keycloak keycloak) {
        this.keycloak = keycloak;
    }

    @GetMapping("/realms/{realm}")
    public RealmRepresentation getRealm(@PathVariable String realm) {
        return keycloak.realm(realm).toRepresentation();
    }
}
