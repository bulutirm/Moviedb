package com.example.moviedb.services;

import com.example.moviedb.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    List<Movie> getAll();
    Movie add(Movie movie);
    Movie update(Movie movie);
    void delete(Long id);
}
