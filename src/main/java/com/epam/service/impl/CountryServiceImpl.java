package com.epam.service.impl;

import com.epam.beans.Country;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class CountryServiceImpl implements Service<Country> {
    private Repository<Country> countryRepository = RepositoryFactory.getInstance().getCountryRepository();

    @Override
    public Repository getRepository() {
        return countryRepository;
    }
}
