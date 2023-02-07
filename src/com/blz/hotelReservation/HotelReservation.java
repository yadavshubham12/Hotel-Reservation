package com.blz.hotelReservation;

import java.time.LocalDate;

public class HotelReservation {

    public static void main(String[] args) {
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90));
        reservationSystem.addHotel(new Hotel("Bridgewood", 150, 50));
        reservationSystem.addHotel(new Hotel("Ridgewood", 200, 150));

        LocalDate startDate = LocalDate.of(2020, 9, 10);
        LocalDate endDate = LocalDate.of(2020, 9, 11);

        Hotel cheapestHotel = reservationSystem.findCheapestHotel(startDate, endDate);
        System.out.println("Cheapest Hotel: " + cheapestHotel.getName());
        System.out.println("Total Rates: $" + cheapestHotel.getRate(startDate) * (endDate.toEpochDay() - startDate.toEpochDay()));
    }
}
