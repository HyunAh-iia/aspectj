package com.example.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;

@EnableCaching(mode = AdviceMode.ASPECTJ)
@SpringBootApplication
public class AspectjApplication {

    public static void main(String[] args) {
        SpringApplication.run(AspectjApplication.class, args);
    }

}
