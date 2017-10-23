package com.zls.model;

import java.util.List;

public class Grade {

	private int id;
	private String gradeName;
	private List<Student> studentList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", studentList=" + studentList + "]";
	}
	
}