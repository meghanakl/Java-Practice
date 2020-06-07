package com.inheritance.vehicle;

import com.inheritance.shape.shape;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	vehicle v =	getFavVehicleOfCurrentOwner();
	System.out.println("Fav vehicle is "+v.type);
	System.out.println("registration no."+v.RegistrationNumber);
	v.washTheVehicle();
	v.start();
	}
	 public static vehicle getFavVehicleOfCurrentOwner() {
		 owner o = new owner("Meghana");
		 return o.getFavVehicle();
		 
		 
	     //car c = new car();
		 // c.start();
		
		 // bus b = new bus();
		// b.start();
	
		// bike k = new bike();
		// k.start();
	}
}
