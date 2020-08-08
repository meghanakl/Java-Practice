package com.meghana.BasicPrograms;

import java.util.Scanner;

public class EvenOrOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		CheckEvenOrOdd( a);  
	}

	public static void CheckEvenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("The given" + a + "number is even");
		}

		else {
			System.out.println("The given " + a + " number is odd");
		}
	}
}
