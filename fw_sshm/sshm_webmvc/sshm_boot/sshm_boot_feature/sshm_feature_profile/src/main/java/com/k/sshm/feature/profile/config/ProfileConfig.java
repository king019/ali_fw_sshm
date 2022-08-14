package com.k.sshm.feature.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cc")
public class ProfileConfig {
    @Bean
    public CG cg() {
        return new CG();
    }

    class CG {
    }
}
