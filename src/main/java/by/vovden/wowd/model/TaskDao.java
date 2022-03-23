package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TaskDao extends CrudRepository<Task, Long> {
    List<Task> findAll();

    Task findById(long id);
}
