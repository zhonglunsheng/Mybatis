package com.zls.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
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
		Student student = new Student(1, "张三2", 23);
		byte[] pic = null;
		try {
			File file = new File("c://1.jpg");
			InputStream inputStream = new FileInputStream(file);
			pic = new byte[inputStream.available()];
			inputStream.read(pic);
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		student.setPic(pic);
		student.setRemark("个人简历。。。。");
		studentMapper.add(student);
	}
	
	@Test
	public void testFindStudent() {
		logger.info("查找学生信息");
		Student student = studentMapper.findById(12);
		byte[] pic = student.getPic();
		try {
			File file = new File("F://1.jpg");
			OutputStream outPutStream = new FileOutputStream(file);
			outPutStream.write(pic);
			outPutStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(student);
	}
	
	@Test
	public void testFindStudents() {
		logger.info("查找学生信息");
		int offset=0,limit=3;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<Student> students = studentMapper.findStudents(rowBounds);
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
	
	@Test
	public void testFindStudents2() {
		logger.info("查找学生信息");
		Map<Object, Object> map = new HashMap<Object,Object>();
		map.put("start", 0);
		map.put("pageSize", 3);
		List<Student> students = studentMapper.findStudents2(map);
		for (Student student : students) {
			System.out.println(student);
		}	
	}
}
