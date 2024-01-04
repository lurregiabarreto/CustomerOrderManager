package com.CustomerOrderManager.course.repositories;


import com.CustomerOrderManager.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
