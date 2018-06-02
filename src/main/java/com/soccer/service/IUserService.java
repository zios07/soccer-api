package com.soccer.service;

import com.soccer.domain.User;
import com.soccer.service.Exception.NotFoundException;

import java.util.List;

public interface IUserService {

  User getById(Long id);

  User findByUsername(String username) throws NotFoundException;

    List<User> getAll();

    User create(User city);

    void remove(Long id);
}
