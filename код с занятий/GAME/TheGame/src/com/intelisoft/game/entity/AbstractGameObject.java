package com.intelisoft.game.entity;

public abstract class AbstractGameObject {

	public String name;
	public int health;
	
	public void fight() {
		System.out.println(this.name + " наносит удар");
	}
	
	public void die() {
		System.out.println(this.name + " умер");
	}
	
}