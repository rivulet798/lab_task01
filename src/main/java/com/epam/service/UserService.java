package com.epam.service;

import com.epam.beans.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);

} 

