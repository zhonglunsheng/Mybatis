package com.zls.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public void testFindStudent() {
		logger.info("添加学生信息");
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("searchBy", "name");
		map.put("name", "%李%");
		map.put("gradeId", 1);
		map.put("age", 35);
		List<Student> students = studentMapper.find2(map);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudent2() {
		logger.info("添加学生信息");
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "%李%");
		map.put("gradeId", 1);
		map.put("age", 35);
		List<Student> students = studentMapper.find3(map);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudent3() {
		logger.info("添加学生信息");
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "%李%");
		map.put("gradeId", 1);
		//map.put("age", 35);
		List<Student> students = studentMapper.find4(map);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudent4() {
		logger.info("添加学生信息");
		Map<Object, Object> map = new HashMap<Object,Object>();
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(1);
		gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		List<Student> students = studentMapper.find5(map);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudent5() {
		logger.info("添加学生信息");
		Student student = new Student(1, "张三2", 23);
		studentMapper.update(student);
	}
}
