package by.vovden.wowd.service;


import by.vovden.wowd.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAll();

    Task getById(long id);

    void delete(long id);

    Task create(Task request);
}
