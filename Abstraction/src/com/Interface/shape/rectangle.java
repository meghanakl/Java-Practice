package com.Interface.shape;

public class rectangle implements shape{
public double length;
public double width;;
	@Override
	public double calculateArea() {
		double l = length;
		   double w = width;
		   double area = l*w;
		return area ;
	}

	@Override
	public void printDateTime() {
		// TODO Auto-generated method stub
		
	}

}
