package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu!";
	}

        @RequestMapping("/v1/hello")
        public String hello() {
                return "Greetings from the hello endpoint";
        }

        @RequestMapping("/v1/version")
        public String version() {
                return "v0.0.2";
        }
}
