package com.epam.agency.repository.impl;

import com.epam.agency.beans.User;
import com.epam.agency.repository.Repository;
import com.epam.agency.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * The UserRepositoryImpl class used for storage
 * information about users, implements UserRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see UserRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class UserRepositoryImpl implements UserRepository {
    /** Map for storage information about users, key - id, value - user */
    private Map<Integer, User> users;

    /**
     * Initializes fields {@link UserRepositoryImpl#users}.
     */
    public UserRepositoryImpl() {
        users = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, User> getDataStorage() {
        return users;
    }

}

