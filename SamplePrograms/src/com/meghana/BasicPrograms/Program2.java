package com.meghana.BasicPrograms;


	import java.util.ArrayList;

	public class Program2 {
		public static void main(String[] args) {
			Student s = new Student(1, "mega","phy");
			Student s1 = new Student(2, "ega", "math");
			Student s2 = new Student(3, "ga", "soc");
			Student s3 = new Student(4, "a", "kan");

			ArrayList<Student> studentMinisterDistionary = new ArrayList<Student>(); // generic
			studentMinisterDistionary.add(s);
			studentMinisterDistionary.add(s1);
			
			// this gives error because we cannot insert different type in generic//
	        //studentList.add("narve");//
			studentMinisterDistionary.add(s2);
			studentMinisterDistionary.add(s3);

			for (int i = 0; i <= studentMinisterDistionary.size() - 1; i++) {
	             try {
					Student a = (Student) studentMinisterDistionary.get(i); // type cast object to student convert
	            	System.out.println(i + "th" + " student name is " + a.name);
				}

				catch (Exception e) {
					System.out.println("Error occured while printing student name:" + e.getMessage());
				}
		}
	}
	}
