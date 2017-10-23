package com.zls.mappers;

import java.util.Map;

import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.jdbc.SQL;

import com.zls.model.Student;

public class StudentDynaSqlProvider {
	
	public String addStudent(final Student student){
		return new SQL(){
			{
				INSERT_INTO("t_student");
				if (student.getName()!=null) {
					VALUES("name", "#{name}");
				}
				if (student.getAge()!=0) {
					VALUES("age", "#{age}");
				}
			}
		}.toString();
	}
	
	public String updateStudent(final Student student){
		return new SQL(){
			{
				UPDATE("t_studnet");
				if (student.getName()!=null) {
					SET("name=#{name}");
				}
				if (student.getAge()!=0) {
					SET("age=#{age}");
				}
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String deleteStudent(){
		return new SQL(){
			{
				DELETE_FROM("t_student");
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String findStudent(){
		return new SQL(){
			{
				SELECT("*");
				FROM("*");
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String findStudents(final Map<String, Object> map){
		return new SQL(){
			{
				SELECT("*");
				FROM("t_student");
				StringBuffer sb=new StringBuffer();
				if(map.get("name")!=null){
					sb.append(" and name like '"+map.get("name")+"'");
				}
				if(map.get("age")!=null){
					sb.append(" and age="+map.get("age"));
				}
				if(!sb.toString().equals("")){
					WHERE(sb.toString().replaceFirst("and", ""));					
				}
			}
		}.toString();
	}
}
