package com.meghana.BasicPrograms;

public class objectCountMain {
          
	public static void main(String[] args) {
		objectCount o1 = new objectCount("o1");
		objectCount o2= new objectCount("o2");
		objectCount o3 = new objectCount("o3");

		System.out.println("Number of object created is " + o1.NoOfObjectsCreated);
		System.out.println("Number of object created is " + o2.NoOfObjectsCreated);
		System.out.println("Number of object created is " + o3.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o1.Name);
		System.out.println("size of the object is"+o1.size);
		System.out.println("Number of object created is"+o1.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o2.Name);
		System.out.println("size of the object is"+o2.size);
		System.out.println("Number of object created is"+o2.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o3.Name);
		System.out.println("size of the object is"+o3.size);
		System.out.println("Number of object created is"+o3.NoOfObjectsCreated);
	}

}


