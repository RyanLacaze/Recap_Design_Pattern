package main.java.rpg.core;
package main.java.rpg.core.Character;

public class ConstructeurCharacter {
		
	private String name;
	private int strength;
	private int ability;
	private int intelligence;
		
	public ConstructeurCharacter(String name) {
		this.name = name;
	}
		
	public ConstructeurCharacter definirStrength(int strength) {
		this.strength = strength;
		return this;
	}
		
	public ConstructeurCharacter definirAbility(int ability) {
		this.ability = ability;
		return this;
	}
		
	public ConstructeurCharacter definirIntelligence(int intelligence) {
		this.intelligence = intelligence;
		return this;
	}
	
	public Character construire() {
		return new Character.build(this);
	}
}
