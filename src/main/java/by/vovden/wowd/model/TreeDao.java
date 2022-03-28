package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TreeDao extends CrudRepository<Tree, Long> {
    List<Tree> findAll();

    Tree findById(long id);
}
