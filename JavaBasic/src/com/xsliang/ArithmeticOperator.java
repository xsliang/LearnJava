package com.xsliang;

public class ArithmeticOperator {
	public static void testArithmeticOperator() {
		int i = 123;
		int j = 5;
		System.out.println("i+j=" + (i + j));
		System.out.println("i-j=" + (i - j));
		System.out.println("i*j=" + (i * j));
		System.out.println("i/j=" + (i / j));
		System.out.println("i%j=" + (i % j));
		System.out.println("i++=" + (i++));
		System.out.println("i=" + i);
		System.out.println("++i=" + (++i));
		System.out.println("i=" + i);
		System.out.println("i--=" + (i--));
		System.out.println("i=" + (i));
		System.out.println("--i=" + (--i));
		System.out.println("i=" + (i));

		int sum = i + j;
		System.out.println("sum=" + sum);
		i += j;
		System.out.println("i+=j=" + i);
	}

	public static void main(String[] args) {
		testArithmeticOperator();
	}
}
