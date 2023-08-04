package com.example.moviedb.repositories;

import com.example.moviedb.entities.Imbd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImbdRepository extends JpaRepository<Imbd, Long> {
}
