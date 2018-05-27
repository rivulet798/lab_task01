package com.epam.repository.impl;

import com.epam.beans.Tour;
import com.epam.repository.TourRepository;

import java.util.HashMap;
import java.util.Map;

public class TourRepositoryImpl implements TourRepository {
    private Map<Integer, Tour> tours;

    public TourRepositoryImpl() {
        tours = new HashMap<>();
    }

    @Override
    public Map<Integer, Tour> getDataStorage() {
        return tours;
    }

}

