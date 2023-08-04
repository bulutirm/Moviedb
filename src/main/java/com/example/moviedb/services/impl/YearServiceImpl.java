package com.example.moviedb.services.impl;

import com.example.moviedb.entities.Year;
import com.example.moviedb.repositories.YearRepository;
import com.example.moviedb.services.YearService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class YearServiceImpl implements YearService {

    YearRepository yearRepository;

    @Override
    public List<Year> getAll() {
        List<Year> years = yearRepository.findAll();
        return years;
    }

    @Override
    public Year add(Year year) {
        return yearRepository.save(year);
    }

    @Override
    public Year update(Year year) {
        Year updateYear = yearRepository.save(year);
        return updateYear;
    }

    @Override
    public void delete(Long id) {
        yearRepository.deleteById(id);
    }
}
