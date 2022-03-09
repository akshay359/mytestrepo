package com.excellarate;

import java.io.File;
import java.io.IOException;

public class SearchInCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
		File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getName());
	}
  catch(Exception e)
  {
	  System.out.println("Something went wrong");
  }
	}
}