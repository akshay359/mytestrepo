package com.excellarate;
import java.util.*;

public class FirstPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number to check it id armstrong or not");
      Scanner a=new Scanner(System.in);
		n=a.nextInt();
       int t1=n;
  int length=0;
       while(t1!=0)
       {
    	   t1=t1/10;
    	   length++;
       }
       int t2=n;
       int rem;
       int arm=0;
       while(t2!=0)
       {
    	   rem=t2%10;
      int mul=1;
       for(int i=1;i<=length;i++)
       {
    	  mul=mul*rem;
       }
       arm=arm+mul;
       t2=t2/10;
	}
	if(arm==n)
	{
		System.out.println("Armstrong");
	}
	else
		System.out.println("Not a armstrong");

	}
}
