package com.xsliang;

public class CustomExceptionDemo {
	public static void testRuntimeException() {
		throw new CustomRuntimeException();
	}
	
	public static void testException() throws CustomException{
		throw new CustomException();
	}
	
	public static void main(String[] args) {
		try {
			//testException();
			//testRuntimeException();
		}
		catch (CustomRuntimeException e) {
			System.out.println("catch CustomRuntimeException");
		}
//		catch (CustomException e) {
//			System.out.println("catch CustomException");
//		}
		catch (Exception e) {
			System.out.println("catch Exception");
		}
	}
}
