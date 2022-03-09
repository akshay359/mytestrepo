package com.excellarate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.io.File;

class MymainJob implements Runnable {
	// static int count=1;
	String dir;
	String name;

	MymainJob(String dir, String name) // -->passing directory
	{
		this.dir = dir;
		this.name = name;
	}

	public void run() {
		String subloc = "/" + dir; // -->sub files location
		File subfile = new File(subloc);
		String[] sublist = subfile.list();// listing subfiles
		for (int j = 0; j < sublist.length; j++) {
			String match = sublist[j];
			//
			if (match.equals(name)) // if given file matches the list traversel then print file name and location
			{
				double size=match.length();
				File mm = new File(match);
				System.out.println("File Founded-->" + mm.getName() + "\n" + "File path-->" + mm.getAbsolutePath()+"\n"+"File size in Byte--->"+size);
				break;
			}
		}
	}
}

public class ExecutorThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.print("*Instructions*" + "\n");
		System.err.println("->Enter proper name with extention." + "\n"
				+ "->If no result occur that means you have entered wrong file name or your file is not in system!!.");
		String file;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n" + "enter file name for search:"); // taking input from user
		file = sc.nextLine();
		sc.close();
		int n = 2;
		ExecutorService es = Executors.newFixedThreadPool(n); // create executor service to create threads

		String location = "/"; // drive path

		File main = new File(location);

		String[] list = main.list(); // listing all directories

		for (int i = 0; i < list.length; i++) {
			String passdir = list[i];
			if (passdir.equals(file)) {
				File check = new File(passdir);
				double bytes=file.length();
			
				System.out.println(
						"File Founded--->" + check.getName() + "\n" + "File Path--->" + check.getAbsolutePath()+"\n"+"File size in Byte--->"+bytes);
				break;
			}
			Runnable task = new MymainJob(passdir, file); // passing directories to MymainJob constructor
			es.submit(task);
		}
		es.shutdown(); // executor terminate the tasks
		// MymainJob.check();
	}
}
