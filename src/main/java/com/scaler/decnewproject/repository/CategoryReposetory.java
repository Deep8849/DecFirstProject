package com.scaler.decnewproject.repository;

import com.scaler.decnewproject.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryReposetory extends JpaRepository<Category, Long> {



    Optional<Category> findByTitle(String title);
}
