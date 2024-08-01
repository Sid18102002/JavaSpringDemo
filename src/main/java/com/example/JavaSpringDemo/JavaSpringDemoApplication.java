package com.example.JavaSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpringDemoApplication {

	@GetMapping("/msg")
	public String show() {
		return "Hello this is a demo Java Spring Project";
}

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringDemoApplication.class, args);
	}

}
