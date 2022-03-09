package com.excellarate;
//import java.util.*;
import java.io.*;
import java.util.*;
public class FileSearching {
	static String ss;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		        File directory = new File("/");
		        String[] flist = directory.list();
		        int flag = 0;
		        if (flist == null) {
		            System.out.println("Empty directory.");
		        }
		        else {
		            for (int i = 0; i < flist.length; i++) {
		                String filename = flist[i];
		                if (filename.equalsIgnoreCase("aks"))
		                {
		                	File fs=new File(filename);
		          
		                    System.out.println(filename+ " found"+fs.getAbsolutePath());
		                    flag = 1;
		                }
		            }
		        
		  
		        if (flag == 0) {
		            System.out.println("File Not Found");
		        }
		        }
		    }
		
   }
