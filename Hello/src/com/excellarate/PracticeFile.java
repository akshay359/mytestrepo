package com.excellarate;
import java.util.*;
import java.io.File;

class Filefind implements Runnable  //using Runnable interface
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Character or a name to find folder");
		String ch=sc.next();
		sc.close();
		 String path="/";                   //location of directory
		 File f=new File(path);
		String [] s=f.list();
		
		for(int i=0;i<s.length;i++)        //traversing folders through for loop
		{     
			if(s[i].startsWith(ch))
               {
			System.out.println(s[i]);
			 // String path=s[i];
			  File p=new File(s[i]);
			 System.out.println(p.getAbsoluteFile());      //printing absolute path of folder
	          }
	
        }
    }      
}


public class PracticeFile { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   Filefind f=new Filefind();                                //creating object of class
Thread t1=new Thread(f);                                //passing object to Thread class
t1.start();                              
}
}
