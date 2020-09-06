package com.meghana.BasicPrograms;

public class CommerceStudent extends Student {

	public CommerceStudent(int id, String name, String branch) {
		super(id, name, branch);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcualteFee() {
	double fee= 5000.0;
	return fee; // or return 5000.0 one line le agutte
	}

	@Override
	public void talkfast() {
		// TODO Auto-generated method stub
		System.out.println("CommerceStudent taking fast");
	}

	@Override
	public void talkslow() {
		// TODO Auto-generated method stub
		System.out.println("CommerceStudent taking slow");
	}
	

}

