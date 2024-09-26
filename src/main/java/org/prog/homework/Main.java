package org.prog.homework;


import org.prog.homework.Airplane;
import org.prog.homework.Flight;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Bergamo", "SU");
        Flight flight = new Flight(airplane, "SU-6566");

        System.out.println(airplane);
        System.out.println(flight);
        flight.printFlightDetails("Venice", "Stuttgart", "Berne");
    }
}