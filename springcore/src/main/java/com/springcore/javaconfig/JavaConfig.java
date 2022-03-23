package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
@Bean
public Singing getSinging()
{
	return new Singing();
}
	
@Bean
public Student getStudent()
{
	
	//creating student object
	Student s1=new Student(getSinging());
	return s1;
}

}
