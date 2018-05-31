package com.soccer.service;

import com.soccer.domain.Role;

import java.util.List;

public interface IRoleService {

    Role getById(Long id);

    List<Role> getAll();

    Role create(Role role);

    void remove(Long id);
}
