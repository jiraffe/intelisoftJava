package lections.main;

public class Factory {
    
    private static Carstrade carslog = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
          if (instance == null){
            instance = new Factory();
          }
          return instance;
    }

    public Carstrade getcarslog(){
          if (carslog == null){
            carslog = new Logick();
          }
          return carslog;
    }   
}