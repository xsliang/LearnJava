package com.xsliang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaArray {
	public static void testDirectConArray() {
		String[] strings = { "lilei", "hanmeimei", "lucy" };
		System.out.println("array length = " + strings.length);
		System.out.println(Arrays.asList(strings));
		// C#不能这样直接打印list
		List<String> list = new ArrayList<String>();
		list.add("xsl");
		list.add("xhj");
		System.out.println(list.toString());

	}

	public static void testNewConArray() {
		String[] strings = new String[5];
		strings[0] = "A";
		strings[1] = "B";
		strings[2] = "C";
		strings[3] = "D";

		System.out.println("array length = " + strings.length);
		System.out.println(Arrays.asList(strings));

	}

	public static void testTdimArray() {
		String[][] strings = { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" } };
		// C#写法 String[,]
		for (String[] tempStrings : strings) {
			System.out.println(Arrays.asList(tempStrings));
		}
	}

	public static void testNewTdimArray() {
		String[][] strings = new String[2][];
		strings[0] = new String[2];
		strings[1] = new String[4];
		strings[0][0] = "up";
		strings[0][1] = "down";
		strings[1][0] = "east";
		strings[1][1] = "south";
		strings[1][2] = "west";
		strings[1][3] = "north";
		for (String[] tempStrings : strings) {
			System.out.println(Arrays.asList(tempStrings));
		}
	}

	public static void testArrayList() {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove("four");
		System.out.println(list);
		System.out.println("list contains is " + list.contains("one"));
		list.add("five");
		list.set(3, "four");
		System.out.println(list);
		System.out.println("list index of two is " + list.indexOf("two"));
		System.out.println("sub list is " + list.subList(1, 3));
		System.out.println(list.size());
		if (!list.isEmpty()) {
			Object[] strings = list.toArray();
			System.out.println("array length is" + strings.length);
		}
	}

	public static void testLinkedList() {
		String[] strings = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		List<String> list = new LinkedList<String>();
		list.addAll(Arrays.asList(strings));
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = it.next();
			if (string == "three" || string == "six" || string == "nine") {
				it.remove();
			}

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		testDirectConArray();
		testNewConArray();
		testTdimArray();
		testNewTdimArray();
		testArrayList();
		testLinkedList();
	}
}
