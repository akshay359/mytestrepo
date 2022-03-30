package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
//import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		// JdbcTemplate template = context.getBean("jdbctemplate",JdbcTemplate.class);

		//
		// int result = template.update(query,4,"kiran","pune");
		// System.out.println("number of record inserted:"+result);
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
        Student student=new Student();
        student.setId(5);
        student.setName("john");
        student.setCity("delhi");
////        
     int result = studentDao.insert(student);  
      System.out.println("student added:"+result);
//       
//       Student student=new Student();
//       student.setId(666);
//       student.setName("jack");
//       student.setCity("london");
//       
//       int result = studentDao.change(student);
////       System.out.println("updated record:"+result);
//		System.out.println("enter number id for delete");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		Student student = new Student();
//		sc.close();
//		int result = studentDao.delete(n);
//		System.out.println("record deleted:" + result);
//		Student stud = studentDao.getStudent(3);
//	     
//		System.out.println("displayed records:"+stud);
		
		List<Student> students = studentDao.getAllStudents();
		for(Student s:students)
		{
			System.out.println(s);
		}
	}
}
