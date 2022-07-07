package service;

import model.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void insertAll(List<User> users);
    public void insert(User user);
}
