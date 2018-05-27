package com.epam.travel_agency.service.impl;

import com.epam.travel_agency.beans.Review;
import com.epam.travel_agency.beans.Tour;
import com.epam.travel_agency.beans.User;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.repository.factory.RepositoryFactory;
import com.epam.travel_agency.service.Service;

import java.util.List;

/**
 * The UserServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

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

    @Override
    public boolean checkExistDependentEntities(User user){
        Repository<Review> reviewRepository = RepositoryFactory.getInstance().getReviewRepository();
        try {
            List<Review> reviews = reviewRepository.getAll();
            for(Review review : reviews){
                if(review.getUser().equals(user)){
                    return true;
                }
            }
            return false;
        } catch (RepositoryException e){
            return false;
        }
    };
} 

