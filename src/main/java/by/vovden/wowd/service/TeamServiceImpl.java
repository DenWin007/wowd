package by.vovden.wowd.service;


import by.vovden.wowd.model.Team;
import by.vovden.wowd.model.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Override
    public List<Team> getAll() {
        return teamDao.findAll();
    }

    @Override
    public Team getById(long id) {
        return teamDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (teamDao.existsById(id))
            teamDao.deleteById(id);
    }

    @Override
    public Team create(Team request) {
        return teamDao.save(request);
    }
}
