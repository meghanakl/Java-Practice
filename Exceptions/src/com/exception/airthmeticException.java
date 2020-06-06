package com.exception;

public class airthmeticException {

	public static void main(String[] args) {
		try {
			int num1;
			int num2;

			num1 = 0;
			num2 = 10 / num1;

			System.out.println(num2);

		} // try block end
		catch (ArithmeticException e) {

			System.out.println(" Number is not divide by zero");
		} catch (Exception e) {
			System.out.println("Exception occurred");

		}
	}
}
