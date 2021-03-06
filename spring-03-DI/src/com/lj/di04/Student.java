package com.lj.di04;

public class Student {
	
	private String name;
	private int age;
	private School school;
	
	
	//即使没有无参构造器  也能通过对应的方式获取
	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
}
