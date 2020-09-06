package com.meghana.BasicPrograms;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<talk> talkerList = new ArrayList<talk>();
		talkerList.add(new CommerceStudent(1,"q","r"));
		talkerList.add(new ScienceStudent(2,"y","o"));
		talkerList.add(new Parent());
		talkerList.add(new Teacher());
		
	


	for (int i = 0; i <= talkerList.size() - 1; i++) {
       
       talkerList.get(i);
       System.out.println(i);
       talk  t = (talk) talkerList.get(i);
	System.out.println("fast"+ t.talkfast());
	System.out.println(t.talkslow());
}
	

}
}
