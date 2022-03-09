package com.excellarate;
import java.io.*;
public class Isdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String location="/";
File fs=new File(location);
String[] folder=fs.list();
for(int i=0;i<folder.length;i++)
{
	String isdir=folder[i];
	File dir=new File(isdir);
	if(dir.isDirectory())
	{
		System.out.println(dir.getName());
	}
}
		
	}

}
