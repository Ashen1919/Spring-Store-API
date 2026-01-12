package com.store_api.springstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStoreApiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringStoreApiApplication.class, args);
    }

}
