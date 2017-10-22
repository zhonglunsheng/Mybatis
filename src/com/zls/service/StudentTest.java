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
	public void testAdd() {
		logger.info("添加学生信息");
		Student student = new Student("张三", 14);
		studentMapper.add(student);
	}
	
	@Test
	public void testUpdate(){
		logger.info("修改学生信息");
		Student student = new Student(2,"张三",45);
		studentMapper.update(student);
	}
	
	@Test
	public void testDelete(){
		logger.info("删除学生信息");
		studentMapper.delete(2);
	}
	
	@Test
	public void testFindById(){
		logger.info("查找学生信息");
		Student student = studentMapper.findById(1);
		System.out.println(student);
	}
	
	@Test
	public void testFind(){
		logger.info("查找学生所有信息");
		List<Student> studentList = studentMapper.find();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindByIdWithAddress(){
		logger.info("查找学生含地址所有信息");
		Student student = studentMapper.findByIdWithAddress(4);
		System.out.println(student);
	}

}
