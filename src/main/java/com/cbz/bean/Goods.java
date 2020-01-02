package com.cbz.bean;

public class Goods {
	private int id;
	
	private String name;
	
	private String sex;
	
	private String age;
	
	private String file;

	public Goods() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", file=" + file + "]";
	}
	
	

}
