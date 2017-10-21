package com.zls.service;

import org.apache.ibatis.session.SqlSession;

import com.zls.mappers.StudentMapper;
import com.zls.model.Student;
import com.zls.util.SqlSessionFactoryUtil;

public class StudentTest {
	
	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("张三", 14);
		int result = studentMapper.add(student);
		sqlSession.commit();
		if (result>0) {
			System.out.println("添加成功！！");
		}
	}
}
