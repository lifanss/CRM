package service.impl;

import bean.Cats;
import dao.CatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CatService;

import java.util.List;
@Service
public class CatServiceImpl implements CatService {

    @Autowired
    CatDao catDao;

    @Override
    public List<Cats> queryAll() {
        return catDao.queryAll();
    }

    @Override
    public int deleteCatById(int delid) {
        return catDao.deleteCatById(delid);

    }

    @Override
    public int insertCat(Cats cats) {
        return catDao.insertCat(cats);
    }

    @Override
    public Cats queryOne(int id) {
        return catDao.queryOne(id);
    }

    @Override
    public int updaeCat(Cats cats) {
        return catDao.updaeCat(cats);
    }
}
