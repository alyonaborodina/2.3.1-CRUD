package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> findAll();
    User findById(Integer id);
}
