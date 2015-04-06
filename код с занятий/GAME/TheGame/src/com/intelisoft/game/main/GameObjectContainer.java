package com.intelisoft.game.main;

import java.util.HashMap;

import com.intelisoft.game.entity.Artefact;
import com.intelisoft.game.entity.Enemy;
import com.intelisoft.game.entity.Player;
import com.intelisoft.game.enums.MRT;

public class GameObjectContainer {

	private static HashMap<MRT, Object> container = new HashMap<MRT, Object>();
	
	public static void addElement(MRT key, Object value) {
		container.put(key, value);
	}
	
	public static Player getPlayer()	{
		return (Player) container.get(MRT.PLAYER);
	}
	
	public static Enemy getEnemy()	{
		return (Enemy) container.get(MRT.ENEMY);
	}
	
	public static Artefact getArtefact()	{
		return (Artefact) container.get(MRT.ITEM);
	}
}