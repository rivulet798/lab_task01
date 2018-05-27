package com.epam.service.impl;

import com.epam.beans.Country;
import com.epam.beans.Hotel;
import com.epam.beans.TourType;
import com.epam.service.Service;

public class Runner {
    public static void main(String[] args) {
        try {
            Service<Country> countryService = new CountryServiceImpl();
            Country country = new Country(1, "Minsk");
            countryService.addEntity(country);

            Country country3 = new Country(2, "Mi");
            countryService.addEntity(country3);
            System.out.println(countryService.getAllEntities());

            Country country4 = new Country(3, "Mineesk");
            countryService.updateEntity(country4);
            System.out.println(countryService.getAllEntities());



            Service<Hotel> hotelService = new HotelServiceImpl();
            Country country2 = new Country(2, "Moskov");
            Hotel hotel = new Hotel(1, "Da", "photo", 5, country2);
            hotelService.addEntity(hotel);
        }catch (Exception e){
            System.out.println("PROBLEM");
        }

    }
}
