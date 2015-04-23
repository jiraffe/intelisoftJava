package Abstr;

import Inter.Fishing;
import Inter.IFly;
import Inter.IQuack;
import InterMethod.FlyImpl;
import InterMethod.GetToFishing;
import InterMethod.QuackImpl;



abstract public class AbstrDuck {
	
	protected IFly ifly;
	protected IQuack iguak;
	public Fishing fish;
	
	public AbstrDuck() {
		this.ifly = new FlyImpl();
		this.iguak = new QuackImpl();
		this.fish = new GetToFishing();
	}

	public void swimm (String a){
		System.out.println(a);
	};
	
	public abstract void performQuack();
	
}
