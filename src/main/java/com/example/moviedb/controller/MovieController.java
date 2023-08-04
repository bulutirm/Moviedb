package com.example.moviedb.controller;

import com.example.moviedb.entities.Movie;
import com.example.moviedb.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
@CrossOrigin
public class MovieController {

    private MovieService movieService;

    @GetMapping
    public List<Movie> getAll(){
        return movieService.getAll();
    }

    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public Movie add(@RequestBody Movie movie){
        System.out.print(movie);
        return movieService.add(movie);
    }
}
