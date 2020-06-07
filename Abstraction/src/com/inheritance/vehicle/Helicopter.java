package com.inheritance.vehicle;

public class Helicopter extends vehicle {
	public Helicopter() {
    this.type="Helicopter";
		 }

	@Override
	public void start() {
		System.out.println("helicopter starts:start automatically ");
		}
	
	@Override
	public void washTheVehicle() {
		System.out.println(" Helicopter washing:Wasing with water and soap with big pipe");
	}
		
	
}
