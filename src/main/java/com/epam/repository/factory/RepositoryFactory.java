package com.epam.repository.factory;

import com.epam.beans.*;
import com.epam.repository.Repository;
import com.epam.repository.impl.*;


public class RepositoryFactory {
    private static final RepositoryFactory instance = new RepositoryFactory();
    private final Repository<User> userRepository;
    private final Repository<Tour> tourRepository;
    private final Repository<TourType> tourTypeRepository;
    private final Repository<Review> reviewRepository;
    private final Repository<Hotel> hotelRepository;
    private final Repository<Country> countryRepository;

    private RepositoryFactory() {
        userRepository = new UserRepositoryImpl();
        tourRepository = new TourRepositoryImpl();
        tourTypeRepository = new TourTypeRepositoryImpl();
        reviewRepository = new ReviewRepositoryImpl();
        hotelRepository = new HotelRepositoryImpl();
        countryRepository = new CountryRepositoryImpl();
    }
    public static RepositoryFactory getInstance() {
        return instance;
    }

    public Repository getUserRepository() {
        return userRepository;
    }
    public Repository getTourRepository() {
        return tourRepository;
    }
    public Repository getTourTypeRepository() {
        return tourTypeRepository;
    }
    public Repository getReviewRepository() {
        return reviewRepository;
    }
    public Repository getHotelRepository() {
        return hotelRepository;
    }
    public Repository getCountryRepository() {
        return countryRepository;
    }

}
