package com.blz.hotelReservation;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String Name;
    private double regularRate;

    public Hotel(String name, double regularRate) {
        this.Name = name;
        this.regularRate = regularRate;
    }

    public String getName() {
        return Name;
    }

    public double getRegularRate() {
        return regularRate;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setRegularRate(double regularRate) {
        this.regularRate = regularRate;
    }
}
 class HotelReservationSystem {
    public List<Hotel> hotels;

    public HotelReservationSystem() {
        hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    public List<Hotel> getHotels() {
        return hotels;
    }
 }


