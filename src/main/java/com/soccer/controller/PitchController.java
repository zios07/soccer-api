package com.soccer.controller;

import com.soccer.domain.Pitch;
import com.soccer.service.IPitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/pitches")
public class PitchController {

  @Autowired
  private IPitchService service;

  @GetMapping
  public List<Pitch> findAll() {
    return service.getAll();
  }

}
