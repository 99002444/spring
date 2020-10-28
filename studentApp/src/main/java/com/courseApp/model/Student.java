package com.courseApp.model;

import org.springframework.stereotype.Component;

@Component 
public class Student {

	Integer studentID;
	String name, dept;
	int age;
	Address addr;
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentID, String name, String dept, int age, Address addr) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", dept=" + dept + ", age=" + age + ", addr="
				+ addr + "]";
	}
	
	
}
