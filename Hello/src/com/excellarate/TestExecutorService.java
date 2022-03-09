package com.excellarate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.Executor;
public class TestExecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService es=Executors.newFixedThreadPool(2);
   
Runnable task1=new Runnable() {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("task1...started");
		//TimeUnit.SECONDS.sleep(2);
	}
};
Runnable task2=new Runnable() {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Task2...");
	}
};
es.submit(task1);
es.submit(task2);
es.shutdown();


	} 

}
