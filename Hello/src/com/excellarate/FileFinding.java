package com.excellarate;
import java.io.*;
import java.util.Scanner;
//import java.util.*;
class Mythread implements Runnable{
	public void run() {
		//static String location="/";
		Scanner sc =new Scanner(System.in);           
		String location="/";                          //drive location
		File dir=new File(location);            
		String[] a=dir.list();                   //listing all files into string array
	//	int flag;
		if(a==null) {
			System.out.println("Empty directory.");
		}
		else
		{
			System.out.println("Enter text file");           //taking input user
			String getfile=sc.nextLine();
			sc.close();
		for(int i=0;i<a.length;i++)
		{     
			String loc=a[i];
			String inlocation="/"+loc;                    //getting subfolder location
			File fol=new File(inlocation);
			String[]b=fol.list();                          //listing files into string array
			try {
			for(int j=0;j<b.length;j++)                      //traversing files to match with user input
			{
				String filename=b[j];
				if (filename.equalsIgnoreCase(getfile))
				{
					File fs=new File(filename);
				
				System.out.println(b[j]+fs.getAbsolutePath());            //printing file name and path
				//flag=1;
			}
		//System.out.println(a[i]);
		}
			
			}catch(Exception e)
			{
				
			}
}
}
	}
}
public class FileFinding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Mythread();
		Thread t1=new Thread(r);                      //creating new thread
		t1.start();                                
}
}

