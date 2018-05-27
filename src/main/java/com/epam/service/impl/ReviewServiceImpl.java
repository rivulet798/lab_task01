package com.epam.service.impl;

import com.epam.beans.Review;
import com.epam.beans.Tour;
import com.epam.beans.User;
import com.epam.repository.Repository;
import com.epam.repository.exception.RepositoryException;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;
import com.epam.service.exception.ServiceException;
import org.omg.CORBA.REBIND;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReviewServiceImpl implements Service<Review> {
    Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);
    private Repository<Review> reviewRepository = RepositoryFactory.getInstance().getReviewRepository();

    @Override
    public Repository getRepository() {
        return reviewRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Review review){
        Repository<User> userRepository = RepositoryFactory.getInstance().getUserRepository();
        Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();
        User user = review.getUser();
        Tour tour = review.getTour();
        try {
            userRepository.getById(user.getId());
            tourRepository.getById(tour.getId());
            return true;
        } catch (RepositoryException e){
            return false;
        }
    }
}
