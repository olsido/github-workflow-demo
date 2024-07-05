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
            generateSonarIssue();
            return "Hello, World!";
        }
    }

    private void generateSonarIssue() {
        try {
            int divideByZero = 1 / 0; // This will cause an exception
        } catch (Exception e) {
            // Empty catch block is a common issue that SonarCloud will detect
        }
    }

}
