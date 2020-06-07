package com.inheritance.vehicle;

public class owner {
	
	private String Name;
	
	public owner(String ownerName) // constructor same as class name allways
	{
    this.Name = ownerName;
    }
	
	public vehicle  getFavVehicle() {
	Helicopter h = new Helicopter();
		
	h.RegistrationNumber ="KA 18 F670";
	return h;
	}
}

 