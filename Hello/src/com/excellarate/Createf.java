package com.excellarate;
import java.io.File;
import java.io.IOException;
public class Createf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 File f= new File("Akshay.txt");
	 if(f.createNewFile()) {
		 System.out.println("File created");
	 }else {
		 System.out.println("File is already present");
		 System.out.println(f.getAbsolutePath());
	 }
 }catch(IOException e) {
	 System.out.println("Something went wrong");
 }
	}

}
