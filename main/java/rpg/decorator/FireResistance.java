package main.java.rpg.decorator;

public class FireResistance extends CharacterDecorator {

	public FireResistance(main.java.rpg.core.Character character) {
		super(character);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " résistance au feu";
	}
}
