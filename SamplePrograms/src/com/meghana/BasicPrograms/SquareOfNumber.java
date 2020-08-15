package com.meghana.BasicPrograms;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt(); 

		int Square= SquareOfNumber( a);
		System.out.println( "The square of the number is "+Square);
	}
	
	public static int SquareOfNumber(int a)
	{
		int b= a*a;
		return b ;
	}

}
