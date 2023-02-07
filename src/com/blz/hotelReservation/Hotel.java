package com.blz.hotelReservation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
        class Hotel {
            private String name;
            private double weekdayRate;
            private double weekendRate;

            public Hotel(String name, double weekdayRate, double weekendRate) {
                this.name = name;
                this.weekdayRate = weekdayRate;
                this.weekendRate = weekendRate;
            }
            public String getName() {
                return name;
            }

            public double getRate(LocalDate date) {
                if (date.getDayOfWeek().toString().equals("SATURDAY") || date.getDayOfWeek().toString().equals("SUNDAY")) {
                    return weekendRate;
                } else {
                    return weekdayRate;
                }
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

    public List<Hotel> findCheapestHotels(LocalDate startDate, LocalDate endDate) {
        List<Hotel> cheapestHotels = new ArrayList<>();
        double cheapestRate = Double.MAX_VALUE;

        for (Hotel hotel : hotels) {
            double totalRate = 0.0;
            for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
                totalRate += hotel.getRate(date);
            }

            if (totalRate < cheapestRate) {
                cheapestRate = totalRate;
                cheapestHotels.clear();
                cheapestHotels.add(hotel);
            } else if (totalRate == cheapestRate) {
                cheapestHotels.add(hotel);
            }
        }

        return cheapestHotels;
    }
}