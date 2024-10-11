package org.prog.collections;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
//TODO: create Map which will allow you to track car owners and cars they own
//TODO: At least one car must be owned by two owners
//TODO: print owners that share cars
public class MapsHomework {

    public static void main(String[] args) {
        Car coOwnedCar = new Car("red");
        CarOwner owner1 = createCarOwner("Olya", "Polykova", "748-942-6425");
        CarOwner owner2 = createCarOwner("Nika", "Tarasuik", "987-654-3210");
        CarOwner owner3 = createCarOwner("Dima", "Petrenko", "555-123-4567");


        Map<CarOwner, Set<Car>> ownersAndCars = new HashMap<>();
        ownersAndCars.put(owner1, new HashSet<>());
        ownersAndCars.put(owner2, new HashSet<>());
        ownersAndCars.put(owner3, new HashSet<>());


        ownersAndCars.get(owner1).add(coOwnedCar);
        ownersAndCars.get(owner2).add(coOwnedCar);

        ownersAndCars.get(owner1).add(new Car("blue"));
        ownersAndCars.get(owner2).add(new Car("green"));
        ownersAndCars.get(owner3).add(new Car("yellow"));


        Set<CarOwner> ownersOfSeveralCars = new HashSet<>();
        List<Car> allCars = new ArrayList<>();

        for (Set<Car> cars : ownersAndCars.values()) {
            allCars.addAll(cars);
        }

        Set<Car> coOwnedCars = new HashSet<>();
        for (Car car : allCars) {
            if (Collections.frequency(allCars, car) > 1) {
                coOwnedCars.add(car);
            }
        }


        for (Map.Entry<CarOwner, Set<Car>> entry : ownersAndCars.entrySet()) {
            for (Car carWithMultipleOwners : coOwnedCars) {
                if (entry.getValue().contains(carWithMultipleOwners)) {
                    ownersOfSeveralCars.add(entry.getKey());
                }
            }
        }

        for (CarOwner owner : ownersOfSeveralCars) {
            System.out.println(owner.firstName + " " + owner.lastName);
        }
    }


    public static CarOwner createCarOwner(String firstName, String lastName, String phoneNumber) {
        CarOwner owner = new CarOwner();
        owner.firstName = firstName;
        owner.lastName = lastName;
        owner.phoneNumber = phoneNumber;
        return owner;
    }
}

















