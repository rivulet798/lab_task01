package com.epam.service.impl;

import com.epam.beans.TourType;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class TourTypeServiceImpl implements Service<TourType>{
    private Repository<TourType> tourTypeRepository = RepositoryFactory.getInstance().getTourTypeRepository();

    @Override
    public Repository getRepository(){
        return tourTypeRepository;
    }
}

