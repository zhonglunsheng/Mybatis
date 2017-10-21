package com.zls.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.zls.mappers.StudentMapper;
import com.zls.model.Student;
import com.zls.util.SqlSessionFactoryUtil;

public class StudentTest {
	public static Logger logger = Logger.getLogger(Student.class);
	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("张三", 14);
		int result = studentMapper.add(student);
		sqlSession.commit();
		if (result>0) {
			logger.info("添加成功");
		}
	}
}
