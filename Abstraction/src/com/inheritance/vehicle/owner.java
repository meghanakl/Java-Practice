package com.inheritance.vehicle;

public class owner {
	
	private String Name;
	
	public owner(String ownerName) // constructor same as class name allways
	{
    this.Name = ownerName;
    }
	
	
	public vehicle  getFavVehicle() {
		bike b = new bike();
		return b;
	}
}

 