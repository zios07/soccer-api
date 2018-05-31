package com.soccer.service;

import com.soccer.domain.Pitch;

import java.util.List;

public interface IPitchService {

    Pitch getById(Long id);

    List<Pitch> getAll();

    Pitch create(Pitch pitch);

    void remove(Long id);
}
