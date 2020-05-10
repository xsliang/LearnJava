package com.xsliang;

import java.io.Serializable;

public class Person implements Serializable {
	public long id;
	public String name;
	public Eyes eyes = new Eyes();

	public static class Eyes implements Serializable {
		public String left = "zuoyan";
		public String right = "youyan";
	}

	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + this.id + " name=" + this.name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Person person = (Person) obj;
		if (this.id == person.id && this.name == person.name) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (int) this.id;
	}

	public static void main(String[] args) {
		Person person = new Person(1, "xiaoming");
		System.out.println(person.toString());

		Person person1 = new Person(1, "xiaoming");
		Person person2 = new Person(1, "xiaoming");
		System.out.println("person1 == person2 =" + (person1 == person2));
		System.out.println("person1 equals person2 =" + (person1.equals(person2)));
	}
}
