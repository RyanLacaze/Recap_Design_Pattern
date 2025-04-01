package main.java.rpg.core;

class Character {
	
	private String name;
	private int strength;
	private int ability;
	private int intelligence;
	
	private Character(ConstructeurCharacter constructeur) {
		this.name = constructeur.name;
		this.strength = constructeur.strength;
		this.ability = constructeur.ability;
		this.intelligence = constructeur.intelligence;
	}
	
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
	
	public static class ConstructeurCharacter {
		
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
		
		public Character build() {
			return new Character(this);
		}
	}

}
