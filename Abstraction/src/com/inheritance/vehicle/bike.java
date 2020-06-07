package com.inheritance.vehicle;

public class bike extends vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike starts :Strat by kicking");
	}
	@Override
	public void washTheVehicle() {
		System.out.println("Wasing with water and soap with towel");
	}
	
}
