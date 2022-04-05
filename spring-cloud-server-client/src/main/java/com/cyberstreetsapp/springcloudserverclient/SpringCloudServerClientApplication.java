package com.cyberstreetsapp.springcloudserverclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RequestMapping("/run")
@RestController
public class SpringCloudServerClientApplication {

	//template used to read data off page
	private RestTemplate template;
	
	@Value("${message: The server is running, but not working}")
	private String message;
	
	@GetMapping("/test")
	public String message() {
		return message;
	}
	//@getMapping("/tag to assign page")
	//Create call to webpage
	//public ...
	
	//@getMapping("/tag to assign page")
		//Create call to webpage
		//public ...
	
	//@getMapping("/tag to assign page")
		//Create call to webpage
		//public ...
	

	
	
	//initialized the template above
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
