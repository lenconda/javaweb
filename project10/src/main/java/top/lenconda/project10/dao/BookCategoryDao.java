package top.lenconda.project10.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.lenconda.project10.entity.BookCategory;

@Repository
public interface BookCategoryDao extends JpaRepository<BookCategory, Integer> {
}
