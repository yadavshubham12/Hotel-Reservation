package com.blz.hotelReservation;

import java.time.LocalDate;
import java.util.List;

public class HotelReservation {

    public static void main(String[] args) {
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90));
        reservationSystem.addHotel(new Hotel("Bridgewood", 150, 50));
        reservationSystem.addHotel(new Hotel("Ridgewood", 200, 150));

        LocalDate startDate = LocalDate.of(2020, 9, 11);
        LocalDate endDate = LocalDate.of(2020, 9, 12);

        List<Hotel> cheapestHotels = reservationSystem.findCheapestHotels(startDate, endDate);
        System.out.print("Cheapest Hotels: ");
        for (Hotel hotel : cheapestHotels) {
            System.out.print(hotel.getName() + " ");
        }
        System.out.println();
        System.out.println("Total Rates: $" + cheapestHotels.get(0).getRate(startDate) * (endDate.toEpochDay() - startDate.toEpochDay()));

    }
}
