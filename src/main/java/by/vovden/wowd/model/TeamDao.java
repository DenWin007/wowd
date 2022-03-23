package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TeamDao extends CrudRepository<Team, Long> {
    List<Team> findAll();

    Team findById(long id);
}
