package com.soccer.service;

import com.soccer.domain.User;

import java.util.List;

public interface IUserService {

    User getById(Long id);

    List<User> getAll();

    User create(User city);

    void remove(Long id);
}
