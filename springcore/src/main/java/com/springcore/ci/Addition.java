package com.springcore.ci;

public class Addition {

	private int a;
	 private int b;
	 
	 public Addition(int a,int b)
	 {
		 this.a=a;
		 this.b=b;
		 System.out.println("constructor : int,int");
	 }
	 public Addition(double a,double b)
	 {
		 this.a=(int) a;
		 this.b=(int) b;
		 System.out.println("constructor : double,double");
	 }
	 public void dosum()
	 {
		 System.out.println("sum is ="+(this.a+this.b));
	 }
}
