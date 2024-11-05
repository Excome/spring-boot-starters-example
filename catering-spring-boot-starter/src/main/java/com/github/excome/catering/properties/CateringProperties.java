package com.github.excome.catering.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "catering")
public record CateringProperties(
        boolean enabled,
        int servingsCount
) {
}
