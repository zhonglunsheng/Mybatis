package com.zls.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.zls.model.Student;

public interface StudentMapper {

	void add(Student student);
	
	Student findById(Integer id);
	
	List<Student> findStudents(RowBounds rowBounds);
	
	List<Student> findStudents2(Map<Object, Object> map);
}
