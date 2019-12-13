package top.lenconda.project10.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import top.lenconda.project10.entity.Book;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    @Query(value = "select * from book where id < ?", nativeQuery = true)
    List<Book> queryBook(int id);
}
