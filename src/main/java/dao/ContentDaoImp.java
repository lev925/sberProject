package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import model.Content;

public class ContentDaoImp {
    EntityManager entityManager;
    public ContentDaoImp(){
       entityManager = EntityManagerUtil.getEntityManager();
    }
    public Content createContent(Content content){
        entityManager.getTransaction().begin();
        entityManager.persist(content);
        entityManager.getTransaction().commit();
        return entityManager.find(Content.class,content.getGuid());
    }
}
