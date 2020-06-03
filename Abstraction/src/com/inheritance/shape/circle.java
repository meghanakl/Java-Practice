package com.inheritance.shape;

public class circle extends shape{

	
	public double radius;

	@Override
	public double calculateArea() {
		double r =radius;
		double Area = 3.142 * r* r;
		// TODO Auto-generated method stub
		return Area ;
	}

}
   