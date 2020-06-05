package com.Interface.shape;

public class square implements shape {
public double length;
	

	@Override
	public void printDateTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		double l = length;
		double area = l*l;
		return area ;
	}

}
 