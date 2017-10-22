package com.zls.service;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zls.mappers.GradeMapper;
import com.zls.mappers.StudentMapper;
import com.zls.model.Grade;
import com.zls.model.Student;
import com.zls.util.SqlSessionFactoryUtil;

public class GradeTest {

	private static Logger logger = Logger.getLogger(Student.class);
	private GradeMapper gradeMapper = null;
	private SqlSession sqlSession= null; 
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		gradeMapper=sqlSession.getMapper(GradeMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void testFindStudentWithGrade() {
		logger.info("查找年纪（带学生）");
		Grade grade = gradeMapper.findById(1);
		System.out.println(grade);
	}

}
