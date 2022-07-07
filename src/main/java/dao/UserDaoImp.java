package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import model.Content;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDaoImp implements UserDao {

    EntityManager entityManager;
    public UserDaoImp(){
        entityManager = EntityManagerUtil.getEntityManager();
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("From User").getResultList();
    }

    @Override
    public void insert(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }


}
