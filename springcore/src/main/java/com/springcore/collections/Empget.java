package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empget {

	public static void main(String[] args) {
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");

	Emp e1= (Emp) context.getBean("emp1");
	 System.out.println(e1.getName());
	 System.out.println(e1.getAddress());
	 System.out.println(e1.getCourses());
	 System.out.println(e1.getPhones());
	}

}
