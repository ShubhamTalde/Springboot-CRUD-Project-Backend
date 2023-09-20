 package com.emsproject.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsProjectApplication.class, args);
	}
	
	//<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
}
