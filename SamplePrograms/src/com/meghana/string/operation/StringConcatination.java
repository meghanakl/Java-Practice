package com.meghana.string.operation;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the number string");
	Scanner s = new Scanner(System.in);
	String[] String = new String[ s.nextInt()];
	s.nextLine();
	
	
	for (int i=0;i<=String.length;i++) {
		String[i] = s.nextLine();
	}

	}

	public static String Concate(String s1, String s2) {

		return  s1 + s2;
		
		
	 
	}
}
