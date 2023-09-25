package com.naresh.it.course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("python")
@Scope("prototype")
public class CourseDetails {

	private int noOfDays;
	private String courseName;

	public CourseDetails() {
		System.out.println("CourseDetails Instance Created ");
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}