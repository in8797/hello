package com.dbpackage.model;

public class Student {
	String stuNo;
	String name;
	String major;
	public Student(String stuNo, String name, String major) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.major = major;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

}
