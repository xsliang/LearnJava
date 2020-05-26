package com.xsliang;

public class CustomTemplete<T extends PrintInterface<T>> {
	public T data;
	
	public void print() {
		data.print();
	}
	
	public static void main(String[] args) {
		CustomTemplete<Tomato> customTemplete=new CustomTemplete<>();
		//customTemplete.data=new Tomato();
		customTemplete.print();
	}
}
