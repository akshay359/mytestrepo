package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	public Singing singing;
	

	public Student(Singing singing) {
		super();
		this.singing = singing;
	}


	public Singing getSinging() {
		return singing;
	}


	public void setSinging(Singing singing) {
		this.singing = singing;
	}


	public void study()
	{
		System.out.println("student is reading book");
		this.singing.sing();
	}

}
