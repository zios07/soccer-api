package com.soccer.service.impl;

import com.soccer.domain.Role;
import com.soccer.repository.RoleRepository;
import com.soccer.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    @Autowired
    private RoleRepository repo;

    @Override
    public Role getById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<Role> getAll() {
        return repo.findAll();
    }

    @Override
    public Role create(Role role) {
        return repo.save(role);
    }

    @Override
    public void remove(Long id) {
        repo.delete(id);
    }
}
