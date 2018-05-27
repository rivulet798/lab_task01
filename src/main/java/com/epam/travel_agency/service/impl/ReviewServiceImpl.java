package com.epam.travel_agency.service.impl;

import com.epam.travel_agency.beans.Review;
import com.epam.travel_agency.beans.Tour;
import com.epam.travel_agency.beans.User;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.repository.factory.RepositoryFactory;
import com.epam.travel_agency.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ReviewServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

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
            return (userRepository.getById(user.getId()).equals(user) &&
                    tourRepository.getById(tour.getId()).equals(tour));
        } catch (RepositoryException e){
            return false;
        }
    }

    @Override
    public boolean checkExistDependentEntities(Review review){
        return false;
    };
}
