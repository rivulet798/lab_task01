package com.epam.service.impl;

import com.epam.beans.Tour;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class TourServiceImpl implements Service<Tour>{
    private Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();

    @Override
    public Repository getRepository(){
        return tourRepository;
    }
}
