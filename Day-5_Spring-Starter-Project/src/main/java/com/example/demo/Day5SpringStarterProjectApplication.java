package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.example.springmvc.Student;
@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Day5SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		//Spring IOC
		ConfigurableApplicationContext c=SpringApplication.run(Day5SpringStarterProjectApplication.class, args);
		Student s=c.getBean(Student.class);
		//Student s=new Student();
		s.display();
		//System.out.println("Welcome to Software Batch");
	}
}
