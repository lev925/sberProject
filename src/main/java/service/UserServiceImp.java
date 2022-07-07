package service;

import dao.UserDaoImp;
import dao.UserDao;
import model.User;

import java.util.List;

public class UserServiceImp implements UserService {
    UserDao dao;
    public UserServiceImp(){
        this.dao = new UserDaoImp();
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public void insert(User user) {
        dao.insert(user);
    }
}
