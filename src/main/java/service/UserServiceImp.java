package service;

import dao.HiberUserDao;
import dao.UserDao;
import model.User;

import java.util.List;

public class UserServiceImp implements UserService {
    UserDao dao;
    public UserServiceImp(){
        this.dao = new HiberUserDao();
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public void insertAll(List<User> users) {
        dao.insertAll(users);
    }

    @Override
    public void insert(User user) {
        dao.insert(user);
    }
}
