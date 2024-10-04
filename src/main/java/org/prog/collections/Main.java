package org.prog.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"};
        List<String> cars = new ArrayList<>();


        for (int i = 1; i <= 1000; i++) {
            String model = "Model" + i;
            String color = colors[new Random().nextInt(colors.length)];
            cars.add(model + " (" + color + ")");
        }


        List<String> redCars = new ArrayList<>();
        List<String> greenCars = new ArrayList<>();
        List<String> blueCars = new ArrayList<>();


        for (String car : cars) {
            if (car.contains("(red)")) {
                redCars.add(car);
            } else if (car.contains("(green)")) {
                greenCars.add(car);
            } else if (car.contains("(blue)")) {
                blueCars.add(car);
            }
        }


        System.out.println("Red cars: " + redCars.size());
        System.out.println("Green cars: " + greenCars.size());
        System.out.println("Blue cars: " + blueCars.size());


        System.out.println("\nFirst 10 red cars: " + redCars.subList(0, Math.min(100, redCars.size())));
        System.out.println("First 10 green cars: " + greenCars.subList(0, Math.min(100, greenCars.size())));
        System.out.println("First 10 blue cars: " + blueCars.subList(0, Math.min(100, blueCars.size())));
    }
}