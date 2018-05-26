package com.epam.repository.impl;

import com.epam.beans.Country;
import com.epam.repository.CountryRepository;

import java.util.HashMap;
import java.util.Map;

public class CountryRepositoryImpl implements CountryRepository {
    private Map<Integer, Country> countries = new HashMap<>();

    @Override
    public Map<Integer,Country> getDataStorage() {
        return countries;
    }
}

