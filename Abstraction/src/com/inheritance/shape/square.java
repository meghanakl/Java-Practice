package com.inheritance.shape;

public class square extends shape {

	
public double length;
	@Override
	public double calculateArea() {
		double l = length;
		double area = l*l;
		return area ;
	}

	
	
 
}
