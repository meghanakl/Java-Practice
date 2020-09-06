package com.meghana.BasicPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class Program5 {

	public static void main(String[] args) {
		  Student S= new ScienceStudent(1,"a","p");
		  Student S1= new ScienceStudent(2,"b","c");
		  Student C= new CommerceStudent(3,"c","m");
		  Student C1= new CommerceStudent(4,"d","d");
		  
		
		ArrayList<Student> studentList = new ArrayList<Student>(); // generic
		studentList.add(S); // new Science student
		studentList.add(S1);
		studentList.add(C);
		studentList.add(C1);
		
		
		
		
	//	studentList.add(s1);
		// this gives error because we cannot insert different type in generic//
		// studentList.add("narve");//
	//	studentList.add(s2);
	//	studentList.add(s3);

		for (int i = 0; i <= studentList.size() - 1; i++) {
		//	try {
			//	Student a = (Student) studentList.get(i); // type cast object to student convert
		//		System.out.println(i + "th" + " student name is " + a.name);
		//	}
        System.out.println("fees is" +S.calcualteFee());
        System.out.println("id is"+S.id);
        
        System.out.println("name is"+S.name);
        
        System.out.println("branch is"+S.branch);
        
        System.out.println("fees is" +C.calcualteFee());
        System.out.println("id is"+C.id);
        
        System.out.println("name is"+C.name);
        
        System.out.println("branch is"+C.branch);
        
        
		//	catch (Exception e) {
			//	System.out.println("Error occured while printing student name:" + e.getMessage());
			}
		}
	

}






















