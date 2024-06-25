package com.breakline.farmville.farmville;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:values.properties")
public class FarmvilleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmvilleApplication.class, args);
	}

}
