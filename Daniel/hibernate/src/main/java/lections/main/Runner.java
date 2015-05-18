package lections.main;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;

import lections.model.Man;
import lections.util.HibernateUtil;



public class Runner {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		  //Выведем всех студентов из бд
        List<Man> car = Factory.getInstance().getcarslog().getAllcars();
        System.out.println("========Все бибики=========");
        for(int i = 0; i < car.size(); ++i) {
                System.out.println("Марка : " + car.get(i).getmark() + ", Возраст : " + car.get(i).getAge() +",  id : " + car.get(i).getId() +",  Поняшки : " + car.get(i).getHorse());
                System.out.println("=============================");              
        }       
        
      
	/*	Session session = HibernateUtil.getCurrentSession();

		System.out.println("Придумайте логин");
		String us = scan.next();
		String adduser = "INSERT INTO autorisation.Man (id,login) VALUES (null,' "
				+ us + " ')";
		System.out.println("Профиль создан");
		session.save(adduser);

		//
		HibernateUtil.reset(); */

	}
}
