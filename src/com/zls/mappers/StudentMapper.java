package com.zls.mappers;

import java.util.List;

import com.zls.model.Student;

public interface StudentMapper {

	int add(Student student);
	
	void update(Student student);
	
	void delete(Integer id);
	
	Student findById(Integer id);
	
	List<Student> find();
}
