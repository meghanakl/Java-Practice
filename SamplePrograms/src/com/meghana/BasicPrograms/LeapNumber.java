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

	public static boolean CheckLeapNumber(int number) {
		boolean leapyear = false;
		if (number % 100 == 0 && number % 400 == 0) 
		{
			leapyear = true;

		} else if (number % 4 == 0 && number % 100 != 0) 
		{

			leapyear = true;
		}
		return leapyear;
		
	}
}
