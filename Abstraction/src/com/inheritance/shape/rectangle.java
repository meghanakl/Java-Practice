package com.inheritance.shape;

public class rectangle extends shape {

	public double length;
	public double width;

	@Override
	public double calculateArea() {
		double l = length;
		   double w = width;
		   double area = l*w;
		return area ;
		
		// TODO Auto-generated method stub
		
	}

	}
