package dao;

import model.User;

import java.util.List;

public interface UserDao extends CrudDao<User> {
    List<User> findAllByName(String name);
}
