package com.epam.agency.service.impl;

import com.epam.agency.beans.Country;
import com.epam.agency.beans.Hotel;
import com.epam.agency.beans.Tour;
import com.epam.agency.beans.TourType;
import com.epam.agency.service.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Runner {
    public static void main(String[] args) {
        try {
            Service<Country> countryService = new CountryServiceImpl();
            Country country = new Country(1, "Minsk");
            countryService.addEntity(country);

            Country country3 = new Country(2, "Mi");
            countryService.addEntity(country3);
            System.out.println(countryService.getAllEntities());

            Country country4 = new Country(2, "Alla");

            Service<Hotel> hotelService = new HotelServiceImpl();;
            Hotel hotel = new Hotel(1, "Da", "photo", 5, country4);
            hotelService.addEntity(hotel);
            System.out.println(hotelService.getAllEntities());

            Service<Tour> tourService = new TourServiceImpl();
            Service<TourType> tourTypeService = new TourTypeServiceImpl();
            TourType tourType = new TourType(1,"Active");
            LocalDateTime dateTime = LocalDateTime.of(2018, Month.MAY, 25, 14, 20);
            LocalTime time = LocalTime.of(4, 20);
            BigDecimal cost = new BigDecimal(25.2);
            Tour tour = new Tour(1, "Ph", dateTime, time, "Desription", cost, tourType, hotel);
            tourService.addEntity(tour);
            System.out.println(tourService.getAllEntities());

            country3.setName("Suka");
            countryService.updateEntity(country3);
            System.out.println(countryService.getAllEntities());
            System.out.println(hotelService.getAllEntities());
            System.out.println(tourService.getAllEntities());
        }catch (Exception e){
            System.out.println("PROBLEM");
        }

    }
}
