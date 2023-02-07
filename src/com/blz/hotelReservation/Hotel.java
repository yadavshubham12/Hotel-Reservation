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

            public Hotel findCheapestHotel(LocalDate startDate, LocalDate endDate) {
                Hotel cheapestHotel = hotels.get(0);
                double cheapestRate = Double.MAX_VALUE;

                for (Hotel hotel : hotels) {
                    double totalRate = 0.0;
                    for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
                        totalRate += hotel.getRate(date);
                    }

                    if (totalRate < cheapestRate) {
                        cheapestRate = totalRate;
                        cheapestHotel = hotel;
                    }
                }

                return cheapestHotel;
            }
        }
