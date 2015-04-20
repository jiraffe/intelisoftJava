package mainer;

import DuckS.Duck1;
import DuckS.Duck2;
import DuckS.Duck3;

public class mainer {
	
 public static void main(String[] args) {
	Duck1 duck1 = new Duck1();
	Duck2 duck2 = new Duck2();
	Duck3 duck3 = new Duck3();
	duck2.swim();
	duck1.setName("duck1");
	System.out.println(duck1.getName());
	duck1.fly1.fly();
}	
	
}