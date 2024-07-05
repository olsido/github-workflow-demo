package com.example.githubworkflowdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubWorkflowDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubWorkflowDemoApplication.class, args);
    }

    @RestController
    class HelloWorldController {
        @GetMapping("/")
        public String hello() {
            // Introducing a potential NullPointerException
            String potentiallyNullString = getPotentiallyNullString();
            potentiallyNullString.toString();
            return "Hello, World!";
        }
    }

    private String getPotentiallyNullString() {
        return null; // This will cause a NullPointerException when toString() is called
    }
    
}
