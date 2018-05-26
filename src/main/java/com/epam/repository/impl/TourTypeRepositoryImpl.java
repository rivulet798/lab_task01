package com.epam.repository.impl;

import com.epam.beans.TourType;
import com.epam.repository.TourTypeRepository;

import java.util.HashMap;
import java.util.Map;

public class TourTypeRepositoryImpl implements TourTypeRepository {
    private Map<Integer, TourType> tourTypes = new HashMap<>();

    @Override
    public Map<Integer, TourType> getDataStorage() {
        return tourTypes;
    }

}

