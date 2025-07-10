package com.kajal.movie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class UserServiceApplication {
    public static void main(String[] args) {
        try {
             SpringApplication.run(UserServiceApplication.class, args);
        } catch (Exception e) {
            log.error("Error while creating application context.", e);
        }    }
}