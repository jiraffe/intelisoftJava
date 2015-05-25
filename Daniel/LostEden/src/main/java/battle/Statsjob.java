package battle;

import java.sql.SQLException;
import java.util.List;

import Enumodel.Model;

public interface Statsjob {

    public void bdstats (Model hp) throws SQLException;
    public List getAllstats() throws SQLException;   
   
}

