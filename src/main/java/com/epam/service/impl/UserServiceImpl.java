package com.epam.service.impl;

import com.epam.beans.User;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class UserServiceImpl implements Service<User>{
    private Repository<User> userRepository = RepositoryFactory.getInstance().getUserRepository();

    @Override
    public Repository getRepository(){
        return userRepository;
    }
} 

