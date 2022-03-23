package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
		 Student s1=(Student) context.getBean("ob");
		 System.out.println(s1.getName());
		 System.out.println(s1.getCity());
		 System.out.println("+++++++++");
		 System.out.println(s1.getAddress());
		 

	}

}
