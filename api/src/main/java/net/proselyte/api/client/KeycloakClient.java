package net.proselyte.api.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.proselyte.api.config.KeycloakProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Component
@RequiredArgsConstructor
public class KeycloakClient {

    private static final String BEARER_PREFIX = "Bearer ";

    private final WebClient webClient;
    private final KeycloakProperties keycloakProperties;

    private String userRegistrationUrl;

    private String userPasswordResetUrl;

    private String userByIdUrl;
}
