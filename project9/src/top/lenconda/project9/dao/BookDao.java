package top.lenconda.project9.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.lenconda.project9.entity.Book;

import java.util.List;

@Repository
public interface BookDao {
    List<Book> findBookByCategoryId(@Param("id") String id);
}
