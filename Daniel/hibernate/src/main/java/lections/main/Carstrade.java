package lections.main;
import java.sql.SQLException;
import java.util.List;
import lections.model.Man;


public interface Carstrade {
    public void buycars (Man buy) throws SQLException;   //Купить машину
    public List getAllcars() throws SQLException;              //получить все машины
    public void reservecar(Man reserve) throws SQLException;// резерв
}