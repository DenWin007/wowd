package by.vovden.wowd.service;


import by.vovden.wowd.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(long id);

    void delete(long id);

    User create(User request);
}
