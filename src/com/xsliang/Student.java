package com.xsliang;

public class Student {
	private int age = 18;
	private String name = "todo";

	private static int count = 0;

	public static int getCount() {
		return count;
	}

	public Student() {
		count++;
		this.age = 0;
		this.name = "todo";
	}

	public Student(int age, String name) {
		count++;
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Student student = new Student();
		}
		System.out.println("student count="+Student.getCount());
		

	}
}
