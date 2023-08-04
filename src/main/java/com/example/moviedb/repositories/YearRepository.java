package com.example.moviedb.repositories;

import com.example.moviedb.entities.Year;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YearRepository extends JpaRepository<Year, Long> {
}
