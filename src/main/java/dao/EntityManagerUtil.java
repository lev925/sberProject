package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory factory;
    private static EntityManagerFactory getInstance(){
        if(factory==null){
            factory = Persistence.createEntityManagerFactory("org.java.sber");

        }
        return factory;
    }
    public static EntityManager getEntityManager() {
        return getInstance().createEntityManager();
    }
}
