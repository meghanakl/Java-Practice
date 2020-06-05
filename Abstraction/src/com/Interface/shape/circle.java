package com.Interface.shape;

public class circle implements shape {
public double radius;
	@Override
	public double calculateArea() {
		double r =radius;
		double Area = 3.142 * r* r;
		return Area ;
		
	}

	@Override
	public void printDateTime() {
	
		
	}

}

