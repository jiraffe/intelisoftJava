package com.intelisoft.game.main;

import com.intelisoft.game.entity.Artefact;
import com.intelisoft.game.entity.Enemy;
import com.intelisoft.game.entity.Player;
import com.intelisoft.game.enums.MRT;


public class Runner {

	public static void main(String[] args) {
		
		// создание игрока
		Player player = new Player(50, "Player");
		GameObjectContainer.addElement(MRT.PLAYER, player);
		
		// создали врага
		Artefact art = new Artefact();
		GameObjectContainer.addElement(MRT.ITEM, art);
		
		// создали артефакт
		Enemy enemy = new Enemy("test", 50);
		GameObjectContainer.addElement(MRT.ENEMY, enemy);
	}
	
}