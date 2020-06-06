package com.exception;

public class NullPointerException {

	public static void main(String args[]) {
		try {
			String s = null; // null value
			System.out.println(s.charAt(0));
		}

		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}                                  