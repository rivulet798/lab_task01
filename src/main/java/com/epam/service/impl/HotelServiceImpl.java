package com.epam.service.impl;

import com.epam.beans.Hotel;
import com.epam.repository.Repository;
import com.epam.repository.factory.RepositoryFactory;
import com.epam.service.Service;

public class HotelServiceImpl implements Service<Hotel> {
    private Repository<Hotel> hotelRepository = RepositoryFactory.getInstance().getHotelRepository();

    @Override
    public Repository getRepository() {
        return hotelRepository;
    }
}
