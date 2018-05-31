package com.soccer.service;

import com.soccer.domain.Statistic;

import java.util.List;

public interface IStatisticService {
    
    Statistic getById(Long id);

    List<Statistic> getAll();

    Statistic create(Statistic city);

    void remove(Long id);
}
