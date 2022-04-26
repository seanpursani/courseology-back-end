package com.nology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication()

public class CourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args); }
    }

