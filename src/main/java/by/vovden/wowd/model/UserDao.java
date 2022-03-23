package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    List<User> findAll();

    User findById(long id);
}
