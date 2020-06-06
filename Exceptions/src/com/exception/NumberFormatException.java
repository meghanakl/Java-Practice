package com.exception;

public class NumberFormatException {
	public static void main(String args[]) {
		try {

			int a = Integer.parseInt(null);

		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}