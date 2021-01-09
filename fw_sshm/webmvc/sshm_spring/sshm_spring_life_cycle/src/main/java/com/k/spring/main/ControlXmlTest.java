package com.k.spring.main;

import org.springframework.boot.SpringApplication;
//@SpringBootApplication
//@ImportResource(locations = {"classpath:spring/xml/applicationContext-*.xm"})
public class ControlXmlTest {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(ControlXmlTest.class, args);
    // SpringApplication app = new SpringApplication(SampleController.class);
    // app.setBannerMode(Banner.Mode.OFF);
    // app.run(args);
  }
}
