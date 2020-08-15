package com.meghana.BasicPrograms;

import java.util.Scanner;

public class FindOvelOrConsonent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char a = s.next().charAt(0);
		FindOvelOrConsonent(a);
	}

	public static void FindOvelOrConsonent(char c)
	{
		if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c== 'A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("The given char is Ovel");
		}
			else {
				System.out.println("The given char is not a Ovel");
			}
	}
}
		
	



