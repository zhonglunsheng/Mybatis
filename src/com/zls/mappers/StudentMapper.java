package com.zls.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.zls.model.Student;

public interface StudentMapper {
	
	@InsertProvider(type=StudentDynaSqlProvider.class,method="addStudent")
	void add(Student student);
	
	@UpdateProvider(type=StudentDynaSqlProvider.class,method="updateStudent")
	void update(Student student);
	
	@SelectProvider(type=StudentDynaSqlProvider.class,method="findStudent")
	Student findById(Integer id);
	
	@SelectProvider(type=StudentDynaSqlProvider.class,method="findStudents")
	List<Student> findStudents();
	
}
