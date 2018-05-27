package com.epam.agency.repository.impl;

import com.epam.agency.beans.Tour;
import com.epam.agency.repository.Repository;
import com.epam.agency.repository.TourRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * The TourRepositoryImpl class used for storage
 * information about tours, implements TourRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see TourRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class TourRepositoryImpl implements TourRepository {
    /** Map for storage information about tours, key - id, value - tour */
    private Map<Integer, Tour> tours;

    /**
     * Initializes fields {@link TourRepositoryImpl#tours}.
     */
    public TourRepositoryImpl() {
        tours = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, Tour> getDataStorage() {
        return tours;
    }

}

