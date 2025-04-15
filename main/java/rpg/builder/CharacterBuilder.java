package main.java.rpg.builder;

import main.java.rpg.core.Character;

public class CharacterBuilder {
	
	private String name;
	private int strength;
	private int ability;
	private int intelligence;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getAbility() {
		return ability;
	}
	
	public void setAbility(int ability) {
		this.ability = ability;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
		
	public CharacterBuilder(String name) {
		this.name = name;
	}
		
	public CharacterBuilder definirStrength(int strength) {
		this.strength = strength;
		return this;
	}

	public CharacterBuilder definirAbility(int ability) {
		this.ability = ability;
		return this;
	}
		
	public CharacterBuilder definirIntelligence(int intelligence) {
		this.intelligence = intelligence;
		return this;
	}
}
