package com.k.spring.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.k.spring.boot.anno"})
public class ControlAnnlTest {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(ControlAnnlTest.class, args);
    // SpringApplication app = new SpringApplication(SampleController.class);
    // app.setBannerMode(Banner.Mode.OFF);
    // app.run(args);
  }
}
