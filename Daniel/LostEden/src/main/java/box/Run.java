package box;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import battle.Attackblock;
import mysqljob.Session;
import Enumodel.Model;
import mysqljob.Factory;
import mysqljob.HibernateUtil;
import mysqljob.Session;

public class Run {	
	int i;
		public static void main(String[] args) throws SQLException {
			
        List<Model> mod = Factory.getInstance().getAllstats().getAllstats();
        System.out.println("========Все=========");
        for(int i = 0; i < mod.size(); ++i) {
                System.out.println("Хп : " + mod.get(i).getDex() + ", Возраст : " + mod.get(i).getHp() +",  id : " + mod.get(i).getId() +",  Поняшки : " + mod.get(i).getHp());
                System.out.println("=============================");         
               run.Attackblock.Userblock(){
            	   
               }
            
        }       
        
}
}
