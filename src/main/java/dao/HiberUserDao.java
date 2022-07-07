package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HiberUserDao implements UserDao {
    SessionFactory factory;
    public HiberUserDao(){
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
    @Override
    public List<User> getAll(){
        Session session = factory.openSession();
        List<User> userList = session.createQuery("FROM User",User.class).list();
        session.close();
        return userList;
    }

    @Override
    public void insert(User user) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void insertAll(List<User> users) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        for (User u:users){
            session.save(u);
        }
        transaction.commit();
        session.close();
    }


}
