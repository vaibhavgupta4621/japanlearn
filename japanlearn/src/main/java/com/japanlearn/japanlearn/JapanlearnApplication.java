package com.japanlearn.japanlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.japanlearn", "com.repository"})
@EnableJpaRepositories(basePackages = "com.repository")
public class JapanlearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(JapanlearnApplication.class, args);
    }
}