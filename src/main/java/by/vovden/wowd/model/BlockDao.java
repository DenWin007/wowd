package by.vovden.wowd.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BlockDao extends CrudRepository<Block, Long> {

    List<Block> findAll();

    Block findById(long id);
}
