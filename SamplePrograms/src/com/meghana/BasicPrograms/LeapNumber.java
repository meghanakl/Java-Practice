package com.meghana.BasicPrograms;

import java.util.Scanner;

public class LeapNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		 CheckLeapNumber(a);
	}

	public static void CheckLeapNumber(int number) {
		if (number % 100 == 0 && number % 400 == 0) {
			System.out.println("The given " + number + " is leap number");
		} else {
			System.out.println("The given " + number + " is not a leap number");

		}
	} 
	
	
	
}
