package by.vovden.wowd.service;

import by.vovden.wowd.model.Unittest;
import by.vovden.wowd.model.UnittestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnittestServiceImpl implements UnittestService {

    @Autowired
    private UnittestDao unittestDao;

    @Override
    public List<Unittest> getAll() {
        return unittestDao.findAll();
    }

    @Override
    public Unittest getById(long id) {
        return unittestDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (unittestDao.existsById(id))
            unittestDao.deleteById(id);
    }

    @Override
    public Unittest create(Unittest request) {
        return unittestDao.save(request);
    }
}
