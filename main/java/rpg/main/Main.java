package main.java.rpg.main;
import main.java.rpg.core.*;
import main.java.rpg.decorator.*;
import main.java.rpg.dao.*;
import main.java.rpg.settings.*;

public class Main {
	
	public static void main(String[] args) {
		Character character1 = new Character.ConstructeurCharacter("Jill")
				.definirSrength(20)
				.definirAbility(40)
				.definirIntelligence(20)
				.build();
		
		Character character2 = new Character.ConstructeurCharacter("Koth")
				.definirSrength(10)
				.definirAbility(40)
				.definirIntelligence(30)
				.build();
		
		Character character3 = new Character.ConstructeurCharacter("Fred")
				.definirSrength(10)
				.definirAbility(20)
				.definirIntelligence(10)
				.build();
			
			character1.AfficherCharacter();
			character2.AfficherCharacter();
			character3.AfficherCharacter();			
	}

}
