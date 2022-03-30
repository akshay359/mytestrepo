package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {

	public int insert(Student student);

	public int change(Student student);

	public int delete(int stud);
	public Student getStudent(int studid);
	public List<Student> getAllStudents();
	
}
