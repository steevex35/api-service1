package at.steeves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiService1 {
    public static void main(String[] args) {
        SpringApplication.run(ApiService1.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from app1!";
    }
}

@RestController
class RootController {
    @GetMapping("/")
    public String hello() {
        return "API Service 1";
    }
}
