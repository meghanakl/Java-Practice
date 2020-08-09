package com.meghana.BasicPrograms;

public class objectCountMain {
          
	public static void main(String[] args) {
		objectCount o1 = new objectCount("o1");
		o1.size=124;
		System.out.println("Name of the object is"+o1.Name);
		System.out.println("size of the object is"+o1.size);
		  System.out.println("Number of object created is"+o1.NoOfObjectsCreated);
			
		objectCount o2= new objectCount("o2");
		System.out.println("Name of the object is"+o2.Name);
		System.out.println("size of the object is"+o2.size);
		  System.out.println("Number of object created is"+o2.NoOfObjectsCreated);
			
			
		objectCount o3 = new objectCount("o3");
		System.out.println("size of the object is"+o3.size);
		System.out.println("Name of the object is"+o3.Name);
		System.out.println("Number of object created is"+o3.NoOfObjectsCreated);
		 

		System.out.println("Number of object created is " + o1.NoOfObjectsCreated);
   	    System.out.println("Number of object created is " + o2.NoOfObjectsCreated);
		System.out.println("Number of object created is " + o3.NoOfObjectsCreated);
		

		System.out.println("size of o1 is"+o1.GetSize());
     
		
       System.out.println("size of o1 is"+o2.GetSize());
       
		System.out.println("size of o1 is"+o3.GetSize());
	
	System.out.println(o1.GetANumber());


}
}


