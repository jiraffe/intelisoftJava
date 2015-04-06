package com.intelisoft.game.entity;

import com.intelisoft.game.enums.Direction;

public class Player extends AbstractGameObject	{

	private Artefact artefact;

	public Player(int health)	{
		this.health = health;
	}
	
	public Player(int health, String name) {
		this.health = health;
		this.name = name;
	}

	public void move(Direction direction)	{
		System.out.println("игрок двигаеся в " + direction);
	}
	
	public void setArtefact(Artefact artefact) {
		// есть ли права на добавление артефакта
		this.artefact = artefact;
	}
	
	public Artefact getArtefact()	{
		return artefact;
	}
}