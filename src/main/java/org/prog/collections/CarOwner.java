package org.prog.collections;

public class CarOwner {
    public String firstName;
    public String lastName;
    public String phoneNumber;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
