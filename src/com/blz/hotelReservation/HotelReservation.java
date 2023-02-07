package com.blz.hotelReservation;

import java.time.LocalDate;
import java.util.List;

public class HotelReservation {

    public static void main(String[] args) {
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90, 3));
        reservationSystem.addHotel(new Hotel("Bridgewood", 150, 50, 4));
        reservationSystem.addHotel(new Hotel("Ridgewood", 200, 150, 5));

        List<Hotel> hotels = reservationSystem.getHotels();
        for (Hotel hotel : hotels) {
            System.out.println("Hotel: " + hotel.getName());
            System.out.println("Weekday Rate: $" + hotel.getWeekdayRate());
            System.out.println("Weekend Rate: $" + hotel.getWeekendRate());
            System.out.println("Rating: " + hotel.getRating());
            System.out.println();
        }
    }
}
