package com.example.moviedb.services.impl;

import com.example.moviedb.entities.Movie;
import com.example.moviedb.repositories.MovieRepository;
import com.example.moviedb.services.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAll() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie) {
        Movie updateMovie = movieRepository.save(movie);
        return updateMovie;
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }

    public void addMovieFromJson(String movieJson) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // JSON verisini Movie nesnesine dönüştürme
            Movie movie = objectMapper.readValue(movieJson, Movie.class);

            // Yeni bir Movie nesnesini veritabanına eklemek için add metodu çağrılıyor
            add(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
