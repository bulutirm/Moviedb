package com.example.moviedb.services.impl;

import com.example.moviedb.entities.Imbd;
import com.example.moviedb.repositories.ImbdRepository;
import com.example.moviedb.services.ImbdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImbdServiceImpl implements ImbdService {

    ImbdRepository imbdRepository;

    @Override
    public List<Imbd> getAll() {
        List<Imbd> imbds = imbdRepository.findAll();
        return imbds;
    }

    @Override
    public Imbd add(Imbd imbd) {
        return imbdRepository.save(imbd);
    }

    @Override
    public Imbd update(Imbd imbd) {
        Imbd updateImbd = imbdRepository.save(imbd);
        return updateImbd;
    }

    @Override
    public void delete(Long id) {
        imbdRepository.deleteById(id);
    }
}
