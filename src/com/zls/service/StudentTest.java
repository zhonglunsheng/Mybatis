package com.zls.service;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zls.mappers.StudentMapper;
import com.zls.model.Student;
import com.zls.util.SqlSessionFactoryUtil;

public class StudentTest {
	private static Logger logger = Logger.getLogger(Student.class);
	private StudentMapper studentMapper = null;
	private SqlSession sqlSession= null; 
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	
	@Test
	public void testAddStudent() {
		logger.info("添加学生信息");
		Student student = new Student("小明", 15);
		studentMapper.add(student);
	}
	
	@Test
	public void testUpdateStudent() {
		logger.info("修改学生信息");
		Student student = new Student("小明", 13);
		studentMapper.update(student);
	}
	
	@Test
	public void testFindStudent() {
		logger.info("修改学生信息");
		Student student = studentMapper.findById(1);
		System.out.println(student);
	}
	
	@Test
	public void testFindStudents() {
		logger.info("修改学生信息");
		List<Student> students = studentMapper.findStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
