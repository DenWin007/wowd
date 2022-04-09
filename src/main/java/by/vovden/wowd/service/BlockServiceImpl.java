package by.vovden.wowd.service;

import by.vovden.wowd.model.Block;
import by.vovden.wowd.model.BlockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements  BlockService{

    @Autowired
    private BlockDao blockDao;

    @Override
    public List<Block> getAll() {
        return blockDao.findAll();
    }

    @Override
    public Block getById(long id) {
        return blockDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (blockDao.existsById(id))
            blockDao.deleteById(id);
    }

    @Override
    public Block create(Block request) {
        return blockDao.save(request);
    }
}
