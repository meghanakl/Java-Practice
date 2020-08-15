package com.meghana.BasicPrograms;

import java.util.Scanner;

public class MultiplyTwoNumber
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a = s.nextDouble();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first number");
		double b = s1.nextDouble();

		double Result = MthodToMultiplyNumber(a, b);
		System.out.println("The multiplication of the two numbers is " + Result);

	}


	public static double MthodToMultiplyNumber(double a, double b) {
		double Result = a * b;
    	return Result;

	}
	

}
