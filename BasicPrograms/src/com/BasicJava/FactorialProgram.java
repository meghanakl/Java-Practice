package com.BasicJava;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();

		int fac = 1;
		for (int i = a; i >= 1; i--) {
			fac = fac * i;
		}
		System.out.println("The factorial of " + a + " is " + fac);
	}

}
