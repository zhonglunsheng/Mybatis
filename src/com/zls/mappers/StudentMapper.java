package com.zls.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zls.model.Student;

public interface StudentMapper {
	
	@Insert("insert into t_student values(null,#{name},#{age})")
	void add(Student student);
	
	@Update("update t_student set name=#{name},age=#{age}")
	void update(Student student);
	
	@Select("select * from t_student where id=#{id}")
	Student findById(Integer id);
	
	@Select("select * from t_student")
	@Results(
			{
				@Result(id=true,column="id",property="id"),
				@Result(column="name",property="name"),
				@Result(column="age",property="age")
				
			}
			)
	List<Student> findStudents();
	
}
