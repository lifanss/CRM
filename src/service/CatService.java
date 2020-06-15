package service;

import bean.Cats;

import java.util.List;

public interface CatService {
     List<Cats> queryAll();

    int deleteCatById(int id);

    int insertCat(Cats cats);

    Cats queryOne(int id);

    int updaeCat(Cats cats);
}
