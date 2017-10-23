package com.zls.mappers;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zls.model.Grade;

public interface GradeMapper {

	@Select("select * from t_grade where id=#{id}")
	@Results(
			{
				@Result(id=true,column="id",property="id"),
				@Result(column="gradeName",property="gradeName"),
				@Result(column="id",property="studentList",many=@Many(select="com.zls.mappers.StudentMapper.findById"))
			}
			)
	Grade findById(Integer id);
}
