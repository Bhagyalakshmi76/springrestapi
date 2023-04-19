package com.restapicrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value="classpath:application-dev.properties")
public class RestapicrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapicrudApplication.class, args);
	}

}
