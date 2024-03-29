package com.afautos.main.services.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afautos.main.models.user.User;
import com.afautos.main.repositories.user.UserRepository;
import com.afautos.main.services.user.UserService;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @SuppressWarnings("null")
    @Override
    public User getByIdUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    @Override
    public User addUser(User user) {
        userRepository.save(user);
        return user;
    };
}
