package mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootRunUnUse {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunUnUse.class, args);
    }
}
