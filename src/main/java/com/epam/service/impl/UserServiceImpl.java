package com.epam.service.impl;

import com.epam.beans.User;
import com.epam.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.getAll()
                .forEach(users::add);
        return users;
    }

    public void addUser(User user){
        userRepository.save(user);
    }
} 

