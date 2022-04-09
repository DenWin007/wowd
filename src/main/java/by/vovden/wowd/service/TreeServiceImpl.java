package by.vovden.wowd.service;

import by.vovden.wowd.model.Tree;
import by.vovden.wowd.model.TreeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeDao treeDao;

    @Override
    public List<Tree> getAll() {
        return treeDao.findAll();
    }

    @Override
    public Tree getById(long id) {
        return treeDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (treeDao.existsById(id))
            treeDao.deleteById(id);
    }

    @Override
    public Tree create(Tree request) {
        return treeDao.save(request);
    }
}
