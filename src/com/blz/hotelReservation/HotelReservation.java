package com.blz.hotelReservation;

import java.time.LocalDate;

public class HotelReservation {
    private static Hotel cheapestHotel;

    public static void main(String[] args) {
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90));
        reservationSystem.addHotel(new Hotel("Bridgewood", 160, 60));
        reservationSystem.addHotel(new Hotel("Ridgewood", 220, 150));

        LocalDate startDate = LocalDate.of(2020, 9, 10);
        LocalDate endDate = LocalDate.of(2020, 9, 11);

        Hotel cheapestHotel = reservationSystem.findCheapestHotel("Regular", startDate, endDate);
        System.out.println("Cheapest Hotel: " + cheapestHotel.getName());
        System.out.println("Total Rates: $" + cheapestHotel.getRate("Regular", startDate) * (endDate.toEpochDay() - startDate.toEpochDay()));
    }
}
