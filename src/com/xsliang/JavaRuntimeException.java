package com.xsliang;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JavaRuntimeException {
	public static void testDivisor() {
		try {
			int i = 6 / 0;
			System.out.println("i=" + i);
		} catch (Exception e) {
			System.out.println("divisor can not be 0");
		}
	}

	public static void testNullPoint() {
		Person person = null;
		System.out.println(person.id);
	}

	public static void testArrayRemove() {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		int index = 0;
		for (String string : list) {
			System.out.println(string);
			index++;
			if (index == 1) {
				list.remove(index);
			}
		}
	}

	public static String readFile() {
		boolean bool = true;
		StringBuilder builder = new StringBuilder();
		try {
			FileReader fReader = new FileReader("d:\\test.txt");
			char[] cs = new char[10];
			while (fReader.read(cs) != -1) {
				builder.append(cs);
				cs = new char[10];
			}
			fReader.close();
		} catch (Exception e) {
			bool = false;
			e.printStackTrace();
		} finally {
			if (bool) {
				System.out.println("read file ok!");
			} else {
				System.out.println("read file fail!");
				builder.replace(0, builder.length(), "fail");
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		// testDivisor();
		// testNullPoint();
		// testArrayRemove();
		System.out.println(readFile());
	}
}
