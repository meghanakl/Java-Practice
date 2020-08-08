package com.meghana.BasicPrograms;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number");
int a= s.nextInt();

System.out.println("Enter the second number");
int b= s.nextInt();

System.out.println("Enter the third number");
int c= s.nextInt();


AddGivenNumbers( a,b,c);
	}



	public static void AddGivenNumbers(int a,int b,int c) {
		
		int Sum = a+b+c;
		System.out.println("Sum of the given numbers is " + Sum);
	}

	
}
