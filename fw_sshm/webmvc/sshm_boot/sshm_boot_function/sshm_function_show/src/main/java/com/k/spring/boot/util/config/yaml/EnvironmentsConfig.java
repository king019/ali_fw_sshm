package com.k.spring.boot.util.config.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by k on 17-7-13.
 */
@Component
@ConfigurationProperties("environments")
public class EnvironmentsConfig {
  private String product;
  private Map<String, String> dev = new HashMap<>();
  private Map<String, String> prod = new HashMap<>();
  public Map<String, String> getDev() {
    return dev;
  }
  public void setDev(final Map<String, String> dev) {
    this.dev = dev;
  }
  public Map<String, String> getProd() {
    return prod;
  }
  public void setProd(final Map<String, String> prod) {
    this.prod = prod;
  }
  public String getProduct() {
    return product;
  }
  public void setProduct(final String product) {
    this.product = product;
  }
}
