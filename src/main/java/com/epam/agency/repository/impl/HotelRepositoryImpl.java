package com.epam.agency.repository.impl;

import com.epam.agency.beans.Hotel;
import com.epam.agency.repository.HotelRepository;
import com.epam.agency.repository.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * The HotelRepositoryImpl class used for storage
 * information about hotels, implements HotelRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see HotelRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class HotelRepositoryImpl implements HotelRepository {
    /** Map for storage information about hotels, key - id, value - hotel */
    private Map<Integer, Hotel> hotels;

    /**
     * Initializes fields {@link HotelRepositoryImpl#hotels}.
     */
    public HotelRepositoryImpl() {
        hotels = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, Hotel> getDataStorage() {
        return hotels;
    }

}

