package com.epam.travel_agency.service.impl;

import com.epam.travel_agency.beans.Tour;
import com.epam.travel_agency.beans.TourType;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.repository.factory.RepositoryFactory;
import com.epam.travel_agency.service.Service;

import java.util.List;

/**
 * The TourTypeServiceImpl class implements Service
 * interface and realizes its methods.
 *
 * Description of methods:
 * @see Service
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class TourTypeServiceImpl implements Service<TourType> {
    private Repository<TourType> tourTypeRepository = RepositoryFactory.getInstance().getTourTypeRepository();

    @Override
    public Repository getRepository() {
        return tourTypeRepository;
    }

    @Override
    public boolean checkExistInternalEntities(TourType tourType){
        return true;
    }

    @Override
    public boolean checkExistDependentEntities(TourType tourType){
        Repository<Tour> tourRepository = RepositoryFactory.getInstance().getTourRepository();
        try {
            List<Tour> tours = tourRepository.getAll();
            for(Tour tour : tours){
                if(tour.getTourType().equals(tourType)){
                    return true;
                }
            }
            return false;
        } catch (RepositoryException e){
            return false;
        }
    };
}

