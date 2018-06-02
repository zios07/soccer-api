package com.soccer.service.impl;

import com.soccer.domain.City;
import com.soccer.repository.CityRepository;
import com.soccer.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository repo;

    @Override
    public City getById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<City> getAll() {
        return repo.findAll();
    }

    @Override
    public City create(City city) {
        return repo.save(city);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }
}
