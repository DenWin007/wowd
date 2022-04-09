package by.vovden.wowd.service;

import by.vovden.wowd.model.Project;
import by.vovden.wowd.model.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<Project> getAll() {
        return projectDao.findAll();
    }

    @Override
    public Project getById(long id) {
        return projectDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (projectDao.existsById(id))
            projectDao.deleteById(id);
    }

    @Override
    public Project create(Project request) {
        return projectDao.save(request);
    }
}
