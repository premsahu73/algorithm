package com;

public class Student {

	private Integer id;
	private String Name;
	
	public Student() {
		super();
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
