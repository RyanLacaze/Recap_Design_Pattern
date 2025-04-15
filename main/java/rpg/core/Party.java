package main.java.rpg.core;

import java.util.ArrayList;

public class Party {

	private ArrayList<Character> listCharacter = new ArrayList<>();
	
	public void addCharacter(Character character) {
		listCharacter.add(character);
	}
	
	public void deleteCharacter(Character character) {
		String c = "\nPersonnage :";
		for(int i = 0; i < listCharacter.size(); i++) {
			if(character == listCharacter.get(i)) {
				listCharacter.remove(i);
			}
		}
	}
	
	public int additionCharacter() {
		int res=0;
		for(int i = 0; i < listCharacter.size(); i++) {
			res += listCharacter.get(i).getPowerLevel() ;
		}
		return res;
	}
}
