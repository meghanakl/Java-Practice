package com.BasicJava;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int factorial = multiplyNumbers(num);
		System.out.println("Factorial of " + num + " = " + factorial);
	}

	public static int multiplyNumbers(int num) {
		if (num >= 1)
			return num * multiplyNumbers(num - 1);
		else
			return 1;
	}

}
