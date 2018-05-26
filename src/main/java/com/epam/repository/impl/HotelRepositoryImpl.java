package com.epam.repository.impl;

import com.epam.beans.Hotel;
import com.epam.repository.HotelRepository;

import java.util.HashMap;
import java.util.Map;

public class HotelRepositoryImpl implements HotelRepository {
    private Map<Integer, Hotel> hotels = new HashMap<>();

    @Override
    public Map<Integer, Hotel> getDataStorage() {
        return hotels;
    }

}

