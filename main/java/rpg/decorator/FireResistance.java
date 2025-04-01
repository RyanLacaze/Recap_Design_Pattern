package main.java.rpg.decorator;

public class FireResistance extends CharacterDecorator {

	public FireResistance(Character character) {
		super(character);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " résistance au feu";
	}
}
