package com.intelisoft.game.main;

import java.util.Scanner;

import com.intelisoft.game.entity.Artefact;
import com.intelisoft.game.entity.Enemy;
import com.intelisoft.game.entity.Player;
import com.intelisoft.game.enums.MRT;


public class Runner {

	public static Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		initGameObjects();
		startMenu();
		
	}

	private static void startMenu() {
		// TODO Auto-generated method stub
		
	}

	private static void initGameObjects() {
		// создание игрока
		Player player = new Player(50, "Player");
		GameObjectContainer.addElement(MRT.PLAYER, player);
		
		// создали артефакт
		Artefact art = new Artefact();
		GameObjectContainer.addElement(MRT.ITEM, art);
		
		// создали врага
		Enemy enemy = new Enemy("test", 50);
		GameObjectContainer.addElement(MRT.ENEMY, enemy);
	}
	
}