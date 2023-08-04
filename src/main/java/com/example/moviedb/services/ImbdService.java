package com.example.moviedb.services;

import com.example.moviedb.entities.Imbd;
import com.example.moviedb.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImbdService {

    List<Imbd> getAll();
    Imbd add(Imbd imbd);
    Imbd update(Imbd imbd);
    void delete(Long id);
}
