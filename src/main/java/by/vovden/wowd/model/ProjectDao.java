package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProjectDao extends CrudRepository<Project, Long> {

    List<Project> findAll();

    Project findById(long id);
}
