package zuhaprogrammer.spring.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import zuhaprogrammer.spring.validation.properties.DatabaseProperties;

@EnableConfigurationProperties({DatabaseProperties.class})
@SpringBootApplication
public class SpringValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringValidationApplication.class, args);
    }

}
