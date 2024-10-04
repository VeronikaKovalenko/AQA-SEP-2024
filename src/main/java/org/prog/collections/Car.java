package org.prog.collections;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color ;
    }

    @Override
    public String toString() {
        return model + " (" + color + ")";
    }
}
