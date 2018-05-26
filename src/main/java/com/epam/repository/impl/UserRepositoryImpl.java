package com.epam.repository.impl;

import com.epam.beans.User;
import com.epam.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public Map<Integer, User> getDataStorage() {
        return users;
    }

}

