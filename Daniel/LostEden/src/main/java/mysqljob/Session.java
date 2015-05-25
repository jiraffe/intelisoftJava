package mysqljob;

import java.util.List;

import org.hibernate.Criteria;

import Enumodel.Model;

public class Session {
	public static void createCriteria() {
		org.hibernate.Session session = HibernateUtil.getCurrentSession();
		Criteria crit = session.createCriteria(Model.class);
		crit.setMaxResults(50);
		List studs = crit.list();
	}
}
