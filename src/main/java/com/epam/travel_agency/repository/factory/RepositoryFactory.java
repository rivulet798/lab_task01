package com.epam.travel_agency.repository.factory;

import com.epam.travel_agency.beans.*;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.impl.*;

/**
 * The RepositoryFactory class uses a FactoryMethod and
 * Singleton pattern to create objects.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class RepositoryFactory {
    /**
     * Field instance realises Singleton pattern
     */
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

    /**
     *
     * @return object of UserRepositoryImpl class
     */
    public Repository getUserRepository() {
        return userRepository;
    }

    /**
     *
     * @return object of TourRepositoryImpl class
     */
    public Repository getTourRepository() {
        return tourRepository;
    }

    /**
     *
     * @return object of TourTypeRepositoryImpl class
     */
    public Repository getTourTypeRepository() {
        return tourTypeRepository;
    }

    /**
     *
     * @return object of ReviewRepositoryImpl class
     */
    public Repository getReviewRepository() {
        return reviewRepository;
    }

    /**
     *
     * @return object of HotelRepositoryImpl class
     */
    public Repository getHotelRepository() {
        return hotelRepository;
    }

    /**
     *
     * @return object of CountryRepositoryImpl class
     */
    public Repository getCountryRepository() {
        return countryRepository;
    }

}
