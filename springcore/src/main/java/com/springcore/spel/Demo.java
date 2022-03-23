package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
   
	@Value("#{2+3}")
	private int a;
	
	@Value("#{5+3}")
	private int b;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double c;

	@Value("#{T(java.lang.Math).PI}")
	private double d;
	
	@Value("#{new java.lang.String('akshay kadam')}")
	private String name;
	
	@Value("#{5<6}")
	private boolean active;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", name=" + name + ", active=" + active + "]";
	}
	

}
