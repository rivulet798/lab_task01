package com.epam.travel_agency.service.impl;

import com.epam.travel_agency.beans.Country;
import com.epam.travel_agency.beans.Hotel;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.repository.factory.RepositoryFactory;
import com.epam.travel_agency.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The CountryServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class CountryServiceImpl implements Service<Country> {
    Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);
    private Repository<Country> countryRepository = RepositoryFactory.getInstance().getCountryRepository();

    @Override
    public Repository getRepository() {
        return countryRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Country country) {
        return true;
    }

    @Override
    public boolean checkExistDependentEntities(Country country) {
        Repository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();
        try {
            List<Hotel> hotels = hotelRepository.getAll();
            for(Hotel hotel : hotels){
                if(hotel.getCountry().equals(country)){
                    return true;
                }
            }
            return false;
        } catch (RepositoryException e) {
            return false;
        }
    }
}
