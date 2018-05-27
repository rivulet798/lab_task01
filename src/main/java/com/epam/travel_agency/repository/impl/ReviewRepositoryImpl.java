package com.epam.travel_agency.repository.impl;

import com.epam.travel_agency.beans.Review;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.ReviewRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * The ReviewRepositoryImpl class used for storage
 * information about reviews, implements ReviewRepository
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see ReviewRepository
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class ReviewRepositoryImpl implements ReviewRepository {
    /** Map for storage information about reviews, key - id, value - review */
    private Map<Integer, Review> reviews;

    /**
     * Initializes fields {@link ReviewRepositoryImpl#reviews}.
     */
    public ReviewRepositoryImpl() {
        reviews = new HashMap<>();
    }

    /**
     * @see Repository#getDataStorage()
     */
    @Override
    public Map<Integer, Review> getDataStorage() {
        return reviews;
    }

}

