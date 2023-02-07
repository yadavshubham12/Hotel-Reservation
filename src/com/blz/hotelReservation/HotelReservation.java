package com.blz.hotelReservation;

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");

        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        Hotel hotel = new Hotel("Grand Hotel", 200.0);
        reservationSystem.addHotel(hotel);
        System.out.println("Hotel added; " + hotel.getName() + "With regular rates " + hotel.getRegularRate());
    }
}
