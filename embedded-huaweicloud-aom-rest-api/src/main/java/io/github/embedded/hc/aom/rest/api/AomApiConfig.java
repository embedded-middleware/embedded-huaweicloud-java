package io.github.embedded.hc.aom.rest.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AomApiConfig {

    @Value("${embedded.hc.aom.baseUrl:}")
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }
}
