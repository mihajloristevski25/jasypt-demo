package com.mihajlo.jasypt.jasyptdemo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class JasyptDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptDemoApplication.class, args);
	}

}
