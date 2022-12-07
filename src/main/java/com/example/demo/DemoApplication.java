package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("package com.example.demo.entity")
public class DemoApplication {

    public static void main(final String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        System.out.println();
    }

}
