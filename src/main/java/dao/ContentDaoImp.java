package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class ContentDaoImp {
    EntityManager entityManager;
    public ContentDaoImp(){
        Persistence.createEntityManagerFactory("persistence.xml");
    }
}
