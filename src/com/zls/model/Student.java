package com.zls.model;
/**
 * 
 * @author zhonglunsheng
 *
 */
public class Student {
	public int id;
	public String name;
	public int age;

	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
