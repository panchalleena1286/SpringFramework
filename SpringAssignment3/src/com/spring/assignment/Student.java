package com.spring.assignment;

public class Student {
	
	int studentId;
	String studentName;
	String studentTest;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, String studentTest) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentTest = studentTest;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(String studentTest) {
		this.studentTest = studentTest;
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest;
	}
	
	

}
