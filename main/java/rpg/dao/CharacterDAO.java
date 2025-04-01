package main.java.rpg.dao;

import java.util.*;

public class CharacterDAO implements DAO <Character> {

	private ArrayList<Character> listCharacter = new ArrayList<>();
	
	@Override
	public void save(Character character) {
		listCharacter.add(character);
	}
	
	@Override
	public String findByName(String name) {
		String c = "\nPersonnage :";
		for(int i = 0; i < listCharacter.size(); i++) {
			if(name == Character.getName(i)) {
				c += listCharacter.get(i).toString()+ "\n";
			}
		}
		return c;
	}
	
	@Override
	public String findAll() {
		String s = "\nTous les personnages :";
		for(int i = 0; i < listCharacter.size(); i++) {
			s += listCharacter.get(i).toString()+ "\n";
		}
		return s;
	}
}
