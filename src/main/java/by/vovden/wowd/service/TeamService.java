package by.vovden.wowd.service;


import by.vovden.wowd.model.Team;

import java.util.List;

public interface TeamService {
    List<Team> getAll();

    Team getById(long id);

    void delete(long id);

    Team create(Team request);
}
