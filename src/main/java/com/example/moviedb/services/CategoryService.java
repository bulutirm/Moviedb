package com.example.moviedb.services;

import com.example.moviedb.entities.Category;
import com.example.moviedb.entities.Year;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAll();
    Category add(Category category);
    Category update(Category category);
    void delete(Long id);
}
