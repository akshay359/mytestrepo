package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/rref.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a.getX());
		B b = (B) context.getBean("bref");
		System.out.println(b.getY());
	}

}
