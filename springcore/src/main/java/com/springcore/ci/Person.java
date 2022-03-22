package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int id;
	 Certi certi;
	 List<String> list;
	
	public Person(String name, int id, Certi certi,List<String> list)
	{
		this.id=id;
		this.name=name;
		this.certi=certi;
		this.list=list;
	}

	@Override
	public String toString() {
		
		return this.name+" : "+this.id+"{"+this.certi.name+"}"+this.list;
	}
}
