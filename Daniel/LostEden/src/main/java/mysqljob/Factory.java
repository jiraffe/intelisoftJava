package mysqljob;

import java.util.List;
import Enumodel.Model;
import battle.Statsjob;
import box.Logick;

public class Factory {
    
    private static Statsjob statsjob  = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
          if (instance == null){
            instance = new Factory();
          }
          return instance;
    }

    public Statsjob getAllstats(){
          if (statsjob == null){
        	  statsjob = new Logick();
          }
          return statsjob;
    }

	
}