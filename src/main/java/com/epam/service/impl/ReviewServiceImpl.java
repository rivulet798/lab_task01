package com.epam.service.impl;

import com.epam.beans.Review;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class ReviewServiceImpl implements Service<Review> {
    private Repository<Review> reviewRepository = RepositoryFactory.getInstance().getReviewRepository();

    @Override
    public Repository getRepository() {
        return reviewRepository;
    }
}
