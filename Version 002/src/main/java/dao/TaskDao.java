package dao;

import model.Task;

import java.util.List;

public interface TaskDao extends CrudDao<Task> {
    List<Task> findTaskByTaskName(String taskName);
}
