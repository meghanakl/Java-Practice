package com.meghana.numeric;

import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");

		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		if (number % 7 == 0 && number % 120 == 0) {
			System.out.println("The number is divisible by both 7 and 120");
		}
		else if (number % 7 == 0) {
			System.out.println("The number is divisible by only by 7");

		}
		else if (number % 120 == 0) {
			System.out.println("The number is divisible by only by 120");
		}

		else {
			System.out.println("The number is not divisible by 7 and 120");
		}
	}
}
