package com.wipro.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJdbcTest {
	
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
	private static final String username = "root";
	private static final String password = "1QAZ@wsx";
	private static DataSource datasource;
	
	public static DriverManagerDataSource getDataSource() {
		 
		  DriverManagerDataSource dataSource = new DriverManagerDataSource();
		  dataSource.setDriverClassName(driverClassName);
		  dataSource.setUrl(url);
		  dataSource.setUsername(username);
		  dataSource.setPassword(password);
		  return dataSource;	    
	}
	
	public static void getAllDetails() {
		
		JdbcTemplate jdbctemplate = new JdbcTemplate(datasource);
		String sql = "SELECT * FROM students";
		
		RowMapper<Student> rowMapper = new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				int studentId = rs.getInt("student_id");
				String studentName = rs.getString("student_name");
				String studentAddress = rs.getString("student_address");
				
				return new Student(studentId, studentName, studentAddress);
			}
			
		};
		List<Student> listStudents = jdbctemplate.query(sql, rowMapper);
		
		for(Student astudent : listStudents) {
			System.out.println(astudent);
		}
	}
	
	public static void getDetails(int studentId) {
		
		JdbcTemplate jdbctemplate = new JdbcTemplate(datasource);
		String sql = "SELECT * FROM students where student_id ='"+ studentId+"';";
		
		RowMapper<Student> rowMapper = new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				int studentId = rs.getInt("student_id");
				String studentName = rs.getString("student_name");
				String studentAddress = rs.getString("student_address");
				
				return new Student(studentId, studentName, studentAddress);
			}
			
		};
		Student stud = jdbctemplate.queryForObject(sql, rowMapper);
		
		System.out.println(stud);
	}
	
	public static void addStudent(Student student) {
		
		
		JdbcTemplate jdbctemplate = new JdbcTemplate(datasource);
		int studentId = student.getStudentId();
		String studentName = student.getStudentName();
		String studentAdd = student.getStudentAddress();
		
		//String sql = "Insert into students (student_id, student_name, student_address) VALUES '"+studentId+"' '" +studentName+"' '" +studentAdd+"' ;";
		
		int result = jdbctemplate.update("INSERT INTO students (student_id, student_name, student_address) VALUES (?, ?, ?)", studentId, studentName, studentAdd);
		
		if(result>0) {
			System.out.println("A new Student record has been inserted");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		datasource = getDataSource();
		
		System.out.println("------------------------");
		System.out.println("Details of All Students");
		getAllDetails();
		System.out.println("------------------------");
		
		System.out.println("------------------------");
		System.out.println("Details of a Particular Student");
		getDetails(103);
		System.out.println("------------------------");
		
		System.out.println("------------------------");
		Student student = new Student(111, "Leena", "Pune");
		addStudent(student);
		System.out.println("------------------------");
		
	}

}
