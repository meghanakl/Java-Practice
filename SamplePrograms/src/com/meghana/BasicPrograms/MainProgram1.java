package com.meghana.BasicPrograms;

import java.util.ArrayList;

public class MainProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Talk> talkerList = new ArrayList<Talk>();
		talkerList.add(new CommerceStudent(1, "q", "r"));
		talkerList.add(new ScienceStudent(2, "y", "o"));
		talkerList.add(new Parent());
		talkerList.add(new Teacher());

		ProcessTalk(new CommerceStudent(7, "y", "p"));
		ProcessTalk(new ScienceStudent(8, "s", "b"));
		ProcessTalk(new Parent());
		ProcessTalk(new Teacher());

		for (int i = 0; i <= talkerList.size() - 1; i++) {
			talkerList.get(i);
			System.out.println(i);
			Talk t = (Talk) talkerList.get(i);
			t.talkfast();
			t.talkslow();
		}
	}

	public static void ProcessTalk(Talk t) {
		t.talkfast();
		t.talkslow();

	}

}
