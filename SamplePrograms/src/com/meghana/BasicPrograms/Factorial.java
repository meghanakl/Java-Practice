package com.meghana.BasicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, Number;
		long Factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter any number to Find Factorial: ");
		Number = sc.nextInt();

		for (i = 1; i <= Number; i++) {
			Factorial = Factorial * i;
		}
		System.out.format("\nFactorial of %d = %d\n", Number, Factorial);
	}
}
