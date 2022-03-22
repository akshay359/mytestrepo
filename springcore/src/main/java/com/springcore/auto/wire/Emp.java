package com.springcore.auto.wire;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Emp {
	@Autowired
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

}
