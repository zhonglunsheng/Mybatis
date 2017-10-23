package com.zls.service;
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

public class StudentTest {
	private static Logger logger = Logger.getLogger(Student.class);
	private StudentMapper studentMapper = null;
	private GradeMapper gradeMapper = null;
	private SqlSession sqlSession= null; 
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper=sqlSession.getMapper(StudentMapper.class);
		gradeMapper=sqlSession.getMapper(GradeMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	
	@Test
	public void testAddStudent() {
		logger.info("���ѧ����Ϣ");
		Student student = new Student("С��", 15);
		studentMapper.add(student);
	}
	
	@Test
	public void testUpdateStudent() {
		logger.info("�޸�ѧ����Ϣ");
		Student student = new Student("С��", 13);
		studentMapper.update(student);
	}
	
	@Test
	public void testFindStudent() {
		logger.info("�޸�ѧ����Ϣ");
		Student student = studentMapper.findById(1);
		System.out.println(student);
	}
	
	@Test
	public void testFindStudents() {
		logger.info("�޸�ѧ����Ϣ");
		List<Student> students = studentMapper.findStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudentWithAddress() {
		logger.info("����ѧ����Ϣ����ַ");
		Student student = studentMapper.findStudentWithAddressAndGrade(1);
		System.out.println(student);
	}
	
	@Test
	public void testFindGradeWithStudent() {
		logger.info("���������Ϣ��ѧ��");
		Grade grade = gradeMapper.findById(1);
		System.out.println(grade);
	}
	
	@Test
	public void testFindStudentWithGrade() {
		logger.info("����ѧ����Ϣ���꼶");
		Student student = studentMapper.findStudentWithAddressAndGrade(1);
		System.out.println(student);
	}
}
