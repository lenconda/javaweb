package top.lenconda.project9.dao;

import org.springframework.stereotype.Repository;
import top.lenconda.project9.entity.Category;

import java.util.List;

@Repository
public interface CategoryDao {
    List<Category> findAll();
}
