package com.inheritance.vehicle;

public class car extends vehicle
{
	public car() {
		 this.type="car";
				 }
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car starts:start automatically by press button");
	}
}
