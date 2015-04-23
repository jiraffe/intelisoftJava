package Duckers;

import Abstr.AbstrDuck;
import InterMethod.CannotFlyImpl;
import InterMethod.NotGetToFishing;

public class RubberDuck extends AbstrDuck {

	
	
	public RubberDuck() {
		super();
		ifly = new CannotFlyImpl();
		fish = new NotGetToFishing();
	}

	@Override
	public void performQuack() {
		System.out.println(iguak.iQuak());
	}

}