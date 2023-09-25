package com.tek.teacher;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentId;
	private String studentName;

	public Student() {
		System.out.println("Object created :0-param");
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
