package com.epam.agency.service.impl;

import com.epam.agency.beans.Hotel;
import com.epam.agency.beans.Tour;
import com.epam.agency.beans.TourType;
import com.epam.agency.repository.Repository;
import com.epam.agency.repository.exception.RepositoryException;
import com.epam.agency.repository.factory.RepositoryFactory;
import com.epam.agency.service.Service;

/**
 * The TourServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class TourServiceImpl implements Service<Tour> {
    private Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();

    @Override
    public Repository getRepository() {
        return tourRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Tour tour) {
        Repository<TourType> tourTypeRepository = RepositoryFactory.getInstance().getTourTypeRepository();
        Repository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();
        TourType tourType = tour.getTourType();
        Hotel hotel = tour.getHotel();
        try {
            return (tourTypeRepository.getById(tourType.getId()).equals(tourType) &&
            hotelRepository.getById(hotel.getId()).equals(hotel));
        } catch (RepositoryException e) {
            return false;
        }
    }

    @Override
    public boolean checkExistDependentEntities(Tour tour) {
        return false;
    };
}
