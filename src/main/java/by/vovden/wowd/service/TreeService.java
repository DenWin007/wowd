package by.vovden.wowd.service;

import by.vovden.wowd.model.Tree;

import java.util.List;

public interface TreeService {
    List<Tree> getAll();

    Tree getById(long id);

    void delete(long id);

    Tree create(Tree request);

}
