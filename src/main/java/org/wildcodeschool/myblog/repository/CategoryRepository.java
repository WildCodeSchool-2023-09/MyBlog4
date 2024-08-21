package org.wildcodeschool.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.myblog.model.Category;

import java.time.LocalDateTime;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByName(String name);
}