package com.epam.travel_agency.service.impl;

import com.epam.travel_agency.beans.Country;
import com.epam.travel_agency.beans.Hotel;
import com.epam.travel_agency.beans.Tour;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.repository.factory.RepositoryFactory;
import com.epam.travel_agency.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The HotelServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class HotelServiceImpl implements Service<Hotel> {
    Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);
    private Repository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();

    @Override
    public Repository getRepository() {
        return hotelRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Hotel hotel){
        Repository<Country> countryRepository = RepositoryFactory.getInstance().getCountryRepository();
        Country country = hotel.getCountry();
        try {
            return countryRepository.getById(country.getId()).equals(country);
        } catch (RepositoryException e){
            return false;
        }
    }

    @Override
    public boolean checkExistDependentEntities(Hotel hotel){
        Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();
        try {
            List<Tour> tours = tourRepository.getAll();
            for(Tour tour : tours){
                if(tour.getHotel().equals(hotel)){
                    return true;
                }
            }
            return false;
        } catch (RepositoryException e){
            return false;
        }
    };
}
