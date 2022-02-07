package com.docker.Dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DockerprojectApplication {
	
	@RequestMapping("/")
  public String home() {
    return "This is a Docker project..";
  }
	public static void main(String[] args) {
		SpringApplication.run(DockerprojectApplication.class, args);
	}

}
