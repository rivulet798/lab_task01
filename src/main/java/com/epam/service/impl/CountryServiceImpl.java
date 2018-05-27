package com.epam.service.impl;

import com.epam.beans.Country;
import com.epam.repository.Repository;
import com.epam.repository.exception.RepositoryException;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;
import com.epam.service.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountryServiceImpl implements Service<Country> {
    Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);
    private Repository<Country> countryRepository = RepositoryFactory.getInstance().getCountryRepository();

    @Override
    public Repository getRepository() {
        return countryRepository;
    }

    @Override
    public boolean checkExistInternalEntities(Country country){
        return true;
    }
}
