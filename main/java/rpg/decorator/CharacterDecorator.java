package main.java.rpg.decorator;

public abstract class CharacterDecorator {

	private main.java.rpg.core.Character character;
	
	public String getDescription() {
		return "Description :";
	}
	
	public int getPowerlevel() {
		return 0;
	}
	
	public CharacterDecorator(main.java.rpg.core.Character character) {
		this.character = character;
	}
	
	public main.java.rpg.core.Character getCharacter() {
		return character;
	}
}
