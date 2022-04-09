package by.vovden.wowd.service;

import by.vovden.wowd.model.User;
import by.vovden.wowd.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public User getById(long id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(long id) {
        if (userDao.existsById(id))
            userDao.deleteById(id);
    }

    @Override
    public User create(User request) {
        return userDao.save(request);
    }
}
