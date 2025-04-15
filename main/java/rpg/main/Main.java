package main.java.rpg.main;
import main.java.rpg.core.Character;
import main.java.rpg.builder.CharacterBuilder;
import main.java.rpg.decorator.*;
import main.java.rpg.dao.*;
import main.java.rpg.settings.*;

public class Main {
	
	public static void main(String[] args) {
		main.java.rpg.core.Character character1 = Character.build(new CharacterBuilder("Jill")
				.definirStrength(20)
				.definirAbility(40)
				.definirIntelligence(20)
				);
		
		Character character2 = Character.build(new CharacterBuilder("Koth")
				.definirStrength(10)
				.definirAbility(40)
				.definirIntelligence(30)
				);
		
		Character character3 = Character.build(new CharacterBuilder("Fred")
				.definirStrength(10)
				.definirAbility(20)
				.definirIntelligence(10)
				);
		
		CharacterDecorator telepath = new Telepathy(character1);
		
		CharacterDecorator resfeu = new FireResistance(character2);
		
		CharacterDecorator invisibility = new Invisibility(character3);
		
		System.out.println(telepath.getDescription());
		character1.AfficherCharacter();
		
		System.out.println(resfeu.getDescription());
		character2.AfficherCharacter();
		
		System.out.println(invisibility.getDescription());
		character3.AfficherCharacter();			
	}

}
