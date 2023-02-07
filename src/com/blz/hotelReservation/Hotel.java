package com.blz.hotelReservation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
        class Hotel {
            private String name;
            private double weekdayRate;
            private double weekendRate;
            private int rating;

            public Hotel(String name, double weekdayRate, double weekendRate, int rating) {
                this.name = name;
                this.weekdayRate = weekdayRate;
                this.weekendRate = weekendRate;
                this.rating = rating;
            }

            public String getName() {
                return name;
            }

            public double getWeekdayRate() {
                return weekdayRate;
            }

            public double getWeekendRate() {
                return weekendRate;
            }

            public int getRating() {
                return rating;
            }
        }

class HotelReservationSystem {
    private List<Hotel> hotels;

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