package com.soccer.service.impl;

import com.soccer.domain.User;
import com.soccer.repository.UserRepository;
import com.soccer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User getById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public void remove(Long id) {
        repo.deleteById(id);
    }
}
