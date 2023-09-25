package com.tek.teacher;

public class Student
{
	private String studentName;
	private String studentId;
	private String studentBranch;
	
	
	public Student() {}
	
	public Student(String studentName, String studentId, String studentBranch) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentBranch = studentBranch;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	
}
