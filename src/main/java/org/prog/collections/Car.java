package org.prog.collections;

import java.util.Objects;

public class Car {

    String color;

        Car(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Objects.equals(color, car.color);
        }

        @Override
        public int hashCode() {
            Objects Objects;
            return java.util.Objects.hash(color);
        }
    }
