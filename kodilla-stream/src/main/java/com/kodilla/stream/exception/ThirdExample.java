package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundExeption airportNotFoundExeption) {
            System.out.println("Sorry, this airport cannot be served by our airlines.");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines.");
        }
    }
}
