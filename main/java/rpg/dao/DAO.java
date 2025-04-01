package main.java.rpg.dao;

public interface DAO <T> {

	void save(T item);
	String findByName(String name);
	String findAll();
}
