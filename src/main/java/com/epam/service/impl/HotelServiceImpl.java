package com.epam.service.impl;

import com.epam.beans.Country;
import com.epam.beans.Hotel;
import com.epam.repository.Repository;
import com.epam.repository.exception.RepositoryException;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;
import com.epam.service.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
            countryRepository.getById(country.getId());
            return true;
        } catch (RepositoryException e){
            return false;
        }
    }
}
