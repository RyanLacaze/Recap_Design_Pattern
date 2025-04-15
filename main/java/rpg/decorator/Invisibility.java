package main.java.rpg.decorator;

public class Invisibility extends CharacterDecorator {

	public Invisibility(main.java.rpg.core.Character character) {
		super(character);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " invisibilité";
	}
}
