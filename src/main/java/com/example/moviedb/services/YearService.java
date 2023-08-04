package com.example.moviedb.services;

import com.example.moviedb.entities.Movie;
import com.example.moviedb.entities.Year;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface YearService {

    List<Year> getAll();
    Year add(Year year);
    Year update(Year year);
    void delete(Long id);
}
