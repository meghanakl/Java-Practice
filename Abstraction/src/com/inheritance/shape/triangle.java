package com.inheritance.shape;

public class triangle extends shape {

	public int base;
	public int height;

	@Override
	public double calculateArea() 
	{     int area;
				try 
				{
	 area =(1/2 *base)/height; // this is for test purpose
				
				System.out.println("completd area calculation");
			//	return area;
				}
				 catch(Exception ex) 
				{ System.out.println("error occured");
					 System.out.println("executing catch block of triangle.calculate area method");
					 area= 0;
				 }
			
		//	finally
		//	{ 
			
		//		System.out.println("executing finally block of triangle.calculate area method");
         
		//	}
				System.out.println("after finally");
				return area;
		//		System.out.println("after finally");	
	}
	public void printDateTime() 
	{
	
	}

}

