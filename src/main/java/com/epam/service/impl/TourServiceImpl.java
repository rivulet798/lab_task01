package com.epam.service.impl;

import com.epam.beans.Hotel;
import com.epam.beans.Tour;
import com.epam.beans.TourType;
import com.epam.repository.Repository;
import com.epam.repository.exception.RepositoryException;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class TourServiceImpl implements Service<Tour> {
    private Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();

    @Override
    public Repository getRepository() {
        return tourRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Tour tour){
        Repository<TourType> tourTypeRepository = RepositoryFactory.getInstance().getTourTypeRepository();
        Repository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();
        TourType tourType = tour.getTourType();
        Hotel hotel = tour.getHotel();
        try {
            tourTypeRepository.getById(tourType.getId());
            hotelRepository.getById(hotel.getId());
            return true;
        } catch (RepositoryException e){
            return false;
        }
    }
}
