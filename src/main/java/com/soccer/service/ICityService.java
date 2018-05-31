package com.soccer.service;

import com.soccer.domain.City;

import java.util.List;

public interface ICityService {

    City getById(Long id);

    List<City> getAll();

    City create(City city);

    void remove(Long id);

}
