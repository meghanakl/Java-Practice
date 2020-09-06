package com.meghana.BasicPrograms;

public class ScienceStudent extends Student {
	
	

	public ScienceStudent(int id, String name, String branch) {
		super(id, name, branch);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcualteFee() {
	
	return 8000.0;
	
	
	}

	@Override
	public void talkfast() {
	System.out.println(" ScienceStudent taking fast ");
		
	}

	@Override
	public void talkslow() {
		// TODO Auto-generated method stub
		System.out.println(" ScienceStudent taking slow");
		
	}

}