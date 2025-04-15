package main.java.rpg.core;

import main.java.rpg.builder.CharacterBuilder;

public class Character {
	
	private String name;
	private int strength;
	private int ability;
	private int intelligence;
	
	
	
	private Character(CharacterBuilder constructeur) {
		this.name = constructeur.getName();
		this.strength = constructeur.getStrength();
		this.ability = constructeur.getAbility();
		this.intelligence = constructeur.getIntelligence();
	}

	public int getPowerLevel() {
		return strength + ability + intelligence;
	}
	
	public String getDescription() {
		return "Description :";
	}
	
	public void AfficherCharacter() {
		System.out.println("Nom : " + name);
		
		if (strength != 0) {
			System.out.println("Force : " + strength);
		}
		if (ability != 0 ) {
			System.out.println("Abilité : " + ability);
		}
		if (intelligence != 0) {
			System.out.println("Intelligence : " + intelligence);
		}
		System.out.println("--------------------------------");
	}
		
	public static Character build(CharacterBuilder constructeur) {
		return new Character(constructeur);
	}
}
