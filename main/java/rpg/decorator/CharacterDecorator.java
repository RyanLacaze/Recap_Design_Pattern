package main.java.rpg.decorator;

public abstract class CharacterDecorator {

	private Character character;
	
	public String getDescription() {
		return "Description :";
	}
	
	public int getPowerlevel() {
		return 0;
	}
	
	public CharacterDecorator(Character character) {
		this.character = character;
	}
	
	public Character getCharacter() {
		return character;
	}
}
