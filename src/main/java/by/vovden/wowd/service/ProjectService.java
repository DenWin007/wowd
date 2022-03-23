package by.vovden.wowd.service;

import by.vovden.wowd.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAll();

    Project getById(long id);

    void delete(long id);

    Project create(Project request);
}
