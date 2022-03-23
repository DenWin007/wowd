package by.vovden.wowd.service;


import by.vovden.wowd.model.Block;

import java.util.List;

public interface BlockService {

    List<Block> getAll();

    Block getById(long id);

    void delete(long id);

    Block create(Block request);

}
