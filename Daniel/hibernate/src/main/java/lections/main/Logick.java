package lections.main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lections.model.Man;
import lections.util.HibernateUtil;

import org.hibernate.Session;

public class Logick implements Carstrade {    
      
      public List<Man> getAllcars() throws SQLException {
            Session session = null;
            List<Man> studs = new ArrayList<Man>();
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                studs = session.createCriteria(Man.class).list();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            return studs;
      }     
             
      
      

	@Override
	public void buycars(Man buy) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservecar(Man reserve) throws SQLException {
		// TODO Auto-generated method stub
		
	}  
}