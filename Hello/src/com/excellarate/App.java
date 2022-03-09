package com.excellarate;

class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hii");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class Hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main is representing main thread
		Runnable h=new Hi();
		Runnable hw=new Hello();
	Thread t1=new Thread(hw);
	Thread t2=new Thread(h);
	t1.start();
	t2.start();
		

	}
}	


