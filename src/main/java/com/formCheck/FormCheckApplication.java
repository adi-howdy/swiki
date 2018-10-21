package com.formCheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan("com.formCheck")
public class FormCheckApplication {

	public static void main(String[] args) {
		System.out.print("1");
		SpringApplication.run(FormCheckApplication.class, args);
	}
}
