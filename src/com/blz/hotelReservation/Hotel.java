package com.blz.hotelReservation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    class Hotel {
        private String name;
        private double regularRate;
        private double rewardRate;

        public Hotel(String name, double regularRate, double rewardRate) {
            this.name = name;
            this.regularRate = regularRate;
            this.rewardRate = rewardRate;
        }

        public String getName() {
            return name;
        }

        public double getRate(String customerType, LocalDate date) {
            if (customerType.equals("Regular")) {
                if (date.getDayOfWeek().toString().equals("FRIDAY") || date.getDayOfWeek().toString().equals("SATURDAY")) {
                    return regularRate + 40;
                } else {
                    return regularRate;
                }
            } else if (customerType.equals("Reward")) {
                return rewardRate;
            } else {
                return 0.0;
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

        public Hotel findCheapestHotel(String customerType, LocalDate startDate, LocalDate endDate) {
            Hotel cheapestHotel = hotels.get(0);
            double cheapestRate = Double.MAX_VALUE;

            for (Hotel hotel : hotels) {
                double totalRate = 0.0;
                for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
                    totalRate += hotel.getRate(customerType, date);
                }

                if (totalRate < cheapestRate) {
                    cheapestRate = totalRate;
                    cheapestHotel = hotel;
                }
            }

            return cheapestHotel;
        }
    }
