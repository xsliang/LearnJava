package com.javadevmap.bean;

public class ProductWithDestoryMethod {
	private int id;
	private String name;

	public ProductWithDestoryMethod() {
		System.out.println("invode method -- Product()");
	}

	public ProductWithDestoryMethod(int id, String name) {
		System.out.println("invode method -- Product(int id,String name)");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("invoke method -- setId");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("invode method -- setName");
		this.name = name;
	}
	
	public void destoryMethod() {
		System.out.println("execute destoryMethod()");
	}
}
