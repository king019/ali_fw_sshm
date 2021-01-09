package com.k.spring.boot.util.config.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by k on 17-7-13.
 */
@Component
@ConfigurationProperties(prefix = "my")
@Validated
public class MyConfig {
  private final List<String> servers = new ArrayList<String>();
  public List<String> getServers() {
    return servers;
  }
}
