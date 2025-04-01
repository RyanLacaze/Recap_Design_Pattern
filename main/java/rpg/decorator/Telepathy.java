package main.java.rpg.decorator;

public class Telepathy extends CharacterDecorator {

	public Telepathy(Character character) {
		super(character);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " télépathie";
	}
}
