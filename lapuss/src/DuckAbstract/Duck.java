package DuckAbstract;

import inter.IntForDuck;

abstract public class Duck implements IntForDuck {

	String name;
	abstract public void swim();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
