package com.epam.travel_agency.repository.impl;

import com.epam.travel_agency.beans.Country;
import com.epam.travel_agency.repository.CountryRepository;
import com.epam.travel_agency.repository.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * The CountryRepositoryImpl class used for storage
 * information about countries, implements CountryRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see CountryRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class CountryRepositoryImpl implements CountryRepository {
    /** Map for storage information about countries, key - id, value - country */
    private Map<Integer, Country> countries;

    /**
     * Initializes fields {@link CountryRepositoryImpl#countries}.
     */
    public CountryRepositoryImpl() {
        countries = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, Country> getDataStorage() {
        return countries;
    }
}

