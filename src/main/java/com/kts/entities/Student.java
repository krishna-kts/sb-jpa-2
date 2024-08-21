package com.kts.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "student_data")
public class Student {
	@Id
	private Integer studentRno;
	//@Column(name = "name")
	private String studentName;
	private String studentCourse;
	private Double studentFees;
	private String studentLocation;
	
	
	
	public int getStudentRno() {
		return studentRno;
	}
	public void setStudentRno(int studentRno) {
		this.studentRno = studentRno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	public String getStudentLocation() {
		return studentLocation;
	}
	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}
	@Override
	public String toString() {
		return "Student [studentRno=" + studentRno + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", studentFees=" + studentFees + ", studentLocation=" + studentLocation + "]";
	}
	
	
	
}
