package com.xsliang;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String address;
	private String name;
	List<Student> stList = new ArrayList<Student>();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStList() {
		return stList;
	}

	public void setStList(List<Student> stList) {
		this.stList = stList;
	}
	
	public void addStudent(int age,String name) {
		Student student=new Student(age, name);
		addStudent(student);
		/*Student student =new Student();
		student.setAge(age);
		student.setName(name);*/
		//addStudent(student);
		
		
	}
	
	public void addStudent(Student student) {
		stList.add(student);
		
	}
	
	public static void main(String[] args) {
		School school=new School();
		school.setAddress("beijing");
		school.setName("qinghua");
		school.addStudent(18, "xiaosong");
		Student student=new Student();
		student.setAge(19);
		student.setName("daming");
		school.addStudent(student);
		System.out.println(school.getStList().size());
		
	}
}
