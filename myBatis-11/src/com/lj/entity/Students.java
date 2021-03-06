package com.lj.entity;

public class Students {
	private Integer id;
	private String name ;
	private int age;
	private double score;
	


	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Students(Integer id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
	
}
