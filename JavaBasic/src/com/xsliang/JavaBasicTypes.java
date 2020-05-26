package com.xsliang;

public class JavaBasicTypes {
	static char charval;
	static byte bytecal;
	static short shortval;
	static int intval;
	static long longval;
	static float floatval;
	static double doubleval;

	public static void basicTypesRange() {
		// char 便于展示范围，所以做了类型转换
		System.out.println("char size=" + Character.SIZE);
		System.out.println("char min=" + (int)Character.MIN_VALUE);
		System.out.println("char max=" + (int)Character.MAX_VALUE);
		System.out.println("char default=" + (int)charval);
		// byte
		System.out.println("byte size=" + Byte.SIZE);
		System.out.println("byte min=" + (int)Byte.MIN_VALUE);
		System.out.println("byte max=" + (int)Byte.MAX_VALUE);
		System.out.println("byte default=" + (int)bytecal);	
		// short
		System.out.println("short size=" + Short.SIZE);
		System.out.println("short min=" + (int)Short.MIN_VALUE);
		System.out.println("short max=" + (int)Short.MAX_VALUE);
		System.out.println("short default=" + (int)shortval);		
		// int
		System.out.println("int size=" + Integer.SIZE);
		System.out.println("int min=" + Integer.MIN_VALUE);
		System.out.println("int max=" + Integer.MAX_VALUE);
		System.out.println("int default=" + intval);
		// long
		System.out.println("long size=" + Long.SIZE);
		System.out.println("long min=" + Long.MIN_VALUE);
		System.out.println("long max=" + Long.MAX_VALUE);
		System.out.println("long default=" + longval);	
		// float
		System.out.println("float size=" + Float.SIZE);
		System.out.println("float min=" + Float.MIN_VALUE);
		System.out.println("float max=" + Float.MAX_VALUE);
		System.out.println("float default=" + floatval);	
		// double
		System.out.println("double size=" + Double.SIZE);
		System.out.println("double min=" + Double.MIN_VALUE);
		System.out.println("double max=" + Double.MAX_VALUE);
		System.out.println("double default=" + doubleval);			
	}
	
	public static void main(String[] args) {
		basicTypesRange();
	}
}
