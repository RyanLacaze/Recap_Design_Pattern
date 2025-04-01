package main.java.rpg.settings;

public class GameSettings {

	private static GameSettings instance;
	private int maxStatPoint = 100;
	
	private GameSettings() {
	}
	
	public static GameSettings getInstance() {
		if (instance == null) {
			instance = new GameSettings();
		}
		return instance;
	}
	
	public void isValid(Character c) {
		if(maxStatPoint > 100) {
			maxStatPoint = 100;
			System.out.println("Le niveau ne peut aller au delà de 100 !");
		}
	}
}
