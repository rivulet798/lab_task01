package com.epam.repository.impl;

import com.epam.beans.Review;
import com.epam.repository.ReviewRepository;

import java.util.HashMap;
import java.util.Map;

public class ReviewRepositoryImpl implements ReviewRepository {
    private Map<Integer, Review> reviews = new HashMap<>();

    @Override
    public Map<Integer, Review> getDataStorage() {
        return reviews;
    }

}

