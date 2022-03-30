package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into  student(id,name,city) values (?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public int change(Student student) {

		String query = "update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int studentid) {
		String query = "delete from  student where id=?";
		int r = this.jdbcTemplate.update(query, studentid);
		return r;
	}

	public Student getStudent(int studid) {
	 String query="select * from student where id =?";
	 RowMapper< Student> rowMapper=new RowMapperImple();
	  Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studid);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student > students = this.jdbcTemplate.query(query, new RowMapperImple());
		return students;
	}
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

}
