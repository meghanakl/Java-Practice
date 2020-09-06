package com.meghana.BasicPrograms;

import java.util.ArrayList;

public class Main {// generic example is a

	public static void main(String[] args) {

		Student s = new Student(1, "mega", "phy");
		Student s1 = new Student(2, "ega", "math");
        Student s2 = new Student(3, "ga", "soc");
		Student s3 = new Student(4, "a", "kan");

		ArrayList studentList = new ArrayList(); // collection, ///<> is only for (geniic one type matra hakodh)
		studentList.add(s);
		studentList.add(s1);
		studentList.add("narve");// not convertted to student so error. error shows exception
		studentList.add(s2);
		studentList.add(s3);
 
		
		for (int i = 0; i <= studentList.size()-1; i++)

			try {
				Student a = (Student) studentList.get(i);// type cast object to student convert

				System.out.println(i+"th"+" student name is " + a.name);
			}

			catch (Exception e) {
				System.out.println("Error occured while printing student name:" + e.getMessage());
			}
	}
}
