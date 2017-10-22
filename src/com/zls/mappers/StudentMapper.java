package com.zls.mappers;

import java.util.List;
import java.util.Map;

import com.zls.model.Student;

public interface StudentMapper {

	List<Student> find(Map<Object, Object> map);
	
	List<Student> find2(Map<Object, Object> map);
	
	List<Student> find3(Map<Object, Object> map);
	
	List<Student> find4(Map<Object, Object> map);
	
	List<Student> find5(Map<Object, Object> map);
	
	void update(Student student);
}
