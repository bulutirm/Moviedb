package com.example.moviedb.services.impl;

import com.example.moviedb.entities.Category;
import com.example.moviedb.repositories.CategoryRepository;
import com.example.moviedb.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    @Override
    public Category add(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        Category updateCategory = categoryRepository.save(category);
        return updateCategory;
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
