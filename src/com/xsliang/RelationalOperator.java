package com.xsliang;

/**
 * @author My
 *
 */
public class RelationalOperator {
	public static void testRelationalOperator() {
		int value = 10;
		System.out.println("value==10 is " + (value == 10));
		System.out.println("value!=10 is " + (value != 10));
		System.out.println("value!=11 is " + (value != 11));
		System.out.println("value>9 is " + (value > 9));
		System.out.println("value<10 is " + (value < 9));
		System.out.println("value>=10 is " + (value >= 10));
		System.out.println("value<=8 is " + (value <= 8));
	}

	public static void testLogicalOperator() {
		System.out.println();
		System.out.println("logical true && true is " + (true && true));
		System.out.println("logical true && false is " + (true && false));
		System.out.println("logical true || true is " + (true || true));
		System.out.println("logical true || false is " + (true || false));
		System.out.println("logical false || false is " + (false || false));
		System.out.println("logical !true is " + (!true));
		System.out.println("logical !false is " + (!false));

		int i = 10, j = 20;
		System.out.println("logical || short circuit is " + (((i++) > 5) || ((j++) > 2)));
		System.out.println("i=" + i + " j=" + j);
	}

	public static void testBitwiseOperator() {
		int i = 15;
		int j = 11;
		System.out.println();
		System.out.println("i binary is " + Integer.toBinaryString(i));
		System.out.println("j binary is " + Integer.toBinaryString(j));
		System.out.println("i & j = " + (i & j) + ",Binary=" + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + (i | j) + ",Binary=" + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + (i ^ j) + ",Binary=" + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + (~i) + ",Binary=" + Integer.toBinaryString(~i));
		System.out.println("i<<2 = " + (i << 2) + ",Binary=" + Integer.toBinaryString(i << 2));
		System.out.println("i>>2 = " + (i >> 2) + ",Binary=" + Integer.toBinaryString(i >> 2));
		int k = -1;
		System.out.println("-1 Bianry = " + Integer.toBinaryString(k));
		System.out.println("k<<2 = " + (k << 2) + ",Binary=" + Integer.toBinaryString(k << 2));
		System.out.println("k>>2 = " + (k >> 2) + ",Binary=" + Integer.toBinaryString(k >> 2));
		System.out.println("k>>>2 = " + (k >>> 2) + ",Binary=" + Integer.toBinaryString(k >>> 2));
	}

	public static void testConditionOperator() {
		System.out.println();
		System.out.println("condition operation trueCondition = " + (true ? "conditionTrue" : "conditionFalse"));
		System.out.println("condition operation falseCondition = " + (false ? "conditionTrue" : "conditionFalse"));

	}

	public static void testStringOperation() {
		String stringValue = "string value ";
		int i = 1, j = 2;
		System.out.println();
		System.out.println(stringValue + i + j);
		System.out.println(stringValue + (i + j));
		System.out.println(i + j + stringValue);
		stringValue += "add other string ";
		System.out.println(stringValue);

	}

	public static void testConversion() {
		int i = Integer.MAX_VALUE;
		System.out.println();
		System.out.println("max int =" + i);
		short j = (short) i;
		System.out.println("max int to short =" + j);
		long k = (long) i;
		System.out.println("max int to long =" + k);
		float x = (float) i;
		System.out.println("max int to float =" + x);
		double y = (double) i;
		System.out.println("max int to double =" + y);
	}

	public static void testOutRange() {
		int i = Integer.MAX_VALUE;
		System.out.println();
		System.out.println("max int =" + i);
		i = i + 1;
		System.out.println("max int + 1 =" + i);

		int j = Integer.MIN_VALUE;
		System.out.println("min int =" + j);
		j = j - 1;
		System.out.println("min int - 1 =" + j);

		double x = Double.MAX_VALUE;
		System.out.println("max double =" + x);
		x = x + Double.MAX_VALUE;
		System.out.println("max double + max double =" + x);

		double y = -Double.MAX_VALUE;
		System.out.println("-max double =" + y);
		y = y - Double.MAX_VALUE;
		System.out.println("- max double - max double =" + y);

		double z = Double.MIN_VALUE;
		System.out.println("max double =" + z);
		z = z - Double.MIN_VALUE;
		System.out.println("min double - min double =" + y);
	}

	public static void testBoolean() {
		boolean bool = false;
		int i = 1;
		// bool =(boolean)i;
		bool = (i >= 1) ? true : false;
		System.out.println("boolean balue = " + bool);
	}

	public static void testOperation() {
		int i = 6, j = 5;
		int k = i / j;
		System.out.println();
		System.out.println("int i/j = " + k);
		double x = i / j;
		System.out.println("double i/j=" + x);
		double y = (double) i / j;
		System.out.println("double (double)i/j=" + y);
		double z = i * 1.0 / j;
		System.out.println("double i*1.0/j=" + z);
	}

	public static void testIfElse(int num) {
		System.out.println();
		System.out.println("num = " + num);
		if (num < 10) {
			System.out.println("num < 10");
		}

		if (num < 100) {
			System.out.println("num<100");
		} else {
			System.out.println("num>=100");
		}

		if (num < 50) {
			System.out.println("num<50");
		} else if (num >= 50 && num < 100) {
			System.out.println("num>=50 && num<100");
		} else {
			System.out.println("num > 100");
		}

	}

	public enum Color {
		RED, GREEN, BLACK, YELLOW
	}

	public static void testSwitch(Color color) {
		switch (color) {
		case RED:
			System.out.println("color is " + Color.RED);
			break;
		case GREEN:
			System.out.println("color is " + Color.GREEN);
			break;
		case BLACK:
			System.out.println("color is " + Color.BLACK);
			break;
		case YELLOW:
			System.out.println("color is " + Color.YELLOW);
			break;
		default:
			break;
		}
	}

	public static void testFor() {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}

		for (int j : array) {
			System.out.print(j + " ");
		}
	}

	public static void testWhile() {
		System.out.println();
		int[] array = new int[10];
		int i = 0;
		while (i < array.length) {
			array[i] = i;
			i++;
		}

		int j = 0;
		do {
			System.out.print(array[j] + " ");
			j++;
		} while (j < array.length);
	}

	public static void testBreakAndContinue() {
		System.out.println();
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}

		for (int j : array) {
			if (j == 3) {
				continue;
			}
			if (j == 6) {
				break;
			}
			System.out.print(j + " ");
		}

	}
	
	public static void testReturn(int num) {
		System.out.println();
		System.out.println("testRetrun start*******");
		if (num==1) {
			return;
		}
		else if (num==2) {
			try {
				System.out.println("testRetrun try*******");
				return;
			} finally {
				System.out.println("testRetrun finally*******");
			}
		}
		System.out.println("testRetrun end*******");
	}
	
	

	public static void main(String[] args) {
		testRelationalOperator();
		testLogicalOperator();
		testBitwiseOperator();
		testConditionOperator();
		testStringOperation();
		testConversion();
		testOutRange();
		testBoolean();
		testOperation();
		testIfElse(51);
		testSwitch(Color.RED);
		testFor();
		testWhile();
		testBreakAndContinue();
		testReturn(0);
		testReturn(1);
		testReturn(2);
	}
}
