


	import java.util.ArrayList;

import com.meghana.BasicPrograms.Student;

	public class Program1  {
		public static void main(String[] args) {
			Student s = new Student(1, "mega", "phy");
			Student s1 = new Student(2, "ega", "math");
			Student s2 = new Student(3, "ga", "soc");
			Student s3 = new Student(4, "a", "kan");

			ArrayList<Student> studentList = new ArrayList<Student>(); // generic
			studentList.add(s);
			studentList.add(s1);
			// this gives error because we cannot insert different type in generic//
	        //studentList.add("narve");//
			studentList.add(s2);
			studentList.add(s3);

			for (int i = 0; i <= studentList.size() - 1; i++) {
	             try {
					Student a = (Student) studentList.get(i); // type cast object to student convert
	            	System.out.println(i + "th" + " student name is " + a.name);
				}

				catch (Exception e) {
					System.out.println("Error occured while printing student name:" + e.getMessage());
				}
		}
	}
	}

	
	
	

