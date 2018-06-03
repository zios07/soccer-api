package com.soccer.service.impl;

import com.soccer.domain.Pitch;
import com.soccer.repository.PitchRepository;
import com.soccer.service.IPitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchService implements IPitchService{

    @Autowired
    private PitchRepository repo;

    @Override
    public Pitch getById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<Pitch> getAll() {
        return repo.findAll();
    }

    @Override
    public Pitch create(Pitch pitch) {
        return repo.save(pitch);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }
}
