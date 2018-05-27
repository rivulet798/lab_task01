package com.epam.travel_agency.repository.impl;

import com.epam.travel_agency.beans.TourType;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.TourTypeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * The TourTypeRepositoryImpl class used for storage
 * information about tourTypes, implements TourTypeRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see TourTypeRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class TourTypeRepositoryImpl implements TourTypeRepository {
    /** Map for storage information about tourTypes, key - id, value - tourType */
    private Map<Integer, TourType> tourTypes;

    /**
     * Initializes fields {@link TourTypeRepositoryImpl#tourTypes}.
     */
    public TourTypeRepositoryImpl() {
        tourTypes = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, TourType> getDataStorage() {
        return tourTypes;
    }

}

