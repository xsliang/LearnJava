package com.xsliang;

import java.util.ArrayList;
import java.util.List;

public class TempleteTypeErase {
	public static <T> void print(List<T> list) {
		for (T t : list) {
			if (t instanceof Apple) {
				System.out.println("It is an Apple! in foreach");
			} else if (t instanceof Orange) {
				System.out.println("It is an Orange! in foreach");
			} else if (t instanceof Fruit) {
				System.out.println("It is a Fruit! in foreach");
			}
		}
	}

	public static void testExtendWildcard() {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		// List<Fruit> fruits = apples;
		List<? extends Fruit> fruits = apples;
		// fruits.add(new Apple());
		fruits.get(0).print();
	}

	public static void testSuperWildcard() {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		List<? super Apple> apples = fruits;
		apples.add(new Apple());
		((Fruit)apples.get(0)).print();
	}

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		fruits.add(new Orange());
		for (Fruit fruit : fruits) {
			fruit.print();
		}

		print(fruits);
	}
}
