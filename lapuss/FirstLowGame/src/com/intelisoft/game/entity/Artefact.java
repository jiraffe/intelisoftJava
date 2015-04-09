package com.intelisoft.game.entity;

public class Artefact {

	public String name;
	public int attack;
	
	public Artefact() {
		this.name = "Standard name";
		this.attack = 10;
	}

	public Artefact(String name, int attack) {
		this.name = name;
		this.attack = attack;
	}
	
}