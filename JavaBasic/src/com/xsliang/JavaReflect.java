package com.xsliang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JavaReflect {
	public long num = 123456;
	public String name = "xiaoming";

	@Override
	public String toString() {
		return "num=" + num + "/name=" + name;
	}

	public void print() {
		System.out.println(toString());
	}

	public void set(long num, String name) {
		this.num = num;
		this.name = name;
	}

	private void privatefun() {
		System.out.println("private fun");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			System.out.println("Hello,Akina!");
	        System.out.println("\033[30;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[31;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[32;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[33;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[34;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[35;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[36;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[37;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[40;31;4m" + "Hello,Akina! bg black text red" + "\033[0m");
	        System.out.println("\033[41;32;4m" + "Hello,Akina! bg red text green" + "\033[0m");
	        System.out.println("\033[42;33;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[43;34;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[44;35;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[45;36;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[46;37;4m" + "Hello,Akina!" + "\033[0m");
	        System.out.println("\033[47;4m" + "Hello,Akina!" + "\033[0m");
			
			Class reClass = JavaReflect.class;
			Class reClass2=Class.forName("com.xsliang.JavaReflect");
			
			if (reClass==reClass2) {
				System.out.println("class is single");
			}
			
			Field[] fields=reClass.getFields();
			System.out.println("fields:" + Arrays.asList(fields));
			
			Method[] methods=reClass.getMethods();
			System.out.println("methods:"+Arrays.asList(methods));
			
			Constructor[] constructors=reClass.getConstructors();
			System.out.println("constructors:"+Arrays.asList(constructors));
			
			Object reObject=reClass.newInstance();
			Method method=reClass.getMethod("print");
			method.invoke(reObject, null);
			
			method=reClass.getMethod("set",long.class,String.class);
			method.invoke(reObject, 234567,"daming");
			
			method=reClass.getMethod("print");
			method.invoke(reObject, null);
			
			method=reClass.getDeclaredMethod("privatefun");
			method.setAccessible(true);
			method.invoke(reObject, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
