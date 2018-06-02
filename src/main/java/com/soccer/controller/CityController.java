package com.soccer.controller;

import com.soccer.domain.City;
import com.soccer.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/cities")
public class CityController {

    @Autowired
    private ICityService service;


    @GetMapping
    public List<City> getAll() {
      return service.getAll();
    }

}
