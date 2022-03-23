package by.vovden.wowd.service;


import by.vovden.wowd.model.Unittest;

import java.util.List;

public interface UnittestService {
    List<Unittest> getAll();

    Unittest getById(long id);

    void delete(long id);

    Unittest create(Unittest request);
}
