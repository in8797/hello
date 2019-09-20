package com.mycompany.cih;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
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
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height <0)
			this.height = 0;
		else
			this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if(weight<0)
			this.weight = 0;
		else 
			this.weight = weight;
	}
	
}
