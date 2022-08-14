package com.k.sshm.boot.function.show.simple.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EnvironmentProcessImpl implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Properties properties = new Properties();
        properties.setProperty("prop.name", "env");
        environment.getPropertySources().addLast(new PropertiesPropertySource("myenvi", properties));
    }
}
