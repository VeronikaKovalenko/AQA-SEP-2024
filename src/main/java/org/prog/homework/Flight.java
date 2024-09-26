package org.prog.homework;

import java.util.Objects;


public class Flight {
    private Airplane  airplane ;
    private String flightNumber;

    public Flight(Airplane airplane , String flightNumber) {
        this.airplane  = airplane  ;
        this.flightNumber = flightNumber ;
    }

    public Airplane  getAirplane () {
        return airplane ;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber  + " from " + airplane.getName();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight)  o;
        return Objects.equals(airplane.getName(), flight.airplane.getName()) &&
                Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airplane.getName(), flightNumber); // Генерация hash-кода
    }

    public void printFlightDetails(String destination, String departureAirport, String transitAirport) {
        System.out.println("flight number " + flightNumber + ", airplane " + airplane.getName() +
                ", flying from " + departureAirport + " to " + destination +
                " in " + transitAirport);
    }
}
