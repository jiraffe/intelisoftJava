package box;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import Enumodel.Model;
import mysqljob.Factory;

public class Run {	
	int i;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		  
        List<Model> mod = Factory.getInstance().getstatsjob().getAllstats();
        System.out.println("========Все бибики=========");
        for(int i = 0; i < mod.size(); ++i) {
                System.out.println("Хп : " + mod.get(i).getDex() + ", Возраст : " + mod.get(i).getHp() +",  id : " + mod.get(i).getId() +",  Поняшки : " + mod.get(i).getHp());
                System.out.println("=============================");              
        }       
        
}
}
