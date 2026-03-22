package net.proselyte.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ApiApplication {
//5.05
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
