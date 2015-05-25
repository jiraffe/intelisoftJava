package box;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import mysqljob.HibernateUtil;

import org.hibernate.Session;

import battle.Statsjob;
import Enumodel.Model;

public class Logick implements Statsjob {

	public List<Model> getAllstats() throws SQLException {
		Session session = null;
		List<Model> log = new ArrayList<Model>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			log = session.createCriteria(Model.class).list();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O",
					JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return log;
	}

}