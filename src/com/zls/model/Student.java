package com.zls.model;
/**
 * 
 * @author zhonglunsheng
 *
 */
public class Student {
	private int id;
	private String name;
	private  int age;
	private byte[] pic;
	private String remark;

	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
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
	
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", remark=" + remark + "]";
	}
	
	
}
