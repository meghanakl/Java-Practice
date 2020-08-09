package com.meghana.BasicPrograms;

public class objectCountMain {
          
	public static void main(String[] args) {
		objectCount o = new objectCount("o");
		objectCount o1 = new objectCount("o1");
		objectCount o2 = new objectCount("o2");

		System.out.println("Number of object created is " + o.NoOfObjectsCreated);
		System.out.println("Number of object created is " + o1.NoOfObjectsCreated);
		System.out.println("Number of object created is " + o2.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o.Name);
		System.out.println("size of the object is"+o.size);
		System.out.println("Number of object created is"+o.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o1.Name);
		System.out.println("size of the object is"+o1.size);
		System.out.println("Number of object created is"+o1.NoOfObjectsCreated);
		
		System.out.println("Name of the object is"+o2.Name);
		System.out.println("size of the object is"+o2.size);
		System.out.println("Number of object created is"+o2.NoOfObjectsCreated);
	}

}

