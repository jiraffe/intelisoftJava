package lections.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	private static Session session;

	@SuppressWarnings("deprecation")
	private static  SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = getConfiguration().buildSessionFactory();
		}
		return sessionFactory;
	}

	public static  Session getCurrentSession() {
		if (session == null) {
			session = getSessionFactory().openSession();
			System.out.println("session opened.");
		}
		return session;
	}

	public static Configuration getConfiguration() {
		if (configuration == null) {
			System.out.print("configuring Hibernate ... ");
			try {
				configuration = new Configuration().configure();
				System.out.println("ok");
			} catch (HibernateException e) {
				System.out.println("failure");
				e.printStackTrace();
			}
		}
		return configuration;
	}

	public static void reset() {
		session = getCurrentSession();
		if (session != null && session.isOpen()) {
			session.flush();
			if (session.isOpen()) {
				System.out.print("closing session ... ");
				session.close();
				System.out.println("ok");
			}
		}
		SessionFactory sf = getSessionFactory();
		if (sf != null) {
			System.out.print("closing session factory ... ");
			sf.close();
			System.out.println("ok");
		}
		configuration = null;
		sessionFactory = null;
		session = null;
	}
}