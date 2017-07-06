package com.trendy.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(value = {"com.trendy.controller"})  
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}