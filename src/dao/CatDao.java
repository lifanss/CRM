package dao;

import bean.Cats;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatDao {

    @Select("select * from cats")
    List<Cats> queryAll();
    @Delete("delete from cats where id=#{id}")
    int deleteCatById(int id);
    @Insert("insert into cats values(#{id},#{name},#{age},#{kind},#{sex})")
    int insertCat(Cats cats);
    @Select("select * from cats where id=#{id}")
    Cats queryOne(int id);
    @Update("update cats set name=#{name},age=#{age},kind=#{kind},sex=#{sex} where id=#{id} ")
    int updaeCat(Cats cats);
}
