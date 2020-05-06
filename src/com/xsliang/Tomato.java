package com.xsliang;

public class Tomato implements PrintInterface<Tomato> {
	@Override
	public void print() {
		System.out.println("This is Tomato!");
	}
}
