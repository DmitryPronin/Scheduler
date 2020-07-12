package dao;

import model.User;

import java.util.List;

public interface CrudDao<T> {
    void save(T model);
    T find(int id);
    void update(T model);
    void delete(int i);

    List<T> findAll();
}
