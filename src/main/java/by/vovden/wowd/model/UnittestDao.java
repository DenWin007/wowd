package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UnittestDao extends CrudRepository<Unittest, Long> {
    List<Unittest> findAll();

    Unittest findById(long id);
}
