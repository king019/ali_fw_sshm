package com.k.sshm.feature.extra.servlet.inf.filter;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

public class CORSFilterFilter {
    public CorsFilter test() {
        CorsConfiguration config = new CorsConfiguration();
// Possibly...
// config.applyPermitDefaultValues()
        config.setAllowCredentials(true);
        config.addAllowedOrigin("https://domain1.com");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        CorsFilter filter = new CorsFilter(source);
        return filter;
    }
}
