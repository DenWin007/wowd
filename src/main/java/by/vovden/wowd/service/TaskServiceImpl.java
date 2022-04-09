package by.vovden.wowd.service;

import by.vovden.wowd.model.Task;
import by.vovden.wowd.model.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements  TaskService{

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> getAll() {
        return taskDao.findAll();
    }

    @Override
    public Task getById(long id) {
        return taskDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (taskDao.existsById(id))
            taskDao.deleteById(id);
    }

    @Override
    public Task create(Task request) {
        return taskDao.save(request);
    }
}
