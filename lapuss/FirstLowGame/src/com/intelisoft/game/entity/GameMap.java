package com.intelisoft.game.entity;

import com.intelisoft.game.enums.Direction;
import com.intelisoft.game.enums.MRT;
import com.intelisoft.game.main.GameObjectContainer;
import com.intelisoft.game.main.Runner;

public class GameMap {
	
	private static int X = 1;
	private static int Y = 1;
	
	public static MRT[][] gameMap = {
		{ MRT.BORDER,	MRT.ROAD, 	 MRT.ROAD,		MRT.ITEM  },
		{ MRT.BORDER,	MRT.PLAYER,	 MRT.BORDER,	MRT.ROAD  },
		{ MRT.BORDER,	MRT.ROAD, 	 MRT.BORDER,	MRT.ROAD  },
		{ MRT.BORDER,	MRT.ROAD, 	 MRT.BORDER,	MRT.ROAD  },
		{ MRT.BORDER,	MRT.ROAD,	 MRT.BORDER,	MRT.ENEMY }
	};
	
	
	public static MRT getItemByDirection(Direction direction)	{
		
		switch (direction) {
			case UP: 
				return gameMap[X][Y-1];
			
			case DOWN:
				return gameMap[X][Y+1];
				
			case LEFT:
				return gameMap[X-1][Y];
				
			case RIGHT:
				return gameMap[X+1][Y];
		}
		
		return MRT.BORDER;
	}
	
	public static void movePlayer(Direction direction)	{
		
		switch (direction) {
			case UP:
				organizeMap(X, Y, --X, Y);
				break;
			
			case DOWN:
				organizeMap(X, Y, ++X, Y);
				break;
				
			case LEFT:
				organizeMap(X, Y, X, --Y);
				break;
				
			case RIGHT:
				organizeMap(X, Y, X, ++Y);
				break;
		}
	}
	
	private static void organizeMap(int oldX, int oldY, int newX, int newY)	{
		gameMap[oldX][oldY] = MRT.ROAD;
		gameMap[newX][newY] = MRT.PLAYER;

		// по новым координатам находится артефакт
		MRT mrt = MRT.ITEM;
		
		// если по новым координатам находится артефакт, то добавить артефакт игроку
		if(mrt.equals(MRT.ITEM))	{
			Player pl = GameObjectContainer.getPlayer();
			Artefact art = GameObjectContainer.getArtefact();
			
			pl.setArtefact(art);
			GameObjectContainer.addElement(MRT.PLAYER, pl);
		} else if(mrt.equals(MRT.ENEMY))	{
			
		}
	}
	
}