package lections.main;

import java.util.List;

import lections.model.Man;
import lections.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Runner {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getCurrentSession();
		
//		select * from Man
		Criteria cr = session.createCriteria(Man.class);
		List<Man> mans = cr.list();
		
		for (Man man : mans) {
			System.out.println(man.getLogin());
		}
		
		session = HibernateUtil.getCurrentSession();
		
//		select * from Man where login = "vasya"
		cr = session.createCriteria(Man.class);
		cr.add(Restrictions.eq("login", "vasya"));
		Man man = (Man) cr.uniqueResult();
		
		
		Man newMan = new Man();
		newMan.setLogin("new_login");
		
//		insert into Man 
		HibernateUtil.getCurrentSession().save(newMan);
//		после вставки у объекта появится ID
		System.out.println("id of new record is: " + newMan.getId());
		HibernateUtil.reset();
	}
}
