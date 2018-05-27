package com.epam.service.impl;

import com.epam.beans.Review;
import com.epam.beans.Tour;
import com.epam.beans.User;
import com.epam.repository.Repository;
import com.epam.repository.ReviewRepository;
import com.epam.repository.exception.RepositoryException;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

import java.util.List;

public class UserServiceImpl implements Service<User> {
    private Repository<User> userRepository = RepositoryFactory.getInstance().getUserRepository();

    @Override
    public Repository getRepository() {
        return userRepository;
    }

    @Override
    public boolean checkExistInternalEntities(User user){
        Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();
        Repository<Review> reviewRepository = RepositoryFactory.getInstance().getReviewRepository();
        List<Tour> visitedTours = user.getVisitedTours();
        List<Review> reviews = user.getReviews();
        try {
            for(Tour visitedTour : visitedTours){
                tourRepository.getById(visitedTour.getId());
            }
            for(Review review : reviews){
                reviewRepository.getById(review.getId());
            }
            return true;
        } catch (RepositoryException e){
            return false;
        }
    }
} 

