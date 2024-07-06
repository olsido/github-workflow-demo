package com.example.githubworkflowdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubWorkflowDemoApplicationTests {

    @Test
    void contextLoads() {
        GithubWorkflowDemoApplication.HelloWorldController application = new GithubWorkflowDemoApplication().new HelloWorldController();
        assertThat(application).isNotNull();
    }

    @Test
    void testHelloWorld() {
        GithubWorkflowDemoApplication.HelloWorldController controller = new GithubWorkflowDemoApplication().new HelloWorldController();
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello, World 123!");
    }

}
